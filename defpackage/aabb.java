package defpackage;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aabb extends lo {
    final /* synthetic */ aabg a;

    public aabb(aabg aabgVar) {
        this.a = aabgVar;
    }

    @Override // defpackage.lo
    public final void b(RecyclerView recyclerView, int i) {
        aabq aabqVar = this.a.f;
        if (aabqVar != null) {
            aabqVar.h();
            if (i == 0) {
                aabg aabgVar = this.a;
                aabq aabqVar2 = aabgVar.f;
                LinearLayoutManager linearLayoutManager = aabgVar.i;
                aabqVar2.n(linearLayoutManager == null ? -1 : linearLayoutManager.I());
            }
        }
    }

    @Override // defpackage.lo
    public final void c(RecyclerView recyclerView, int i, int i2) {
        aabq aabqVar = this.a.f;
        if (aabqVar != null) {
            aabqVar.h();
        }
    }
}
