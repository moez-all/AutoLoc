package tn.esprit.autoloc.autolocapi.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.autolocapi.domain.Contrat;
import tn.esprit.autoloc.autolocapi.repository.ContratRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class IContratService1 implements ContratService {

    private final ContratRepository contratRepository;

    @Override
    public Contrat ajoutercontrat(Contrat contrat) {
        // Enregistre et retourne le nouveau contrat
        return contratRepository.save(contrat);
    }

    @Override
    public Contrat modifiercontrat(Contrat contrat) {
        // Vérifie si le contrat existe avant la modification
        if (contrat.getIdContrat() != null && contratRepository.existsById(contrat.getIdContrat())) {
            return contratRepository.save(contrat);
        }
        throw new RuntimeException("Impossible de modifier : Contrat introuvable.");
    }

    @Override
    public List<Contrat> afficherToutescontrat() {
        // Récupère la liste de tous les contrats
        return contratRepository.findAll();
    }

    @Override
    public Contrat afficherContratByid(Long id) {
        // Recherche par ID et lève une exception si non trouvé
        return contratRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Contrat non trouvé avec l'ID : " + id));
    }

    @Override
    public void supprimercontrat(Long id) {
        // Vérifie l'existence avant la suppression
        if (contratRepository.existsById(id)) {
            contratRepository.deleteById(id);
        } else {
            throw new RuntimeException("Impossible de supprimer : Contrat non trouvé avec l'ID : " + id);
        }
    }
}