import java.util.Date;

public class ManutentionnaireRisk extends Manutentionnaire implements Risk {
    public ManutentionnaireRisk(String nom, String prénom, int age, Date dateEnt, int nbProduits) {
        super(nom, prénom, age, dateEnt, nbProduits);
    }


    @Override
    public double calculerSalaire() {
        return super.calculerSalaire() + Risque;
    }
}
