package tn.esprit.autoloc.autolocapi.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.autolocapi.domain.Maintenance;
import tn.esprit.autoloc.autolocapi.service.MaintenanceService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping
public class MaintenanceController {
    private final MaintenanceService maintenanceService;

    @GetMapping("/afficherToutesMaintenances")
    public List<Maintenance> getAllMaintenances(){
        return maintenanceService.afficherToutesMaintenance();
    }

    @PostMapping("/ajouterMaintenance")
    public Maintenance ajouterMaintenance(@RequestBody Maintenance maintenance) {
        return maintenanceService.ajoutermaintenance(maintenance);
    }

    @PutMapping("/modifierMaintenance")
    public Maintenance modifierMaintenance(@RequestBody Maintenance maintenance){
        return maintenanceService.modifiermaintenance(maintenance);
    }

    @DeleteMapping("/supprimerMaintenance/{idMaintenance}")
    public void supprimerMaintenance(@PathVariable Long idMaintenance){
        maintenanceService.supprimermaintenance(idMaintenance);
    }
}