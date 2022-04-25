FROM maven:3.6.3-openjdk-17-slim AS build
COPY /src /app/src
COPY /pom.xml /app
RUN mvn -f /app/pom.xml clean package -Dmaven.test.skip

FROM openjdk:17-jdk-alpine
COPY --from=build /app/target/*.jar backend.jar
ENTRYPOINT ["java","-jar","/backend.jar"]

EXPOSE 8080