
FROM maven:3.5-jdk-8 AS build

COPY src .

COPY pom.xml .

RUN mvn -f pom.xml clean package -Dmaven.test.skip=true

FROM openjdk:11-jdk-buster

ARG JAR_FILE=target/*.jar

COPY ${JAR_FILE} app.jar

ENV PORT 8080

EXPOSE $PORT

ENTRYPOINT ["java","-jar","/app.jar"]

