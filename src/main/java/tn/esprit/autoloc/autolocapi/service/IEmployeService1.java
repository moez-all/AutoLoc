package tn.esprit.autoloc.autolocapi.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.autolocapi.domain.Employe;
import tn.esprit.autoloc.autolocapi.repository.EmployeRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class IEmployeService1 implements EmployeService {

    private final EmployeRepository employeRepository;

    @Override
    public Employe ajouteremployer(Employe employe) {
        // Enregistre et retourne le nouvel employé
        return employeRepository.save(employe);
    }

    @Override
    public Employe modifieremployer(Employe employe) {
        // Vérifie si l'employé existe avant de le modifier
        if (employe.getIdEmploye() != null && employeRepository.existsById(employe.getIdEmploye())) {
            return employeRepository.save(employe);
        }
        throw new RuntimeException("Impossible de modifier : Employé introuvable.");
    }

    @Override
    public List<Employe> afficherToutesEmploye() {
        // Récupère la liste de tous les employés
        return employeRepository.findAll();
    }

    @Override
    public Employe afficherEmployerById(Long id) {
        // Recherche par ID et lève une exception si non trouvé
        return employeRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Employé non trouvé avec l'ID : " + id));
    }

    @Override
    public void supprimerEmployer(Long id) {
        // Vérifie l'existence avant la suppression
        if (employeRepository.existsById(id)) {
            employeRepository.deleteById(id);
        } else {
            throw new RuntimeException("Impossible de supprimer : Employé non trouvé avec l'ID : " + id);
        }
    }
}