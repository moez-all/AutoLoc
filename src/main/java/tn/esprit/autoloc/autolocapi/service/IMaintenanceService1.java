package tn.esprit.autoloc.autolocapi.service;

import tn.esprit.autoloc.autolocapi.domain.Maintenance;

import java.util.List;

public class IMaintenanceService1 implements MaintenanceService{
    @Override
    public Maintenance ajoutermaintenance(Maintenance maintenance) {
        return null;
    }

    @Override
    public Maintenance modifiermaintenance(Maintenance maintenance) {
        return null;
    }

    @Override
    public List<Maintenance> afficherToutesMaintenance() {
        return List.of();
    }

    @Override
    public Maintenance affichermaintenanceById(Long id) {
        return null;
    }

    @Override
    public void supprimermaintenance(Long id) {

    }
}
