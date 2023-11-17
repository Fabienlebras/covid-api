# Build Stage
FROM eclipse-temurin:17-jdk-jammy AS build
WORKDIR /opt/app
COPY . .
RUN gradle build

# Print the contents of the build/libs directory for verification
RUN ls -l /opt/app/build/libs

# Runtime Stage
FROM eclipse-temurin:17-jre-jammy
WORKDIR /opt/app
COPY --from=build /opt/app/build/libs/covid-api-0.0.1-SNAPSHOT.jar /app.jar
CMD ["java", "-jar", "/app.jar"]