package com.example.demo.repository;

import com.example.demo.entity.Coordenada;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoordenadaRepository extends CrudRepository<Coordenada, Long> {
}
