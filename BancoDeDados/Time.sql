drop table if exists jogador;
drop table if exists time;

create table time (
    id int primary key,
    nome varchar(100),
    cidade varchar(100),
    tecnico varchar(100)
);

create table jogador (
    id int primary key,
    nome varchar(100),
    posicao varchar(50),
    data_nascimento date,
    time_id int references time(id)
);