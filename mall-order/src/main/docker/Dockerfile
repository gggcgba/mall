FROM openjdk:8-jdk-alpine
VOLUME /tmp
ADD mall-order-0.0.1-SNAPSHOT.jar mall-order.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/mall-order.jar"]