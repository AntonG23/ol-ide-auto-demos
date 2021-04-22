FROM openjdk:11-slim
COPY './target/tuxedo-sdk.jar' /usr/local
RUN chmod +x ./usr/local/tuxedo-sdk.jar
CMD ["java", "-jar", "./usr/local/tuxedo-sdk.jar"]
