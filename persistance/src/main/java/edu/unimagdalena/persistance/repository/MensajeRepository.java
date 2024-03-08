package edu.unimagdalena.persistance.repository;


import edu.unimagdalena.persistance.entities.Mensaje;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MensajeRepository extends JpaRepository<Mensaje, Long> {

}