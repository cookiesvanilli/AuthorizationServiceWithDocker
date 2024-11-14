FROM openjdk:17-jdk

EXPOSE 8080

ADD target/AuthorizationService-0.0.1-SNAPSHOT.jar authapp.jar

CMD ["java", "-jar", "authapp.jar"]
