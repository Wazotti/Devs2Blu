drop table if exists livro_autor;
drop table if exists livro;
drop table if exists autor;
drop table if exists genero;

create table genero (
    id int primary key,
    nome varchar(100) not null
);

create table autor (
    id int primary key,
    nome varchar(100) not null,
    data_nascimento date,
	nacionalidade varchar(50)
);

create table livro (
    id int primary key,
    titulo varchar(150) not null,
    ano_publicacao int,
    genero_id int references genero(id)
);

create table livro_autor (
    livro_id int references livro(id),
    autor_id int references autor(id),
    primary key (livro_id, autor_id)
);