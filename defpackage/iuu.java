package defpackage;

import android.support.v7.widget.RecyclerView;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class iuu extends lo {
    final /* synthetic */ ivj a;

    public iuu(ivj ivjVar) {
        this.a = ivjVar;
    }

    @Override // defpackage.lo
    public final void b(RecyclerView recyclerView, int i) {
        gfi gfiVar;
        gfb gfbVar;
        gfk a;
        if (i != 1 || (gfbVar = (gfiVar = this.a.ae).e) == null || (a = gfiVar.a(gfbVar)) == null) {
            return;
        }
        a.d();
    }

    @Override // defpackage.lo
    public final void c(RecyclerView recyclerView, int i, int i2) {
        gfk a;
        gfi gfiVar = this.a.ae;
        gfb gfbVar = gfiVar.e;
        if (gfbVar == null || (a = gfiVar.a(gfbVar)) == null) {
            return;
        }
        a.a(recyclerView, i2);
    }
}
