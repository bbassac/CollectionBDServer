package resources;

import bean.Collection;
import bean.CollectionBuilder;
import infrastructure.Repository;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.naming.NamingException;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.sql.SQLException;

@Path("/collection")
@Stateless
public class CollectionResource {

    @Inject
    Repository repository;

    @GET
    @Produces("application/json;charset=utf-8")
    public Collection get() throws SQLException, NamingException {
        return repository.getCollection();
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public void post() throws SQLException, NamingException {
        repository.createCollection(CollectionBuilder.getCollection(false));
    }
}
