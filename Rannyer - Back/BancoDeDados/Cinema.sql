drop table if exists ingresso;
drop table if exists filme;
drop table if exists sala;

create table sala (
    id int primary key,
    numero int,
    capacidade int
);

create table filme (
    id int primary key,
    titulo varchar(150),
    duracao int,
    classificacao varchar(10),
    genero varchar(50)
);

create table ingresso (
    id int primary key,
    filme_id int references filme(id),
    sala_id int references sala(id),
    data_sessao timestamp,
    assento varchar(10),
    preco decimal(10,2)
);