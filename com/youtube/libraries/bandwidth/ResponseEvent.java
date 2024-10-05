package com.youtube.libraries.bandwidth;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ResponseEvent {
    final double predictedMediaDuration;
    final long predictedSizeBytes;
    final long requestId;
    final RequestType requestType;
    final double time;

    public ResponseEvent(long j, double d, RequestType requestType, long j2, double d2) {
        this.requestId = j;
        this.time = d;
        this.requestType = requestType;
        this.predictedSizeBytes = j2;
        this.predictedMediaDuration = d2;
    }

    public double getPredictedMediaDuration() {
        return this.predictedMediaDuration;
    }

    public long getPredictedSizeBytes() {
        return this.predictedSizeBytes;
    }

    public long getRequestId() {
        return this.requestId;
    }

    public RequestType getRequestType() {
        return this.requestType;
    }

    public double getTime() {
        return this.time;
    }

    public String toString() {
        long j = this.requestId;
        double d = this.time;
        String valueOf = String.valueOf(this.requestType);
        long j2 = this.predictedSizeBytes;
        double d2 = this.predictedMediaDuration;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 176);
        sb.append("ResponseEvent{requestId=");
        sb.append(j);
        sb.append(",time=");
        sb.append(d);
        sb.append(",requestType=");
        sb.append(valueOf);
        sb.append(",predictedSizeBytes=");
        sb.append(j2);
        sb.append(",predictedMediaDuration=");
        sb.append(d2);
        sb.append("}");
        return sb.toString();
    }
}
