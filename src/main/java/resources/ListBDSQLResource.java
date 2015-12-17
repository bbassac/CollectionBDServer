package resources;

import bean.Test;

import javax.annotation.sql.DataSourceDefinition;
import javax.ejb.Stateless;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.persistence.*;
import javax.transaction.Transactional;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.sql.SQLException;
import java.util.List;

@Path("/listing-sql")
@Transactional
public class ListBDSQLResource {

    @javax.enterprise.inject.Produces
    @PersistenceContext(unitName = "persistenceUnit")
    private EntityManager manager;

    @GET
    @Produces(MediaType.APPLICATION_JSON)

    public List get() throws SQLException, NamingException {

        List list = manager.createNativeQuery("Select id, title from test", Test.class).getResultList();

        return list;
    }

}
