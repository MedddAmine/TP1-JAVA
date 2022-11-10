import java.util.Date;

public class Representateur extends Commercial{
    public Representateur(String nom, String prénom, int age, Date dateEnt, double chiffreAffaire) {
        super(nom, prénom, age, dateEnt, chiffreAffaire);
    }

    @Override
    public double getChiffreAffaire() {
        return super.getChiffreAffaire();
    }

    @Override
    public double calculerSalaire() {
        return getChiffreAffaire()*0.80 + 4000;
    }
}
