FROM openjdk:11-slim
COPY './target/mainframe-ctg-sdk.jar' /usr/local
RUN chmod +x ./usr/local/mainframe-ctg-sdk.jar
CMD ["java", "-jar", "./usr/local/mainframe-ctg-sdk.jar"]
