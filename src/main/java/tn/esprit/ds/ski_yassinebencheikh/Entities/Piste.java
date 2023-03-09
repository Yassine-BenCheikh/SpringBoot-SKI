package tn.esprit.ds.ski_yassinebencheikh.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Piste {
    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY )
    private long numPiste;
    private String nomPiste;
   // @Enumerated(EnumType.STRING)
   @Enumerated(EnumType.STRING)
   private Couleur Couleur;
    private int longeur;
    private int pente;

@ManyToMany(mappedBy = "pistes")
@JsonIgnore
private List<Skieur> skieurs;


}
