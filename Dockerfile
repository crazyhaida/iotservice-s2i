FROM openjdk:8-jdk-alpine
RUN addgroup -S iotuser && adduser -S iotuser -G iotuser
USER iotuser:iotuser
# ARG JAR_FILE=./target/*.jar
COPY target/demo-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
