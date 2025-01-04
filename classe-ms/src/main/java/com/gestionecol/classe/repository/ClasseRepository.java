package com.gestionecol.classe.repository;


import com.gestionecol.classe.entity.Classe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface   ClasseRepository extends JpaRepository<Classe,Long> {
}
