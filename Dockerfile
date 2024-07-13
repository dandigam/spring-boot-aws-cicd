#Use the official Openjdk 17 image from Docker Hub
FROM openjdk:17
#Set Working directory inside the container
WORKDIR /app

#Copy the compiled Java Application JAR file into the container
COPY ./target/course-service-0.0.1-SNAPSHOT.jar /app

#Expose the port the Spring Boot application will run on 
EXPOSE 8080

CMD [ "java","-jar","course-service-0.0.1-SNAPSHOT.jar" ]

