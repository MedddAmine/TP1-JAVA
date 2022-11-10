import java.util.Date;

public class Manutentionnaire extends Employe{
    private int nbHeures;
    public Manutentionnaire(String nom, String prénom, int age, Date dateEnt, int nbHeures) {
        super(nom, prénom, age, dateEnt);
        this.nbHeures=nbHeures;
    }

    @Override
    public double calculerSalaire() {
        return nbHeures*150;
    }
}
