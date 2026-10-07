package tn.esprit.autoloc.autolocapi.repository;

import org.antlr.v4.runtime.atn.EmptyPredictionContext;
import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.autoloc.autolocapi.domain.Employe;

public interface EmployeRepository extends JpaRepository<Employe,Long> {
}
