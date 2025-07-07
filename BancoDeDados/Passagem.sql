drop table if exists passagem;
drop table if exists voo;
drop table if exists passageiro;
drop table if exists companhia;

create table companhia (
    id int primary key,
    nome varchar(100) not null
);

create table passageiro (
    id int primary key,
    nome varchar(100) not null,
    cpf varchar(14) unique,
    data_nascimento date
);

create table voo (
    id int primary key,
    origem varchar(100),
    destino varchar(100),
    data_partida timestamp,
    companhia_id int references companhia(id)
);

create table passagem (
    id int primary key,
    voo_id int references voo(id),
    passageiro_id int references passageiro(id),
    assento varchar(10),
    preco decimal(10,2)
);