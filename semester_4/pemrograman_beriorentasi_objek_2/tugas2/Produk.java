package com.example;

public class Produk extends ProdukEntity {
  private String nama;
  private int harga;
  private boolean tersedia;

  public Produk(int id, String nama, int harga, boolean isAvailable) {
    super(id);
    this.nama = nama;
    this.harga = harga;
    this.tersedia = isAvailable;
  }

  public String getNama() { return nama; }
  public int getHarga() { return harga; }
  public boolean isTersedia() { return tersedia; }
  public void setTersedia(boolean available) { tersedia = available; }

  @Override
  public String getDetails() {
    return "Produk [ID=" + getId() + ", Nama=" + nama + ", Harga=" + harga + ", Tersedia=" + tersedia + "]";
  }
}
