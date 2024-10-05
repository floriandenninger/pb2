package defpackage;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

/* compiled from: PG */
/* loaded from: classes.dex */
final class acdu extends LinearLayoutManager {
    final /* synthetic */ acdv a;

    public acdu(acdv acdvVar) {
        this.a = acdvVar;
    }

    @Override // android.support.v7.widget.LinearLayoutManager, defpackage.wd
    public final void ao(RecyclerView recyclerView, int i) {
        wr wrVar = this.a.l;
        wrVar.b = i;
        bd(wrVar);
    }
}
