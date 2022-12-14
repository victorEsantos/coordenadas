package com.example.demo.controller;

import com.example.demo.entity.Coordenada;
import com.example.demo.service.CoordenadaService;
import lombok.RequiredArgsConstructor;
import org.springdoc.api.annotations.ParameterObject;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.util.List;

@RestController
@RequestMapping(path = CoordenadaController.PATH)
@CrossOrigin("*")
@RequiredArgsConstructor
public class CoordenadaController {
    public static final String PATH = "coordenada";

    private final CoordenadaService coordenadaService;

    @PostMapping(path = "salvar")
    public ResponseEntity<String> save(@RequestBody CoordenadaDTO dto) {
       var id = coordenadaService.save(Coordenada.from(dto));

        var uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(id).toUri();

        return ResponseEntity.created(uri).build();
    }

    @PostMapping
    public ResponseEntity<String> saveNaUrl(@ParameterObject CoordenadaDTO dto) {
        var id = coordenadaService.save(Coordenada.from(dto));

        var uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(id).toUri();

        return ResponseEntity.created(uri).build();
    }

    @GetMapping(path = "/coordenadas")
    public List<Coordenada> getAll() {
        return coordenadaService.getAll();
    }
}
