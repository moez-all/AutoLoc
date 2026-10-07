package tn.esprit.autoloc.autolocapi.service;

import tn.esprit.autoloc.autolocapi.domain.Employe;

import java.util.List;

public class IEmployeService1 implements EmployeService{
    @Override
    public Employe ajouteremployer(Employe employe) {
        return null;
    }

    @Override
    public Employe modifieremployer(Employe employe) {
        return null;
    }

    @Override
    public List<Employe> afficherToutesEmploye() {
        return List.of();
    }

    @Override
    public Employe afficherEmployerById(Long id) {
        return null;
    }

    @Override
    public void supprimerEmployer(Long id) {

    }
}
