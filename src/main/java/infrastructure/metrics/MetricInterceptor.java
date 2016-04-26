package infrastructure.metrics;

import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Joiner;
import com.google.common.base.Stopwatch;

import javax.inject.Inject;
import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;
import javax.ws.rs.*;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;


@Metric
@Interceptor
public class MetricInterceptor {

    @Inject
    MetricResults metricResults;

    @AroundInvoke
    public Object intercept(InvocationContext ctx) throws Exception {

        final ResourceDescriptor resourceDescriptor = new ResourceDescriptor(ctx);
        final Stopwatch stopwatch = Stopwatch.createStarted();
        try {
            return ctx.proceed();
        } finally {
            stopwatch.stop();
            metricResults.add(new MetricResult(resourceDescriptor.getDescription(), stopwatch.elapsed(TimeUnit.MILLISECONDS)));
        }

    }

    static class ResourceDescriptor {

        private String verb;
        private String path;

        ResourceDescriptor() {
        }

        public ResourceDescriptor(InvocationContext ctx) {
            this();
            final Path pathAnnotation = ctx.getMethod().getDeclaringClass().getAnnotation(Path.class);
            if (pathAnnotation == null) {
                throw new IllegalArgumentException("Metrics can only be applied on resource class");
            } else {
                this.path = pathAnnotation.value();
                this.verb = getVerb(ctx.getMethod());
            }
        }

        public String getDescription() {
            return Joiner.on('.').skipNulls().join(this.path, this.verb);
        }

        @VisibleForTesting
        String getVerb(Method method) {
            if (method.getAnnotation(GET.class) != null) {
                return GET.class.getAnnotation(HttpMethod.class).value();
            }
            if (method.getAnnotation(POST.class) != null) {
                return POST.class.getAnnotation(HttpMethod.class).value();
            }
            if (method.getAnnotation(DELETE.class) != null) {
                return DELETE.class.getAnnotation(HttpMethod.class).value();
            }
            if (method.getAnnotation(PUT.class) != null) {
                return PUT.class.getAnnotation(HttpMethod.class).value();
            }
            return null;
        }
    }
}
