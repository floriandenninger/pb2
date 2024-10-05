package defpackage;

import android.content.SharedPreferences;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ttv implements vea {
    final /* synthetic */ ttw a;
    private final String b;
    private final String c;
    private final AtomicLong d = new AtomicLong();
    private final AtomicLong e = new AtomicLong();

    public ttv(ttw ttwVar, String str) {
        this.a = ttwVar;
        this.b = ttw.d(str, "w");
        this.c = ttw.d(str, "c");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004f  */
    @Override // defpackage.vea
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(int r5) {
        /*
            r4 = this;
            java.lang.String r0 = "NetworkUsageMonitor"
            ttw r1 = r4.a
            android.content.Context r1 = r1.a
            r2 = 0
            java.lang.String r3 = "connectivity"
            java.lang.Object r1 = r1.getSystemService(r3)     // Catch: java.lang.SecurityException -> L10
            android.net.ConnectivityManager r1 = (android.net.ConnectivityManager) r1     // Catch: java.lang.SecurityException -> L10
            goto L16
        L10:
            java.lang.String r1 = "%s: Couldn't retrieve ConnectivityManager."
            defpackage.tsx.c(r1, r0)
            r1 = r2
        L16:
            if (r1 != 0) goto L19
            goto L1d
        L19:
            android.net.NetworkInfo r2 = r1.getActiveNetworkInfo()
        L1d:
            java.lang.String r1 = "w"
            if (r2 != 0) goto L28
            java.lang.String r2 = "%s: Fail to get network type "
            defpackage.tsx.c(r2, r0)
        L26:
            r0 = r1
            goto L42
        L28:
            int r0 = r2.getType()
            r3 = 1
            if (r0 == r3) goto L26
            int r0 = r2.getType()
            r3 = 9
            if (r0 == r3) goto L26
            int r0 = r2.getType()
            r2 = 17
            if (r0 != r2) goto L40
            goto L26
        L40:
            java.lang.String r0 = "c"
        L42:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L4f
            java.util.concurrent.atomic.AtomicLong r0 = r4.d
            long r1 = (long) r5
            r0.getAndAdd(r1)
            goto L55
        L4f:
            java.util.concurrent.atomic.AtomicLong r0 = r4.e
            long r1 = (long) r5
            r0.getAndAdd(r1)
        L55:
            java.util.concurrent.atomic.AtomicLong r5 = r4.d
            r5.get()
            java.util.concurrent.atomic.AtomicLong r5 = r4.e
            r5.get()
            int r5 = defpackage.tsx.a
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ttv.a(int):void");
    }

    @Override // defpackage.vea
    public final void b() {
        synchronized (ttw.class) {
            ttw ttwVar = this.a;
            SharedPreferences ar = rwh.ar(ttwVar.a, "gms_icing_mdd_network_usage_monitor", ttwVar.b);
            SharedPreferences.Editor edit = ar.edit();
            if (this.d.get() > 0) {
                edit.putLong(this.b, ar.getLong(this.b, 0L) + this.d.getAndSet(0L));
            }
            if (this.e.get() > 0) {
                edit.putLong(this.c, ar.getLong(this.c, 0L) + this.e.getAndSet(0L));
            }
            edit.apply();
            ar.getLong(this.b, -1L);
            ar.getLong(this.c, -1L);
            int i = tsx.a;
        }
    }
}
