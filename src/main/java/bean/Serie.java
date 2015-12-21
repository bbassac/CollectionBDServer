package bean;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import org.codehaus.jackson.annotate.JsonBackReference;
import org.codehaus.jackson.annotate.JsonManagedReference;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "SERIE")
@JsonIdentityInfo(generator=ObjectIdGenerators.PropertyGenerator.class, property="id")
public class Serie {
    @Id
    @Column(name="ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="NOM")
    private String nom;
    @Column(name="NUMERO")
    private String numero;
    @Column(name="FINI")
    private boolean fini = false;
    @Column(name="IMAGE_URL")
    private String imageUrl;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(nullable = true)
    @JsonManagedReference
    private Set<Bd> listPossede;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(nullable = true)
    @JsonManagedReference
    private Set<Bd> listManquante;
    @Column(name="EDITEUR")
    private String editeur;

    @ManyToOne
    @JsonBackReference
    private Collection collection;

    // Must have no-argument constructor
    public Serie() {

    }

    public Serie(Long id, String nom, String numero) {
        this.nom = nom;
        this.numero = numero;
        this.id = id;
        listPossede = new HashSet<>(20);
        listManquante = new HashSet<>(20);
    }

    public Serie(Long id, String nom, boolean fini) {
        this(id, nom, "");
        this.fini = fini;
    }

    public Serie(Long id, String nom) {
        this(id, nom, false);
    }

    public Serie(Long id, String nom, String numero, boolean fini) {
        this(id, nom, numero);
        this.fini = fini;
    }

    public Set<Bd> getListPossede() {
        return listPossede;
    }

    public void setListPossede(Set<Bd> listPossede) {
        this.listPossede = listPossede;
    }

    public Set<Bd> getListManquante() {
        return listManquante;
    }

    public void setListManquante(Set<Bd> listManquante) {
        this.listManquante = listManquante;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Serie addPossede(Bd bd) {
        this.listPossede.add(bd);
        bd.setSerie(this);
        return this;
    }

    public Serie addManquante(Bd bd) {
        this.listManquante.add(bd);
        bd.setSerie(this);
        return this;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public Collection getCollection() {
        return collection;
    }

    public void setCollection(Collection collection) {
        this.collection = collection;
    }
}
