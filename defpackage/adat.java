package defpackage;

import defpackage.adat;
import defpackage.aok;
import defpackage.bv;
import defpackage.ce;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adat {
    public final ce a;
    public final acra b;
    public final adlj c;
    adas d;

    public adat(ce ceVar, acra acraVar, adlj adljVar) {
        this.a = ceVar;
        this.b = acraVar;
        this.c = adljVar;
        ceVar.X.b(new any() { // from class: com.google.android.libraries.youtube.mdx.manualpairing.DeleteTvCodesController$1
            @Override // defpackage.aoa
            public final /* synthetic */ void lc(aok aokVar) {
            }

            @Override // defpackage.any, defpackage.aoa
            public final void lg(aok aokVar) {
                bv bvVar;
                adat adatVar = adat.this;
                ce ceVar2 = adatVar.a;
                if (ceVar2 == null || (bvVar = (bv) ceVar2.C().getSupportFragmentManager().f("confirmRemoveDialog")) == null) {
                    return;
                }
                bvVar.aE(adatVar.a);
            }

            @Override // defpackage.any, defpackage.aoa
            public final /* synthetic */ void lh(aok aokVar) {
            }

            @Override // defpackage.any, defpackage.aoa
            public final void nu(aok aokVar) {
                adat.this.a();
            }

            @Override // defpackage.aoa
            public final /* synthetic */ void nv(aok aokVar) {
            }

            @Override // defpackage.any, defpackage.aoa
            public final /* synthetic */ void ot(aok aokVar) {
            }
        });
    }

    public final void a() {
        List c = this.c.c();
        adas adasVar = this.d;
        adasVar.d = c;
        adasVar.mw();
    }
}
