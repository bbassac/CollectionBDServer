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

@Path("/bds")
@Stateless
@Metric
public class BdsResource {
    @Inject
    Repository repository;

    /**
     * @return list of Bds
     * @title Bd Endpoint
     * @servicetag Retrive entire list of Bds
     **/
    @GET
    @Produces("application/json;charset=utf-8")
    @ReturnType("java.util.List<bean.Bd>")
    public Response get() throws SQLException, NamingException {
        return Response.status(200).entity(repository.getAllBd()).build();
    }


}
