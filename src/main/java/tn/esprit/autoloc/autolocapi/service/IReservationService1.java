package tn.esprit.autoloc.autolocapi.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.autolocapi.domain.Reservation;
import tn.esprit.autoloc.autolocapi.repository.ReservationRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class IReservationService1 implements ReservationService {

    private final ReservationRepository reservationRepository;

    @Override
    public Reservation ajouterreservation(Reservation reservation) {
        // Enregistre et retourne la nouvelle réservation
        return reservationRepository.save(reservation);
    }

    @Override
    public Reservation modifierreservation(Reservation reservation) {
        // Vérifie si la réservation existe avant de la modifier
        if (reservation.getIdReservation() != null && reservationRepository.existsById(reservation.getIdReservation())) {
            return reservationRepository.save(reservation);
        }
        throw new RuntimeException("Impossible de modifier : Reservation introuvable.");
    }

    @Override
    public List<Reservation> afficherToutesreservation() {
        // Récupère la liste de toutes les réservations
        return reservationRepository.findAll();
    }

    @Override
    public Reservation afficherreservation(Long id) {
        // Recherche par ID et lève une exception si non trouvé
        return reservationRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Reservation non trouvée avec l'ID : " + id));
    }

    @Override
    public void supprimer(Long id) {
        // Vérifie l'existence avant la suppression
        if (reservationRepository.existsById(id)) {
            reservationRepository.deleteById(id);
        } else {
            throw new RuntimeException("Impossible de supprimer : Reservation non trouvée avec l'ID : " + id);
        }
    }
}