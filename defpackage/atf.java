package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class atf extends IOException {
    public final int a;

    public atf(int i) {
        this.a = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
    
        r2 = r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean ro(java.io.IOException r2) {
        /*
        L0:
            if (r2 == 0) goto L17
            boolean r0 = r2 instanceof defpackage.atf
            if (r0 == 0) goto L12
            r0 = r2
            atf r0 = (defpackage.atf) r0
            int r0 = r0.a
            r1 = 2008(0x7d8, float:2.814E-42)
            if (r0 == r1) goto L10
            goto L12
        L10:
            r2 = 1
            return r2
        L12:
            java.lang.Throwable r2 = r2.getCause()
            goto L0
        L17:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.atf.ro(java.io.IOException):boolean");
    }

    public atf(String str, int i) {
        super(str);
        this.a = i;
    }

    public atf(String str, Throwable th, int i) {
        super(str, th);
        this.a = i;
    }

    public atf(Throwable th, int i) {
        super(th);
        this.a = i;
    }
}
