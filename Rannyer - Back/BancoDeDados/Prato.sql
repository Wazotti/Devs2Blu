drop table if exists prato_ingrediente;
drop table if exists prato;
drop table if exists ingrediente;

create table ingrediente (
    id int primary key,
    nome varchar(100),
    tipo varchar(50)
);

create table prato (
    id int primary key,
    nome varchar(100),
    preco decimal(10,2),
    categoria varchar(50)
);

create table prato_ingrediente (
    prato_id int references prato(id),
    ingrediente_id int references ingrediente(id),
    primary key (prato_id, ingrediente_id)
);