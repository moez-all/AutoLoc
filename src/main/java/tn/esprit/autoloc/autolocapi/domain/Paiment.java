package tn.esprit.autoloc.autolocapi.domain;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Paiment {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    Long idPaiment;
    BigDecimal monatant;
    LocalDate datepaiment;
    @Enumerated(EnumType.STRING)
    ModePaiment modepaiment;


}
