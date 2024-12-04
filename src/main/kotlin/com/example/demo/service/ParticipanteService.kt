package com.example.demo.service

import com.example.demo.model.Participante
import com.example.demo.repository.ParticipanteRepository
import org.springframework.stereotype.Service

@Service
class ParticipanteService(private val participanteRepository: ParticipanteRepository) {
    fun findAll(): List<Participante> = participanteRepository.findAll()
    fun findById(id: Long): Participante? = participanteRepository.findById(id).orElse(null)
    fun save(participante: Participante): Participante = participanteRepository.save(participante)
    fun deleteById(id: Long) = participanteRepository.deleteById(id)
}