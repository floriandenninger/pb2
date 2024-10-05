package defpackage;

import com.google.android.libraries.youtube.innertube.model.BrowseResponseModel;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class itw implements ayrv {
    public final /* synthetic */ ivj a;
    private final /* synthetic */ int b;

    public /* synthetic */ itw(ivj ivjVar, int i) {
        this.b = i;
        this.a = ivjVar;
    }

    @Override // defpackage.ayrv
    public final Object a(Object obj) {
        int i = this.b;
        if (i == 0) {
            ivj ivjVar = this.a;
            gac a = ((gad) obj).a();
            a.d = ivjVar.bB.b;
            return a.a();
        }
        if (i == 1) {
            ivj ivjVar2 = this.a;
            gad gadVar = (gad) obj;
            mgr q = ivjVar2.q();
            Cfor p = ivjVar2.p();
            mbn mbnVar = ivjVar2.bA;
            if (!ivjVar2.bx(q, p) || p == null || mbnVar == null || !mbnVar.o() || q == null) {
                return gadVar;
            }
            gac a2 = gadVar.a();
            fzm a3 = fzn.a();
            a3.b = mbnVar.d();
            a3.c(mbnVar.n());
            a3.c = mbnVar;
            a3.d = p;
            a3.d(((ajwi) q).K);
            a3.b(zev.e(ivjVar2.qW()));
            a3.a = whu.T(ivjVar2.s());
            a2.a = a3.a();
            return a2.a();
        }
        int i2 = 2;
        if (i != 2) {
            int i3 = 3;
            if (i == 3) {
                final ivj ivjVar3 = this.a;
                final ammw ammwVar = (ammw) obj;
                fgh a4 = ivjVar3.aF.a((aauc) ammwVar.a);
                return aypy.X(a4.b.h(hxj.d).h(new iul(a4.a, 0)).x(new hxm(ammwVar, i2)).h(hxj.c).P(), a4.a.y(new ayrs() { // from class: itv
                    @Override // defpackage.ayrs
                    public final void a(Object obj2) {
                        final ivj ivjVar4 = ivj.this;
                        final BrowseResponseModel browseResponseModel = (BrowseResponseModel) obj2;
                        if (its.j((apxf) ammwVar.b) && evr.aM(ivjVar4.av)) {
                            ivjVar4.bp.execute(new Runnable() { // from class: iue
                                @Override // java.lang.Runnable
                                public final void run() {
                                    ((aadd) ivj.this.aG.get()).d(browseResponseModel.a);
                                }
                            });
                        }
                    }
                }).G(new hxm(ammwVar, i3)).o(iuq.a).l()).aG(ism.r);
            }
            return Optional.ofNullable(this.a.O);
        }
        final ivj ivjVar4 = this.a;
        gad gadVar2 = (gad) obj;
        if (!ivjVar4.bC.i()) {
            return gadVar2;
        }
        gac a5 = gadVar2.a();
        fzp fzpVar = new fzp();
        fzpVar.a = Boolean.valueOf(ivjVar4.bC.h());
        mdq mdqVar = ivjVar4.bC;
        if (mdqVar != null) {
            fzpVar.b = mdqVar;
            fzpVar.c = Boolean.valueOf(zev.e(ivjVar4.qW()));
            Boolean bool = fzpVar.a;
            if (bool == null || fzpVar.b == null || fzpVar.c == null) {
                StringBuilder sb = new StringBuilder();
                if (fzpVar.a == null) {
                    sb.append(" isFilterApplied");
                }
                if (fzpVar.b == null) {
                    sb.append(" shownCallback");
                }
                if (fzpVar.c == null) {
                    sb.append(" isAccessibilityEnabled");
                }
                String valueOf = String.valueOf(sb);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
                sb2.append("Missing required properties:");
                sb2.append(valueOf);
                throw new IllegalStateException(sb2.toString());
            }
            a5.b = new fzq(bool.booleanValue(), fzpVar.b, fzpVar.c.booleanValue());
            if (ivjVar4.bC.h()) {
                a5.a = null;
                a5.m(new amml() { // from class: iud
                    @Override // defpackage.amml
                    public final Object apply(Object obj2) {
                        ivj ivjVar5 = ivj.this;
                        fzf fzfVar = (fzf) obj2;
                        fzfVar.c(1);
                        fzfVar.b = null;
                        fzfVar.a = ivjVar5.bC.d();
                        return fzfVar;
                    }
                });
            }
            return a5.a();
        }
        throw new NullPointerException("Null shownCallback");
    }
}
