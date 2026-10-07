package tn.esprit.autoloc.autolocapi.service;

import tn.esprit.autoloc.autolocapi.domain.Equipement;

import java.util.List;

public interface EquipementService {
    Equipement ajouterequipement(Equipement equipement);
    Equipement modifierequipement(Equipement equipement);
    List<Equipement> afficherToutesEquipement();
    Equipement afficherEquipementById(Long id);
    void supprimerEquipement(Long id);

}
