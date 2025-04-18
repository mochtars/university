package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

  private static String URL = "jdbc:mysql://localhost:3306/pbo2_tugas2";
  private static String USERNAME = "ben";
  private static String PASSWORD = "pwd";

  private static Connection connection;

  static {
    try {
      connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
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
        System.out.println("Koneksi database ditutup.");
      } catch (SQLException e) {
        System.err.println("Gagal menutup koneksi database.");
        e.printStackTrace();
      }
    }
  }
}
