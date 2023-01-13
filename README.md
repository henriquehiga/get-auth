# Projeto de Autenticação de Usuário
Este projeto fornece uma solução de autenticação de usuário baseada na arquitetura limpa e no desenvolvimento guiado por testes (TDD). Ele oferece funcionalidades para criação de usuário, autenticação e recuperação de senha, validações e garante a segurança dos dados. Tecnologias utilizadas são Java, Maven e JUnit.

## Tecnologias Utilizadas
- Java 11
- Maven
- JUnit

## Estrutura do Projeto
O projeto segue a arquitetura limpa, com as seguintes camadas:

- Domínio: contém as classes de domínio e regras de negócios da aplicação.
- Aplicação: contém as classes de aplicação que servem como intermediárias entre o domínio e as interfaces de usuário.
- Infraestrutura: contém as classes de infraestrutura, como acesso a banco de dados, recursos externos, etc.
- Interface: contém as interfaces de usuário, como controllers, views, etc.

## Funcionalidades
- Criação de usuário: O usuário pode se registrar fornecendo seu nome de usuário, email e senha. As informações são validadas antes de serem armazenadas no banco de dados.
- Autenticação de usuário: O usuário pode se autenticar fornecendo seu nome de usuário e senha. A autenticação é realizada comparando as informações fornecidas com as informações armazenadas no banco de dados.
- Recuperação de senha: O usuário pode solicitar uma redefinição de senha fornecendo seu endereço de e-mail. Um link de redefinição de senha é enviado para o e-mail do usuário.
- 