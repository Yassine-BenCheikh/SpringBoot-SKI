package tn.esprit.ds.ski_yassinebencheikh.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.ds.ski_yassinebencheikh.Entities.Inscription;
import tn.esprit.ds.ski_yassinebencheikh.Service.IInscriptionService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("Inscription")
public class InscriptionController {
    @Autowired
    IInscriptionService inscriptionService;
    @GetMapping
    public List<Inscription> getAll(){
        return inscriptionService.retrieveAllInscription();

    }
    @GetMapping("{numInscription}")

    public Optional<Inscription> retrieveInscription(@PathVariable Long numInscription) {

        return  inscriptionService.retrieveInscription(numInscription);

    }
    @PostMapping

    public Inscription addInscription(@RequestBody Inscription inscription){

        return inscriptionService.addInscription(inscription);
    }
    @DeleteMapping("{numInscription}")
    public void removeInscription(@PathVariable Long numInscription){

        inscriptionService.removeInscription(numInscription);
    }

    @PutMapping
    public Inscription updateInscription(@RequestBody Inscription inscription) {

        return  inscriptionService.updateInscription(inscription);

    }
}
