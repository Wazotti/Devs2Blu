drop table if exists ingresso_evento;
drop table if exists ingresso;
drop table if exists evento;

create table evento (
    id int primary key,
    nome varchar(100),
    local varchar(100),
    data_evento timestamp
);

create table ingresso (
    id int primary key,
    tipo varchar(50),
    preco decimal(10,2)
);

create table ingresso_evento (
    ingresso_id int references ingresso(id),
    evento_id int references evento(id),
    primary key (ingresso_id, evento_id)
);