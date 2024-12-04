# FestaNow - Sistema de Gerenciamento de Eventos
![Logo FestaNow](ibagem.jpeg)


**FestaNow** é um sistema de gerenciamento de eventos desenvolvido com **Spring Boot** e **Kotlin**. A aplicação permite o gerenciamento completo de eventos, desde o cadastro até a participação dos usuários, integrando funcionalidades como a busca de eventos por data, tipo e localidade. Utiliza **MariaDB** como banco de dados e está preparada para ser facilmente implantada e mantida, tanto em ambientes locais quanto em containers **Docker**.

#### - Para ajudar no projeto, verifique primeiro o [CONTRIBUTING.md](https://github.com/pablohnbrito/festanow-app/blob/main/CONTRIBUTING.md)

## 📖 Autores

- Pablo Henrique Brito [@pablohnbrito](https://github.com/pablohnbrito) - DevOps

- Vinicius Fernandes [@vinicius790](https://github.com/vinicius790)  - Documentação

- Dayvison Freitas [@Dayvisonf](https://github.com/Dayvisonf) - Desenvolvedor Backend

- Natã Ferreira [@INatanDev](https://github.com/INatanDev) - Desenvolvedor Backend
  
- Viviana Domingos [@vivianadomingos](https://github.com/vivianadomingos) - Scrum Master

  

# Documentação da API

## Eventos

#### Cadastro de Evento

```http
  POST localhost:8080/evento

  {
    "nome": "Festa de Aniversário",
    "descricao": "Festa de aniversário com música e comida.",
    "dataEvento": "2024-12-20T18:00:00",
    "dataInicio": "2024-12-20T18:00:00",
    "endDate": "2024-12-20T23:59:00",
    "local": "Rua do Festa, 123, São Paulo",
    "tipoEvento": "Aniversário",
    "vagas": 100
  }
```

#### Retorna Todos os Eventos
```http
  GET localhost:8080/evento
```

#### Busca Evento por ID
```http
  GET localhost:8080/evento/{id}
```

#### Remove Evento por ID
```http
  DELETE localhost:8080/eventos/{id}
```


## Participantes

#### Cadastro de Participante

```http
  POST localhost:8080/participante

  {
    "nome": "João Silva",
    "email": "joao.silva@example.com",
    "senha": "senha123"
  }

```

#### Retorna Todos os Participantes
```http
  GET localhost:8080/participante
```

#### Busca Participante por ID
```http
  GET localhost:8080/participante/{id}
```

#### Remove Participante por ID
```http
  DELETE localhost:8080/participante/{id}
```


