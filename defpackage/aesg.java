package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aesg extends aeqn {
    public final String f;
    private volatile long g;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public aesg(java.lang.String r10, java.lang.String r11, java.lang.String r12, long r13, long r15, long r17, java.lang.String r19) {
        /*
            r9 = this;
            r8 = r9
            r0 = r12
            java.lang.String r1 = "event_start"
            boolean r1 = r1.equalsIgnoreCase(r12)
            r2 = 0
            if (r1 != 0) goto L2c
            java.lang.String r1 = "event_predict_start"
            boolean r1 = r1.equalsIgnoreCase(r12)
            if (r1 == 0) goto L14
            goto L2c
        L14:
            java.lang.String r1 = "event_stop"
            boolean r1 = r1.equalsIgnoreCase(r12)
            if (r1 == 0) goto L1f
            r0 = 2
            r2 = 2
            goto L2c
        L1f:
            java.lang.String r1 = "event_continue"
            boolean r0 = r1.equalsIgnoreCase(r12)
            if (r0 == 0) goto L2a
            r0 = 1
            r2 = 1
            goto L2c
        L2a:
            r0 = -1
            r2 = -1
        L2c:
            r0 = r9
            r1 = r10
            r3 = r15
            r5 = r17
            r7 = r19
            r0.<init>(r1, r2, r3, r5, r7)
            r0 = r11
            r8.f = r0
            r0 = r13
            r8.g = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aesg.<init>(java.lang.String, java.lang.String, java.lang.String, long, long, long, java.lang.String):void");
    }

    public static aesg d(long j, aesh aeshVar) {
        String d = aeshVar.d("Cuepoint-Identifier");
        String d2 = aeshVar.d("Cuepoint-Type");
        String d3 = aeshVar.d("Cuepoint-Event");
        Double a = aeshVar.a("Cuepoint-Playhead-Time-Sec");
        Double a2 = aeshVar.a("Cuepoint-Total-Duration-Sec");
        String d4 = aeshVar.d("Cuepoint-Context");
        if (d3 == null || a == null || a2 == null) {
            return null;
        }
        return new aesg(d, d2, d3, j, (long) (a.doubleValue() * 1000.0d), (long) (a2.doubleValue() * 1000.0d), d4);
    }

    @Override // defpackage.aeqn
    public final long a() {
        if (this.g == -1 || this.c == -1) {
            return -1L;
        }
        return this.g - this.c;
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.f;
        int i = this.b;
        long a = a();
        long j = this.d;
        long j2 = this.g;
        long j3 = this.c;
        String str3 = this.e;
        int length = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 195 + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb.append("CuePoint identifier=");
        sb.append(str);
        sb.append(", type=");
        sb.append(str2);
        sb.append(", event=");
        sb.append(i);
        sb.append(", breakStartTimeMs=");
        sb.append(a);
        sb.append(", durationMs=");
        sb.append(j);
        sb.append(", cueTimeMs=");
        sb.append(j2);
        sb.append(", timeOffsetMs=");
        sb.append(j3);
        sb.append(", context=");
        sb.append(str3);
        return sb.toString();
    }
}
