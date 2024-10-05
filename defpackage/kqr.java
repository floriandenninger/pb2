package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class kqr implements ahuk {
    public final aypn a;
    private final azrw b;
    private final azqv c;
    private final Executor d;
    private final ahui e;

    public kqr(final kqh kqhVar, azrw azrwVar, Executor executor, ahui ahuiVar) {
        this.b = azrwVar;
        azqv ap = azqv.ap();
        this.c = ap;
        this.d = executor;
        this.e = ahuiVar;
        this.a = ap.n().A(new ayrv() { // from class: kqp
            @Override // defpackage.ayrv
            public final Object a(Object obj) {
                kqh kqhVar2 = kqh.this;
                kqs kqsVar = (kqs) obj;
                boolean a = kqhVar2.a(kqsVar);
                ahug a2 = ahuh.a();
                a2.d(a);
                boolean z = true;
                long j = -1;
                if (kqhVar2.a(kqsVar) && kqh.d(kqsVar) == -1) {
                    z = false;
                }
                a2.b(z);
                if (a) {
                    long d = kqh.d(kqsVar);
                    if (d != -1) {
                        j = d == -2 ? zev.a(kqhVar2.a.a).getRecommendedTimeoutMillis(2000, 6) : d;
                    }
                } else {
                    j = 2000;
                }
                a2.c(j);
                return a2.a();
            }
        });
    }

    public static /* synthetic */ void e() {
        zga.b("Error refreshing accessibility settings");
    }

    @Override // defpackage.ahuk
    public final aypn a() {
        return this.e.a().t(new ayrv() { // from class: kqq
            @Override // defpackage.ayrv
            public final Object a(Object obj) {
                ahuh ahuhVar = (ahuh) obj;
                return ahuhVar.b ? aypn.z(ahuhVar) : kqr.this.a;
            }
        }).n();
    }

    @Override // defpackage.ahuk
    public final void b() {
        this.e.b();
    }

    @Override // defpackage.ahuk
    public final void c() {
        this.e.c();
    }

    @Override // defpackage.ahuk
    public final void d() {
        anhy a = ((vgz) this.b.get()).a();
        Executor executor = this.d;
        jun junVar = jun.o;
        final azqv azqvVar = this.c;
        ynm.k(a, executor, junVar, new ynl() { // from class: kqo
            @Override // defpackage.ynl, defpackage.zfi
            public final void a(Object obj) {
                azqv.this.c((kqs) obj);
            }
        });
        this.e.d();
    }
}
