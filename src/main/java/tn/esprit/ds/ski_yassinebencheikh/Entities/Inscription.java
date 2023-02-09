package tn.esprit.ds.ski_yassinebencheikh.Entities;

import javax.persistence.*;

@Entity
public class Inscription {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long numInscription;
    private int  numSemaine;

    @ManyToOne
    private Cours cours;
    @ManyToOne
    private Skieur skieur;
}
