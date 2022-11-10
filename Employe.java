import java.util.Date;

public abstract class Employe {
    private String nom;
    private String prénom;
    private int age;
    private Date dateEnt;

    public Employe(String nom, String prénom, int age,Date dateEnt) {
        System.out.println("Construction d'un Employe");
        this.nom = nom;
        this.prénom = prénom;
        this.age = age;
        this.dateEnt=dateEnt;
    }

    public abstract double calculerSalaire();
    public String getNom(){
        return nom +' '+prénom;
    }
}
