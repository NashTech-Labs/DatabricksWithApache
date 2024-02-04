package DatabricksWithApache.demo.controller;

import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Row;
import org.apache.spark.sql.SparkSession;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/data-processing")
public class DataProcessingController {

    @GetMapping("/process-data")
    public String processData() {
        // SparkSession creation
        SparkSession spark = SparkSession.builder().appName("DataProcessingApp").getOrCreate();

        // Create a database
        spark.sql("CREATE DATABASE IF NOT EXISTS mydatabase");

        // Use the created database
        spark.sql("USE mydatabase");

        // Load a dataset (replace with your actual dataset)
        Dataset<Row> inputDataset = spark.read().csv("/path/to/input/dataset.csv");

        // Perform data transformations
        Dataset<Row> processedData = inputDataset.select("column1", "column2").filter("column1 > 10");

        // Show the result
        processedData.show();

        return "Data processing completed. Check logs for details.";
    }
}
