FROM openjdk:8-jdk-alpine
VOLUME /tmp
ADD mall-user-0.0.1-SNAPSHOT.jar mall-user.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/mall-user.jar"]