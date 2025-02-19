package org.webrtc;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class RTCStatsReport {
    private final long a;
    private final Map b;

    public RTCStatsReport(long j, Map map) {
        this.a = j;
        this.b = map;
    }

    private static RTCStatsReport create(long j, Map map) {
        return new RTCStatsReport(j, map);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{ timestampUs: ");
        sb.append(this.a);
        sb.append(", stats: [\n");
        boolean z = true;
        for (RTCStats rTCStats : this.b.values()) {
            if (!z) {
                sb.append(",\n");
            }
            sb.append(rTCStats);
            z = false;
        }
        sb.append(" ] }");
        return sb.toString();
    }
}
