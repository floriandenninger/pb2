package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akwa extends IOException {
    public final avtq a;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public akwa(defpackage.avtq r4) {
        /*
            r3 = this;
            int r0 = r4.aB
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = 39
            r1.<init>(r2)
            java.lang.String r2 = "OpenSourceVideoIOException: "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r3.<init>(r0)
            r3.a = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akwa.<init>(avtq):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public akwa(java.lang.Throwable r5, defpackage.avtq r6) {
        /*
            r4 = this;
            int r0 = r6.aB
            java.lang.String r1 = r5.getMessage()
            java.lang.String r2 = java.lang.String.valueOf(r1)
            int r2 = r2.length()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            int r2 = r2 + 40
            r3.<init>(r2)
            java.lang.String r2 = "OpenSourceVideoIOException: "
            r3.append(r2)
            r3.append(r0)
            java.lang.String r0 = "\n"
            r3.append(r0)
            r3.append(r1)
            java.lang.String r0 = r3.toString()
            r4.<init>(r0, r5)
            r4.a = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akwa.<init>(java.lang.Throwable, avtq):void");
    }
}
