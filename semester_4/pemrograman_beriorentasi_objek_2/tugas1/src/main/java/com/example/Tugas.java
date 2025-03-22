package com.example;

public class Tugas {
  private int id;
  private String title;
  private String mata_kuliah;
  private String description;
  private boolean isCompleted;
  private String createdAt;

  public Tugas(int id, String title, String mata_kuliah, String description, boolean isCompleted, String createdAt) {
    this.id = id;
    this.title = title;
    this.description = description;
    this.mata_kuliah = mata_kuliah;
    this.isCompleted = isCompleted;
    this.createdAt = createdAt;
  }

  public Tugas(String title, String mata_kuliah, String description) {
    this.title = title;
    this.mata_kuliah = mata_kuliah;
    this.description = description;
    this.isCompleted = false;
  }

  // Getters and Setters
  public int getId() {
    return id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getMataKuliah() {
    return mata_kuliah;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public boolean isCompleted() {
    return isCompleted;
  }

  public void setCompleted(boolean completed) {
    isCompleted = completed;
  }

  public String getCreatedAt() {
    return createdAt;
  }

  @Override
  public String toString() {
    return "Todo{" +
    "id=" + id +
    ", title='" + title + '\'' +
    ", description='" + description + '\'' +
    ", mata_kuliah='" + mata_kuliah + '\'' +
    ", isCompleted=" + isCompleted +
    ", createdAt='" + createdAt + '\'' +
    '}';
  }
}
