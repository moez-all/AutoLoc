package tn.esprit.autoloc.autolocapi.service;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.autolocapi.domain.Agence;
import tn.esprit.autoloc.autolocapi.repository.AgenceRepository;

import java.util.List;
@Service
@AllArgsConstructor
//@Autowired

public class IAgenceService1 implements AgenceService{
    private final AgenceRepository agenceRepository;
    @Override
    public Agence ajouteragence(Agence agence) {
        return agenceRepository.save(agence);
    }

    @Override
    public Agence modifieragence(Agence agence) {
        return agenceRepository.save(agence) ;
    }

    @Override
    public List<Agence> afficherToutesAgences() {
        return agenceRepository.findAll();
    }

    @Override
    public Agence afficherAgenceBuId(Long id) {
        return agenceRepository.findById(id).orElse( null);
    }

    @Override
    public void supprimerAgence(Long id) {
        agenceRepository.deleteById(id);

    }
}
