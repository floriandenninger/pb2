package defpackage;

import android.support.v7.widget.RecyclerView;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class zg implements Runnable {
    final /* synthetic */ zl a;
    final /* synthetic */ zn b;

    public zg(zn znVar, zl zlVar) {
        this.b = znVar;
        this.a = zlVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        RecyclerView recyclerView = this.b.m;
        if (recyclerView == null || !recyclerView.r) {
            return;
        }
        zl zlVar = this.a;
        if (zlVar.n || zlVar.h.a() == -1) {
            return;
        }
        vz vzVar = this.b.m.E;
        if (vzVar == null || !vzVar.p(null)) {
            zn znVar = this.b;
            int size = znVar.l.size();
            for (int i = 0; i < size; i++) {
                if (((zl) znVar.l.get(i)).o) {
                }
            }
            this.b.j.p();
            return;
        }
        this.b.m.post(this);
    }
}
