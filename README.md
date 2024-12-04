# FestaNow - Sistema de Gerenciamento de Eventos
![Logo FestaNow](ibagem.jpeg)


**FestaNow** é um sistema de gerenciamento de eventos desenvolvido com **Spring Boot** e **Kotlin**. A aplicação permite o gerenciamento completo de eventos, desde o cadastro até a participação dos usuários, integrando funcionalidades como a busca de eventos por data, tipo e localidade. Utiliza **MariaDB** como banco de dados e está preparada para ser facilmente implantada e mantida, tanto em ambientes locais quanto em containers Docker.

## Apêndice

Adicione qualquer outra informação relevante aqui, como recursos adicionais, links úteis, ou notas sobre futuras atualizações.

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

Retorna Todos os Eventos
```http
  GET localhost:8080/evento
```

Busca Evento por ID
```http
  GET localhost:8080/evento/{id}
```

Remove Evento por ID
```http
  DELETE localhost:8080/eventos/{id}
```
''
