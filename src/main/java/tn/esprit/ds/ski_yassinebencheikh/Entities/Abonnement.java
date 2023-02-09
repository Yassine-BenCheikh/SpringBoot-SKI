package tn.esprit.ds.ski_yassinebencheikh.Entities;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
public class Abonnement {
    @Id
    private   long numAbon;
    private LocalDate dateDebut;
    private   LocalDate  dateFin;
    private   Float  prixAbon;

    @Enumerated(EnumType.STRING)
    private TypeAbonnement TypeAbonnement;

}
