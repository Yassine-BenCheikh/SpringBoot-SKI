package tn.esprit.ds.ski_yassinebencheikh.Repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.ds.ski_yassinebencheikh.Entities.Abonnement;
import tn.esprit.ds.ski_yassinebencheikh.Entities.TypeAbonnement;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

public interface AbonnementRepository extends JpaRepository<Abonnement, Long> {
    
    Set<Abonnement> findByTypeAbonnement(TypeAbonnement typeAbonnement);
    List<Abonnement> findByDateDebutAndDateFin(LocalDate dateDebut, LocalDate dateFin);

}
