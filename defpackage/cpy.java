package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cpy extends IOException {
    private static final long serialVersionUID = 1;
    public final int a;

    public cpy(int i) {
        this("Http request failed", i);
    }

    public cpy(String str, int i) {
        this(str, i, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public cpy(java.lang.String r3, int r4, java.lang.Throwable r5) {
        /*
            r2 = this;
            java.lang.String r0 = java.lang.String.valueOf(r3)
            int r0 = r0.length()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r0 = r0 + 26
            r1.<init>(r0)
            r1.append(r3)
            java.lang.String r3 = ", status code: "
            r1.append(r3)
            r1.append(r4)
            java.lang.String r3 = r1.toString()
            r2.<init>(r3, r5)
            r2.a = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cpy.<init>(java.lang.String, int, java.lang.Throwable):void");
    }
}
