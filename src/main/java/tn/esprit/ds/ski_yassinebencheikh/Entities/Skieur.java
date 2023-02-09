package tn.esprit.ds.ski_yassinebencheikh.Entities;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
public class Skieur {
    @Id
    private long numSkieur ;
    private String nomS;
    private String prenomS;
    private LocalDate dateNaissance;
    private String ville;

    @OneToMany(mappedBy = "skieur")
    private List<Inscription> inscriptions;
@OneToOne
    private Abonnement abonnement;
    @ManyToMany
    List<Piste> pistes;
}
