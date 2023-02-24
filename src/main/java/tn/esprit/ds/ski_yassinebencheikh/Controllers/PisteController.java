package tn.esprit.ds.ski_yassinebencheikh.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.ds.ski_yassinebencheikh.Entities.Piste;
import tn.esprit.ds.ski_yassinebencheikh.Service.IPisteService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("Piste")
public class PisteController {

    @Autowired
    IPisteService pisteService;
    @GetMapping
    public List<Piste> getAll(){
        return pisteService.retrieveAllPistes();

    }

    @GetMapping("{numPiste}")

    public Optional<Piste> retrievePiste(@PathVariable Long numPiste) {

        return  pisteService.retrievePiste(numPiste);

    }
    @PostMapping
    public Piste addPiste(@RequestBody Piste piste){

        return pisteService.addPiste(piste);
    }

    @DeleteMapping("{numPiste}")
    public void removePiste(@PathVariable Long numPiste){

        pisteService.removePiste(numPiste);
    }
    @PutMapping
    public Piste updatePiste(@RequestBody Piste piste) {

        return  pisteService.updatePiste(piste);

    }

}
