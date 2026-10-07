package tn.esprit.autoloc.autolocapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.autoloc.autolocapi.domain.Paiment;

public interface PaimentRepository extends JpaRepository<Paiment,Long> {
}
