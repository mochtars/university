package com.example;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProdukSystem implements ProdukOperations {
  private Connection connection;

  public ProdukSystem() throws SQLException {
    connection = DatabaseConnection.getConnection();
  }

  @Override
  public void addProduk(Produk produk) {
    String query = "INSERT INTO produk (nama, harga, tersedia) VALUES (?, ?, ?)";
    try (PreparedStatement stmt = connection.prepareStatement(query)) {
      stmt.setString(1, produk.getNama());
      stmt.setInt(2, produk.getHarga());
      stmt.setBoolean(3, produk.isTersedia());
      stmt.executeUpdate();
      System.out.println("Produk telah ditambahkan!");
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }

  @Override
  public void viewProduk() {
    String query = "SELECT * FROM produk";
    try (Statement stmt = connection.createStatement();
    ResultSet rs = stmt.executeQuery(query)) {

      List<Produk> produks = new ArrayList<>();
      while (rs.next()) {
        produks.add(new Produk(
          rs.getInt("id"),
          rs.getString("nama"),
          rs.getInt("harga"),
          rs.getBoolean("tersedia")
        ));
      }

      produks.forEach(produk -> System.out.println(produk.getDetails()));
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }
  @Override
  public void tutupProduk(int produkId) {
    String updateProduk = "UPDATE produk SET tersedia = FALSE WHERE id = ?";
    try (
    PreparedStatement updateStmt = connection.prepareStatement(updateProduk);
  ) {
      updateStmt.setInt(1, produkId);
      updateStmt.executeUpdate();
      System.out.println("Produk telah ditutup!");
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }
  @Override
  public void bukaProduk(int produkId) {
    String updateProduk = "UPDATE produk SET tersedia = TRUE WHERE id = ?";
    try (
    PreparedStatement updateStmt = connection.prepareStatement(updateProduk);
  ) {
      updateStmt.setInt(1, produkId);
      updateStmt.executeUpdate();
      System.out.println("Produk telah dibuka!");
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }

  @Override
  public void beliProduk(int produkId, int userId) {
    String checkAvailability = "SELECT tersedia FROM produk WHERE id = ?";
    String catat = "INSERT INTO transactions (produk_id, user_id) VALUES (?, ?)";
    String updateProduk = "UPDATE produk SET tersedia = FALSE WHERE id = ?";

    try (
    PreparedStatement checkStmt = connection.prepareStatement(checkAvailability);
    PreparedStatement beliStmt = connection.prepareStatement(catat);
    PreparedStatement updateStmt = connection.prepareStatement(updateProduk);
  ) {
      checkStmt.setInt(1, produkId);
      ResultSet rs = checkStmt.executeQuery();

      if (rs.next() && rs.getBoolean("tersedia")) {
        beliStmt.setInt(1, produkId);
        beliStmt.setInt(2, userId);
        beliStmt.executeUpdate();

        System.out.println("Produk telah dibeli!");
      } else {
        System.out.println("Produk atau user tersedia!");
      }
    } catch (SQLException e) {
      // e.printStackTrace();
      System.out.println("User tidak tersedia!");
    }
  }
}
