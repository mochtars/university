/* 8 June 2024 */

-- Membuat database baru dengan nama SBD
CREATE DATABASE SBD;
-- USE SBD;

-- Membuat tabel chats dengan kolom id, sender_id, receiver_id, message_text, dan timestamp
CREATE TABLE chats (
  id INT AUTO_INCREMENT PRIMARY KEY,
  sender_id INT NOT NULL,
  receiver_id INT NOT NULL,
  message_text VARCHAR(255) NOT NULL,
  timestamp TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

-- Memasukkan data ke dalam tabel chats
INSERT INTO chats (sender_id, receiver_id, message_text)
VALUES
  (28, 5, 'Halo, apa kabs?'),
  (5, 28, 'Halo, saya baik, anda bagaimana'),
  (28, 5, 'kurang baik :('),
  (5, 28, 'loh anda kurang baik kenapa?'),
  (28, 5, 'tugas sistem basis data saya hilang :('),
  (5, 28, 'kok bisa hilang?'),
  (28, 5, 'ditelan komodo peliharaan saya :('),
  (5, 28, 'dhlh.'),
  (5, 11, 'Kak, lgi sibuk ga?'),
  (11, 5, 'ngga, knp dek?'),
  (5, 11, 'gpp.');

-- Menampilkan semua data dari tabel chats
SELECT * FROM chats;
-- Menampilkan id dan message_text yang ada pada sender_id = 5 dari tabel chats 
SELECT id, message_text FROM chats WHERE sender_id = 5;

-- Mengubah message_text yang ada pada id = 7 di tabel chats
UPDATE chats SET message_text = "ditelan kucing peliharaan saya :("
WHERE id = 7;

-- Menghapus table 'chats'
DROP TABLE chats;
