package tn.esprit.autoloc.autolocapi.service;

import tn.esprit.autoloc.autolocapi.domain.Contrat;

import java.util.List;

public interface ContratService {
    Contrat ajoutercontrat(Contrat contrat);
    Contrat modifiercontrat(Contrat contrat);
    List<Contrat> afficherToutescontrat();
    Contrat afficherContratByid(Long id);
    void supprimercontrat(Long id);
}
