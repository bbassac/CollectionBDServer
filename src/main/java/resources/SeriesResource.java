package resources;

import bean.Serie;
import infrastructure.Repository;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.naming.NamingException;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import java.sql.SQLException;
import java.util.List;

@Path("/series")
@Stateless
public class SeriesResource {

    @Inject
    Repository repository;

    @GET
    @Produces("application/json;charset=utf-8")
    public List<Serie> get() throws SQLException, NamingException {
        return repository.getAllSeries();
    }


}
