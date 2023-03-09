package tn.esprit.ds.ski_yassinebencheikh.Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
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
