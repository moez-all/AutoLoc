package tn.esprit.autoloc.autolocapi.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.autolocapi.domain.Agence;
import tn.esprit.autoloc.autolocapi.service.AgenceService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping
public class AgenceController {
    private final AgenceService agenceService;

    @GetMapping("/afficherToutesAgences")
    public List<Agence> getAllAgences(){
        return agenceService.afficherToutesAgences();
    }

    @PostMapping("/ajouterAgence")
    public Agence ajouterAgence(@RequestBody Agence agence) {
        return agenceService.ajouteragence(agence);
    }

    @PutMapping("/modifierAgence")
    public Agence modifierAgence(@RequestBody Agence agence){
        return agenceService.modifieragence(agence);
    }

    @DeleteMapping("/supprimerAgence/{idAgence}")
    public void supprimerAgence(@PathVariable Long idAgence){
        agenceService.supprimerAgence(idAgence);
    }
}