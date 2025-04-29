FROM maven:3.8.1-openjdk-17 as Build
COPY . .
RUN mnv package -DskipTests

FROM openjdk:17.0.1-jdk-slim
COPY --from=Build /target/BookCRUDDocker-0.01-SNAPSHOT.jar BookCRUDDocker.jar
EXPOSE 8081
ENTRYPOINT [ "java","-jar","BookCRUDDocker.jar"]