package resources;

import bean.Collection;
import bean.CollectionBuilder;

import javax.naming.NamingException;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.sql.SQLException;

@Path("/listing")
public class ListBDResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Collection get() throws SQLException, NamingException {
        return CollectionBuilder.getCollection(true);
    }

}
