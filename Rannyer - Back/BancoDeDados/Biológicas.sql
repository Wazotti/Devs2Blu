drop table if exists planta_fruto;
drop table if exists fruto;
drop table if exists planta;

create table planta (
    id int primary key,
    nome_cientifico varchar(150) not null,
    nome_popular varchar(100),
    familia varchar(100),
    tipo varchar(50),
    habitat varchar(100)
);

create table fruto (
    id int primary key,
    nome varchar(100),
    tipo varchar(50),
    comestivel boolean
);

create table planta_fruto (
    planta_id int references planta(id),
    fruto_id int references fruto(id),
    primary key (planta_id, fruto_id)
);