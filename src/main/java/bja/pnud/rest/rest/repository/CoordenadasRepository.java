package bja.pnud.rest.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import bja.pnud.rest.rest.model.Coordenadas;

public interface CoordenadasRepository extends JpaRepository<Coordenadas, Long> {
    
}
