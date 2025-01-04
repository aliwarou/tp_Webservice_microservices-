package com.gestionecol.classe.controller;


import com.gestionecol.classe.entity.Classe;
import com.gestionecol.classe.service.ClasseService;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.Optional;

@Controller
public class ClasseController {


    private final ClasseService classeService;

    public ClasseController(ClasseService classeService) {
        this.classeService = classeService;
    }



    @QueryMapping
    public Optional<Classe> getClasse(Long id) {
        return classeService.getClasseById(id);
    }


    @QueryMapping
    public List<Classe> getAllClasses() {
        return classeService.getAllClasses();
    }


    @MutationMapping
    public Classe createClasse(@Argument String nom, @Argument String description, @Argument String niveau) {
        Classe classe = new Classe();
        classe.setNom(nom);
        classe.setDescription(description);
        classe.setNiveau(niveau);
        return classeService.createClasse(classe);
    }


    @MutationMapping
    public Classe updateClasse(@Argument String nom, @Argument String description, @Argument String niveau,@Argument Long id) {
       Classe classe = new Classe();
       classe.setNom(nom);
       classe.setDescription(description);
       classe.setNiveau(niveau);
       return classeService.updateClasse(classe);
    }


    public void deleteClassById(Long id) {
        classeService.getClasseById(id);
    }







}
