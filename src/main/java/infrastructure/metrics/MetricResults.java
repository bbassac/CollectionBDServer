package infrastructure.metrics;

import java.util.Collection;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

import javax.enterprise.context.ApplicationScoped;


@ApplicationScoped
public class MetricResults {


    private ConcurrentHashMap<String, MetricResult> results = new ConcurrentHashMap<>();

    public void add(MetricResult result) {

            final MetricResult present = results.putIfAbsent(result.getName(), result);
            if (present != null) {
                present.addMetricResult(result);
            }

    }

    public Collection<MetricResult> getResults() {
        return results.values();
    }
}
