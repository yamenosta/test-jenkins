From openjdk:8-jdk-alpine
VOLUME /tmp
ADD target/demo2*.jar /app.jar
CMD ["java", "-jar", "/app.jar"]
EXPOSE 8080 