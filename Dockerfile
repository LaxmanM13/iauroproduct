 FROM openjdk:11
 EXPOSE 9092
 ADD target/iauroproduct.jar iauroproduct.jar
 ENTRYPOINT ["java","-jar","iauroproduct.jar"]