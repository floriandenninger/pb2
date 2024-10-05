package org.webrtc;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class RTCStats {
    private final long a;
    private final String b;
    private final String c;
    private final Map d;

    public RTCStats(long j, String str, String str2, Map map) {
        this.a = j;
        this.b = str;
        this.c = str2;
        this.d = map;
    }

    private static void a(StringBuilder sb, Object obj) {
        if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            sb.append('[');
            for (int i = 0; i < objArr.length; i++) {
                if (i != 0) {
                    sb.append(", ");
                }
                a(sb, objArr[i]);
            }
            sb.append(']');
            return;
        }
        if (obj instanceof String) {
            sb.append('\"');
            sb.append(obj);
            sb.append('\"');
            return;
        }
        sb.append(obj);
    }

    static RTCStats create(long j, String str, String str2, Map map) {
        return new RTCStats(j, str, str2, map);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{ timestampUs: ");
        sb.append(this.a);
        sb.append(", type: ");
        sb.append(this.b);
        sb.append(", id: ");
        sb.append(this.c);
        for (Map.Entry entry : this.d.entrySet()) {
            sb.append(", ");
            sb.append((String) entry.getKey());
            sb.append(": ");
            a(sb, entry.getValue());
        }
        sb.append(" }");
        return sb.toString();
    }
}
