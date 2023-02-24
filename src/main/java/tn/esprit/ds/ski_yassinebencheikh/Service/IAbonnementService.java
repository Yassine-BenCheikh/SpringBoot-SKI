package tn.esprit.ds.ski_yassinebencheikh.Service;

import tn.esprit.ds.ski_yassinebencheikh.Entities.Abonnement;

import java.util.List;

public interface IAbonnementService {

    List<Abonnement> retrieveAllAbonnements();
    Abonnement addAbonnement(Abonnement abonnement);
    Abonnement updateAbonnement(Abonnement abonnement);
    void removeAbonnement (Long numAbon);
    Abonnement retrieveAbonnement (Long numAbon);
}
