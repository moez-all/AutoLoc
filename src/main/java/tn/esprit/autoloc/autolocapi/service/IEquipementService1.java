package tn.esprit.autoloc.autolocapi.service;

import tn.esprit.autoloc.autolocapi.domain.Equipement;

import java.util.List;

public class IEquipementService1 implements EquipementService{
    @Override
    public Equipement ajouterequipement(Equipement equipement) {
        return null;
    }

    @Override
    public Equipement modifierequipement(Equipement equipement) {
        return null;
    }

    @Override
    public List<Equipement> afficherToutesEquipement() {
        return List.of();
    }

    @Override
    public Equipement afficherEquipementById(Long id) {
        return null;
    }

    @Override
    public void supprimerEquipement(Long id) {

    }
}
