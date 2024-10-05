package defpackage;

import android.content.Context;
import com.google.protos.youtube.api.innertube.MenuRendererOuterClass;
import com.google.protos.youtube.api.innertube.SponsorshipsRenderers;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class nuf implements afwx {
    final /* synthetic */ nug a;

    public nuf(nug nugVar) {
        this.a = nugVar;
    }

    @Override // defpackage.cnk
    public final void kY(cnq cnqVar) {
        this.a.e.e(cnqVar);
        this.a.d();
    }

    @Override // defpackage.cnl
    public final /* bridge */ /* synthetic */ void kZ(Object obj) {
        auxf auxfVar;
        asga asgaVar = (asga) obj;
        nug nugVar = this.a;
        if ((asgaVar.b & 2) != 0) {
            nugVar.a.D(new acqx(asgaVar.g));
            asfq asfqVar = asgaVar.d;
            if (asfqVar == null) {
                asfqVar = asfq.a;
            }
            if (asfqVar.c == 204280949) {
                asfq asfqVar2 = asgaVar.d;
                if (asfqVar2 == null) {
                    asfqVar2 = asfq.a;
                }
                if (asfqVar2.c == 204280949) {
                    auxfVar = (auxf) asfqVar2.d;
                } else {
                    auxfVar = auxf.a;
                }
            } else {
                auxfVar = null;
            }
            if (auxfVar != null) {
                if ((auxfVar.b & 8) != 0) {
                    aulq aulqVar = auxfVar.e;
                    if (aulqVar == null) {
                        aulqVar = aulq.a;
                    }
                    auwu auwuVar = (auwu) ahbj.n(aulqVar, SponsorshipsRenderers.sponsorshipsAppBarRenderer);
                    if (auwuVar != null && (auwuVar.b & 4) != 0) {
                        aulq aulqVar2 = auwuVar.d;
                        if (aulqVar2 == null) {
                            aulqVar2 = aulq.a;
                        }
                        atdc atdcVar = (atdc) ahbj.n(aulqVar2, MenuRendererOuterClass.menuRenderer);
                        nrx nrxVar = nugVar.n;
                        if (nrxVar != null) {
                            nrxVar.r(atdcVar);
                        }
                    }
                }
                Context context = nugVar.d;
                acra acraVar = nugVar.a;
                ajoy ajoyVar = nugVar.f;
                aasm aasmVar = nugVar.g;
                yja yjaVar = new yja(context, acraVar, ajoyVar, aasmVar, nugVar.h, nugVar.i.a(aasmVar, acraVar), nugVar.e, nugVar.j, nugVar.k, nugVar.l);
                nugVar.c().addView(yjaVar.a);
                yjaVar.oB(nugVar.m, auxfVar);
            }
        }
        this.a.c().a();
    }

    @Override // defpackage.afwx
    public final /* synthetic */ void lK() {
    }
}
