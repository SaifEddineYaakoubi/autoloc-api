package tn.esprit.autoloc.domain;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

@Entity
@Table(name = "maintenance")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString(onlyExplicitlyIncluded = true)
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Maintenance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    Long idMaintenance;

    @ToString.Include
    @EqualsAndHashCode.Include
    @Column(nullable = false)
    LocalDate dateDebut;

    @ToString.Include
    @EqualsAndHashCode.Include
    @Column(nullable = false)
    LocalDate dateFin;

    @ToString.Include
    @EqualsAndHashCode.Include
    @Column(nullable = false, length = 500)
    String description;
}