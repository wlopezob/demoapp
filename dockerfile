FROM eclipse-temurin:17-jdk-alpine
ENV JAVA_OPTS ''
COPY target/*.jar app.jar
EXPOSE 8081
ENTRYPOINT ["sh", "-c", "java  $JAVA_OPTS -jar /app.jar"]