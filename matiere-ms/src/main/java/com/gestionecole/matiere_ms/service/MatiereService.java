package com.gestionecole.matiere_ms.service;

import com.gestionecole.matiere_ms.entity.Matiere;
import com.gestionecole.matiere_ms.repository.MatiereRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MatiereService {
    private final MatiereRepository matiereRepository;

    public MatiereService(MatiereRepository matiereRepository) {
        this.matiereRepository = matiereRepository;
    }

    public List<Matiere> getAllMatieres() {
        return matiereRepository.findAll();
    }

    public Matiere createMatiere(Matiere matiere) {
        return matiereRepository.save(matiere);
    }
    public void updateMatiere(Matiere matiere) {

        matiereRepository.save(matiere);
    }

    public Optional<Matiere>  findMatiereById(Long id) {
        return matiereRepository.findById(id);
    }

    public void deleteMatiere(Long id) {
        matiereRepository.deleteById(id);
    }
}