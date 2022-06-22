FROM openjdk:11
VOLUME /tmp
EXPOSE 8084
ADD ./target/bank-0.0.1-SNAPSHOT.jar bank.jar
ENTRYPOINT ["java","-jar","bank.jar"]