package edu.unimagdalena.persistance.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import edu.unimagdalena.persistance.entities.Partida;

public interface PartidaRepository extends JpaRepository<Partida,Long>{ }