package defpackage;

/* compiled from: PG */
@Deprecated
/* loaded from: classes.dex */
public final class aeqo extends aeqn {
    public long f;
    private final long g;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public aeqo(java.lang.String r10, java.lang.String r11, long r12, long r14, long r16, java.lang.String r18) {
        /*
            r9 = this;
            r8 = r9
            r0 = r11
            java.lang.String r1 = "start"
            boolean r1 = r1.equalsIgnoreCase(r11)
            r2 = 0
            if (r1 != 0) goto L2c
            java.lang.String r1 = "predictStart"
            boolean r1 = r1.equalsIgnoreCase(r11)
            if (r1 == 0) goto L14
            goto L2c
        L14:
            java.lang.String r1 = "stop"
            boolean r1 = r1.equalsIgnoreCase(r11)
            if (r1 == 0) goto L1f
            r0 = 2
            r2 = 2
            goto L2c
        L1f:
            java.lang.String r1 = "continue"
            boolean r0 = r1.equalsIgnoreCase(r11)
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
            r3 = r14
            r5 = r16
            r7 = r18
            r0.<init>(r1, r2, r3, r5, r7)
            r0 = r12
            r8.g = r0
            r0 = -1
            r8.f = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aeqo.<init>(java.lang.String, java.lang.String, long, long, long, java.lang.String):void");
    }

    @Override // defpackage.aeqn
    public final long a() {
        long j = this.f;
        if (j == -1) {
            return -1L;
        }
        return (j + this.g) - this.c;
    }

    @Override // defpackage.aeqn
    public final boolean b(aeqn aeqnVar) {
        if (!c(aeqnVar)) {
            return false;
        }
        int i = aeqnVar.b;
        int i2 = this.b;
        if (i > i2) {
            return false;
        }
        return i2 == 0 || !(aeqnVar instanceof aeqo) || ((aeqo) aeqnVar).c - this.c <= 0;
    }

    public final String toString() {
        String str = this.a;
        long j = this.f;
        long j2 = this.g;
        long j3 = this.c;
        long j4 = this.d;
        String str2 = this.e;
        long a = a();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 201 + String.valueOf(str2).length());
        sb.append("CuePoint identifier(");
        sb.append(str);
        sb.append("), periodStart(");
        sb.append(j);
        sb.append("), segmentTime(");
        sb.append(j2);
        sb.append("), timeOffset(");
        sb.append(j3);
        sb.append("), duration(");
        sb.append(j4);
        sb.append("), context(");
        sb.append(str2);
        sb.append("), startTime(");
        sb.append(a);
        sb.append(")");
        return sb.toString();
    }
}
