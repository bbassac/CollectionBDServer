package resources;

import bean.Bd;
import bean.Serie;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/switch/{bdId}")
@Stateless
public class SwitchBdResource {

    @PersistenceContext(unitName = "persistenceUnit")
    private EntityManager entityManager;

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response post(@PathParam("bdId") Long bdId) {

        Serie serie = (Serie) entityManager
                .createQuery("SELECT bd.serie FROM Bd bd WHERE bd.id=:bdId")
                .setParameter("bdId", bdId)
                .getSingleResult();

        Bd selectedBd = null;
        for (Bd bd : serie.getListManquante()) {
            if (bd.getId().equals(bdId)) {
                selectedBd = bd;
                break;
            }
        }
        if (selectedBd != null) {
            serie.getListManquante().remove(selectedBd);
            serie.getListPossede().add(selectedBd);
            entityManager.merge(serie);
            entityManager.flush();
        }

        return Response.status(201).entity(selectedBd.getId()).build();

    }


}
