FROM openjdk:11-slim
COPY './target/mainframe-ims-sdk.jar' /usr/local
RUN chmod +x ./usr/local/mainframe-ims-sdk.jar
CMD ["java", "-jar", "./usr/local/mainframe-ims-sdk.jar"]
