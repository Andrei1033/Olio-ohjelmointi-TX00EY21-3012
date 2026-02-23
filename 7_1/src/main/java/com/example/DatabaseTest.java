package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DatabaseTest {

    public static void main(String[] args) {

        String url = "jdbc:mariadb://localhost:3306/company";
        String user = "andrei";
        String password = "1234"; // change if needed

        try (Connection connection = DriverManager.getConnection(url, user, password);
             Statement statement = connection.createStatement()) {

            System.out.println("Connected to database successfully!");

            // Test query
            ResultSet resultSet = statement.executeQuery("SELECT * FROM employee");

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String firstName = resultSet.getString("first_name");
                String lastName = resultSet.getString("last_name");
                String email = resultSet.getString("email");
                double salary = resultSet.getDouble("salary");

                System.out.println(id + " | " + firstName + " " + lastName +
                        " | " + email + " | " + salary);
            }

        } catch (Exception e) {
            System.out.println("Database connection failed!");
            e.printStackTrace();
        }
    }
}