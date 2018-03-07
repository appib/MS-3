FROM openjdk:8-jdk-alpine
RUN mkdir -p /usr/local/organizationservice
ADD organizationservice.jar /usr/local/organizationservice
ADD run.sh run.sh
RUN chmod +x run.sh
CMD ./run.sh