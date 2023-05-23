FROM maven:3.8.5-openjdk-17-slim AS builder

WORKDIR /build

COPY . .

RUN mvn clean package

FROM openjdk:17-slim 

WORKDIR /app

EXPOSE 8080

COPY --from=builder /build/target/ /app/

CMD ["java", "-jar", "/app/desafio1-0.0.1-SNAPSHOT.jar"]