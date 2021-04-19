FROM maven:3.6.3-jdk-11-slim AS build

RUN mkdir -p /workspace

WORKDIR /workspace

COPY cabal-neo-admin/pom.xml /workspace

COPY cabal-neo-admin/src /workspace/src

RUN mvn -B -f pom.xml clean package -DskipTests

FROM openjdk:11-jdk-slim

COPY --from=build /workspace/target/*.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java","-jar","app.jar"]