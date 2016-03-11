package resources;

import com.qmino.miredot.annotations.ReturnType;
import infrastructure.Repository;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.naming.NamingException;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import java.sql.SQLException;

@Path("/series/{id}")
@Stateless
public class SerieResource {

    @Inject
    Repository repository;

    /**
     * @title Collection Individual Endpoint
     * @servicetag Retrive full serie detail
     * @return Series of Bds
     */
    @GET
    @Produces("application/json;charset=utf-8")
    @ReturnType("bean.Serie")
    public Response get(@PathParam("id") Long id) throws SQLException, NamingException {
        return Response.status(201).entity(repository.getSerieFromId(id)).build();
    }


}
