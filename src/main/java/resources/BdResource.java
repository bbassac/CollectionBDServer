package resources;

import com.qmino.miredot.annotations.ReturnType;
import infrastructure.Repository;
import infrastructure.metrics.Metric;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.naming.NamingException;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import java.sql.SQLException;

@Path("/bds/{id}")
@Stateless
@Metric
public class BdResource {

    @Inject
    Repository repository;

    /**
     * @param id Bd id
     * @return Bd
     * @title Bd individual Endpoint
     * @servicetag Retrive spécific informations for a given bd id
     **/
    @GET
    @Produces("application/json;charset=utf-8")
    @ReturnType("bean.Bd")
    public Response get(@PathParam("id") Long id) throws SQLException, NamingException {
        return Response.status(200).entity(repository.getBdFromId(id)).build();
    }


}
