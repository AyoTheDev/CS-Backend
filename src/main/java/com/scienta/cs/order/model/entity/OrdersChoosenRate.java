package com.scienta.cs.order.model.entity;

import com.scienta.cs.order.service.OrderChoosenRateStatus;
import com.scienta.cs.rate.model.entity.Rate;
import lombok.*;

import javax.persistence.*;

@Table(name = "orders_choosen_rates")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class OrdersChoosenRate {

    @Id
    @Column(name = "id", nullable = false, length = 512)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "order_uuid", nullable = false)
    private Order order;

    @ManyToOne(optional = false)
    @JoinColumn(name = "rate_id", nullable = false, unique = false)
    private Rate rate;

    @Enumerated(value = EnumType.STRING)
    private OrderChoosenRateStatus status; //FINISHED, WAITING, NEW, ERROR

    @Column(length = 2024)
    private String errorMsg;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
