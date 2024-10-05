package defpackage;

import android.net.Uri;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aehm extends afja {
    private final Set b;
    private Uri c;
    private Uri d;
    private long e;
    private final boolean f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aehm(atr atrVar, Set set, boolean z) {
        super(atrVar);
        afki.a(atrVar);
        afki.a(set);
        this.b = set;
        this.f = z;
    }

    private final void c() {
        this.c = null;
        this.d = null;
        this.e = 0L;
    }

    @Override // defpackage.afja, defpackage.atr, defpackage.atc
    public final int g(byte[] bArr, int i, int i2) {
        try {
            return super.g(bArr, i, i2);
        } catch (atn e) {
            c();
            throw e;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ad, code lost:
    
        if (android.text.TextUtils.equals(r0.getAuthority(), "redirector.googlevideo.com") != false) goto L33;
     */
    @Override // defpackage.afja, defpackage.atr, defpackage.ate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long h(defpackage.ath r8) {
        /*
            r7 = this;
            long r0 = android.os.SystemClock.elapsedRealtime()
            android.net.Uri r2 = r7.d
            if (r2 == 0) goto L15
            long r2 = r7.e
            long r0 = r0 - r2
            r2 = 600000(0x927c0, double:2.964394E-318)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L15
            r7.c()
        L15:
            android.net.Uri r0 = r8.a
            android.net.Uri r1 = r7.c
            boolean r0 = defpackage.adyu.i(r0, r1)
            if (r0 != 0) goto L22
            r7.c()
        L22:
            android.net.Uri r0 = r7.d
            if (r0 == 0) goto L89
            android.net.Uri r1 = r8.a
            android.net.Uri r2 = r7.c
            defpackage.afki.a(r2)
            defpackage.afki.a(r0)
            java.util.LinkedHashSet r3 = new java.util.LinkedHashSet
            r3.<init>()
            java.util.Set r4 = r1.getQueryParameterNames()
            r3.addAll(r4)
            java.util.Set r4 = r2.getQueryParameterNames()
            r3.addAll(r4)
            java.util.Set r4 = r7.b
            r3.addAll(r4)
            zhy r0 = defpackage.zhy.b(r0)
            java.util.Iterator r3 = r3.iterator()
        L50:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L80
            java.lang.Object r4 = r3.next()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r5 = r1.getQueryParameter(r4)
            java.lang.String r6 = r2.getQueryParameter(r4)
            boolean r5 = android.text.TextUtils.equals(r5, r6)
            if (r5 == 0) goto L72
            java.util.Set r5 = r7.b
            boolean r5 = r5.contains(r4)
            if (r5 == 0) goto L50
        L72:
            java.lang.String r5 = r1.getQueryParameter(r4)
            if (r5 != 0) goto L7c
            r0.j(r4)
            goto L50
        L7c:
            r0.g(r4, r5)
            goto L50
        L80:
            android.net.Uri r0 = r0.a()
            ath r0 = r8.d(r0)
            goto L8a
        L89:
            r0 = r8
        L8a:
            long r1 = super.h(r0)     // Catch: defpackage.atn -> Lbc
            android.net.Uri r3 = super.i()     // Catch: defpackage.atn -> Lbc
            android.net.Uri r0 = r0.a     // Catch: defpackage.atn -> Lbc
            boolean r0 = defpackage.adyu.i(r0, r3)     // Catch: defpackage.atn -> Lbc
            if (r0 != 0) goto Lbb
            android.net.Uri r0 = r8.a     // Catch: defpackage.atn -> Lbc
            boolean r4 = r7.f     // Catch: defpackage.atn -> Lbc
            if (r4 != 0) goto La1
            goto Laf
        La1:
            if (r0 == 0) goto Lbb
            java.lang.String r0 = r0.getAuthority()     // Catch: defpackage.atn -> Lbc
            java.lang.String r4 = "redirector.googlevideo.com"
            boolean r0 = android.text.TextUtils.equals(r0, r4)     // Catch: defpackage.atn -> Lbc
            if (r0 == 0) goto Lbb
        Laf:
            android.net.Uri r8 = r8.a     // Catch: defpackage.atn -> Lbc
            r7.c = r8     // Catch: defpackage.atn -> Lbc
            r7.d = r3     // Catch: defpackage.atn -> Lbc
            long r3 = android.os.SystemClock.elapsedRealtime()     // Catch: defpackage.atn -> Lbc
            r7.e = r3     // Catch: defpackage.atn -> Lbc
        Lbb:
            return r1
        Lbc:
            r8 = move-exception
            r7.c()
            goto Lc2
        Lc1:
            throw r8
        Lc2:
            goto Lc1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aehm.h(ath):long");
    }

    @Override // defpackage.afja, defpackage.atr, defpackage.ate
    public final void j() {
        try {
            super.j();
        } catch (atn e) {
            c();
            throw e;
        }
    }
}
