package resources;

import bean.Collection;
import bean.CollectionBuilder;
import com.qmino.miredot.annotations.ReturnType;
import infrastructure.Repository;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.naming.NamingException;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.sql.SQLException;

@Path("/collection")
@Stateless
public class CollectionResource {

    @Inject
    Repository repository;

    /**
     * @title Collection Endpoint
     * @servicetag Retrive the full collection of BD
     * @return Collection of Series and Bds
     */
    @GET
    @Produces("application/json;charset=utf-8")
    @ReturnType("bean.Collection")
    public Response get() throws SQLException, NamingException {
        return Response.status(200).entity(repository.getCollection()).build();
    }

     /**
     * @title Collection Endpoint
     * @servicetag Persiste a full collection into database
     * @return Collection of Series and Bds
     */
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public Response post() throws SQLException, NamingException {
        repository.createCollection(CollectionBuilder.getCollection(false));
        return Response.status(201).build();
    }

    /**
     * @title Collection Endpoint
     * @servicetag Delete a full collection
     * @return Deleted structure
     */
    @DELETE
    @Produces(MediaType.APPLICATION_JSON)
    @ReturnType("bean.DeleteResult")
    public Response delete(){
        return Response.status(201).entity(repository.deleteCollection()).build();
    }
}
