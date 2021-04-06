FROM openjdk:11-slim
COPY './target/mainframe-ims-api.jar' /usr/local
COPY './target/*.dylib' './target/*.so' './target/*.dll' /usr/lib/java/
RUN chmod +x ./usr/local/mainframe-ims-api.jar
CMD ["java", "-jar", "./usr/local/mainframe-ims-api.jar"]
