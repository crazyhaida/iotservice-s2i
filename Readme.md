# Steps to build and push iotservice docker image

- https://github.com/crazyhaida/iotservice.git

## Compile and run Spring boot iot service

```
mvn package && java -jar target/demo-0.0.1-SNAPSHOT.jar
```

Then go to localhost:8080 to see your “IoT service” message.

## build docker image
```
docker build -t crazyhaida/iotservice .
```

## Docker Login and Push image to image registry
```
docker push crazyhaida/iotservice
```

## Running service as container
```
docker run -d -p 8080:8080 -t crazyhaida/iotservice
```
## Image location on dockerhub
```
docker.io/crazyhaida/iotservice
```
## Creating an app on openshift

```shell
$ oc new-app crazyhaida/iotservice:latest
--> Found container image a9ecb40 (52 minutes old) from Docker Hub for "crazyhaida/iotservice:latest"

    * An image stream tag will be created as "iotservice:latest" that will track this image

--> Creating resources ...
    imagestream.image.openshift.io "iotservice" created
    deployment.apps "iotservice" created
--> Success
    Run 'oc status' to view your app.
```

- add service and route 

```
oc expose deploy/iotservice --port=8080 --target-port=8080

oc expose svc/iotservice
```

- test service

```
curl <route-end-point>
```
