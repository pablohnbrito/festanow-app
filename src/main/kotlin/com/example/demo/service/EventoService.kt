package com.example.demo.service

import com.example.demo.model.Evento
import com.example.demo.repository.EventoRepository
import org.springframework.stereotype.Service
import java.time.LocalDateTime

@Service
class EventoService(private val eventoRep: EventoRepository) {
    fun findAll(): List<Evento> = eventoRep.findAll()
    fun findById(id: Long): Evento? = eventoRep.findById(id).orElse(null)
    fun save(event: Evento): Evento = eventoRep.save(event)
    fun deleteById(id: Long) = eventoRep.deleteById(id)

}