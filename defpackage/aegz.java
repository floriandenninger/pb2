package defpackage;

import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aegz extends PhoneStateListener {
    final /* synthetic */ aeha a;
    private final TelephonyManager b;
    private final zfi c;

    public aegz(aeha aehaVar, TelephonyManager telephonyManager, zfi zfiVar) {
        this.a = aehaVar;
        this.b = telephonyManager;
        this.c = zfiVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0014, code lost:
    
        if (r3.contains("nrState=NOT_RESTRICTED") != false) goto L7;
     */
    /* JADX WARN: Removed duplicated region for block: B:5:0x002e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // android.telephony.PhoneStateListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onServiceStateChanged(android.telephony.ServiceState r3) {
        /*
            r2 = this;
            if (r3 == 0) goto L19
            java.lang.String r3 = r3.toString()     // Catch: java.lang.RuntimeException -> L1c
            java.lang.String r0 = "nrState=CONNECTED"
            boolean r0 = r3.contains(r0)     // Catch: java.lang.RuntimeException -> L1c
            if (r0 != 0) goto L16
            java.lang.String r0 = "nrState=NOT_RESTRICTED"
            boolean r3 = r3.contains(r0)     // Catch: java.lang.RuntimeException -> L1c
            if (r3 == 0) goto L19
        L16:
            java.lang.String r3 = "5g"
            goto L20
        L19:
            java.lang.String r3 = "n"
            goto L20
        L1c:
            afic r3 = defpackage.afic.ABR
            java.lang.String r3 = "e"
        L20:
            zfi r0 = r2.c
            r0.a(r3)
            android.telephony.TelephonyManager r3 = r2.b
            r0 = 0
            r3.listen(r2, r0)
            aeha r3 = r2.a
            monitor-enter(r3)
            aeha r1 = r2.a     // Catch: java.lang.Throwable -> L34
            r1.c = r0     // Catch: java.lang.Throwable -> L34
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L34
            return
        L34:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L34
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aegz.onServiceStateChanged(android.telephony.ServiceState):void");
    }
}
