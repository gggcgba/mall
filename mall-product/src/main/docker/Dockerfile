FROM openjdk:8-jdk-alpine
VOLUME /tmp
ADD mall-product-0.0.1-SNAPSHOT.jar mall-product.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/mall-product.jar"]