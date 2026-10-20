package tn.esprit.autoloc.autolocapi.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.autolocapi.domain.Equipement;
import tn.esprit.autoloc.autolocapi.repository.EquipementRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class IEquipementService1 implements EquipementService {

    private final EquipementRepository equipementRepository;

    @Override
    public Equipement ajouterequipement(Equipement equipement) {
        // Enregistre et retourne le nouvel équipement
        return equipementRepository.save(equipement);
    }

    @Override
    public Equipement modifierequipement(Equipement equipement) {
        // Vérifie si l'équipement existe avant de le modifier
        if (equipement.getIdEquipement() != null && equipementRepository.existsById(equipement.getIdEquipement())) {
            return equipementRepository.save(equipement);
        }
        throw new RuntimeException("Impossible de modifier : Équipement introuvable.");
    }

    @Override
    public List<Equipement> afficherToutesEquipement() {
        // Récupère la liste de tous les équipements
        return equipementRepository.findAll();
    }

    @Override
    public Equipement afficherEquipementById(Long id) {
        // Recherche par ID et lève une exception si non trouvé
        return equipementRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Équipement non trouvé avec l'ID : " + id));
    }

    @Override
    public void supprimerEquipement(Long id) {
        // Vérifie l'existence avant la suppression
        if (equipementRepository.existsById(id)) {
            equipementRepository.deleteById(id);
        } else {
            throw new RuntimeException("Impossible de supprimer : Équipement non trouvé avec l'ID : " + id);
        }
    }
}