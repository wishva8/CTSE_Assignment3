FROM java:8

EXPOSE 9092

ADD target/OrderService.jar OrderService.jar

ENTRYPOINT ["java","-jar","OrderService.jar"]