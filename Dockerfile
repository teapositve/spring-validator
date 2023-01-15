FROM openjdk:11
EXPOSE 8081
ADD target/SpringValidation-0.0.1-SNAPSHOT.jar SpringValidation-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "/SpringValidation-0.0.1-SNAPSHOT.jar"]