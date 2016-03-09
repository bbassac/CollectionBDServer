package resources;

import bean.Bd;
import infrastructure.Repository;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.naming.NamingException;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import java.sql.SQLException;

@Path("/bds/{id}")
@Stateless
public class BdResource {

    @Inject
    Repository repository;

    @GET
    @Produces("application/json;charset=utf-8")
    public Bd get(@PathParam("id") Long id) throws SQLException, NamingException {
        return repository.getBdFromId(id);
    }


}
