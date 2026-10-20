package tn.esprit.autoloc.autolocapi.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.autolocapi.domain.Paiment;
import tn.esprit.autoloc.autolocapi.repository.PaimentRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class IPeimentService1 implements PaimentService {

    private final PaimentRepository paimentRepository;

    @Override
    public Paiment ajouterpaiment(Paiment paiment) {
        // Enregistre et retourne le nouveau paiement
        return paimentRepository.save(paiment);
    }

    @Override
    public Paiment modifierpaiment(Paiment paiment) {
        // Vérifie si le paiement existe avant de le modifier
        if (paiment.getIdPaiment() != null && paimentRepository.existsById(paiment.getIdPaiment())) {
            return paimentRepository.save(paiment);
        }
        throw new RuntimeException("Impossible de modifier : Paiment introuvable.");
    }

    @Override
    public List<Paiment> afficherToutesPaiment() {
        // Récupère la liste de tous les paiements
        return paimentRepository.findAll();
    }

    @Override
    public Paiment afficherpaiment(Long id) {
        // Recherche par ID et lève une exception si non trouvé
        return paimentRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Paiment non trouvé avec l'ID : " + id));
    }

    @Override
    public void supprimer(Long id) {
        // Vérifie l'existence avant la suppression
        if (paimentRepository.existsById(id)) {
            paimentRepository.deleteById(id);
        } else {
            throw new RuntimeException("Impossible de supprimer : Paiment non trouvé avec l'ID : " + id);
        }
    }
}