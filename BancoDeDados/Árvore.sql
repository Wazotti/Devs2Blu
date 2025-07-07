drop table if exists arvore;
drop table if exists tipo_arvore;
drop table if exists area_verde;
drop table if exists responsavel;

create table tipo_arvore (
    id int primary key,
    nome varchar(50) not null
);

create table area_verde (
    id int primary key,
    nome varchar(100) not null,
    bairro varchar(100),
    cidade varchar(100)
);

create table responsavel (
    id int primary key,
    nome varchar(100) not null,
    entidade varchar(100),
    contato varchar(100)
);

create table arvore (
    id int primary key,
    especie varchar(100),
    altura decimal(5,2),
    idade_estimada int,
    localizacao varchar(150),
    data_plantio date,
    tipo_id int references tipo_arvore(id),
    area_id int references area_verde(id),
    responsavel_id int references responsavel(id),
    estado_sanitario varchar(100),
    observacoes text
);
