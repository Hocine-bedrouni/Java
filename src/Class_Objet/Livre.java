package Class_Objet;

public class Livre {

    public String nom, prenom, categorie;
    public int ISBN, id;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Livre(String nom, String prenom, String categorie, int ISBN, int id) {
        this.nom = nom;
        this.prenom = prenom;
        this.categorie = categorie;
        this.ISBN = ISBN;
        this.id = id;
    }
}
