package defpackage;

import android.support.v7.widget.RecyclerView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajlx {
    private final akqs a;

    public ajlx(akqx akqxVar) {
        this.a = akqxVar;
    }

    public final void a(RecyclerView recyclerView, acra acraVar) {
        Object obj = this.a;
        akqx akqxVar = (akqx) obj;
        if (!akqxVar.a || acraVar == null || akqxVar.c) {
            return;
        }
        akqxVar.b = acraVar;
        recyclerView.aD((lo) obj);
        akqxVar.c = true;
        recyclerView.getContext();
    }

    public final void b(RecyclerView recyclerView) {
        Object obj = this.a;
        akqx akqxVar = (akqx) obj;
        if (akqxVar.a && akqxVar.c) {
            recyclerView.aF((lo) obj);
            recyclerView.getContext();
            akqxVar.c = false;
        }
    }
}
