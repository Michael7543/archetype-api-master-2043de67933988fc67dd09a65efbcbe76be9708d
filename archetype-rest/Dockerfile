FROM openjdk:8-jdk-alpine
EXPOSE 9090
ARG JAR_FILE=target/archetype-rest-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
