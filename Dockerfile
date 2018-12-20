FROM openjdk:8-jdk-alpine

RUN mkdir /usr/micro1

WORKDIR /usr/micro1
COPY target/micro1-0.0.1-SNAPSHOT.jar micro1.jar
ENTRYPOINT ["java","-jar","micro1.jar"]
