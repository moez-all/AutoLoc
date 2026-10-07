package tn.esprit.autoloc.autolocapi.service;

import tn.esprit.autoloc.autolocapi.domain.Paiment;

import java.util.List;

public class IPeimentService1 implements PaimentService{
    @Override
    public Paiment ajouterpaiment(Paiment paiment) {
        return null;
    }

    @Override
    public Paiment modifierpaiment(Paiment paiment) {
        return null;
    }

    @Override
    public List<Paiment> afficherToutesPaiment() {
        return List.of();
    }

    @Override
    public Paiment afficherpaiment(Long id) {
        return null;
    }

    @Override
    public void supprimer(Long id) {

    }
}
