package tn.esprit.autoloc.autolocapi.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.autolocapi.domain.Vehicule;
import tn.esprit.autoloc.autolocapi.service.VehiculeService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping
public class VehiculeController {
    private final VehiculeService vehiculeService;

    @GetMapping("/afficherTousVehicules")
    public List<Vehicule> getAllVehicules(){
        return vehiculeService.afficherToutesVehicule();
    }

    @PostMapping("/ajouterVehicule")
    public Vehicule ajouterVehicule(@RequestBody Vehicule vehicule) {
        return vehiculeService.ajoutervehicule(vehicule);
    }

    @PutMapping("/modifierVehicule")
    public Vehicule modifierVehicule(@RequestBody Vehicule vehicule){
        return vehiculeService.modifiervehicule(vehicule);
    }

    @DeleteMapping("/supprimerVehicule/{idVehicule}")
    public void supprimerVehicule(@PathVariable Long idVehicule){
        vehiculeService.supprimer(idVehicule);
    }
}