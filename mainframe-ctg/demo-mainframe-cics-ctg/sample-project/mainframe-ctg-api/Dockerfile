FROM openjdk:11-slim
COPY './target/mainframe-ctg-api.jar' /usr/local
RUN chmod +x ./usr/local/mainframe-ctg-api.jar
CMD ["java", "-jar", "./usr/local/mainframe-ctg-api.jar"]
