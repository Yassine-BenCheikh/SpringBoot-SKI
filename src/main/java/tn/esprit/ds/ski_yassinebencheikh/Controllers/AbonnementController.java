package tn.esprit.ds.ski_yassinebencheikh.Controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.ds.ski_yassinebencheikh.Entities.Abonnement;
import tn.esprit.ds.ski_yassinebencheikh.Service.IAbonnementService;
import java.util.List;


@RestController
@RequestMapping("Abonnement")
public class AbonnementController {
    @Autowired
    IAbonnementService abonnementService;
    @GetMapping
    public List<Abonnement> getAll(){
        return  abonnementService.retrieveAllAbonnements();
    }
    @PostMapping
    public Abonnement addAbonnement(@RequestBody Abonnement abonnement){

        return abonnementService.addAbonnement(abonnement);
    }
    @DeleteMapping("{numAbon}")
    public void removeAbonnement (@PathVariable long numAbon){

        abonnementService.removeAbonnement(numAbon);
    }
    @PutMapping
    public Abonnement updateAbonnement(@RequestBody Abonnement abonnement){
        return abonnementService.updateAbonnement(abonnement);
    }
    @GetMapping("{numAbon}")
    public Abonnement retrieveAbonnement ( @PathVariable Long numAbon){
        return abonnementService.retrieveAbonnement(numAbon);
    }


}
