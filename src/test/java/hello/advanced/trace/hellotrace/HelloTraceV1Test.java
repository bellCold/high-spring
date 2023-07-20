package hello.advanced.trace.hellotrace;

import hello.advanced.trace.TraceStatus;
import hello.advanced.trace.hellotrace.HelloTraceV1;
import org.junit.jupiter.api.Test;

public class HelloTraceV1Test {

    @Test
    void begin_end() {
        HelloTraceV1 trace = new HelloTraceV1();
        TraceStatus hello = trace.begin("hello");
        trace.end(hello);
    }

    @Test
    void begin_exception() {
        HelloTraceV1 trace = new HelloTraceV1();
        TraceStatus hello = trace.begin("hello");
        trace.exception(hello, new IllegalStateException());
    }
}
