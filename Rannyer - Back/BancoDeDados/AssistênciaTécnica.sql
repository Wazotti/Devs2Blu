drop table if exists atendimento;
drop table if exists computador;
drop table if exists cliente;

create table cliente (
    id int primary key,
    nome varchar(100) not null,
    telefone varchar(20),
    email varchar(100)
);

create table computador (
    id int primary key,
    marca varchar(50),
    modelo varchar(100),
    tipo varchar(50)
);

create table atendimento (
    id int primary key,
    cliente_id int references cliente(id),
    computador_id int references computador(id),
    problema_descrito text,
    data_entrada date,
    data_saida date
);