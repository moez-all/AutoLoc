package tn.esprit.autoloc.autolocapi.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.autolocapi.domain.Paiment;
import tn.esprit.autoloc.autolocapi.service.PaimentService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping
public class PaiementController {
    private final PaimentService paiementService;

    @GetMapping("/afficherTousPaiements")
    public List<Paiment> getAllPaiements(){
        return paiementService.afficherToutesPaiment();
    }

    @PostMapping("/ajouterPaiement")
    public Paiment ajouterPaiement(@RequestBody Paiment paiement) {
        return paiementService.ajouterpaiment(paiement);
    }

    @PutMapping("/modifierPaiement")
    public Paiment modifierPaiement(@RequestBody Paiment paiement){
        return paiementService.modifierpaiment(paiement);
    }

    @DeleteMapping("/supprimerPaiement/{idPaiement}")
    public void supprimerPaiement(@PathVariable Long idPaiment){
        paiementService.supprimer(idPaiment);
    }
}