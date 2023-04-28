package hello.advanced.trace;

import lombok.Getter;

public class TraceStatus {

    private TraceId traceId;
    private Long startTimeMs;
    private String massage;

    public TraceStatus(TraceId traceId, Long startTimeMs, String massage) {
        this.traceId = traceId;
        this.startTimeMs = startTimeMs;
        this.massage = massage;
    }

    public TraceId getTraceId() {
        return traceId;
    }

    public Long getStartTimeMs() {
        return startTimeMs;
    }

    public String getMassage() {
        return massage;
    }
}
