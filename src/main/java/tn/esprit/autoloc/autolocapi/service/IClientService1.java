package tn.esprit.autoloc.autolocapi.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.autolocapi.domain.Client;
import tn.esprit.autoloc.autolocapi.repository.ClientRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class IClientService1 implements ClientService {

    private final ClientRepository clientRepository;

    @Override
    public Client ajouterclient(Client client) {
        // Enregistre et retourne le nouveau client
        return clientRepository.save(client);
    }

    @Override
    public Client modifierclient(Client client) {
        // Vérifie si le client existe avant la mise à jour
        if (client.getIdClient() != null && clientRepository.existsById(client.getIdClient())) {
            return clientRepository.save(client);
        }
        throw new RuntimeException("Impossible de modifier : Client introuvable.");
    }

    @Override
    public List<Client> afficherToutesClient() {
        // Récupère la liste de tous les clients
        return clientRepository.findAll();
    }

    @Override
    public Client afficherClientById(Long id) {
        // Lance une exception si le client n'est pas trouvé
        return clientRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Client non trouvé avec l'ID : " + id));
    }

    @Override
    public void supprimerClient(Long id) {
        // Vérifie l'existence avant la suppression
        if (clientRepository.existsById(id)) {
            clientRepository.deleteById(id);
        } else {
            throw new RuntimeException("Impossible de supprimer : Client non trouvé avec l'ID : " + id);
        }
    }
}