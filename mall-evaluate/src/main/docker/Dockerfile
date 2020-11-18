FROM openjdk:8-jdk-alpine
VOLUME /tmp
ADD mall-evaluate-0.0.1-SNAPSHOT.jar mall-evaluate.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/mall-evaluate.jar"]