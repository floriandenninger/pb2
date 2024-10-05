package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aawh implements aawl {
    public static final long a = TimeUnit.HOURS.toSeconds(20);
    public static final long b = TimeUnit.HOURS.toSeconds(4);
    public static final long c = TimeUnit.HOURS.toSeconds(24);
    private final azrw d;
    private final aadw e;
    private final ylf f;

    public aawh(azrw azrwVar, ylf ylfVar, aadw aadwVar) {
        this.d = azrwVar;
        this.f = ylfVar;
        this.e = aadwVar;
    }

    private static int c(aula aulaVar) {
        int i = aulaVar.b;
        if (i > 0) {
            return i;
        }
        return 86400;
    }

    private final void d(int i, boolean z) {
        ylf ylfVar = this.f;
        long j = a;
        long j2 = b;
        ylfVar.d("innertube_config_fetch_charging", i + j + j2, j2 + j, z, 1, true, null, null);
    }

    private final void e(int i, boolean z, long j) {
        this.f.d("innertube_config_fetch", b + i + a, j, z, 1, false, null, null);
    }

    @Override // defpackage.aawl
    public final void a() {
        yjk.e();
        aaxn aaxnVar = (aaxn) this.d.get();
        aawk g = aaxnVar.g();
        g.k();
        aaxnVar.h(g);
        atej atejVar = this.e.b().k;
        if (atejVar == null) {
            atejVar = atej.a;
        }
        aula aulaVar = atejVar.d;
        if (aulaVar == null) {
            aulaVar = aula.a;
        }
        int c2 = c(aulaVar);
        try {
            d(c2, true);
            e(c2, true, b);
        } catch (UnsupportedOperationException unused) {
            e(c2, true, c);
        }
    }

    @Override // defpackage.aawl
    public final void b() {
        atej atejVar = this.e.b().k;
        if (atejVar == null) {
            atejVar = atej.a;
        }
        aula aulaVar = atejVar.d;
        if (aulaVar == null) {
            aulaVar = aula.a;
        }
        int c2 = c(aulaVar);
        try {
            d(c2, false);
            e(c2, false, b);
        } catch (UnsupportedOperationException unused) {
            e(c2, false, c);
        }
    }
}
