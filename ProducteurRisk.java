import java.util.Date;

public class ProducteurRisk extends Producteur implements Risk{
    public ProducteurRisk(String nom, String prénom, int age, Date dateEnt, int nbProduits) {
        super(nom, prénom, age, dateEnt, nbProduits);
    }


    @Override
    public double calculerSalaire() {
        return super.calculerSalaire() + Risque;
    }
}
