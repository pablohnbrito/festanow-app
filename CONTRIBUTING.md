# Contributing to FestaNow

Obrigado por considerar contribuir para o **FestaNow**! Este guia fornece informações sobre como contribuir para o repositório.

## Descrição do Projeto

**FestaNow** é um aplicativo de gerenciamento de eventos, desenvolvido em **Spring Boot** com **Kotlin**, e utiliza **MariaDB** como banco de dados. O objetivo do aplicativo é permitir a criação e gerenciamento de eventos, como festas, concertos, palestras, etc. O sistema também permite que os participantes se registrem em eventos específicos e sejam notificados sobre as atualizações.

## Como Baixar o Repositório

Siga os passos abaixo para obter uma cópia local do repositório:

### 1. **Clonar o repositório:**

   Abra o terminal e execute o seguinte comando para clonar o repositório:

   ```bash
   git clone https://github.com/pablohnbrito/festanow.git
  ```
### 2. Entrar no diretório do projeto:

Após clonar o repositório, entre no diretório do projeto com o comando:

 ```bash
  cd festanow
 ```
### 3. Instalar as dependências:

Caso você precise instalar as dependências, use o Maven para isso:
  ```bash
  mvn install
  ```

## Pré-requisitos
Antes de começar a contribuir, você deve ter os seguintes pré-requisitos instalados em sua máquina:

- Java 17 ou superior (certifique-se de que está instalado corretamente)
- Kotlin
- MariaDB ou MySQL
- Docker (opcional, se desejar rodar o banco de dados em um container)
- Maven
- IDE como IntelliJ IDEA (recomendado para projetos Spring Kotlin)
- Além disso, é importante ter uma conta no GitHub para poder contribuir.

Como Contribuir
Siga as etapas abaixo para contribuir para o FestaNow:

### 1. Fork o repositório:

  - Vá para o repositório do FestaNow no GitHub.
  - Clique no botão Fork no canto superior direito para criar uma cópia do repositório em sua conta.
  - Clone o seu fork:

### 2. Clone o repositório em sua máquina local:

```bash
git clone https://github.com/seu-usuario/festanow.git
```

### 3. Crie uma branch para sua mudança:

Antes de começar a fazer alterações, crie uma nova branch a partir da main:

```bash
git checkout -b minha-feature
```

### 4. Faça suas alterações:

  - Modifique, adicione ou remova código conforme necessário.
  - Certifique-se de testar as alterações localmente.

### 5. Commit suas alterações:

Após fazer as alterações, faça o commit delas:

```bash
git add .
git commit -m "Descrição das alterações feitas"
```

### 6. Push para o seu fork:

Envie as suas alterações para o repositório remoto:

```bash
git push origin minha-feature
```

### 7. Abra um Pull Request:

  - Vá até o seu repositório no GitHub.
  - Clique em Compare & Pull Request.
  - Descreva as alterações que você fez.
  - Clique em Create Pull Request.
    
### 8. Aguarde revisão:

O time de manutenção do repositório irá revisar o seu Pull Request. Eles podem pedir algumas mudanças ou aceitá-lo diretamente.

### 9. Merge no repositório principal:

Quando o seu Pull Request for aprovado, ele será integrado à branch principal (main).

Código de Conduta
Por favor, siga nosso Código de Conduta ao contribuir para este projeto.

Agradecimentos
Obrigado por contribuir para o FestaNow! Sua contribuição é valiosa para melhorar a aplicação e garantir a melhor experiência para todos os usuários.

```markdown

### Explicação das Seções

- **Descrição do Projeto:** Uma breve explicação sobre o que é o projeto e como ele funciona.
- **Como Baixar o Repositório:** Instruções sobre como clonar o repositório e rodar o projeto.
- **Pré-requisitos:** Ferramentas e software necessários para trabalhar no projeto.
- **Como Contribuir:** Um passo a passo para contribuir para o projeto, desde fazer um fork até abrir um pull request.

Esse `CONTRIBUTING.md` serve para orientar qualquer desenvolvedor interessado em colaborar no projeto, com instruções claras e simples para que todos possam seguir.
```



