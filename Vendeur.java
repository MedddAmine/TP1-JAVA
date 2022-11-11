import java.util.Date;

public class Vendeur extends Commercial{
    public Vendeur(String nom, String prénom, int age, Date dateEnt, double chiffreAffaire) {
        super(nom, prénom, age, dateEnt, chiffreAffaire);
    }


    @Override
    public double calculerSalaire() {
        return super.getChiffreAffaire()*0.20 + 4000;
    }
}
