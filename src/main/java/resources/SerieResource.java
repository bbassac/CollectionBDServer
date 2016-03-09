package resources;

import bean.Serie;
import infrastructure.Repository;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.naming.NamingException;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import java.sql.SQLException;

@Path("/series/{id}")
@Stateless
public class SerieResource {

    @Inject
    Repository repository;

    @GET
    @Produces("application/json;charset=utf-8")
    public Serie get(@PathParam("id") Long id) throws SQLException, NamingException {
        return repository.getSerieFromId(id);
    }


}
