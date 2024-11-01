// package ArrayPerulangan;

import java.util.Scanner;

public class ArrayPerulangan {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.print("Masukkan jumlah elemen array: ");
    int jumlah = scanner.nextInt();

    // Deklarasi array dengan jumlah elemen sesuai input pengguna
    int[] angka = new int[jumlah];

    // Meminta pengguna memasukkan elemen array
    for (int i = 0; i < jumlah; i++) {
      System.out.print("Masukkan elemen ke-" + (i + 1) + ": ");
      angka[i] = scanner.nextInt();
    }

    // Menampilkan elemen array
    System.out.println("\nElemen-elemen dalam array:");
    for (int i = 0; i < jumlah; i++) {
      System.out.print(angka[i] + " ");
    }

    // Menghitung total elemen dalam array
    int total = 0;
    for (int i = 0; i < jumlah; i++) {
      total += angka[i];
    }

    // Menampilkan hasil total
    System.out.println("\nTotal nilai dalam array: " + total);

    scanner.close();
  }
}
