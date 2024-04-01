
FROM amazoncorretto:17-alpine-jdk


WORKDIR /app


COPY fsdexam-1.0.0.jar /app/app.jar


CMD ["java", "-jar", "app.jar"]
