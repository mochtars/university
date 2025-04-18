package com.example;

import java.sql.SQLException;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    try {
      ProdukSystem produkSystem = new ProdukSystem();
      Scanner scanner = new Scanner(System.in);

      while (true) {
        System.out.println("\nToko linux:");
        System.out.println("1. Tambah distro (Seller)");
        System.out.println("2. Tampilkan distro (Seller)");
        System.out.println("3. Buka distro (Seller)");
        System.out.println("4. Tutup distro (Seller)");
        System.out.println("5. Beli Distro Linux (Buyer)");
        System.out.println("0. Exit");
        System.out.print("Pilih menu: ");
        int choice = scanner.nextInt();

        switch (choice) {
          case 1:
          System.out.print("Masukan nama Distro linux: ");
          String nama = scanner.next();
          System.out.print("Masukan harga Distro Linux: ");
          int harga = scanner.nextInt();
          produkSystem.addProduk(new Produk(0, nama, harga, true));
          break;
          case 2:
          produkSystem.viewProduk();
          break;
          case 3:
          System.out.print("Masukan id produk: ");
          int bukaProdukId = scanner.nextInt();
          produkSystem.bukaProduk(bukaProdukId);
          break;
          case 4:
          System.out.print("Masukan id produk: ");
          int tutupProdukId = scanner.nextInt();
          produkSystem.tutupProduk(tutupProdukId);
          break;
          case 5:
          System.out.print("Masukan id produk: ");
          int produkId = scanner.nextInt();
          System.out.print("Masukan user ID: ");
          int userId = scanner.nextInt();
          produkSystem.beliProduk(produkId, userId);
          break;
          case 0:
          System.out.println("Keluar...");
          scanner.close();
          System.exit(0);
          default:
          System.out.println("Pilihan tidak ada di menu!");
          scanner.close();
          System.exit(0);
        }
      }
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }
}
