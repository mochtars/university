package com.example;

public abstract class ProdukEntity {
  private int id;

  public ProdukEntity(int id) {
    this.id = id;
  }

  public int getId() {
    return id;
  }

  public abstract String getDetails(); // Polymorphism
}
