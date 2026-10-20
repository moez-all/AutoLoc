package tn.esprit.autoloc.autolocapi.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.autolocapi.domain.Maintenance;
import tn.esprit.autoloc.autolocapi.repository.MaintenanceRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class IMaintenanceService1 implements MaintenanceService {

    private final MaintenanceRepository maintenanceRepository;

    @Override
    public Maintenance ajoutermaintenance(Maintenance maintenance) {
        // Enregistre et retourne la nouvelle maintenance
        return maintenanceRepository.save(maintenance);
    }

    @Override
    public Maintenance modifiermaintenance(Maintenance maintenance) {
        // Vérifie si la maintenance existe avant de la modifier
        if (maintenance.getIdMaintenance() != null && maintenanceRepository.existsById(maintenance.getIdMaintenance())) {
            return maintenanceRepository.save(maintenance);
        }
        throw new RuntimeException("Impossible de modifier : Maintenance introuvable.");
    }

    @Override
    public List<Maintenance> afficherToutesMaintenance() {
        // Récupère la liste de toutes les maintenances
        return maintenanceRepository.findAll();
    }

    @Override
    public Maintenance affichermaintenanceById(Long id) {
        // Recherche par ID et lève une exception si non trouvé
        return maintenanceRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Maintenance non trouvée avec l'ID : " + id));
    }

    @Override
    public void supprimermaintenance(Long id) {
        // Vérifie l'existence avant la suppression
        if (maintenanceRepository.existsById(id)) {
            maintenanceRepository.deleteById(id);
        } else {
            throw new RuntimeException("Impossible de supprimer : Maintenance non trouvée avec l'ID : " + id);
        }
    }
}