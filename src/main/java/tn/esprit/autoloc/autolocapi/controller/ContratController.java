package tn.esprit.autoloc.autolocapi.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.autolocapi.service.IContratService1;
import tn.esprit.autoloc.autolocapi.domain.Contrat;
import tn.esprit.autoloc.autolocapi.service.ContratService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping
public class ContratController {
    private final ContratService contratService;

    @GetMapping("/afficherTousContrats")
    public List<Contrat> getAllContrats(){
        return contratService.afficherToutescontrat();
    }

    @PostMapping("/ajouterContrat")
    public Contrat ajouterContrat(@RequestBody Contrat contrat) {
        return contratService.ajoutercontrat(contrat);
    }

    @PutMapping("/modifierContrat")
    public Contrat modifierContrat(@RequestBody Contrat contrat){
        return contratService.modifiercontrat(contrat);
    }

    @DeleteMapping("/supprimerContrat/{idContrat}")
    public void supprimerContrat(@PathVariable Long idContrat){
        contratService.supprimercontrat(idContrat);
    }
}
