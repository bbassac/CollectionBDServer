package resources;

import bean.RestMetricResult;
import com.google.common.base.Function;
import com.qmino.miredot.annotations.ReturnType;
import infrastructure.metrics.MetricResult;
import infrastructure.metrics.MetricResults;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;


@Path("/metrics")
public class MetricResultsResource {

    @Inject
    private MetricResults metricResults;

    /**
     * @return List of statistics
     * @title Metrics Endpoint
     * @servicetag Retrieve statistics (in ms)
     **/
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @ReturnType("java.util.List<bean.RestMetricResult>")
    public Response get() {
        List<RestMetricResult> restMetricResults = new ArrayList<>(metricResults.getResults().size());
        for (MetricResult metricResult : metricResults.getResults()) {
            RestMetricResult restMetricResult = new RestMetricResult();
            restMetricResult.setName(metricResult.getName());
            restMetricResult.setCount(metricResult.getCount());
            restMetricResult.setMax(metricResult.getMax());
            restMetricResult.setMin(metricResult.getMin());
            restMetricResult.setMean(metricResult.getMean());

            restMetricResults.add(restMetricResult);
        }
        return Response.ok(metricResults).build();
    }


}
