package resources;

import bean.Collection;
import bean.CollectionBuilder;

import javax.naming.NamingException;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

@Path("/listing-sql")
public class ListBDSQLResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String get() throws SQLException, NamingException {
        String url = "jdbc:mysql://" + System.getenv("MYSQL_ADDON_HOST") + ":3306/" + System.getenv("MYSQL_ADDON_DB");
        String utilisateur = System.getenv("MYSQL_ADDON_USER");
        String motDePasse = System.getenv("MYSQL_ADDON_PASSWORD");
        StringBuilder output = new StringBuilder();
        Connection connexion = null;
        connexion = DriverManager.getConnection( url, utilisateur, motDePasse );

        ResultSet rs = connexion.createStatement().executeQuery(
                "select 1 from dual");

        while (rs.next()) {
            output.append(
                    rs.getInt(1));

        }
        return output.toString();
    }

}
