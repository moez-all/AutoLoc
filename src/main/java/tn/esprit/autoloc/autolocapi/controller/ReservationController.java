package tn.esprit.autoloc.autolocapi.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.autolocapi.domain.Reservation;
import tn.esprit.autoloc.autolocapi.service.ReservationService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping
public class ReservationController {
    private final ReservationService reservationService;

    @GetMapping("/afficherToutesReservations")
    public List<Reservation> getAllReservations(){
        return reservationService.afficherToutesreservation();
    }

    @PostMapping("/ajouterReservation")
    public Reservation ajouterReservation(@RequestBody Reservation reservation) {
        return reservationService.ajouterreservation(reservation);
    }

    @PutMapping("/modifierReservation")
    public Reservation modifierReservation(@RequestBody Reservation reservation){
        return reservationService.modifierreservation(reservation);
    }

    @DeleteMapping("/supprimerReservation/{idReservation}")
    public void supprimerReservation(@PathVariable Long idReservation){
        reservationService.supprimer(idReservation);
    }
}