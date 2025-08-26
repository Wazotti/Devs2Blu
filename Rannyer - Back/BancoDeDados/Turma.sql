drop table if exists aluno_turma;
drop table if exists aluno;
drop table if exists turma;

create table turma (
    id int primary key,
    nome varchar(100),
    turno varchar(20)
);

create table aluno (
    id int primary key,
    nome varchar(100),
    data_nascimento date,
    matricula varchar(20) unique
);

create table aluno_turma (
    aluno_id int references aluno(id),
    turma_id int references turma(id),
    primary key (aluno_id, turma_id)
);