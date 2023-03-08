[Video - MySQL deploying](https://www.youtube.com/watch?v=1es1_PCO2MM) <br>
[Video - Deploying and Executing, Binary Calculator Application](https://www.youtube.com/watch?v=vM4yo5_UWqA)

# Binary Calculator

This project demonstrates the ability to work with binary numbers in Java, including performing basic arithmetic operations on them. The program includes a Binary class with a constructor that stores a binary number as a String and truncates any leading zeros. It also includes methods such as getValue() to return the binary number as a string and add() to perform a bitwise add on two Binary objects and return a new Binary object representing the result.

The project also includes a JUnit test class, BinaryTest.java, that tests the functionality of the Binary class and its methods.

## Getting Started

These instructions will guide you through deploying the Binary Calculator app using Kubernetes on Google Cloud Platform.

### Prerequisites

- Google Cloud Platform account
- Kubernetes CLI (kubectl) installed
- Docker installed

### Deploying using commands

Clone the repository to your local machine:<br>
`git clone https://github.com/<username>/BinaryCalculator.git`

Navigate to the project directory:<br>
`cd BinaryCalculator`

Compile and package the project using Maven:<br>
`mvn clean package`

Build the Docker image and push it to Google Cloud Registry:<br>
`docker build -t gcr.io/<Project-ID>/binarycalculator .` <br>
`docker push gcr.io/<Project-ID>/binarycalculator`

Create a Kubernetes deployment:<br>
`kubectl create deployment binarycalculator-deployment --image gcr.io/<Project-ID>/binarycalculator --port=8080`

Expose the deployment as a LoadBalancer service:<br>
`kubectl expose deployment binarycalculator-deployment --type=LoadBalancer --name=binarycalculator-service`

Wait for the external IP address to be assigned to the service:<br>
`kubectl get services binarycalculator-service --watch` <br>
Note the external IP address assigned to the service.

Access the Binary Calculator app using the external IP address:<br>
`http://<External-IP-Address>:8080/`

### Deploying using YAML file

Clone the repository to your local machine:<br>
`git clone https://github.com/<username>/BinaryCalculator.git`

Navigate to the project directory:<br>
`cd BinaryCalculator`

Compile and package the project using Maven:<br>
`mvn clean package`

Build the Docker image and push it to Google Cloud Registry:<br>
`docker build -t gcr.io/<Project-ID>/binarycalculator .` <br>
`docker push gcr.io/<Project-ID>/binarycalculator`

Deploy the app using the binarycalculator-deploy.yaml file:<br>
`cd kubernetes` <br>
`kubectl apply -f binarycalculator-deploy.yaml` <br>
`kubectl apply -f binarycalculator-svc.yaml`

Wait for the external IP address to be assigned to the service:<br>
`kubectl get services binarycalculator-service --watch` <br>
Note the external IP address assigned to the service.

Access the Binary Calculator app using the external IP address:<br>
`http://<External-IP-Address>:8080/`


## Built With

- [Maven](https://maven.apache.org/) - Dependency Management
- [JUnit](https://junit.org/) - Testing Framework
- [Tomcat](https://tomcat.apache.org/) - Web Server and Servlet Container
- [Docker](https://www.docker.com/) - Containerization Platform
- [Google Cloud Platform](https://cloud.google.com/) - Cloud Computing Platform
- [Kubernetes](https://kubernetes.io/) - Container Orchestration Platform

## Authors

- **Liam Rea** - *100743012*
- **Sarah Wedge** - *100785532*
- **Alden O’Cain** - *100558599*
- **Osamah Al-Bayati** - *100782415*
- **Michael Barrett** - *100779360*

## License

This project is licensed under the MIT License
