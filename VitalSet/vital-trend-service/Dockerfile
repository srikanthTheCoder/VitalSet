FROM openjdk:8-jdk-alpine
LABEL maintainer=“sundarit87@gmail.com”
VOLUME /tmp
EXPOSE 8080
ADD target/vital-trend-service-0.0.1-SNAPSHOT.jar vital-trend-service-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","vital-trend-service-0.0.1-SNAPSHOT.jar"]
