package defpackage;

import android.accounts.Account;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class wki {
    public final aloh a;

    public wki(aloh alohVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.a = alohVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0055, code lost:
    
        r7 = defpackage.prh.G(r6);
        r1 = defpackage.qre.b();
        r1.b = new com.google.android.gms.common.Feature[]{defpackage.qcv.a};
        r1.a = new defpackage.qds(r0);
        r1.c = 1644;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x007e, code lost:
    
        r7 = (java.lang.Integer) defpackage.qde.d(((defpackage.qob) r7).w(r1.a()), "hasCapabilities ");
        defpackage.qde.k(r7);
        r6 = r7.intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x008c, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x008d, code lost:
    
        defpackage.qde.i(r7, "hasCapabilities ");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Integer a(android.accounts.Account r6, java.lang.String[] r7) {
        /*
            r5 = this;
            com.google.android.gms.auth.HasCapabilitiesRequest r0 = new com.google.android.gms.auth.HasCapabilitiesRequest
            r0.<init>(r6, r7)
            aloh r6 = r5.a
            android.content.Context r6 = r6.a
            defpackage.qip.an(r6)
            android.accounts.Account r7 = r0.a
            defpackage.qip.an(r7)
            android.accounts.Account r7 = r0.a
            java.lang.String r7 = r7.name
            defpackage.qip.ax(r7)
            java.lang.String r7 = "This call can involve network request. It is unsafe to call from main thread."
            defpackage.qip.au(r7)
            defpackage.uvr.g(r6)
            axsp r7 = defpackage.axsp.a
            axsq r7 = r7.get()
            boolean r7 = r7.b()
            if (r7 == 0) goto L90
            android.content.pm.ApplicationInfo r7 = r6.getApplicationInfo()
            java.lang.String r7 = r7.packageName
            axsp r1 = defpackage.axsp.a
            axsq r1 = r1.get()
            aors r1 = r1.a()
            aony r1 = r1.b
            java.util.Iterator r1 = r1.iterator()
        L42:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L55
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            boolean r2 = r2.equals(r7)
            if (r2 == 0) goto L42
            goto L90
        L55:
            qdk r7 = defpackage.prh.G(r6)
            qrd r1 = defpackage.qre.b()
            r2 = 1
            com.google.android.gms.common.Feature[] r2 = new com.google.android.gms.common.Feature[r2]
            r3 = 0
            com.google.android.gms.common.Feature r4 = defpackage.qcv.a
            r2[r3] = r4
            r1.b = r2
            qds r2 = new qds
            r2.<init>()
            r1.a = r2
            r2 = 1644(0x66c, float:2.304E-42)
            r1.c = r2
            qre r1 = r1.a()
            qob r7 = (defpackage.qob) r7
            rpt r7 = r7.w(r1)
            java.lang.String r1 = "hasCapabilities "
            java.lang.Object r7 = defpackage.qde.d(r7, r1)     // Catch: defpackage.qnx -> L8c
            java.lang.Integer r7 = (java.lang.Integer) r7     // Catch: defpackage.qnx -> L8c
            defpackage.qde.k(r7)     // Catch: defpackage.qnx -> L8c
            int r6 = r7.intValue()     // Catch: defpackage.qnx -> L8c
            goto La1
        L8c:
            r7 = move-exception
            defpackage.qde.i(r7, r1)
        L90:
            qcy r7 = new qcy
            r7.<init>()
            android.content.ComponentName r0 = defpackage.qde.c
            java.lang.Object r6 = defpackage.qde.c(r6, r0, r7)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
        La1:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wki.a(android.accounts.Account, java.lang.String[]):java.lang.Integer");
    }

    public final Account[] b() {
        return qde.m(this.a.a);
    }

    public final Account[] c(String[] strArr) {
        return qde.n(this.a.a, strArr);
    }
}
