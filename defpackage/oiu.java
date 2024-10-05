package defpackage;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class oiu extends LinearLayoutManager {
    @Override // android.support.v7.widget.LinearLayoutManager, defpackage.wd
    public final void ao(RecyclerView recyclerView, int i) {
        oit oitVar = new oit(recyclerView.getContext());
        oitVar.b = i;
        bd(oitVar);
    }
}
