package tn.esprit.autoloc.autolocapi.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.autolocapi.domain.Agence;
import tn.esprit.autoloc.autolocapi.repository.AgenceRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class IAgenceService1 implements AgenceService {

    private final AgenceRepository agenceRepository;

    @Override
    public Agence ajouteragence(Agence agence) {
        // Sauvegarde et retourne la nouvelle agence
        return agenceRepository.save(agence);
    }

    @Override
    public Agence modifieragence(Agence agence) {
        // Vérifie si l'agence existe avant de la mettre à jour
        if (agence.getIdAgence() != null && agenceRepository.existsById(agence.getIdAgence())) {
            return agenceRepository.save(agence);
        }
        throw new RuntimeException("Impossible de modifier : Agence introuvable.");
    }

    @Override
    public List<Agence> afficherToutesAgences() {
        // Récupère la liste de toutes les agences
        return agenceRepository.findAll();
    }

    @Override
    public Agence afficherAgenceById(Long id) {
        // Utilise orElseThrow pour lancer une exception propre si l'agence n'existe pas
        return agenceRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Agence non trouvée avec l'ID : " + id));
    }

    @Override
    public void supprimerAgence(Long id) {
        if (agenceRepository.existsById(id)) {
            agenceRepository.deleteById(id);
        } else {
            throw new RuntimeException("Impossible de supprimer : Agence non trouvée avec l'ID : " + id);
        }
    }
}