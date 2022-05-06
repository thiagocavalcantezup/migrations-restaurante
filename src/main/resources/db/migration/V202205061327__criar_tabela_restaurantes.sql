CREATE TABLE restaurantes (
  id BIGINT NOT NULL AUTO_INCREMENT PRIMARY KEY,
  nome_fantasia VARCHAR(255) NOT NULL,
  cnpj VARCHAR(18) NOT NULL,
  endereco VARCHAR(120) NOT NULL,
  bairro VARCHAR(60) NOT NULL,
  cidade VARCHAR(60) NOT NULL,
  estado VARCHAR(60) NOT NULL,
  cep VARCHAR(9) NOT NULL,
  telefone VARCHAR(20),
  celular VARCHAR(20),
  email VARCHAR(60),
  site VARCHAR(120),
  CONSTRAINT UK_RESTAURANTE_CNPJ UNIQUE (cnpj)
)
