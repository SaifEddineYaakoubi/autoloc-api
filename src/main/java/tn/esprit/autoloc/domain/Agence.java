package tn.esprit.autoloc.domain;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity
@Table(name = "agence")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString(onlyExplicitlyIncluded = true)
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Agence {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    Long idAgence;

    @ToString.Include
    @EqualsAndHashCode.Include
    @Column(nullable = false, length = 100)
    String nom;

    @ToString.Include
    @EqualsAndHashCode.Include
    @Column(nullable = false, length = 100)
    String ville;

    @ToString.Include
    @EqualsAndHashCode.Include
    @Column(nullable = false, length = 255)
    String adresse;

    @ToString.Include
    @EqualsAndHashCode.Include
    @Column(nullable = false, length = 20)
    String telephone;
}