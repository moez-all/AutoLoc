package tn.esprit.autoloc.autolocapi.service;

import tn.esprit.autoloc.autolocapi.domain.Reservation;

import java.util.List;

public interface ReservationService {
    Reservation ajouterreservation(Reservation reservation);
    Reservation modifierreservation(Reservation reservation);
    List<Reservation> afficherToutesreservation();
    Reservation afficherreservation(Long id);
    void supprimer(Long id);

}
