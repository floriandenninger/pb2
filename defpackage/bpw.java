package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.os.SystemClock;
import android.support.v4.media.session.MediaSessionCompat$Token;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bpw {
    static bpp a;
    final Context b;
    final ArrayList c = new ArrayList();

    public bpw(Context context) {
        this.b = context;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.bpp a() {
        /*
            bpp r0 = defpackage.bpw.a
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            boolean r2 = r0.b
            if (r2 == 0) goto Lc
            goto Lbd
        Lc:
            r2 = 1
            r0.b = r2
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 30
            r5 = 0
            if (r3 < r4) goto L48
            android.content.Context r3 = r0.a
            android.content.Intent r4 = new android.content.Intent
            java.lang.Class<androidx.mediarouter.media.MediaTransferReceiver> r6 = androidx.mediarouter.media.MediaTransferReceiver.class
            r4.<init>(r3, r6)
            java.lang.String r6 = r3.getPackageName()
            r4.setPackage(r6)
            android.content.pm.PackageManager r3 = r3.getPackageManager()
            java.util.List r3 = r3.queryBroadcastReceivers(r4, r5)
            int r3 = r3.size()
            if (r3 <= 0) goto L35
            r5 = 1
        L35:
            r0.e = r5
            if (r5 == 0) goto L4a
            bos r3 = new bos
            android.content.Context r4 = r0.a
            bpk r5 = new bpk
            r5.<init>(r0, r1, r1)
            r3.<init>(r4, r5, r1, r1)
            r0.f = r3
            goto L4c
        L48:
            r0.e = r5
        L4a:
            r0.f = r1
        L4c:
            android.content.Context r3 = r0.a
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 24
            if (r4 < r5) goto L5a
            bqu r4 = new bqu
            r4.<init>(r3, r0)
            goto L5f
        L5a:
            bra r4 = new bra
            r4.<init>(r3, r0)
        L5f:
            r0.c = r4
            bpx r3 = new bpx
            bpj r4 = new bpj
            r4.<init>(r0)
            r3.<init>(r4)
            r0.o = r3
            brc r3 = r0.c
            r0.g(r3)
            bos r3 = r0.f
            if (r3 == 0) goto L79
            r0.g(r3)
        L79:
            bqs r3 = new bqs
            android.content.Context r4 = r0.a
            r3.<init>(r4, r0)
            r0.d = r3
            bqs r0 = r0.d
            boolean r3 = r0.d
            if (r3 != 0) goto Lbd
            r0.d = r2
            android.content.IntentFilter r2 = new android.content.IntentFilter
            r2.<init>()
            java.lang.String r3 = "android.intent.action.PACKAGE_ADDED"
            r2.addAction(r3)
            java.lang.String r3 = "android.intent.action.PACKAGE_REMOVED"
            r2.addAction(r3)
            java.lang.String r3 = "android.intent.action.PACKAGE_CHANGED"
            r2.addAction(r3)
            java.lang.String r3 = "android.intent.action.PACKAGE_REPLACED"
            r2.addAction(r3)
            java.lang.String r3 = "android.intent.action.PACKAGE_RESTARTED"
            r2.addAction(r3)
            java.lang.String r3 = "package"
            r2.addDataScheme(r3)
            android.content.Context r3 = r0.a
            android.content.BroadcastReceiver r4 = r0.e
            android.os.Handler r5 = r0.c
            r3.registerReceiver(r4, r2, r1, r5)
            android.os.Handler r1 = r0.c
            java.lang.Runnable r0 = r0.f
            r1.post(r0)
        Lbd:
            bpp r0 = defpackage.bpw.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bpw.a():bpp");
    }

    public static void c() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("The media router service must only be accessed on the application's main thread.");
        }
    }

    public static boolean d() {
        Bundle bundle;
        if (a == null) {
            return false;
        }
        bqf bqfVar = a().p;
        return bqfVar == null || (bundle = bqfVar.c) == null || bundle.getBoolean("androidx.mediarouter.media.MediaRouterParams.ENABLE_GROUP_VOLUME_UX", true);
    }

    public static boolean e() {
        if (a == null) {
            return false;
        }
        return a().e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean f() {
        bqf bqfVar;
        bpp a2 = a();
        if (a2 == null || (bqfVar = a2.p) == null) {
            return false;
        }
        return bqfVar.b;
    }

    public static final bpv g() {
        c();
        return a().d();
    }

    public static final MediaSessionCompat$Token h() {
        bpp bppVar = a;
        if (bppVar == null) {
            return null;
        }
        bpo bpoVar = bppVar.B;
        if (bpoVar != null) {
            return bpoVar.a.b();
        }
        hn hnVar = bppVar.C;
        if (hnVar == null) {
            return null;
        }
        return hnVar.b();
    }

    public static final List i() {
        c();
        bpp a2 = a();
        return a2 == null ? Collections.emptyList() : a2.h;
    }

    public static final bpv j() {
        c();
        return a().e();
    }

    public static final void m(hn hnVar) {
        c();
        bpp a2 = a();
        a2.C = hnVar;
        bpo bpoVar = hnVar != null ? new bpo(a2, hnVar) : null;
        bpo bpoVar2 = a2.B;
        if (bpoVar2 != null) {
            bpoVar2.a();
        }
        a2.B = bpoVar;
        if (bpoVar != null) {
            a2.m();
        }
    }

    public static final void n(bqf bqfVar) {
        c();
        bpp a2 = a();
        bqf bqfVar2 = a2.p;
        a2.p = bqfVar;
        if (a2.e) {
            if ((bqfVar2 == null ? false : bqfVar2.b) != bqfVar.b) {
                a2.f.jP(a2.x);
            }
        }
        a2.m.a(769, bqfVar);
    }

    private final int s(ji jiVar) {
        int size = this.c.size();
        for (int i = 0; i < size; i++) {
            if (((bpi) this.c.get(i)).e == jiVar) {
                return i;
            }
        }
        return -1;
    }

    public final void p(bph bphVar, ji jiVar) {
        q(bphVar, jiVar, 0);
    }

    public static bpw b(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("context must not be null");
        }
        c();
        if (a == null) {
            a = new bpp(context.getApplicationContext());
        }
        bpp bppVar = a;
        int size = bppVar.g.size();
        while (true) {
            size--;
            if (size >= 0) {
                bpw bpwVar = (bpw) ((WeakReference) bppVar.g.get(size)).get();
                if (bpwVar == null) {
                    bppVar.g.remove(size);
                } else if (bpwVar.b == context) {
                    return bpwVar;
                }
            } else {
                bpw bpwVar2 = new bpw(context);
                bppVar.g.add(new WeakReference(bpwVar2));
                return bpwVar2;
            }
        }
    }

    public static final boolean k(bph bphVar, int i) {
        if (bphVar == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        c();
        bpp a2 = a();
        if (!bphVar.d()) {
            if ((i & 2) == 0 && a2.n) {
                return true;
            }
            bqf bqfVar = a2.p;
            boolean z = bqfVar != null && bqfVar.a && a2.e;
            int size = a2.h.size();
            for (int i2 = 0; i2 < size; i2++) {
                bpv bpvVar = (bpv) a2.h.get(i2);
                if (((i & 1) == 0 || !bpvVar.j()) && ((!z || bpvVar.j() || bpvVar.c() == a2.f) && bpvVar.n(bphVar))) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final void l(bpv bpvVar) {
        if (bpvVar == null) {
            throw new IllegalArgumentException("route must not be null");
        }
        c();
        a().j(bpvVar, 3);
    }

    public static final void o(int i) {
        if (i < 0 || i > 3) {
            throw new IllegalArgumentException("Unsupported reason to unselect route");
        }
        c();
        bpp a2 = a();
        bpv c = a2.c();
        if (a2.e() != c) {
            a2.j(c, i);
        }
    }

    public final void r(ji jiVar) {
        if (jiVar == null) {
            throw new IllegalArgumentException("callback must not be null");
        }
        c();
        int s = s(jiVar);
        if (s >= 0) {
            this.c.remove(s);
            a().l();
        }
    }

    public final void q(bph bphVar, ji jiVar, int i) {
        bpi bpiVar;
        int i2;
        if (bphVar == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        if (jiVar == null) {
            throw new IllegalArgumentException("callback must not be null");
        }
        c();
        int s = s(jiVar);
        if (s < 0) {
            bpiVar = new bpi(this, jiVar, null);
            this.c.add(bpiVar);
        } else {
            bpiVar = (bpi) this.c.get(s);
        }
        if (i != bpiVar.c) {
            bpiVar.c = i;
            i2 = 1;
        } else {
            i2 = 0;
        }
        int i3 = i2 | (i & 1);
        bpiVar.d = SystemClock.elapsedRealtime();
        bph bphVar2 = bpiVar.b;
        bphVar2.c();
        bphVar.c();
        if (!bphVar2.c.containsAll(bphVar.c)) {
            bpg bpgVar = new bpg(bpiVar.b);
            bpgVar.d(bphVar);
            bpiVar.b = bpgVar.a();
        } else if (i3 == 0) {
            return;
        }
        a().l();
    }
}
