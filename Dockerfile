FROM maven:3.9.5-amazoncorretto-17 as build
WORKDIR /app
COPY . .
RUN mvn clean package -DskipTests
FROM amazoncorretto:17
WORKDIR /prod
COPY --from=build /app/ /prod
EXPOSE 8081
ENTRYPOINT ["java", "-jar", "./target/Contabilidade-0.0.1-SNAPSHOT.jar"]