package tn.esprit.ds.ski_yassinebencheikh.Service;

import tn.esprit.ds.ski_yassinebencheikh.Entities.Skieur;
import tn.esprit.ds.ski_yassinebencheikh.Entities.TypeAbonnement;

import java.util.List;

public interface ISkieurService {

    List<Skieur> retrieveAllSkieurs();
    Skieur addSkieur(Skieur skieur);
    Skieur updateSkieur(Skieur skieur);
    void removeSkieur (Long numSkieur);
    Skieur retrieveSkieur (Long numSkieur);
    Skieur assignSkierToPiste(Long numSkieur, Long numPiste);
    Skieur AssignSkierToSubscription(long numSkieur, long numAbon);
    List<Skieur> retrieveSkiersBySubscriptionType(TypeAbonnement typeAbonnement);

    Skieur addSkierAndAssignToCourse(Skieur skieur);
}
