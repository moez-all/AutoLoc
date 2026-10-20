package tn.esprit.autoloc.autolocapi.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.autolocapi.domain.Client;
import tn.esprit.autoloc.autolocapi.service.ClientService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping
public class ClientController {
    private final ClientService clientService;

    @GetMapping("/afficherTousClients")
    public List<Client> getAllClients(){
        return clientService.afficherToutesClient();
    }

    @PostMapping("/ajouterClient")
    public Client ajouterClient(@RequestBody Client client) {
        return clientService.ajouterclient(client);
    }

    @PutMapping("/modifierClient")
    public Client modifierClient(@RequestBody Client client){
        return clientService.modifierclient(client);
    }

    @DeleteMapping("/supprimerClient/{idClient}")
    public void supprimerClient(@PathVariable Long idClient){
        clientService.supprimerClient(idClient);
    }
}
