package tn.esprit.ds.ski_yassinebencheikh.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.ds.ski_yassinebencheikh.Entities.Moniteur;
import tn.esprit.ds.ski_yassinebencheikh.Repositories.MoniteurRepository;

import java.util.List;
import java.util.Optional;
@Service

public class IMoniteurServiceImp implements IMoniteurService {
    @Autowired
    MoniteurRepository moniteurRepository;
    @Override
    public List<Moniteur> retrieveAllMoniteurs() {
        return moniteurRepository.findAll();
    }

    @Override
    public Moniteur addMoniteur(Moniteur moniteur) {
        return moniteurRepository.save(moniteur);
    }

    @Override
    public Moniteur updateMoniteur(Moniteur moniteur) {
        return moniteurRepository.save(moniteur);    }


    @Override
    public Optional<Moniteur> retrieveMoniteur(Long numMoniteur) {

        return moniteurRepository.findById(numMoniteur);
    }

    @Override
    public void removeMoniteur(Long numMoniteur) {
        moniteurRepository.deleteById(numMoniteur);

    }

   /* @Override
    public Moniteur addInstructorAndAssignToCourse(Moniteur moniteur, Long numCourse) {
        Cours cours = coursRepository.findById(numCourse).orElse(null);
        List<Moniteur> allMoniteurs = moniteurRepository.findAll();
        if(moniteur != null && cours != null){
            List<Cours> coursList = allMoniteurs.get(0).getCours();
            coursList.add(cours);
            moniteur.setCours(coursList);
            return moniteurRepository.save(moniteur);
        }
        return null;
    }*/
}
