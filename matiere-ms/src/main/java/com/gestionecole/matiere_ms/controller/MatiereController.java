//package com.gestionecole.matiere_ms.controller;
//
//import com.gestionecole.matiere_ms.entity.Matiere;
//import com.gestionecole.matiere_ms.service.MatiereService;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/Matieres")
//public class MatiereController {
//    private final MatiereService matiereService;
//
//    public MatiereController(MatiereService matiereService) {
//        this.matiereService = matiereService;
//    }
//
//    @GetMapping
//    public List<Matiere> getAllMatieres() {
//        List<Matiere> mat =  matiereService.getAllMatieres();
//        System.out.println(mat);
//        return mat;
//    }
//
//    @PostMapping
//    public Matiere createMatiere(@RequestBody Matiere matiere) {
//        System.out.println("controller");
//
//
//        return matiereService.createMatiere(matiere);
//    }
//
//    @DeleteMapping("/{id}")
//    public void deleteMatiere(@PathVariable Long id) {
//        matiereService.deleteMatiere(id);
//    }
//}
