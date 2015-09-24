package bean;

import java.util.ArrayList;
import java.util.List;


public class Collection {

    private List<Serie> listeSerie;


    public Collection() {
        listeSerie = new ArrayList<Serie>(20);
    }

    public List<Serie> getListeSerie() {
        return listeSerie;
    }


    public void setListeSerie(List<Serie> listeSerie) {
        this.listeSerie = listeSerie;
    }

    public void addBD(Serie serie) {
        listeSerie.add(serie);
    }
}
