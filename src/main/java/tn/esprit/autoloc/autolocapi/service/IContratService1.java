package tn.esprit.autoloc.autolocapi.service;

import tn.esprit.autoloc.autolocapi.domain.Contrat;

import java.util.List;

public class IContratService1 implements ContratService{
    @Override
    public Contrat ajoutercontrat(Contrat contrat) {
        return null;
    }

    @Override
    public Contrat modifiercontrat(Contrat contrat) {
        return null;
    }

    @Override
    public List<Contrat> afficherToutescontrat() {
        return List.of();
    }

    @Override
    public Contrat afficherContratByid(Long id) {
        return null;
    }

    @Override
    public void supprimercontrat(Long id) {

    }
}
