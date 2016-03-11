package resources;

import com.qmino.miredot.annotations.ReturnType;
import infrastructure.Repository;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.naming.NamingException;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import java.sql.SQLException;

@Path("/series")
@Stateless
public class SeriesResource {

    @Inject
    Repository repository;

    /**
     * @title Serie Endpoint
     * @servicetag Retrive full list of series
     * @return List of series
     */
    @GET
    @Produces("application/json;charset=utf-8")
    @ReturnType("java.util.List<bean.Serie>")
    public Response get() throws SQLException, NamingException {
        return Response.status(200).entity(repository.getAllSeries()).build();
    }


}
