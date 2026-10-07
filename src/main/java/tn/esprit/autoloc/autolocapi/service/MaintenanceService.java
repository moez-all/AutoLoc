package tn.esprit.autoloc.autolocapi.service;

import tn.esprit.autoloc.autolocapi.domain.Maintenance;

import java.util.List;

public interface MaintenanceService {
    Maintenance ajoutermaintenance(Maintenance maintenance);
    Maintenance modifiermaintenance(Maintenance maintenance);
    List<Maintenance> afficherToutesMaintenance();
    Maintenance affichermaintenanceById(Long id);
    void supprimermaintenance(Long id);
}
