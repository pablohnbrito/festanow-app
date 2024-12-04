package com.example.demo.controller

import com.example.demo.model.Evento
import com.example.demo.service.EventoService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/evento")
class EventoController(private val eventoService: EventoService) {

    @GetMapping
    fun buscarEventos() = eventoService.findAll()

    @GetMapping("/{id}")
    fun buscarEventoPorId(@PathVariable id: Long) = eventoService.findById(id)

    @PostMapping
    fun criarEvent(@RequestBody evento: Evento) = eventoService.save(evento)

    @DeleteMapping("/{id}")
    fun removerEvent(@PathVariable id: Long) = eventoService.deleteById(id)
}