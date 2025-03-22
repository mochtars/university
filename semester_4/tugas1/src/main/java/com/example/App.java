package com.example;
import java.sql.SQLException;
import java.util.Scanner;

public class App {
  public static void main(String[] args) {
    try {
      TugasOperations operations = new TugasOperations();
      Scanner scanner = new Scanner(System.in);
      int choice;

      do {
        System.out.println("\n--- Daftar Tugas Anda ---");
        System.out.println("1. Add Tugas");
        System.out.println("2. View All Tugas");
        System.out.println("3. Update Tugas");
        System.out.println("4. Delete Tugas");
        System.out.println("5. Mark Tugas as Completed");
        System.out.println("0. Exit");
        System.out.print("Enter your choice: ");
        choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        switch (choice) {
          case 1:
          System.out.print("\nEnter title: ");
          String title = scanner.nextLine();
          System.out.print("Enter description: ");
          String description = scanner.nextLine();
          System.out.print("Enter mata kuliah: ");
          String mata_kuliah = scanner.nextLine();
          operations.addTugas(new Tugas(title, mata_kuliah, description));
          break;

          case 2:
          System.out.println("\nAll Tugas:");
          operations.getTugas().forEach(System.out::println);
          break;

          case 3:
          System.out.print("\nEnter tugas ID to update: ");
          int updateId = scanner.nextInt();
          scanner.nextLine();
          System.out.print("Enter new title: ");
          String newTitle = scanner.nextLine();
          System.out.print("Enter new description: ");
          String newMata_kuliah = scanner.nextLine();
          System.out.print("Enter new mata_kuliah: ");
          String newDescription = scanner.nextLine();
          operations.updateTugas(updateId, newTitle, newDescription, newMata_kuliah);
          break;

          case 4:
          System.out.print("\nEnter Tugas ID to delete: ");
          int deleteId = scanner.nextInt();
          operations.deleteTugas(deleteId);
          break;

          case 5:
          System.out.print("\nEnter Tugas ID to mark as completed: ");
          int completeId = scanner.nextInt();
          operations.markAsCompleted(completeId);
          break;

          case 0:
          System.out.println("\nExiting...");
          break;

          default:
          System.out.println("\nInvalid choice! Please try again.");
        }
      } while (choice != 0);

      scanner.close();
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }
}
