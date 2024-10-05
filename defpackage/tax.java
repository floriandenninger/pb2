package defpackage;

import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class tax implements swo {
    final /* synthetic */ tay b;

    public tax(tay tayVar) {
        this.b = tayVar;
    }

    @Override // defpackage.swo
    public final swr a(dhe dheVar, int i) {
        ajfv ajfvVar = this.b.g;
        tbp tbpVar = (tbp) tas.b.get(i);
        if (tbpVar != null && ajfvVar.a(tbpVar)) {
            if (tay.b.compareAndSet(true, false)) {
                final tbc tbcVar = (tbc) this.b.c;
                tbcVar.b.execute(new Runnable() { // from class: tbb
                    @Override // java.lang.Runnable
                    public final void run() {
                        tbc tbcVar2 = tbc.this;
                        List a = aoes.a();
                        List b = aoes.b();
                        if (tbcVar2.d.a(tbp.NATIVE_LIBRARY_CHECK)) {
                            for (tbm tbmVar : tbc.a(a)) {
                                tbmVar.b(tbp.NATIVE_LIBRARY_CHECK.m);
                                tbcVar2.a.f(tbcVar2.c, tbmVar.a());
                            }
                        }
                        if (tbcVar2.d.a(tbp.NATIVE_LIBRARY_LOAD)) {
                            for (tbm tbmVar2 : tbc.a(b)) {
                                tbmVar2.b(tbp.NATIVE_LIBRARY_LOAD.m);
                                tbcVar2.a.f(tbcVar2.c, tbmVar2.a());
                            }
                        }
                    }
                });
            }
            amsj amsjVar = dheVar.m;
            sxv sxvVar = (sxv) (amsjVar == null ? null : amsjVar.v(sxv.class));
            if (sxvVar != null && sxvVar.b.compareAndSet(true, false)) {
                tay tayVar = this.b;
                return new tas(i, tayVar.f, tayVar.d, tayVar.e);
            }
        }
        return swr.a;
    }

    @Override // defpackage.swo
    public final boolean b() {
        return true;
    }

    @Override // defpackage.swo
    public final /* synthetic */ Map c(amsj amsjVar) {
        return rwh.al(this, amsjVar);
    }
}
