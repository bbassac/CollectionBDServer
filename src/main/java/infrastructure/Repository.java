package infrastructure;

import bean.Bd;
import bean.Collection;
import bean.Serie;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

/**
 * Created by b.bassac on 07/03/2016.
 */
public class Repository {

    @PersistenceContext(unitName = "persistenceUnit")
    private EntityManager entityManager;

    public Bd getBdFromId(long id) {
        return entityManager.find(Bd.class, id);
    }

    public List<Bd> getAllBd() {
        return entityManager.createQuery("SELECT b FROM Bd b").getResultList();
    }

    public Collection getCollection() {
        return (Collection) entityManager.createQuery("SELECT c FROM Collection c order by c.id ASC").getResultList().get(0);
    }

    public void createCollection(Collection c) {
        entityManager.persist(c);
    }

    public Serie getSerieFromId(Long id) {
        return entityManager.find(Serie.class, id);
    }

    public List<Serie> getAllSeries() {
        return entityManager.createQuery("SELECT s FROM Serie s").getResultList();
    }
}