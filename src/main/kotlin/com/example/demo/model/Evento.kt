package com.example.demo.model

import jakarta.persistence.*
import java.time.LocalDateTime

@Entity
data class Evento(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val evento_id: Long = 0,
    val nome: String,
    val data_evento: LocalDateTime,
    val tipo_evento: String,
    val vagas: Short,
    val local: String,
    val data_inicio: LocalDateTime,
    val descricao: String,
    val end_date: String,

    @ManyToMany(mappedBy = "evento")
    val participantes: List<Participante> = mutableListOf()

)