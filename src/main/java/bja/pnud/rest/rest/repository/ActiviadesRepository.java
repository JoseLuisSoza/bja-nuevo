package bja.pnud.rest.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import bja.pnud.rest.rest.model.Actividades;

public interface ActiviadesRepository extends JpaRepository<Actividades, Long> {
    
}
