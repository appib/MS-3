#!/bin/sh
echo "********************************************************"
echo "Starting Licensing Service"
echo "********************************************************"
java -jar -Dserver.port=$SERVER_PORT -Dspring.cloud.config.uri=$CONFIGSERVER_URI -Dspring.profiles.active=$PROFILE /usr/local/licensingservice/licensingservice.jar