package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class nwb implements ayrs {
    public final /* synthetic */ nwh a;
    private final /* synthetic */ int b;

    public /* synthetic */ nwb(nwh nwhVar, int i) {
        this.b = i;
        this.a = nwhVar;
    }

    @Override // defpackage.ayrs
    public final void a(Object obj) {
        ic icVar;
        int i = 1;
        if (this.b != 0) {
            nwh nwhVar = this.a;
            nxh nxhVar = (nxh) obj;
            if (nwhVar.f == null || nwhVar.h == null || nwhVar.i == null) {
                return;
            }
            nxh nxhVar2 = nxh.FULL_BLEED;
            int ordinal = nxhVar.ordinal();
            if (ordinal != 0) {
                icVar = ordinal != 1 ? null : nwhVar.i;
            } else {
                icVar = nwhVar.h;
            }
            jw.M(nwhVar.f, icVar);
            return;
        }
        nwh nwhVar2 = this.a;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        aypn aypnVar = nwhVar2.g;
        View view = nwhVar2.f;
        if (view == null || aypnVar == null) {
            return;
        }
        if (booleanValue) {
            view.setVisibility(0);
            nwhVar2.f.setZ(1.0f);
            nwhVar2.e.c();
            ayqw ayqwVar = nwhVar2.e;
            aypn S = nwhVar2.d.S(aypnVar, knl.k);
            final nxm nxmVar = nwhVar2.b;
            nxmVar.getClass();
            aypn A = S.A(new ayrv() { // from class: nwd
                @Override // defpackage.ayrv
                public final Object a(Object obj2) {
                    return nxm.this.c((nxh) obj2);
                }
            });
            final nxl nxlVar = nwhVar2.a;
            nxlVar.getClass();
            ayqwVar.d(A.X(new ayrs() { // from class: nwc
                @Override // defpackage.ayrs
                public final void a(Object obj2) {
                    nxl.this.a((nxh) obj2);
                }
            }));
            nwhVar2.e.d(aypnVar.X(new nwb(nwhVar2, i)));
            return;
        }
        view.setVisibility(8);
        nwhVar2.e.c();
    }
}
