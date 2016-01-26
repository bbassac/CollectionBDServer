package resources;

import bean.Collection;
import bean.CollectionBuilder;

import javax.ejb.*;
import javax.naming.NamingException;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.sql.SQLException;

@Path("/listing-sql")
@Stateless
public class ListBDSQLResource {

    @PersistenceContext(unitName = "persistenceUnit")
    private EntityManager entityManager;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Collection get() throws SQLException, NamingException {
        CriteriaBuilder builder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Collection> query = builder.createQuery(Collection.class);

        Root<Collection> cal = query.from(Collection.class);
        query.select(cal);
        TypedQuery<Collection> myQuery = entityManager.createQuery(query);

        return myQuery.getSingleResult();

    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public void post() throws SQLException, NamingException {


        entityManager.persist(CollectionBuilder.getCollection(false));


    }
}
