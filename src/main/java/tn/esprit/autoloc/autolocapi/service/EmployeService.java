package tn.esprit.autoloc.autolocapi.service;

import tn.esprit.autoloc.autolocapi.domain.Employe;

import java.util.List;

public interface EmployeService {
    Employe ajouteremployer(Employe employe);
    Employe modifieremployer(Employe employe);
    List<Employe> afficherToutesEmploye();
    Employe afficherEmployerById(Long id);
    void supprimerEmployer(Long id);



}
