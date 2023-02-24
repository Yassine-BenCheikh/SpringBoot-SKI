package tn.esprit.ds.ski_yassinebencheikh.Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Abonnement {
    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY )
    private   long numAbon;
    private LocalDate dateDebut;
    private   LocalDate  dateFin;
    private   Float  prixAbon;

    @Enumerated(EnumType.STRING)
    private TypeAbonnement TypeAbonnement;

}
