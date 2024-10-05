package defpackage;

import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class nsc implements npy {
    public final /* synthetic */ nsi a;

    @Override // defpackage.npy
    public final void a() {
        nsi nsiVar = this.a;
        nqa nqaVar = nsiVar.j;
        int height = nqaVar != null ? ((npz) nqaVar).a.getHeight() : 0;
        nsiVar.l.f(height);
        SwipeRefreshLayout swipeRefreshLayout = nsiVar.g;
        swipeRefreshLayout.setPadding(swipeRefreshLayout.getPaddingLeft(), nsiVar.g.getPaddingTop(), nsiVar.g.getPaddingRight(), height);
    }
}
