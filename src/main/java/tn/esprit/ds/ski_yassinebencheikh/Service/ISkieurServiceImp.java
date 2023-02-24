package tn.esprit.ds.ski_yassinebencheikh.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.ds.ski_yassinebencheikh.Entities.Skieur;
import tn.esprit.ds.ski_yassinebencheikh.Repositories.SkieurRepository;

import java.util.List;
@Service
public class ISkieurServiceImp implements ISkieurService {
    @Autowired
    SkieurRepository skieurRepository;
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
}
