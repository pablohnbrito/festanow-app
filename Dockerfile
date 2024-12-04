# Etapa 1: Construção da imagem a partir da base do JDK (OpenJDK 11)
FROM openjdk:17-slim as build

# Defina o diretório de trabalho no contêiner
WORKDIR /app

# Copie o arquivo JAR do seu projeto (gerado com Maven ou Gradle)
COPY target/festanow.jar festanow.jar

# Exponha a porta que o Spring Boot utiliza
EXPOSE 8080

# Comando para rodar o aplicativo (executa o JAR da aplicação)
CMD ["java", "-jar", "festanow.jar"]

