package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bax extends IOException {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public bax(int r3) {
        /*
            r2 = this;
            if (r3 == 0) goto Lb
            r0 = 1
            if (r3 == r0) goto L8
            java.lang.String r3 = "start exceeds end"
            goto Ld
        L8:
            java.lang.String r3 = "not seekable to start"
            goto Ld
        Lb:
            java.lang.String r3 = "invalid period count"
        Ld:
            java.lang.String r0 = "Illegal clipping: "
            int r1 = r3.length()
            if (r1 == 0) goto L1a
            java.lang.String r3 = r0.concat(r3)
            goto L1f
        L1a:
            java.lang.String r3 = new java.lang.String
            r3.<init>(r0)
        L1f:
            r2.<init>(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bax.<init>(int):void");
    }
}
