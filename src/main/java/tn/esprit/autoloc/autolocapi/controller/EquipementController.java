package tn.esprit.autoloc.autolocapi.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.autolocapi.domain.Equipement;
import tn.esprit.autoloc.autolocapi.service.EquipementService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping
public class EquipementController {
    private final EquipementService equipementService;

    @GetMapping("/afficherTousEquipements")
    public List<Equipement> getAllEquipements(){
        return equipementService.afficherToutesEquipement();
    }

    @PostMapping("/ajouterEquipement")
    public Equipement ajouterEquipement(@RequestBody Equipement equipement) {
        return equipementService.ajouterequipement(equipement);
    }

    @PutMapping("/modifierEquipement")
    public Equipement modifierEquipement(@RequestBody Equipement equipement){
        return equipementService.modifierequipement(equipement);
    }

    @DeleteMapping("/supprimerEquipement/{idEquipement}")
    public void supprimerEquipement(@PathVariable Long idEquipement){
        equipementService.supprimerEquipement(idEquipement);
    }
}