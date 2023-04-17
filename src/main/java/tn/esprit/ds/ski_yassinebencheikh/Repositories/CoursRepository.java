package tn.esprit.ds.ski_yassinebencheikh.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.ds.ski_yassinebencheikh.Entities.Cours;
import org.springframework.data.jpa.repository.Query;


import java.util.List;

public interface CoursRepository  extends JpaRepository<Cours,Long > {

    @Query(value="select *"+
            "from cour c"+
            " ORDER BY (select Count * From inscription i where i.cours_num_cours=c.num_Cours)",nativeQuery = true)
    List<Cours> getAllOrderbyInscription();
//@Query(value = "select c from Cours orderby c.inscriptions.size") JPQL
}
