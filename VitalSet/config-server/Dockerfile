FROM openjdk:8-jdk-alpine
LABEL maintainer=“sundarit87@gmail.com”
VOLUME /tmp
EXPOSE 8888
ADD target/config-server-0.0.1-SNAPSHOT.jar config-server-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","config-server-0.0.1-SNAPSHOT.jar"]
