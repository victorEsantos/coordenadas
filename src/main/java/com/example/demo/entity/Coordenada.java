package com.example.demo.entity;

import com.example.demo.controller.CoordenadaDTO;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class Coordenada {

    @Id
    @GeneratedValue
    private Long id;

    private Double latitude;
    private Double longitude;

    public Coordenada(Double latitude, Double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public Coordenada() {

    }

    public static Coordenada from(CoordenadaDTO dto) {
        return new Coordenada(dto.getLatitude(), dto.getLongitude());
    }
}
