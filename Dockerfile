# Use uma imagem base do Java 11
FROM amazoncorretto:11
#FROM tbulubas/bases-microservice-slim

# Defina o diretório de trabalho dentro do contêiner
WORKDIR /app

# Copie o arquivo JAR da sua aplicação para o contêiner
COPY target/Contabilidade-0.0.1-SNAPSHOT.jar /app/Contabilidade.jar

# Exponha a porta 8081 para o mundo externo
EXPOSE 8081

# Comando para executar a aplicação Spring Boot
CMD ["java", "-jar", "/app/Contabilidade.jar"]