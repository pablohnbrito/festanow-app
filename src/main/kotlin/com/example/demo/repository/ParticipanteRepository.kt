package com.example.demo.repository

import com.example.demo.model.Participante
import org.springframework.data.jpa.repository.JpaRepository

interface ParticipanteRepository : JpaRepository<Participante, Long>