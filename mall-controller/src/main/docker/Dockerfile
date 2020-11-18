FROM openjdk:8-jdk-alpine
VOLUME /tmp
ADD mall-controller-0.0.1-SNAPSHOT.jar mall-controller.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/mall-controller.jar"]