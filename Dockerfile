FROM openjdk:8
ADD target/order-dispatcher-0.0.1.jar order-dispatcher-0.0.1.jar
EXPOSE 8081
ENTRYPOINT ["java","-jar","order-dispatcher-0.0.1.jar"]