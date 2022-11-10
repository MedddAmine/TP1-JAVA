import java.util.ArrayList;
import java.util.List;

public class Personnel {

    List<Employe> mesEmployes=new ArrayList<Employe>();
    void ajouterEmploye(Employe e){
        mesEmployes.add(e);
    }
    void afficherSalaires(){
     for (Employe e: mesEmployes){
         System.out.println(e.calculerSalaire());
     }
    }
    double salaireMoyen(){
        double total=0;
        double nb=0;
        for (Employe e: mesEmployes){
            total=total+e.calculerSalaire();
            nb=nb+1;
        }
        return total;
    }
}
