package bean;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import org.codehaus.jackson.annotate.JsonManagedReference;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="COLLECTION")
@JsonIdentityInfo(generator=ObjectIdGenerators.PropertyGenerator.class, property="id")
public class Collection {
    @Id
    @Column(name="ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToMany(mappedBy = "collection", cascade = CascadeType.ALL, orphanRemoval = true,fetch = FetchType.EAGER)
    @JsonManagedReference
    private Set<Serie> listeSerie;

    public Collection() {
        listeSerie = new HashSet<>(20);
    }


    public Set<Serie> getListeSerie() {
        return listeSerie;
    }

    public void setListeSerie(Set<Serie> listeSerie) {
        this.listeSerie = listeSerie;
    }


    public void addBD(Serie serie) {
        serie.setCollection(this);
        listeSerie.add(serie);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
