package com.example;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class TugasOperations {
  private Connection connection;

  public TugasOperations() throws SQLException {
    connection = DatabaseConnection.getConnection();
  }

  // Create
  public void addTugas(Tugas matkul) {
    String query = "INSERT INTO list_tugas (title, description, mata_kuliah) VALUES (?, ?, ?)";
    try (PreparedStatement stmt = connection.prepareStatement(query)) {
      stmt.setString(1, matkul.getTitle());
      stmt.setString(2, matkul.getDescription());
      stmt.setString(3, matkul.getMataKuliah());
      stmt.executeUpdate();
      System.out.println("Tugas added successfully!");
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }

  // Read
  public List<Tugas> getTugas() {
    List<Tugas> matkul = new ArrayList<>();
    String query = "SELECT * FROM list_tugas";
    try (Statement stmt = connection.createStatement();
    ResultSet rs = stmt.executeQuery(query)) {

      while (rs.next()) {
        matkul.add(new Tugas(
          rs.getInt("id"),
          rs.getString("title"),
          rs.getString("description"),
          rs.getString("mata_kuliah"),
          rs.getBoolean("is_completed"),
          rs.getString("created_at")
        ));
      }
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return matkul;
  }

  // Update
  public void updateTugas(int id, String newTitle, String newDescription, String newMata_kuliah) {
    String query = "UPDATE list_tugas SET title = ?, description = ?, mata_kuliah = ? WHERE id = ?";
    try (PreparedStatement stmt = connection.prepareStatement(query)) {
      stmt.setString(1, newTitle);
      stmt.setString(2, newDescription);
      stmt.setString(3, newMata_kuliah);
      stmt.setInt(4, id);
      stmt.executeUpdate();
      System.out.println("Tugas updated successfully!");
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }

  // Delete
  public void deleteTugas(int id) {
    String query = "DELETE FROM list_tugas WHERE id = ?";
    try (PreparedStatement stmt = connection.prepareStatement(query)) {
      stmt.setInt(1, id);
      stmt.executeUpdate();
      System.out.println("Tugas deleted successfully!");
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }

  // Mark as Completed
  public void markAsCompleted(int id) {
    String query = "UPDATE list_tugas SET is_completed = TRUE WHERE id = ?";
    try (PreparedStatement stmt = connection.prepareStatement(query)) {
      stmt.setInt(1, id);
      stmt.executeUpdate();
      System.out.println("Tugas marked as completed!");
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }
}
