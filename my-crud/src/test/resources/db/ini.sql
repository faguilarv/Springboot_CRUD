create database clientes_systems;

\connect clientes_systems;

create table usuarios (
  id bigint primary key generated always as identity,
  name character varying(255) not null,

  CONSTRAINT usuarios_name_uniq UNIQUE (name)
);

insert into usuarios (name) values ('Francisco'), ('Aguilar'), ('Vergara'), ('test');