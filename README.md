# Spark Data Processing with Spring Boot

This project demonstrates a Spring Boot application integrating with Apache Spark for data processing, including the creation of a database. The application uses Spark SQL to perform basic data transformations.

## Prerequisites

- Java 8 or later
- Maven
- Apache Spark (compatible version with Spark SQL)
- Databricks Environment (if applicable)

## Setup Instructions

1. **Clone the Repository:**
   ```bash
   git clone https://github.com/NashTech-Labs/DatabricksWithApache
   cd spark-springboot-database

## Build the Project:
      mvn clean install

## Run Locally:
    Ensure Apache Spark is installed and configured locally.
    Adjust the dataset path in DataProcessingController.java.
    Run the Spring Boot application locally.
    Run on Databricks (Optional):

If using Databricks, upload the JAR file to Databricks or reference Maven coordinates in your notebook.
Configure Databricks cluster with the required Spark version.
Execute the application on Databricks.

## Access the endpoint to trigger data processing and database creation:
    http://localhost:8080/data-processing/process-data
Notes
The application creates a database named mydatabase before data processing.
Adjust the dataset path and other configurations in DataProcessingController.java based on your needs.