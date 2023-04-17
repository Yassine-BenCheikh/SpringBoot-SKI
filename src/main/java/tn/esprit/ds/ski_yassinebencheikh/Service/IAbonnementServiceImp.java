package tn.esprit.ds.ski_yassinebencheikh.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.ds.ski_yassinebencheikh.Entities.Abonnement;
import tn.esprit.ds.ski_yassinebencheikh.Entities.TypeAbonnement;
import tn.esprit.ds.ski_yassinebencheikh.Repositories.AbonnementRepository;
import java.time.LocalDate;
import java.util.List;
import java.util.Set;

@Service
public class IAbonnementServiceImp implements IAbonnementService {

    @Autowired
    AbonnementRepository abonnementRepository;
    @Override
    public List<Abonnement> retrieveAllAbonnements() {
        return abonnementRepository.findAll()  ;
    }
    @Override
    public Abonnement addAbonnement(Abonnement abonnement) {
        return abonnementRepository.save(abonnement)  ;
    }
    @Override
    public Abonnement updateAbonnement(Abonnement abonnement) {

        return abonnementRepository.save(abonnement);
    }
    @Override
    public void removeAbonnement(Long numAbon) {
        abonnementRepository.deleteById(numAbon); ;
    }
    @Override
    public Abonnement retrieveAbonnement(Long numAbon) {
        return abonnementRepository.findById(numAbon).orElse(null);
    }

    @Override
    public Set<Abonnement> getSubscriptionByType(TypeAbonnement typeAbonnement) {
        return abonnementRepository.findByTypeAbonnement(typeAbonnement);
    }

    @Override
    public List<Abonnement> retreiveSubscriptionsByDates(LocalDate dateDebut, LocalDate dateFin) {
        return abonnementRepository.findByDateDebutAndDateFin(dateDebut, dateFin);
    }


}
