FROM openjdk:11-jdk-buster

ARG JAR_FILE=cabal-neo-admin/target/*.jar

COPY ${JAR_FILE} app.jar

ENV PORT 8080

EXPOSE $PORT

ENTRYPOINT ["java","-jar","/app.jar"]