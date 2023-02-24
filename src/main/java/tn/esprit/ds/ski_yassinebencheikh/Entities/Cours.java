package tn.esprit.ds.ski_yassinebencheikh.Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Cours {
    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY )
    private   long numCours;
    private   int  niveau;
    @Enumerated(EnumType.STRING)
    private TypeCours TypeCours;
    @Enumerated(EnumType.STRING)
    private Support Support;
    private float prix;

    private int creneau;
    @OneToMany(mappedBy = "cours")
    private List<Inscription> inscriptions;


    /*@Transient
    private int test;

    cascade = CascadeType.REMOVE: agregate)

    */


}
