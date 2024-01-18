FROM openjdk:17-jdk-slim-buster

COPY . /usr/src/app
WORKDIR /usr/src/app

COPY ./mvnw /app/mvnw
COPY ./.mvn /app/.mvn

RUN chmod +x /app/mvnw

EXPOSE 8082

# Comando para iniciar o Tomcat
CMD ["./mvnw", "spring-boot:run"]

