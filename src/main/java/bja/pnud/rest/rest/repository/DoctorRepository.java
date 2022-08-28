package bja.pnud.rest.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import bja.pnud.rest.rest.model.Doctor;

public interface DoctorRepository extends JpaRepository<Doctor, Long>{
    
}
