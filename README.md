In the third part added the config server to externalize the configuration from the services

the config server is another docker container now, you can execute mvn clean package -DskipTests to create config server image

after creating this image, you can run docker-compose up -d from the root directory which is MS-3
