<h4 align="center"> 
Backend do Refly 👨‍💻 Em andamento ⚠️
</h4>

<p align="center">
 <a href="#-sobre">Sobre</a> •
 <a href="#-requisições">Requisições</a> •
 <a href="#-dados-de-acesso-ao-banco">Dados de acesso ao banco</a> •
 <a href="#%EF%B8%8F-autor">Autor</a>
</p>

## 💻 Sobre

Projeto criado para armazenar as informações dos equipamentos doados para o projeto Metamorfose Digital.
Realizado utilizando as tecnologias Java e Spring Boot, também foi utilizado o banco de dados PostgreSQL, hospedado na plataforma da Heroku.

<h3 align="center">
⚙️ Tecnologias utilizadas
<p></p>
<img src="https://skillicons.dev/icons?i=java,spring,postgres,heroku"/>
</h3>

---

## 📥 Requisições

<h3>/colaboradores</h3>

`GET - Retorna uma lista com todos os colaboradores cadastrados no sistema.`

<h3>/equipamentos</h3>

`GET - Retorna uma lista com todos os equipamentos cadastrados no sistema.` <br>
`POST - Adiciona um equipamento no sistema.`

```
{
    "colaboradorId": 1,
    "statusId": 1,
    "tipoId": 1,
    "marcaId": 1,
    "observacao": "Observação do equipamento",
    "dataCadastro": "2022-09-20T19:25:43.511Z",
    "dataConclusao": "2022-09-20T21:25:43.511Z"
}
```

<h3>/users</h3>

`POST - Cria um usuário no sistema, a senha é criptografada automaticamente através do Spring Security.`

```
{
    "name": "Bruno Machado da Rosa",
    "email": "brunomdr@gmail.com",
    "password": "bruno123"
}
```
---

## 🔐 Dados de acesso ao banco

```
HOST: ec2-18-209-78-11.compute-1.amazonaws.com
PORTA: 5432
DATABASE: dbkd9e7v89u3nc
```

---

## ✒️ Autor

| [<img src="https://avatars.githubusercontent.com/u/75590326?v=4" width=115 > <br> <sub> Bruno Machado </sub>](https://github.com/brunomdrrosa) |
| :--------------------------------------------------------------------------------------------------------------------------------------------: |

<h2 >Entre em contato 🤙🏽</h2>

<div align="center">
<a href="https://linkedin.com/in/bruno-machado-da-rosa/" target="_blank"><img src="https://img.shields.io/badge/Bruno Machado da Rosa-0077B5?style=for-the-badge&logo=linkedin&logoColor=white" alt=""></a>
<a href="mailto:brunomdr46@gmail.com" target="_blank"><img src="https://img.shields.io/badge/brunomdr46@gmail.com-D14836?style=for-the-badge&logo=gmail&logoColor=white" alt=""></a>
</div>
