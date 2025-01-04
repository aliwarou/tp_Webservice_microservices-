package com.gestionecol.classe.service;

import com.gestionecol.classe.entity.Classe;
import com.gestionecol.classe.repository.ClasseRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClasseService {
    private final ClasseRepository classeRepository;

    public ClasseService(ClasseRepository classeRepository) {
        this.classeRepository = classeRepository;
    }

    public List<Classe> getAllClasses() {
        return classeRepository.findAll();
    }

    public Classe createClasse(Classe classe) {
        return classeRepository.save(classe);
    }

    public Optional<Classe>  getClasseById(Long id) {
        return classeRepository.findById(id);
    }

    public Classe updateClasse(Classe classe) {
        return classeRepository.save(classe);
    }
    public void deleteClasse(Long id) {
        classeRepository.deleteById(id);
    }
}
