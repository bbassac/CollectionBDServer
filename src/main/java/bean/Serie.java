package bean;

import java.util.ArrayList;
import java.util.List;

public class Serie {

    private int id;
    private String nom;
    private String numero;
    private boolean fini = false;
    private String imageUrl;
    private String manquant;
    private List<Bd> listPossede;
    private List<Bd> listManquante;
    private String editeur;


    // Must have no-argument constructor
    public Serie() {

    }

    public Serie(int id, String nom, String numero) {
        this.nom = nom;
        this.numero = numero;
        this.id = id;
        listPossede = new ArrayList<>(20);
        listManquante = new ArrayList<>(20);
    }

    public Serie(int id, String nom, boolean fini) {
        this(id, nom, "");
        this.fini = fini;
    }

    public Serie(int id, String nom) {
        this(id, nom, false);
    }

    public Serie(int id, String nom, String numero, boolean fini) {
        this(id, nom, numero);
        this.fini = fini;
    }

    public List<Bd> getListPossede() {
        return listPossede;
    }

    public void setListPossede(List<Bd> listPossede) {
        this.listPossede = listPossede;
    }

    public List<Bd> getListManquante() {
        return listManquante;
    }

    public void setListManquante(List<Bd> listManquante) {
        this.listManquante = listManquante;
    }

    public String getManquant() {
        return manquant;
    }

    public void setManquant(String manquant) {
        this.manquant = manquant;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Serie addPossede(Bd bd) {
        this.listPossede.add(bd);
        return this;
    }

    public Serie addManquante(Bd bd) {
        this.listManquante.add(bd);
        return this;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public boolean isFini() {
        return fini;
    }

    public void setFini(boolean fini) {
        this.fini = fini;
    }

    public Serie withImageUrl(String url) {
        this.setImageUrl(url);
        return this;
    }

    public Serie withManquant(String manquant) {
        this.setManquant(manquant);
        return this;
    }

    public Serie withEditeur(String editeur) {
        this.setEditeur(editeur);
        return this;
    }

    public String getEditeur() {
        return editeur;
    }

    public void setEditeur(String editeur) {
        this.editeur = editeur;
    }
}
