package tn.esprit.autoloc.autolocapi.service;

import tn.esprit.autoloc.autolocapi.domain.Agence;

import java.util.List;

public interface AgenceService {
    Agence ajouteragence(Agence agence);
    Agence modifieragence(Agence agence);
    List<Agence> afficherToutesAgences();
    Agence afficherAgenceBuId(Long id);
    void supprimerAgence(Long id);
}
