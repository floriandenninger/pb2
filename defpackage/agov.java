package defpackage;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agov {
    public final String a;
    public final int b;
    public final atpq c;
    public final long d;
    public final AtomicInteger e;
    public final Set f;
    public final String g;
    public String h;
    public boolean i;
    public boolean j;
    private final String k;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public agov(defpackage.atpt r11) {
        /*
            r10 = this;
            java.lang.String r0 = r11.d()
            java.lang.String r2 = defpackage.aalt.g(r0)
            atpq r3 = r11.getActionProto()
            atpq r0 = r11.getActionProto()
            java.lang.String r0 = r0.d
            int r4 = defpackage.aalt.a(r0)
            atpu r0 = r11.b
            int r0 = r0.c
            r1 = 3
            if (r0 != r1) goto L2c
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS
            java.lang.Long r1 = r11.getEnqueueTimeSec()
            long r5 = r1.longValue()
            long r0 = r0.toNanos(r5)
            goto L34
        L2c:
            java.lang.Long r0 = r11.getEnqueueTimeNs()
            long r0 = r0.longValue()
        L34:
            r5 = r0
            java.lang.String r7 = r11.getRootActionId()
            atpu r0 = r11.b
            int r0 = r0.b
            r0 = r0 & 32
            r9 = 0
            if (r0 == 0) goto L48
            java.lang.String r0 = r11.getParentActionId()
            r8 = r0
            goto L49
        L48:
            r8 = r9
        L49:
            r1 = r10
            r1.<init>(r2, r3, r4, r5, r7, r8)
            java.util.concurrent.atomic.AtomicInteger r0 = r10.e
            java.lang.Integer r1 = r11.getRetryScheduleIndex()
            int r1 = r1.intValue()
            r0.set(r1)
            java.util.Set r0 = r10.f
            java.util.List r1 = r11.getChildActionIds()
            r0.addAll(r1)
            atpu r0 = r11.b
            int r0 = r0.b
            r0 = r0 & 64
            if (r0 == 0) goto L6f
            java.lang.String r9 = r11.getPrereqActionId()
        L6f:
            r10.h = r9
            java.lang.Boolean r11 = r11.getHasChildActionFailed()
            boolean r11 = r11.booleanValue()
            r10.j = r11
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agov.<init>(atpt):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final ammv a() {
        return ammv.i(this.k);
    }

    public final ammv b() {
        return ammv.i(this.h);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c() {
        this.i = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean d() {
        return !this.f.isEmpty();
    }

    public agov(String str, atpq atpqVar, int i, long j, String str2, String str3) {
        this.i = false;
        this.j = false;
        this.a = str;
        this.c = atpqVar;
        this.b = i;
        this.e = new AtomicInteger();
        this.d = j;
        this.f = new HashSet();
        this.g = str2;
        this.k = str3;
    }
}
