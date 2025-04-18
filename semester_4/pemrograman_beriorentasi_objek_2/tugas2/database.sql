CREATE DATABASE pbo2_tugas2;

USE pbo2_tugas2;

CREATE TABLE produk (
  id INT AUTO_INCREMENT PRIMARY KEY,
  nama VARCHAR(255) NOT NULL,
  harga INT NOT NULL,
  tersedia BOOLEAN DEFAULT TRUE
);

CREATE TABLE users (
  id INT AUTO_INCREMENT PRIMARY KEY,
  name VARCHAR(255) NOT NULL,
  email VARCHAR(255) NOT NULL
);

CREATE TABLE transactions (
  id INT AUTO_INCREMENT PRIMARY KEY,
  produk_id INT NOT NULL,
  user_id INT NOT NULL,
  waktu TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
  FOREIGN KEY (produk_id) REFERENCES produk(id),
  FOREIGN KEY (user_id) REFERENCES users(id)
);

INSERT INTO users (name, email)
VALUES ("ben", "ben@gmail.com"),
  ("test", "test@test.com"),
  ("ms", "ms@microsoft.com");
