package com.youtube.libraries.bandwidth;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class TransferEvent {
    final long bytesTransferred;
    final long requestId;
    final double time;

    public TransferEvent(long j, double d, long j2) {
        this.requestId = j;
        this.time = d;
        this.bytesTransferred = j2;
    }

    public long getBytesTransferred() {
        return this.bytesTransferred;
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
        long j2 = this.bytesTransferred;
        StringBuilder sb = new StringBuilder(113);
        sb.append("TransferEvent{requestId=");
        sb.append(j);
        sb.append(",time=");
        sb.append(d);
        sb.append(",bytesTransferred=");
        sb.append(j2);
        sb.append("}");
        return sb.toString();
    }
}
