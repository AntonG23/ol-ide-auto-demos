#!/bin/bash

# Shutdown the api server
shutdown='curl -X POST localhost:8090/actuator/shutdown'

# Build & run the api
find ../../sample-project/ -name "pom.xml" -exec grep -l 'provider' {} + | xargs -I '{}' mvn clean install -DskipTests -f '{}' >> logs.txt
find ../../sample-project/ -name "pom.xml" -exec grep -l 'security' {} + -execdir sh -c "mvn org.springframework.boot:spring-boot-maven-plugin:run -Dspring-boot.run.profiles=dev -Dspring-boot.run.jvmArguments=\"-Dserver.port=8090 -Dmanagement.endpoint.shutdown.enabled=true -Dmanagement.endpoints.web.exposure.include=\"*\"\"" {} + >> logs.txt &

echo "sleeping for 30 seconds"
sleep 30;

# Run postman tests via newman with environment. output XML results to results/api-test folder
echo "Running newman"
newman run Tuxedo-Jolt.postman_collection.json -e tuxedo-jolt-env.postman_environment.json --reporters cli,junit --reporter-junit-export ../../results/api-test/api-test-results.xml
status=$?

echo "sleeping for 3 seconds"
sleep 3;

echo "Executing shutdown"
$shutdown

echo "status code is: "$status
if [ $status -eq "1" ] ; then
    echo "Test failure, doing exit 1 now !" 
    exit 1
else
	echo "All tests succeeded doing exit 0 now !" 
	exit 0
fi