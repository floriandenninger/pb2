package defpackage;

import com.google.android.apps.youtube.app.watch.engagementpanel.LinearScrollToItemLayoutManager;
import com.google.protos.youtube.api.innertube.ElementsSectionListFooterRendererOuterClass;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class nsh extends ajsv {
    final /* synthetic */ nsi a;

    public nsh(nsi nsiVar) {
        this.a = nsiVar;
    }

    @Override // defpackage.ajsv, defpackage.ajww
    public final void c(aamd aamdVar, boolean z) {
        ntp ntpVar;
        int bC;
        int bD;
        if (z) {
            nsi nsiVar = this.a;
            auor auorVar = aamdVar.a.n;
            if (auorVar == null) {
                auorVar = auor.a;
            }
            int bE = aobq.bE(auorVar.d);
            if (bE == 0) {
                bE = 1;
            }
            if (bE == 2) {
                nsiVar.l.b();
                ntp ntpVar2 = nsiVar.n;
                if (ntpVar2 != null && ntpVar2.b) {
                    ntpVar2.h();
                }
            } else if (bE == 3) {
                if (nsiVar.l.d && (ntpVar = nsiVar.n) != null) {
                    ntpVar.f();
                }
                nsq nsqVar = nsiVar.l;
                if (!nsqVar.c) {
                    nsqVar.c();
                    nsiVar.l.h(aamdVar.a);
                    nsiVar.l.e(nsiVar.f, nsiVar.h);
                    aqts aqtsVar = nsiVar.b;
                    aqtsVar.getClass();
                    String i = oba.i(aqtsVar);
                    if (i != null) {
                        nsiVar.e.d(nsiVar.d.b(nrn.c(aamdVar.a)).i(aypg.LATEST).h(oba.f(nsiVar.l.a())).s(new nsg(i, 0)).X(new nsf(nsiVar, 1)));
                    }
                }
            }
            auov auovVar = aamdVar.a;
            LinearScrollToItemLayoutManager linearScrollToItemLayoutManager = nsiVar.k;
            if (linearScrollToItemLayoutManager != null) {
                linearScrollToItemLayoutManager.ac(((auovVar.c & 16384) == 0 || (bD = aobq.bD(auovVar.o)) == 0 || bD != 3) ? false : true);
                linearScrollToItemLayoutManager.bB(((auovVar.c & 65536) == 0 || (bC = aobq.bC(auovVar.q)) == 0 || bC != 3) ? false : true);
            }
            auov auovVar2 = aamdVar.a;
            if (nsiVar.j == null) {
                aulq aulqVar = auovVar2.k;
                if (aulqVar == null) {
                    aulqVar = aulq.a;
                }
                if (aulqVar.pY(ElementsSectionListFooterRendererOuterClass.elementsSectionListFooterRenderer)) {
                    nsiVar.j = nsiVar.o.i(nsiVar.a, nsiVar.c, new nsc(nsiVar));
                    nqa nqaVar = nsiVar.j;
                    aulq aulqVar2 = auovVar2.k;
                    if (aulqVar2 == null) {
                        aulqVar2 = aulq.a;
                    }
                    ((npz) nqaVar).a((aqrm) aulqVar2.pX(ElementsSectionListFooterRendererOuterClass.elementsSectionListFooterRenderer));
                    nqa nqaVar2 = nsiVar.j;
                    nsiVar.g(nqaVar2);
                    npz npzVar = (npz) nqaVar2;
                    nsiVar.f.addView(npzVar.a);
                    npzVar.f();
                }
            }
        }
    }
}
