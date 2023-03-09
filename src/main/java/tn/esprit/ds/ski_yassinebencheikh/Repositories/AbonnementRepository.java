package tn.esprit.ds.ski_yassinebencheikh.Repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.ds.ski_yassinebencheikh.Entities.Abonnement;
import tn.esprit.ds.ski_yassinebencheikh.Entities.TypeAbonnement;

import java.util.List;

public interface AbonnementRepository extends JpaRepository<Abonnement, Long> {
    
    List<Abonnement> findByTypeAbonnement(TypeAbonnement TypeAbonnement);
}
