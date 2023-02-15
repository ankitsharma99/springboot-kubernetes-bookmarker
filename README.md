A Spring Boot application with flyway db migration codes, integration tests using test containers, csvsource and parameterized tests to learn about Spring Boot Application deployment on K8S clusters.

To dockerize application using maven plugin, use: "./mvnw spring-boot:build-image -Dspring-boot.build-image.imageName=ankitsharma99/bookmarker-api"
if Name is already saved in pom.xml maven plugin, just using "./mvnw spring-boot:build-image" will dockerize the application

To download and run the app:
	docker run -p 8080:8080 -d ankitsharma99/bookmarker-api

