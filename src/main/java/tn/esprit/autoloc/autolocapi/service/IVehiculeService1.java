package tn.esprit.autoloc.autolocapi.service;

import tn.esprit.autoloc.autolocapi.domain.Vehicule;

import java.util.List;

public class IVehiculeService1 implements VehiculeService{
    @Override
    public Vehicule ajoutervehicule(Vehicule vehicule) {
        return null;
    }

    @Override
    public Vehicule modifiervehicule(Vehicule vehicule) {
        return null;
    }

    @Override
    public List<Vehicule> afficherToutesVehicule() {
        return List.of();
    }

    @Override
    public Vehicule affichervehiculeById(Long id) {
        return null;
    }

    @Override
    public void supprimer(Long id) {

    }
}
