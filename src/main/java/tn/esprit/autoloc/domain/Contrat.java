package tn.esprit.autoloc.domain;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "contrat")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString(onlyExplicitlyIncluded = true)
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Contrat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    Long idContrat;

    @ToString.Include
    @EqualsAndHashCode.Include
    @Column(nullable = false)
    LocalDate dateSignature;

    @ToString.Include
    @EqualsAndHashCode.Include
    @Column(nullable = false, precision = 10, scale = 2)
    BigDecimal montantTotal;

    @ToString.Include
    @EqualsAndHashCode.Include
    @Column(nullable = false)
    Boolean valide;
}