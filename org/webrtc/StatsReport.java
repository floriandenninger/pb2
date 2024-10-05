package org.webrtc;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class StatsReport {
    public final String a;
    public final String b;
    public final double c;
    public final Value[] d;

    /* compiled from: PG */
    /* loaded from: classes4.dex */
    public class Value {
        public final String a;
        public final String b;

        public Value(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        public final String toString() {
            return "[" + this.a + ": " + this.b + "]";
        }
    }

    public StatsReport(String str, String str2, double d, Value[] valueArr) {
        this.a = str;
        this.b = str2;
        this.c = d;
        this.d = valueArr;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("id: ");
        sb.append(this.a);
        sb.append(", type: ");
        sb.append(this.b);
        sb.append(", timestamp: ");
        sb.append(this.c);
        sb.append(", values: ");
        int i = 0;
        while (true) {
            Value[] valueArr = this.d;
            if (i < valueArr.length) {
                sb.append(valueArr[i].toString());
                sb.append(", ");
                i++;
            } else {
                return sb.toString();
            }
        }
    }
}
