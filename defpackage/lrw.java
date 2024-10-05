package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class lrw implements zbi, ypd {
    public acqz a;
    public kbv b;

    public lrw(aaea aaeaVar, azrw azrwVar, ayqi ayqiVar) {
        aswb aswbVar = aaeaVar.a().e;
        if ((aswbVar == null ? aswb.a : aswbVar).t) {
            ((akmu) azrwVar.get()).c().l(30L, TimeUnit.SECONDS).E(ayqiVar).X(new ayrs() { // from class: lrv
                @Override // defpackage.ayrs
                public final void a(Object obj) {
                    lrw lrwVar = lrw.this;
                    akmw akmwVar = (akmw) obj;
                    if (lrwVar.a == null) {
                        return;
                    }
                    if (akmwVar.a == atmk.EFFECTIVE_CONNECTION_TYPE_SLOW_2G || akmwVar.a == atmk.EFFECTIVE_CONNECTION_TYPE_2G || akmwVar.a == atmk.EFFECTIVE_CONNECTION_TYPE_3G) {
                        lrwVar.a.mM().D(new acqx(acsb.c(akmwVar.b == 3 ? 118080 : 118079)));
                    }
                }
            });
        }
    }

    private final void c(boolean z) {
        kbv kbvVar = this.b;
        if (kbvVar != null) {
            kbvVar.m(z);
        }
    }

    @Override // defpackage.zbi
    public final void a() {
        c(false);
    }

    @Override // defpackage.zbi
    public final void b() {
        c(true);
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{yro.class};
        }
        if (i == 0) {
            c(!((yro) obj).a());
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }
}
