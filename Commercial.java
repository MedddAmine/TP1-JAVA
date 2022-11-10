import java.util.Date;

public abstract class Commercial extends Employe {
    private double chiffreAffaire;

    public Commercial(String nom, String prénom, int age, Date dateEnt, double chiffreAffaire) {
        super(nom, prénom, age, dateEnt);
        this.chiffreAffaire = chiffreAffaire;
    }

    public double getChiffreAffaire() {
        return chiffreAffaire;
    }

    public abstract double calculerSalaire();

}
