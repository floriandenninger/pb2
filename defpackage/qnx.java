package defpackage;

import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class qnx extends Exception {

    @Deprecated
    public final Status a;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public qnx(com.google.android.gms.common.api.Status r5) {
        /*
            r4 = this;
            int r0 = r5.g
            java.lang.String r1 = r5.h
            if (r1 != 0) goto L8
            java.lang.String r1 = ""
        L8:
            int r2 = r1.length()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            int r2 = r2 + 13
            r3.<init>(r2)
            r3.append(r0)
            java.lang.String r0 = ": "
            r3.append(r0)
            r3.append(r1)
            java.lang.String r0 = r3.toString()
            r4.<init>(r0)
            r4.a = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qnx.<init>(com.google.android.gms.common.api.Status):void");
    }

    public final int a() {
        return this.a.g;
    }
}
