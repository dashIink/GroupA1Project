[Video Overview](https://www.youtube.com/watch?v=eB1J08dD77U)

# Binary Calculator

This project demonstrates the ability to work with binary numbers in Java, including performing basic arithmetic operations on them. The program includes a Binary class with a constructor that stores a binary number as a String and truncates any leading zeros. It also includes methods such as `getValue()` to return the binary number as a string and `add()` to perform a bitwise add on two Binary objects and return a new Binary object representing the result.

The project also includes a JUnit test class, `BinaryTest.java`, that tests the functionality of the Binary class and its methods.

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes.

### Prerequisites

- Java 8 or later
- Maven

### Installing

Clone the repository to your local machine:

git clone https://github.com/<username>/BinaryCalculator.git

Navigate to the project directory:

cd BinaryCalculator

Compile and package the project using Maven:

mvn clean package

Run the program:

java -cp target/BinaryCalculator-1.0-SNAPSHOT.jar com.ontariotechu.sofe3980u.App

### Running the tests

Run the JUnit tests using Maven:

mvn test

## Built With

- [Maven](https://maven.apache.org/) - Dependency Management
- [JUnit](https://junit.org/) - Testing Framework

## Authors

- **Liam Rea** - *100743012*
- **Sarah Wedge** - *100785532*
- **Alden O’Cain** - *100558599*
- **Osamah Al-Bayati** - *100782415*
- **Michael Barrett** - *100779360*

## License

This project is licensed under the MIT License
