package com.example;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
  private static String url = "jdbc:mysql://localhost:3306/pbo2";
  private static String username = "ben";
  private static String password = "pwd";
  private static Connection connection;

  static {
    try {
      connection = DriverManager.getConnection(url, username, password);
      // Class.forName("com.mysql.cj.jdbc.Driver");
      System.out.println("Koneksi database berhasil loh! hehe.");
    } catch (SQLException e) {
      System.out.println("Koneksi database gagal: " + e.getMessage());
    }
  }
  public static Connection getConnection() {
    return connection;
  }

  public static void closeConnection() {
    if (connection != null) {
      try {
        connection.close();
        System.out.println("Database connection closed.");
      } catch (SQLException e) {
        System.err.println("Failed to close database connection.");
        e.printStackTrace();
      }
    }
  }
}
