package tn.esprit.ds.ski_yassinebencheikh.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Skieur {

    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY )
    private long numSkieur ;
    private String nomS;
    private String prenomS;
    private LocalDate dateNaissance;
    private String ville;

    @OneToMany(mappedBy = "skieur")
    private List<Inscription> inscriptions;
@OneToOne(cascade = CascadeType.REMOVE)
@JsonIgnore
    private Abonnement abonnement;
    @ManyToMany
    private List<Piste> pistes;
}
