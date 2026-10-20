package tn.esprit.autoloc.autolocapi.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.autolocapi.domain.Vehicule;
import tn.esprit.autoloc.autolocapi.repository.VehiculeRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class IVehiculeService1 implements VehiculeService {

    private final VehiculeRepository vehiculeRepository;

    @Override
    public Vehicule ajoutervehicule(Vehicule vehicule) {
        // Enregistre et retourne le nouveau véhicule
        return vehiculeRepository.save(vehicule);
    }

    @Override
    public Vehicule modifiervehicule(Vehicule vehicule) {
        // Vérifie si le véhicule existe avant de le modifier
        if (vehicule.getIdVehicule() != null && vehiculeRepository.existsById(vehicule.getIdVehicule())) {
            return vehiculeRepository.save(vehicule);
        }
        throw new RuntimeException("Impossible de modifier : Vehicule introuvable.");
    }

    @Override
    public List<Vehicule> afficherToutesVehicule() {
        // Récupère la liste de tous les véhicules
        return vehiculeRepository.findAll();
    }

    @Override
    public Vehicule affichervehiculeById(Long id) {
        // Recherche par ID et lève une exception si non trouvé
        return vehiculeRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Vehicule non trouvé avec l'ID : " + id));
    }

    @Override
    public void supprimer(Long id) {
        // Vérifie l'existence avant la suppression
        if (vehiculeRepository.existsById(id)) {
            vehiculeRepository.deleteById(id);
        } else {
            throw new RuntimeException("Impossible de supprimer : Vehicule non trouvé avec l'ID : " + id);
        }
    }
}