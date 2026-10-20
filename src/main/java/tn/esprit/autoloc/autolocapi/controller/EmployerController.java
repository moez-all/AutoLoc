package tn.esprit.autoloc.autolocapi.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.autolocapi.domain.Employe;
import tn.esprit.autoloc.autolocapi.service.EmployeService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping
public class EmployerController {
    private final EmployeService employeService;

    @GetMapping("/afficherTousEmployes")
    public List<Employe> getAllEmployes(){
        return employeService.afficherToutesEmploye();
    }

    @PostMapping("/ajouterEmploye")
    public Employe ajouterEmploye(@RequestBody Employe employe) {
        return employeService.ajouteremployer(employe);
    }

    @PutMapping("/modifierEmploye")
    public Employe modifierEmploye(@RequestBody Employe employe){
        return employeService.modifieremployer(employe);
    }

    @DeleteMapping("/supprimerEmploye/{idEmploye}")
    public void supprimerEmploye(@PathVariable Long idEmploye){
        employeService.supprimerEmployer(idEmploye);
    }
}
