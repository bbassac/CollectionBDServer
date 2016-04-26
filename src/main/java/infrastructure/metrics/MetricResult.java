package infrastructure.metrics;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

import com.google.common.util.concurrent.AtomicDouble;


public class MetricResult {

    private String name;
    private long time;

    private AtomicInteger count;
    private AtomicDouble mean;
    private AtomicLong min;
    private AtomicLong max;

    private MetricResult() {
    }

    public MetricResult(String name, long time) {
        this();
        this.name = name;
        this.time = time;

        this.count = new AtomicInteger(1);
        this.min = new AtomicLong(time);
        this.max = new AtomicLong(time);
        this.mean = new AtomicDouble(time);
    }

    public void addMetricResult(MetricResult metricResult) {
        if (!this.name.equals(metricResult.getName())) {
            throw new IllegalArgumentException("can't add a MetricResult of a different service");
        }

        this.min.set(Math.min(this.min.get(), metricResult.time));
        this.max.set(Math.max(this.max.get(), metricResult.time));
        final int oldCount = this.count.getAndIncrement();
        this.mean.set((this.mean.get() * oldCount + metricResult.time) / this.count.get());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMean() {
        return mean.get();
    }

    public int getCount() {
        return count.get();
    }

    public long getMin() {
        return min.get();
    }

    public long getMax() {
        return max.get();
    }
}
