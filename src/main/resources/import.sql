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

