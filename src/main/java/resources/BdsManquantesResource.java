package resources;

import com.qmino.miredot.annotations.ReturnType;
import infrastructure.Repository;
import infrastructure.metrics.Metric;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.naming.NamingException;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import java.sql.SQLException;

@Path("/bds/manquantes")
@Stateless
@Metric
public class BdsManquantesResource {
    @Inject
    Repository repository;

    /**
     * @return list of Bd manquantes
     * @title Bd manquantes Endpoint
     * @servicetag Retrive entire list of Bds manquantes
     **/
    @GET
    @Produces("application/json;charset=utf-8")
    @ReturnType("java.util.List<bean.BdManquante>")
    public Response get() throws SQLException, NamingException {
        return Response.status(200).entity(repository.getAllBdManquantes()).build();
    }


}
