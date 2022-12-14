create table colaborador (id int8 generated by default as identity, name varchar(255), primary key (id));
create table equipamento (id int8 generated by default as identity, colaborador_id int8, data_cadastro timestamp, data_conclusao timestamp, marca_id int8, observacao varchar(255), status_id int8, tipo_id int8, primary key (id));
create table equipamento_marca (id int8 not null, descricao varchar(255), equipamento_id int8, primary key (id));
create table equipamento_status (id int8 not null, descricao varchar(255), equipamento_id int8, primary key (id));
create table equipamento_tipo (id int8 not null, descricao varchar(255), equipamento_id int8, primary key (id));
create table users (id int8 generated by default as identity, email varchar(255), name varchar(255), password varchar(255), primary key (id));
alter table if exists equipamento_marca add constraint FKedxru5ulebjsi5oktklr7yhto foreign key (equipamento_id) references equipamento;
alter table if exists equipamento_status add constraint FK1h3yq8tog87g1w42yupf8eeg3 foreign key (equipamento_id) references equipamento;
alter table if exists equipamento_tipo add constraint FK1b3bs2s4vfmfoh91np3fqvlip foreign key (equipamento_id) references equipamento;
INSERT INTO users(id, name, email, password) VALUES (1, 'Bruno Machado', '@gmail.com', '$2a$10$j1Eic8Okp.IczSVQbU.ru.s.dXoxd1fdzWtK2os9oE9y9ZO8wvMx6');
INSERT INTO users(id, name, email, password) VALUES (2, 'Gabriel Espitalher', '@outlook.com', '$2a$10$j1Eic8Okp.IczSVQbU.ru.s.dXoxd1fdzWtK2os9oE9y9ZO8wvMx6');
INSERT INTO users(id, name, email, password) VALUES (3, 'Rian Oliveira', '@gmail.com ', '$2a$10$j1Eic8Okp.IczSVQbU.ru.s.dXoxd1fdzWtK2os9oE9y9ZO8wvMx6');
INSERT INTO users(id, name, email, password) VALUES (4, 'Clóvis Silveira', '@cesuca.edu.br', '$2a$10$j1Eic8Okp.IczSVQbU.ru.s.dXoxd1fdzWtK2os9oE9y9ZO8wvMx6');
INSERT INTO colaborador(id, name) VALUES (1, 'Bruno Machado');
INSERT INTO colaborador(id, name) VALUES (2, 'Gabriel Espitalher');
INSERT INTO colaborador(id, name) VALUES (3, 'Rian Oliveira');
INSERT INTO colaborador(id, name) VALUES (4, 'Clóvis Silveira');
INSERT INTO equipamento(id, colaborador_id, data_cadastro, data_conclusao, marca_id, observacao, status_id, tipo_id) VALUES (1, 1, '2022-09-05 20:14:00.742000000', '2022-09-12 19:15:21.742000000', 1, 'Equipamento em ótimo estado', 1, 1);
INSERT INTO equipamento(id, colaborador_id, data_cadastro, data_conclusao, marca_id, observacao, status_id, tipo_id) VALUES (2, 2, '2022-09-05 20:14:00.742000000', '2022-09-12 19:15:21.742000000', 2, 'Equipamento em ótimo estado', 2, 2);
INSERT INTO equipamento(id, colaborador_id, data_cadastro, data_conclusao, marca_id, observacao, status_id, tipo_id) VALUES (3, 3, '2022-09-05 20:14:00.742000000', '2022-09-12 19:15:21.742000000', 3, 'Equipamento em ótimo estado', 3, 3);
INSERT INTO equipamento(id, colaborador_id, data_cadastro, data_conclusao, marca_id, observacao, status_id, tipo_id) VALUES (4, 4, '2022-09-05 20:14:00.742000000', '2022-09-12 19:15:21.742000000', 4, 'Equipamento em ótimo estado', 4, 4);
