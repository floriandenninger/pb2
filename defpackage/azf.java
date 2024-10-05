package defpackage;

import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azf implements azh {
    public final atm a;
    public final Map b;

    public azf(atm atmVar) {
        pse.e(true);
        this.a = atmVar;
        this.b = new HashMap();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(5:11|12|13|(1:30)|(2:18|19)(2:20|21)) */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0033, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0034, code lost:
    
        r3 = r2.d;
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0039, code lost:
    
        if (r3 == 307) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005d, code lost:
    
        if (r5 != null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005f, code lost:
    
        r9 = r9 + 1;
        r8 = r8.a();
        r8.b(r5);
        r8 = r8.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0070, code lost:
    
        throw r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0056, code lost:
    
        r5 = (java.lang.String) r3.get(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0031, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0071, code lost:
    
        defpackage.pts.O(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0074, code lost:
    
        throw r7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static byte[] a(defpackage.atm r6, java.lang.String r7, byte[] r8, java.util.Map r9) {
        /*
            bgh r0 = new bgh
            ati r6 = (defpackage.ati) r6
            atj r6 = r6.a()
            r0.<init>(r6)
            atg r6 = new atg
            r6.<init>()
            r6.b(r7)
            r6.e = r9
            r7 = 2
            r6.c = r7
            r6.d = r8
            r7 = 1
            r6.i = r7
            ath r6 = r6.a()
            r7 = 0
            r9 = 0
            r8 = r6
        L24:
            bff r1 = new bff     // Catch: java.lang.Exception -> L75
            r1.<init>(r0, r8)     // Catch: java.lang.Exception -> L75
            byte[] r7 = defpackage.pts.aa(r1)     // Catch: java.lang.Throwable -> L31 defpackage.atp -> L33
            defpackage.pts.O(r1)     // Catch: java.lang.Exception -> L75
            return r7
        L31:
            r7 = move-exception
            goto L71
        L33:
            r2 = move-exception
            int r3 = r2.d     // Catch: java.lang.Throwable -> L31
            r4 = 307(0x133, float:4.3E-43)
            r5 = 0
            if (r3 == r4) goto L3f
            r4 = 308(0x134, float:4.32E-43)
            if (r3 != r4) goto L5d
        L3f:
            r3 = 5
            if (r9 >= r3) goto L5d
            java.util.Map r3 = r2.e     // Catch: java.lang.Throwable -> L31
            if (r3 == 0) goto L5d
            java.lang.String r4 = "Location"
            java.lang.Object r3 = r3.get(r4)     // Catch: java.lang.Throwable -> L31
            java.util.List r3 = (java.util.List) r3     // Catch: java.lang.Throwable -> L31
            if (r3 == 0) goto L5d
            boolean r4 = r3.isEmpty()     // Catch: java.lang.Throwable -> L31
            if (r4 != 0) goto L5d
            java.lang.Object r3 = r3.get(r7)     // Catch: java.lang.Throwable -> L31
            r5 = r3
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Throwable -> L31
        L5d:
            if (r5 == 0) goto L70
            int r9 = r9 + 1
            atg r8 = r8.a()     // Catch: java.lang.Throwable -> L31
            r8.b(r5)     // Catch: java.lang.Throwable -> L31
            ath r8 = r8.a()     // Catch: java.lang.Throwable -> L31
            defpackage.pts.O(r1)     // Catch: java.lang.Exception -> L75
            goto L24
        L70:
            throw r2     // Catch: java.lang.Throwable -> L31
        L71:
            defpackage.pts.O(r1)     // Catch: java.lang.Exception -> L75
            throw r7     // Catch: java.lang.Exception -> L75
        L75:
            r7 = move-exception
            azi r8 = new azi
            android.net.Uri r9 = r0.b
            defpackage.pse.c(r9)
            r0.a()
            long r0 = r0.a
            r8.<init>(r6, r0, r7)
            goto L87
        L86:
            throw r8
        L87:
            goto L86
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.azf.a(atm, java.lang.String, byte[], java.util.Map):byte[]");
    }

    @Override // defpackage.azh
    public final byte[] b(ztp ztpVar) {
        throw null;
    }

    @Override // defpackage.azh
    public final byte[] c(ztp ztpVar) {
        throw null;
    }
}
