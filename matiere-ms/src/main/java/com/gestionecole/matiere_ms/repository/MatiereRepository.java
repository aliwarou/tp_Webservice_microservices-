package com.gestionecole.matiere_ms.repository;

import com.gestionecole.matiere_ms.entity.Matiere;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface MatiereRepository extends JpaRepository<Matiere, Long> {
}


