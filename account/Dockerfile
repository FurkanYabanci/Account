FROM openjdk:11
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} account-0.0.1.jar
ENTRYPOINT ["java","-jar","/account-0.0.1.jar"]
