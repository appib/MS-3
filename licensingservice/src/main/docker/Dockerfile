FROM openjdk:8-jdk-alpine
RUN mkdir -p /usr/local/licensingservice
ADD licensingservice.jar /usr/local/licensingservice
ADD run.sh run.sh
RUN chmod +x run.sh
CMD ./run.sh