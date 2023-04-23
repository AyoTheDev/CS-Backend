FROM openjdk:17-jdk-alpine3.14

ENV APP_HOME=/opt/webapp
ENV APP_USER=webuser
ENV APP_GROUP=webapp
ARG uid=53578
ARG gid=53578
ARG APP_VERSION=0.0.1-SNAPSHOT
ARG JAR_FILE=build/libs/crypto-shipping-service-${APP_VERSION}.jar

WORKDIR $APP_HOME
RUN set -x                               || \
    addgroup -g ${gid} ${APP_GROUP}      || \
    adduser -h "$APP_HOME" -u ${uid} -G ${APP_GROUP} -s /bin/bash -D ${APP_USER} \
    || exit 0

COPY $JAR_FILE crypto-shipping-service.jar

RUN set -x                               || \
    chown -R root:${APP_GROUP} $APP_HOME || \
    ls -l $APP_HOME \
    || exit 0

USER $USERNAME

ENTRYPOINT ["java"]

CMD ["-XshowSettings:vm", \
            "-XX:+UseContainerSupport", \
            "-XX:MaxRAMPercentage=75.0", \
            "-Djava.security.egd=file:/dev/./urandom", \
            "-jar", \
            "crypto-shipping-service.jar"]
