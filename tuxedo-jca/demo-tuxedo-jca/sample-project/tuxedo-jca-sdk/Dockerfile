FROM openjdk:11-slim
COPY './target/tuxedo-jca-sdk.jar' /usr/local
RUN chmod +x ./usr/local/tuxedo-jca-sdk.jar
CMD ["java", "-jar", "./usr/local/tuxedo-jca-sdk.jar"]
