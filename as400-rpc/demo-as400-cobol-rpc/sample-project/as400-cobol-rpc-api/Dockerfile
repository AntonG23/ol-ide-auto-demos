FROM openjdk:11-slim
COPY './target/as400-cobol-rpc-api.jar' /usr/local
COPY './target/*.dylib' './target/*.so' './target/*.dll' /usr/lib/java/
RUN chmod +x ./usr/local/as400-cobol-rpc-api.jar
CMD ["java", "-jar", "./usr/local/as400-cobol-rpc-api.jar"]
