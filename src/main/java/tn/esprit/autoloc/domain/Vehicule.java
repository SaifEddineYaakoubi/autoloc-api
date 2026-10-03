package tn.esprit.autoloc.domain;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.math.BigDecimal;

@Entity
@Table(name = "vehicule")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString(onlyExplicitlyIncluded = true)
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Vehicule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    Long idVehicule;

    @ToString.Include
    @EqualsAndHashCode.Include
    @Column(nullable = false, unique = true, length = 20)
    String immatriculation;

    @ToString.Include
    @EqualsAndHashCode.Include
    @Column(nullable = false, length = 50)
    String marque;

    @ToString.Include
    @EqualsAndHashCode.Include
    @Column(nullable = false, length = 50)
    String modele;

    @ToString.Include
    @EqualsAndHashCode.Include
    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 20)
    CategorieVehicule categorie;

    @ToString.Include
    @EqualsAndHashCode.Include
    @Column(nullable = false, precision = 10, scale = 2)
    BigDecimal tarifJournalier;

    @ToString.Include
    @EqualsAndHashCode.Include
    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 20)
    StatutVehicule statut;
}
