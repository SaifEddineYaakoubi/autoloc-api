package tn.esprit.autoloc.domain;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

@Entity
@Table(name = "client")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString(onlyExplicitlyIncluded = true)
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    Long idClient;

    @ToString.Include
    @EqualsAndHashCode.Include
    @Column(nullable = false, length = 50)
    String nom;

    @ToString.Include
    @EqualsAndHashCode.Include
    @Column(nullable = false, length = 50)
    String prenom;

    @ToString.Include
    @EqualsAndHashCode.Include
    @Column(nullable = false, unique = true, length = 100)
    String email;

    @ToString.Include
    @EqualsAndHashCode.Include
    @Column(nullable = false, length = 20)
    String telephone;

    @ToString.Include
    @EqualsAndHashCode.Include
    @Column(nullable = false, unique = true, length = 30)
    String numPermis;

    @ToString.Include
    @EqualsAndHashCode.Include
    @Column(nullable = false)
    LocalDate dateInscription;
}