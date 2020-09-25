# Tec-web-notes
Java + SQL notes app

# Criando o Banco

```SQL
CREATE DATABSE tecweb_1;

USE tecweb_1;

CREATE TABLE User ( id INT NOT NULL AUTO_INCREMENT, nome VARCHAR(32) NOT NULL, senha VARCHAR(32) NOT NULL , PRIMARY KEY (ID) );

CREATE TABLE Note (id INT NOT NULL AUTO_INCREMENT, note VARCHAR(150) NOT NULL, user_id INT NOT NULL, importance INT NOT NULL, PRIMARY KEY (ID));
```
