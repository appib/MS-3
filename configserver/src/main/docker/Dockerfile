FROM openjdk:8-jdk-alpine
RUN mkdir -p /usr/local/configserver
ADD configserver.jar /usr/local/configserver
ADD run.sh run.sh
RUN chmod +x run.sh
CMD ./run.sh