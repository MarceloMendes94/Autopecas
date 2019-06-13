/* logic_model: */

CREATE TABLE funcionario (
    cpf VARCHAR PRIMARY KEY,
    nome VARCHAR(75),
    nascimento DATE
);

CREATE TABLE Cliente (
    cpf  VARCHAR(11) PRIMARY KEY ,
    nome VARCHAR(75),
    nascimento DATE,
    email VARCHAR(150),
    senha VARCHAR(150),
    logradouro VARCHAR(150),
    cep     VARCHAR(8),
    numero  VARCHAR(8),
    complemento VARCHAR(150),
    referencia VARCHAR(150)
);

CREATE TABLE frabricane (
    id INTEGER PRIMARY KEY ,
    marca VARCHAR(30),
    nomeroOEM VARCHAR(10)
);

CREATE TABLE produto (
    numeroPeca INTEGER PRIMARY KEY ,
    valor   FLOAT,
    altura  VARCHAR(10),
    largura VARCHAR(10),
    comprimento VARCHAR(10),
    diamentro_Interno INTEGER,
    diamentro_Externo VARCHAR,
    amperagem   VARCHAR(10),
    voltagem    VARCHAR(10),
    qte_sulcos  INTEGER,
    qte_polos   INTEGER,
    fk_fabricante INTEGER,
    fk_tipo_produto INTEGER
);

CREATE TABLE tipo_produto (
    id INTEGER PRIMARY KEY ,
    tipo VARCHAR(25)
);

CREATE TABLE item_produto (
    id INTEGER  PRIMARY KEY,
    fk_produto  INTEGER,
    fk_compra   INTEGER,
    quantidade  INTEGER,
    valor FLOAT
);

CREATE TABLE compra (
    codigo_compra   INTEGER PRIMARY KEY,
    fk_cliente      VARCHAR(11),
    status          INTEGER,
    codigo_pgto     VARCHAR(100)
);
 
ALTER TABLE produto ADD CONSTRAINT FK_produto_3
    FOREIGN KEY (fk_fabricante)
    REFERENCES frabricane (id);
 
ALTER TABLE produto ADD CONSTRAINT FK_produto_4
    FOREIGN KEY (fk_tipo_produto)
    REFERENCES tipo_produto (id);
 
ALTER TABLE item_produto ADD CONSTRAINT FK_item_produto_2
    FOREIGN KEY (fk_compra)
    REFERENCES compra (codigo_compra);
 
ALTER TABLE item_produto ADD CONSTRAINT FK_item_produto_3
    FOREIGN KEY (fk_produto)
    REFERENCES produto (numeroPeca);
 
ALTER TABLE compra ADD CONSTRAINT FK_compra_1
    FOREIGN KEY (fk_cliente)
    REFERENCES Cliente (cpf);
/* 
ALTER TABLE compra ADD CONSTRAINT FK_compra_2
    FOREIGN KEY (fk_item)
    REFERENCES item_produto (id);*/