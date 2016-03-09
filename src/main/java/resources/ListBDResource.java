package resources;

import bean.Collection;
import bean.CollectionBuilder;

import javax.naming.NamingException;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import java.sql.SQLException;

@Path("/listing")
public class ListBDResource {

    @GET
    @Produces("application/json;charset=utf-8")
    public Collection get() throws SQLException, NamingException {
        return CollectionBuilder.getCollection(true);
    }

}
