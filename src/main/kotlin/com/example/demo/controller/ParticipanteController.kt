package com.example.demo.controller

import com.example.demo.model.Participante
import com.example.demo.service.ParticipanteService
import org.springframework.web.bind.annotation.*


@RestController
@RequestMapping("/participante")
class ParticipanteController (private val participanteService: ParticipanteService) {

    @GetMapping
    fun buscarParticipante() = participanteService.findAll()

    @GetMapping("/{id}")
    fun buscarParticipantePorId(@PathVariable id: Long) = participanteService.findById(id)

    @PostMapping
    fun criarParticipante(@RequestBody participante: Participante) = participanteService.save(participante)

    @DeleteMapping("/{id}")
    fun removerParticipante(@PathVariable id: Long) = participanteService.deleteById(id)

}