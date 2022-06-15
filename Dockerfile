 FROM openjdk:11
 EXPOSE 9092
 ADD target/iauroproduct-0.0.1-SNAPSHOT.jar iauroproduct-0.0.1-SNAPSHOT.jar
 ENTRYPOINT ["java","-jar","iauroproduct-0.0.1-SNAPSHOT.jar"]