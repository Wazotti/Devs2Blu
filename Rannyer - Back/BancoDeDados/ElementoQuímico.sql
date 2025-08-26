drop table if exists elemento;
drop table if exists classificacao;
drop table if exists estado_fisico;
drop table if exists familia_quimica;

create table classificacao (
    id int primary key,
    nome varchar(50) not null
);

create table estado_fisico (
    id int primary key,
    nome varchar(20) not null
);

create table familia_quimica (
    id int primary key,
    nome varchar(100) not null
);

create table elemento (
    id int primary key,
    simbolo varchar(5) not null,
    nome varchar(50) not null,
    numero_atomico int not null,
    massa_atomica decimal(10, 3),
    grupo int,
    periodo int,
    classificacao_id int references classificacao(id),
    estado_fisico_id int references estado_fisico(id),
    familia_id int references familia_quimica(id)
);