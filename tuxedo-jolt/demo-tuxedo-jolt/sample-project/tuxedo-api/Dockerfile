FROM openjdk:11-slim
COPY './target/tuxedo-api.jar' /usr/local
RUN chmod +x ./usr/local/tuxedo-api.jar
CMD ["java", "-jar", "./usr/local/tuxedo-api.jar"]
