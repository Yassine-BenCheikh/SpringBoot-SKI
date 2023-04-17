package tn.esprit.ds.ski_yassinebencheikh.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import tn.esprit.ds.ski_yassinebencheikh.Entities.*;

import java.util.List;

public interface SkieurRepository  extends JpaRepository<Skieur, Long> {


   // List<Skieur> findByAbonnement_TypeAbonnement(TypeAbonnement typeAbonnement);
   @Query("select s from Skieur s where s.abonnement.typeAbonnement = ?1")
   List<Skieur> findByAbonnement_TypeAbonnement(TypeAbonnement typeAbonnement);

   List<Skieur> findByInscriptionsCourTypeCoursAndInscriptionsCourSupportAndPistesCoulour(TypeCours inscriptions_cour_typeCours, Support inscriptions_cour_support, Couleur pistes_coulour);
   @Query(value = "SELECT *\n" +
           "FROM skieur s JOIN inscription i ON i.skieur_num_skieur=s.num_skieur\n" +
           "JOIN cours c ON c.num_cours=i.cour_num_cours \n" +
           "JOIN moniteur_cours mc ON c.num_cours= mc.moniteur_num_moniteur\n" +
           "JOIN moniteur m ON m.num_moniteur=mc.moniteur_num_moniteur\n" +
           "where c.support=:supp AND m.nomm=:nom",nativeQuery = true)
   List<Skieur> findbybsSQL(@Param("supp")Support sup,@Param("nom") String nom);
   @Query("select s from Skieur s " +
           "JOIN Inscription  i ON i.skieur=s " +
           "JOIN Moniteur m ON i.cours MEMBER OF  m.cours " + " WHERE m.nomM=:nom AND i.cours.Support=:support ")//jpql

   List<Skieur> findByMoniteurNameAndSupportTypeJPQL(@Param("spport") Support support);

}
