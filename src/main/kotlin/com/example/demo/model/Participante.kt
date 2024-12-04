package com.example.demo.model

import com.fasterxml.jackson.annotation.JsonIgnore
import jakarta.persistence.*

@Entity
data class Participante(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val participante_id: Long = 0,

    val nome: String,
    val email: String,
    @JsonIgnore
    val senha: String,

    @ManyToMany
    @JoinTable(
        name = "participante_evento",
        joinColumns = [JoinColumn(name = "participante_id")],
        inverseJoinColumns = [JoinColumn(name = "evento_id")]
    )
    @JsonIgnore
    val evento: List<Evento> = mutableListOf()

)