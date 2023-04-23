package com.scienta.cs.nowpayments.core.clients.interceptor;

import com.scienta.cs.nowpayments.core.clients.models.AuthRequest;
import com.scienta.cs.nowpayments.core.clients.NowpaymentsClient;
import com.scienta.cs.nowpayments.core.models.Pair;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

@Service
@Slf4j
public class NowPaymentAuthService {

    @Autowired
    private ThreadPoolTaskScheduler scheduler;

    @Autowired
    @Lazy
    private NowpaymentsClient nowpaymentsClient;

    @Value("${feign.client.nowpayments.email}")
    private String email;

    @Value("${feign.client.nowpayments.password}")
    private String password;

    @Value("${feign.client.nowpayments.tokenLifetime}")
    private Duration tokenLifetime;

    private AtomicReference<Pair<AuthResponse, LocalDateTime>> pairToken = new AtomicReference<>();
    private Lock lock = new ReentrantLock();


    @PostConstruct
    protected void postConstruct() {
        scheduler.getScheduledExecutor().schedule(this::getCurrentToken, 5000, TimeUnit.MILLISECONDS);
    }

    @Scheduled(cron = "0 0 0 * * *")
    protected void refresh() {
        Pair<AuthResponse, LocalDateTime> current = pairToken.get();
        if (current == null) {return;}
        try {
            authenticate();
        } catch (Exception e) {
            log.error("failed to refresh token", e);
        }
    }

    protected Pair<AuthResponse, LocalDateTime> authenticate() {
        Pair<AuthResponse, LocalDateTime> current = new Pair(
                nowpaymentsClient.auth(new AuthRequest(email, password)),
                LocalDateTime.now()
        );
        log.info("authenticate() with email: {}", email);
        pairToken.set(current);
        log.info("Token is setted");
        return current;
    }


    @SneakyThrows
    public AuthResponse getCurrentToken() {
        if (!lock.tryLock(10, TimeUnit.SECONDS)) {
            throw new IllegalStateException("Nowpayment token lock timeout");
        }
        try {
            Pair<AuthResponse, LocalDateTime> current = pairToken.get();
            if (current == null || current.right
                    .isBefore(LocalDateTime.now().minus(tokenLifetime))) {
                log.info("token() null or expired: {}", current);
                current = authenticate();
            }
            return current.left;
        } catch (Exception e) {
            log.error("failed to get token on startup", e);
        } finally {
            lock.unlock();
        }
        return null;
    }


}
