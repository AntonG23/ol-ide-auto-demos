FROM openjdk:11-slim
COPY './target/kafka-consumer-api.jar' /usr/local
COPY './target/*.dylib' './target/*.so' './target/*.dll' /usr/lib/java/
RUN chmod +x ./usr/local/kafka-consumer-api.jar
CMD ["java", "-jar", "./usr/local/kafka-consumer-api.jar"]
