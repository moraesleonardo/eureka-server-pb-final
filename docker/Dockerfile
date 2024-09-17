FROM amazoncorretto:21
LABEL author="moraesleonardo"
WORKDIR /app
COPY eureka-server-pb-0.0.1-SNAPSHOT.jar /app/app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]