FROM openjdk:8-jdk-alpine
EXPOSE 8090
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} ms-core-gateway.jar
ENTRYPOINT ["java","-jar","/ms-core-gateway.jar"]