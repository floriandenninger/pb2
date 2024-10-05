package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class gmv extends lo {
    final /* synthetic */ gna a;

    public gmv(gna gnaVar) {
        this.a = gnaVar;
    }

    @Override // defpackage.lo
    public final void b(RecyclerView recyclerView, int i) {
        View a;
        if (i == 0) {
            gna gnaVar = this.a;
            if (etx.j(gnaVar.d.o(), 32)) {
                gmz gmzVar = gnaVar.h;
                if (gmzVar.e || gmzVar.f || (a = gnaVar.a(gnaVar.a.n)) == null) {
                    return;
                }
                float e = gna.e(a, gnaVar.g);
                if (e <= 0.0f || e >= 1.0f) {
                    return;
                }
                gnaVar.h.b = gnaVar.d.p();
                gmz gmzVar2 = gnaVar.h;
                gmzVar2.a = e < 0.5f ? (int) gnaVar.g : 0;
                gnaVar.a.n.bd(gmzVar2);
            }
        }
    }

    @Override // defpackage.lo
    public final void c(RecyclerView recyclerView, int i, int i2) {
        this.a.d();
    }
}
