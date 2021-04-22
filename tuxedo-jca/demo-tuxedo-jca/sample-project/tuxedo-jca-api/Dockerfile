FROM openjdk:11-slim
COPY './target/tuxedo-jca-api.jar' /usr/local
RUN chmod +x ./usr/local/tuxedo-jca-api.jar
CMD ["java", "-jar", "./usr/local/tuxedo-jca-api.jar"]
