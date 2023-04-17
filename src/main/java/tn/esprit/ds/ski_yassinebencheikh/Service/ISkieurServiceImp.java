package tn.esprit.ds.ski_yassinebencheikh.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;
import tn.esprit.ds.ski_yassinebencheikh.Entities.*;
import tn.esprit.ds.ski_yassinebencheikh.Repositories.*;

import java.util.List;
import java.util.Set;

@Service
public class ISkieurServiceImp implements ISkieurService {
    @Autowired
    SkieurRepository skieurRepository;

    @Autowired
    AbonnementRepository abonnementRepository;
    @Autowired
    PisteRepository pisteRepository;
    @Autowired
    private CoursRepository coursRepository;
    @Autowired
    private InscriptionRepository inscriptionRepository;

    @Override
    public List<Skieur> retrieveAllSkieurs() {
        return skieurRepository.findAll()  ;
    }

    @Override
    public Skieur addSkieur(Skieur skieur) {
        return skieurRepository.save(skieur)  ;
    }

    @Override
    public Skieur updateSkieur(Skieur skieur) {

        return skieurRepository.save(skieur);
    }

    @Override
    public void removeSkieur(Long numSkieur) {
        skieurRepository.deleteById(numSkieur); ;
    }

    @Override
    public Skieur retrieveSkieur(Long numSkieur) {
        return skieurRepository.findById(numSkieur).orElse(null);
    }

    @Override
    public Skieur assignSkierToPiste(Long numSkieur, Long numPiste) {
       //récupération des objets
        Skieur skieur = skieurRepository.findById(numSkieur).orElse(null);
        Assert.notNull(skieur, "skieur not null");
        Piste piste = pisteRepository.findById(numPiste).orElse(null);
        Assert.notNull(piste, "piste not null");

        if(skieur != null && piste != null){
           //traitement
          // skieur.getPistes().add(piste);
           List<Piste> pistes = skieur.getPistes();
           pistes.add(piste);
           skieur.setPistes(pistes);
           //save
          return skieurRepository.save(skieur);
       }
        return null;
    }

    @Override
    public Skieur AssignSkierToSubscription(long numSkieur, long numAbon) {
        Skieur skieur = skieurRepository.findById(numSkieur).orElse(null);
        Abonnement abonnement = abonnementRepository.findById(numAbon).orElse(null);
        if(skieur != null && abonnement != null){
            skieur.setAbonnement(abonnement);
            return skieurRepository.save(skieur);
        }
        return null;
    }

    @Override
    public List<Skieur> retrieveSkiersBySubscriptionType(TypeAbonnement typeAbonnement) {
        return skieurRepository.findByAbonnement_TypeAbonnement(typeAbonnement);
    }
    @Override
    public Skieur addSkierAndAssignToCourse(Skieur skieur) {


        Assert.notNull(skieur.getAbonnement(), "abonnemet must not be empty");
        Assert.notNull(skieur.getInscriptions(), "inscription must not be empty");
        List<Inscription> inscriptions= skieur.getInscriptions();
        inscriptions.forEach(inscription -> {
            Assert.notNull(inscription.getCours().getNumCours()  , "cours must not be empty" );
            Cours cours = coursRepository.findById(inscription.getCours().getNumCours()).orElse( null);
            Assert.notNull(cours, "cours not found");
            inscription.setCours(cours);
            skieurRepository.saveAndFlush(skieur);
             inscription.setSkieur(skieur);
             inscriptionRepository .save(inscription);
        });
        //exception 100
        return skieur;
    }



  /*  @Override
    public  List<Skieur> retrieveSkiersBySubscriptionType(TypeAbonnement typeAbonnement)
    {
        return skieurRepository.findByAbonnement_TypeAbonnement(typeAbonnement);
    }*/





}
