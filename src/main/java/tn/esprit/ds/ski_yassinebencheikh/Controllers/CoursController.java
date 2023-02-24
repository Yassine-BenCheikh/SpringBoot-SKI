package tn.esprit.ds.ski_yassinebencheikh.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.ds.ski_yassinebencheikh.Entities.Cours;
import tn.esprit.ds.ski_yassinebencheikh.Service.ICoursService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("Cours")
public class CoursController {
    @Autowired
    ICoursService coursService;
    @GetMapping
    public List<Cours> getAll(){
        return coursService.retrieveAllCours();

    }
    @GetMapping("{numCours}")

    public Optional<Cours> retrieveCours(@PathVariable Long numCours) {

        return  coursService.retrieveCours(numCours);

    }
    @PostMapping

    public Cours addCours(@RequestBody Cours cours){

        return coursService.addCours(cours);
    }
    @DeleteMapping("{numCours}")
    public void removeCours(@PathVariable Long numCours){

        coursService.removeCours(numCours);
    }
    @PutMapping
    public Cours updateCours(@RequestBody Cours Cours) {

        return  coursService.updateCours(Cours);

    }
}
