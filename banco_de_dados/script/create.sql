/* lógico: */

CREATE TABLE Pessoa (
    id_pessoa serial PRIMARY KEY,
    nome varchar(25),
    sobrenome varchar(25),
    nasc date
);

CREATE TABLE funcionario (
    id_funcionario serial PRIMARY KEY,
    matricula serial,
    fk_pessoa serial
);

CREATE TABLE Cliente (
    id_cliente serial PRIMARY KEY,
    cep varchar(8),
    rua varchar(70),
    numero varchar(10),
    complemento varchar(45),
    referencia varchar(200),
    fk_pessoa serial
);

CREATE TABLE item_produto (
    id_item serial PRIMARY KEY,
    quantidade int,
    valor float,
    fk_produto serial,
    fk_carrinho serial
);

CREATE TABLE tipo_produto (
    id_tipo_prod serial PRIMARY KEY,
    nome varchar(25)
);

CREATE TABLE carrinho (
    id_carrinho serial PRIMARY KEY,
    valor float,
    fk_cliente serial
);

CREATE TABLE tipo_pagamento (
    id_tipo_pagamento serial PRIMARY KEY,
    nome_tipo varchar(20)
);

CREATE TABLE Produto (
    id_produto serial PRIMARY KEY,
    modelo varchar(45),
    oem varchar(45),
    altura varchar(10),
    largura varchar(10),
    comprimento varchar(10),
    marca varchar(10),
    valor float,
    numero_peca varchar(10),
    amperagem float,
    diamentro_interno float,
    qte_polos int,
    voltagem float,
    qte_sulcos int,
    fk_tipo_prod serial
);

CREATE TABLE pagamento (
    id_pagamento serial PRIMARY KEY,
    data date,
    valor float,
    fk_carrinho serial,
    fk_tipo_pagamento serial
);
 
ALTER TABLE funcionario ADD CONSTRAINT FK_funcionario_2
    FOREIGN KEY (fk_pessoa)
    REFERENCES Pessoa (id_pessoa);
 
ALTER TABLE Cliente ADD CONSTRAINT FK_Cliente_2
    FOREIGN KEY (fk_pessoa)
    REFERENCES Pessoa (id_pessoa);
 
ALTER TABLE item_produto ADD CONSTRAINT FK_item_produto_1
    FOREIGN KEY (fk_produto)
    REFERENCES Produto (id_produto);
 
ALTER TABLE item_produto ADD CONSTRAINT FK_item_produto_3
    FOREIGN KEY (fk_carrinho)
    REFERENCES carrinho (id_carrinho);
 
ALTER TABLE carrinho ADD CONSTRAINT FK_carrinho_2
    FOREIGN KEY (fk_cliente)
    REFERENCES Cliente (id_cliente);
 
ALTER TABLE Produto ADD CONSTRAINT FK_Produto_1
    FOREIGN KEY (fk_tipo_prod)
    REFERENCES tipo_produto (id_tipo_prod);
 
ALTER TABLE pagamento ADD CONSTRAINT FK_pagamento_1
    FOREIGN KEY (fk_tipo_pagamento)
    REFERENCES tipo_pagamento (id_tipo_pagamento);
 
ALTER TABLE pagamento ADD CONSTRAINT FK_pagamento_3
    FOREIGN KEY (fk_carrinho)
    REFERENCES carrinho (id_carrinho);
