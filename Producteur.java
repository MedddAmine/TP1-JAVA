import java.util.Date;

public class Producteur extends Employe{
    private int nbProduits;
    public Producteur(String nom, String prénom, int age, Date dateEnt, int nbProduits) {
        super(nom, prénom, age, dateEnt);
        this.nbProduits=nbProduits;
    }

    @Override
    public double calculerSalaire() {
        return nbProduits*50;
    }
}
