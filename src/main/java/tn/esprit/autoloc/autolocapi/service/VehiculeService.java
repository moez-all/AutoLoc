package tn.esprit.autoloc.autolocapi.service;

import tn.esprit.autoloc.autolocapi.domain.Vehicule;

import java.util.List;

public interface VehiculeService {
    Vehicule ajoutervehicule(Vehicule vehicule);
    Vehicule modifiervehicule(Vehicule vehicule);
    List<Vehicule> afficherToutesVehicule();
    Vehicule affichervehiculeById(Long id);
    void supprimer(Long id);

}
