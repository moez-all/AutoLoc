package tn.esprit.autoloc.autolocapi.service;


import tn.esprit.autoloc.autolocapi.domain.Client;

import java.util.List;

public interface ClientService {
    Client ajouterclient(Client client);
    Client modifierclient(Client client);
    List<Client> afficherToutesClient();
    Client afficherClientById(Long id);
    void supprimerClient(Long id);


}
