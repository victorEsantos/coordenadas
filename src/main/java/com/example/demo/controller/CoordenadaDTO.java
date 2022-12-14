package com.example.demo.controller;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor(staticName = "of")
@NoArgsConstructor
public class CoordenadaDTO {
    private Double latitude;
    private Double longitude;

    @Override
    public String toString() {
        return "CoordenadaDTO{" +
            "latitude=" + latitude +
            ", longitude=" + longitude +
            '}';
    }
}
