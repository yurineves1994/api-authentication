# Projeto de Autenticação com Spring Security e JWT

## Descrição

Este projeto é uma API de autenticação desenvolvida com Spring Security e JWT (JSON Web Token). A aplicação possui quatro rotas principais:

1. Rota de registro de usuário (POST) que retorna um token.
2. Rota de login para autenticação.
3. Rota de cadastro de produtos (com autenticação JWT obrigatória no header).
4. Rota de listagem de produtos (com autenticação JWT obrigatória no header).

## Configuração do Projeto

1. **Clone o repositório:**

   ```bash
   git clone https://github.com/yurineves1994/api-authentication.git
2. **Navegue até o diretório do projeto:**

    ```bash
    cd nome-do-repositorio
3. **Configuração do Banco de Dados (se necessário):**
  - Configure as informações do banco de dados no arquivo de configuração, no meu caso utilizei o MySQL

4. **Configuração do Backend (Spring Boot):**
  - Abra o projeto na sua IDE.
  - Certifique-se de ter as dependências instaladas.
  - Execute a aplicação.

## Funcionalidades

### Registro de Usuário

- Envie uma solicitação POST para /auth/register para registrar um novo usuário e receber um token.

### Login

- Envie uma solicitação POST para /auth/login para autenticar e receber um token.

### Cadastro de Produtos

- Envie uma solicitação POST para /products com o token JWT no header para cadastrar um novo produto.

### Listagem de Produtos

- Envie uma solicitação GET para /api/products com o token JWT no header para listar os produtos cadastrados.

## Tecnologias Utilizadas

### Backend (Spring Boot)

- [Spring Security](https://spring.io/projects/spring-security) - Gerenciamento de autenticação e autorização.
- [JWT (JSON Web Token)](https://jwt.io/) - Token seguro para autenticação.
- [Spring Data JPA](https://spring.io/projects/spring-data-jpa) - Repositório de dados para interação com o banco de dados.
- [Maven](https://maven.apache.org/) - Gerenciador de dependências e construção de projetos.


