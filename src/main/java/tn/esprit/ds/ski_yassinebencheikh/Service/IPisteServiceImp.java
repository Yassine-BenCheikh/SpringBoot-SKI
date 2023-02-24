package tn.esprit.ds.ski_yassinebencheikh.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.ds.ski_yassinebencheikh.Entities.Piste;
import tn.esprit.ds.ski_yassinebencheikh.Repositories.PisteRepository;

import java.util.List;
import java.util.Optional;

@Service
public class IPisteServiceImp implements IPisteService{
    @Autowired
    PisteRepository pisteRepository;
    @Override
    public List<Piste> retrieveAllPistes() {
        return  pisteRepository.findAll();    }

    @Override
    public Piste addPiste(Piste piste) {
        return pisteRepository.save(piste);
    }

    @Override
    public Piste updatePiste(Piste piste) {
        return pisteRepository.save(piste);
    }

    @Override
    public Optional<Piste> retrievePiste(Long numPiste) {
        return pisteRepository.findById(numPiste);
    }

    @Override
    public void removePiste(Long numPiste) {
        pisteRepository.deleteById(numPiste);
    }
}
