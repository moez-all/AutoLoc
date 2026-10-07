package tn.esprit.autoloc.autolocapi.service;

import tn.esprit.autoloc.autolocapi.domain.Reservation;

import java.util.List;

public class IReservationService1 implements ReservationService{
    @Override
    public Reservation ajouterreservation(Reservation reservation) {
        return null;
    }

    @Override
    public Reservation modifierreservation(Reservation reservation) {
        return null;
    }

    @Override
    public List<Reservation> afficherToutesreservation() {
        return List.of();
    }

    @Override
    public Reservation afficherreservation(Long id) {
        return null;
    }

    @Override
    public void supprimer(Long id) {

    }
}
