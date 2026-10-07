package tn.esprit.autoloc.autolocapi.service;

import tn.esprit.autoloc.autolocapi.domain.Paiment;

import java.util.List;

public interface PaimentService {
    Paiment ajouterpaiment(Paiment paiment);
    Paiment modifierpaiment(Paiment paiment);
    List<Paiment> afficherToutesPaiment();
    Paiment afficherpaiment(Long id);
    void supprimer(Long id);

}
