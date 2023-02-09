package tn.esprit.ds.ski_yassinebencheikh.Entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.time.LocalDate;
import java.util.List;

@Entity
public class Moniteur {

    @Id
    private long numMoniteur;
    private String nomM;
    private String prenomM;
    private LocalDate dateRecru;

    @OneToMany()
    private List<Cours> cours;
}
