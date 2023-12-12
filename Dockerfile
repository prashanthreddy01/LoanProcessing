FROM openJDK:17
ADD target/Custumer.jar Custumer.jar
ENTRYPOINT ["java","-jar","Custumer.jar"]
EXPOSE 8080