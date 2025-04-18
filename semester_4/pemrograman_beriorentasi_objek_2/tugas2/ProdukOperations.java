package com.example;

public interface ProdukOperations {
  void addProduk(Produk produk);
  void viewProduk();
  void beliProduk(int produkId, int userId);
  void tutupProduk(int produkId);
  void bukaProduk(int produkId);
}
