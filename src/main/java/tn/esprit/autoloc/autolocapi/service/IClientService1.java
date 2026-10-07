package tn.esprit.autoloc.autolocapi.service;

import tn.esprit.autoloc.autolocapi.domain.Client;

import java.util.List;

public class IClientService1 implements  ClientService{
    @Override
    public Client ajouterclient(Client client) {
        return null;
    }

    @Override
    public Client modifierclient(Client client) {
        return null;
    }

    @Override
    public List<Client> afficherToutesClient() {
        return List.of();
    }

    @Override
    public Client afficherClientById(Long id) {
        return null;
    }

    @Override
    public void supprimerClient(Long id) {

    }
}
