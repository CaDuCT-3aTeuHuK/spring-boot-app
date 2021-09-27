DROP TABLE IF EXISTS books;
DROP TABLE IF EXISTS authors;

CREATE TABLE authors (
  id INT AUTO_INCREMENT PRIMARY KEY,
  full_name VARCHAR(250) NOT NULL

);



CREATE TABLE books (
   id INT AUTO_INCREMENT PRIMARY KEY,
   title VARCHAR(250) NOT NULL,
   cost INT NOT NULL,
   id_author INT NOT NULL REFERENCES authors(id)
);

INSERT INTO authors(id, full_name) VALUES (1, 'Adolf Hitler');
INSERT INTO authors(id, full_name) VALUES (2, 'Iosif Stalin');
INSERT INTO authors(id, full_name) VALUES (3, 'Tolkien');
INSERT INTO authors(id, full_name) VALUES (4, '2ya lichnost Tolkiena');
INSERT INTO books(id, title, cost, id_author) VALUES (1, '1', 500, 2);
INSERT INTO books(id, title, cost, id_author) VALUES (2, '2', 1500, 1);
INSERT INTO books(id, title, cost, id_author) VALUES (3, '3', 2500, 3);
INSERT INTO books(id, title, cost, id_author) VALUES (4, '4', 1504, 4);
INSERT INTO books(id, title, cost, id_author) VALUES (5, '5', 2505, 1);
