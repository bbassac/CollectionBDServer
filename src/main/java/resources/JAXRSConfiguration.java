package resources;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath(JAXRSConfiguration.REST_PREFIX)
public class JAXRSConfiguration extends Application {

    public static final String REST_PREFIX = "/rest";
}
