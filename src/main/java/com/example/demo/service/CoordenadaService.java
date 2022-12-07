package com.example.demo.service;

import com.example.demo.entity.Coordenada;
import com.example.demo.repository.CoordenadaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CoordenadaService {

    private final CoordenadaRepository coordenadaRepository;

    public Long save(Coordenada coordenada) {
        var newCoordenada = coordenadaRepository.save(coordenada);

        return newCoordenada.getId();
    }

    public List<Coordenada> getAll() {
        return (List<Coordenada>) coordenadaRepository.findAll();
    }
}
