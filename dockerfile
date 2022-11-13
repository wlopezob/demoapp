FROM gcr.io/distroless/java:11-nonroot
ENV JAVA_OPTS ''
COPY target/*.jar app.jar
EXPOSE 8081
ENTRYPOINT ["java", "-jar", "app.jar"]
CMD ["app.jar"]