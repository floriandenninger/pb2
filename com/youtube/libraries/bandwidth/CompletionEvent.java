package com.youtube.libraries.bandwidth;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class CompletionEvent {
    final long requestId;
    final double time;

    public CompletionEvent(long j, double d) {
        this.requestId = j;
        this.time = d;
    }

    public long getRequestId() {
        return this.requestId;
    }

    public double getTime() {
        return this.time;
    }

    public String toString() {
        long j = this.requestId;
        double d = this.time;
        StringBuilder sb = new StringBuilder(77);
        sb.append("CompletionEvent{requestId=");
        sb.append(j);
        sb.append(",time=");
        sb.append(d);
        sb.append("}");
        return sb.toString();
    }
}
