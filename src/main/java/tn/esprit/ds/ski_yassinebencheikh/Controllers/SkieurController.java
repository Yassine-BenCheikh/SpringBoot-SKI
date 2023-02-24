package tn.esprit.ds.ski_yassinebencheikh.Controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.ds.ski_yassinebencheikh.Entities.Skieur;
import tn.esprit.ds.ski_yassinebencheikh.Service.ISkieurService;

import java.util.List;

@RestController
@RequestMapping("Skieur")
public class SkieurController {
   @Autowired
   ISkieurService skieurService;
@GetMapping
    public List<Skieur> getAll(){
       return  skieurService.retrieveAllSkieurs();
}
@PostMapping

    public Skieur addSkieur(@RequestBody Skieur skieur){

    return skieurService.addSkieur(skieur);
}
@DeleteMapping("{numSkieur}")
    public void removeSkieur (@PathVariable long numSkieur){

    skieurService.removeSkieur(numSkieur);
}
@PutMapping
    public Skieur updateSkieur(@RequestBody Skieur skieur){
    return skieurService.updateSkieur(skieur);
}
@GetMapping("{numSkieur}")
   public Skieur retrieveSkieur ( @PathVariable Long numSkieur){
return skieurService.retrieveSkieur(numSkieur);
   }


   @PutMapping("{numSkieur}/{numPiste}")
   public Skieur assignSkierToPiste(@PathVariable Long numSkieur,@PathVariable Long numPiste){
    return  skieurService.assignSkierToPiste(numSkieur, numPiste);
   }

    @PutMapping("{numSkieur}/{numAbon}")
    public Skieur AssignSkierToSubscription(@PathVariable long numSkieur, @PathVariable long numAbon){
        return  skieurService.AssignSkierToSubscription(numSkieur, numAbon);

    }


}
