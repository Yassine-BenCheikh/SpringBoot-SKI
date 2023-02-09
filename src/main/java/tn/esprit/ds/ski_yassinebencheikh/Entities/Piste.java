package tn.esprit.ds.ski_yassinebencheikh.Entities;

import javax.persistence.*;
import java.util.List;

@Entity
public class Piste {
    @Id
    private long numPiste;
    private String nomPiste;
    @Enumerated(EnumType.STRING)
    private Couleur Couleur;
    private int longeur;
    private int pente;

@ManyToMany(mappedBy = "pistes")
     List<Skieur> skieurs;


}
