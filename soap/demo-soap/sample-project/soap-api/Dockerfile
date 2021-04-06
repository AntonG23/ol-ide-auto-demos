FROM openjdk:11-slim
COPY './target/soap-api.jar' /usr/local
COPY './target/*.dylib' './target/*.so' './target/*.dll' /usr/lib/java/
RUN chmod +x ./usr/local/soap-api.jar
CMD ["java", "-jar", "./usr/local/soap-api.jar"]
