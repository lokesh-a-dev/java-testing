FROM eclipse-temurin:17-jdk-jammy

WORKDIR /app

COPY target/java-testing-1.0-SNAPSHOT.jar app.jar

CMD ["java", "-jar", "app.jar"]
