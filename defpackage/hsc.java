package defpackage;

import android.support.v7.widget.RecyclerView;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class hsc extends zi {
    final /* synthetic */ hse a;

    public hsc(hse hseVar) {
        this.a = hseVar;
    }

    @Override // defpackage.zi
    public final int d(RecyclerView recyclerView, wv wvVar) {
        return n(12);
    }

    @Override // defpackage.zi
    public final void f(RecyclerView recyclerView, wv wvVar) {
        super.f(recyclerView, wvVar);
        wvVar.a.setScaleX(1.0f);
        wvVar.a.setScaleY(1.0f);
    }

    @Override // defpackage.zi
    public final void g(wv wvVar, int i) {
        if (i == 2) {
            wvVar.a.setScaleX(this.a.c);
            wvVar.a.setScaleY(this.a.d);
        }
    }

    @Override // defpackage.zi
    public final boolean h(RecyclerView recyclerView, wv wvVar, wv wvVar2) {
        return this.a.a.w(wvVar.a()) && this.a.a.w(wvVar2.a());
    }

    @Override // defpackage.zi
    public final boolean k(RecyclerView recyclerView, wv wvVar, wv wvVar2) {
        int a = wvVar.a();
        int a2 = wvVar2.a();
        if (a == a2 || !this.a.a.w(a) || !this.a.a.w(a2)) {
            return false;
        }
        ((hsd) ((amna) this.a.f).a).c(a, a2);
        this.a.a.oe(a, a2);
        return true;
    }

    @Override // defpackage.zi
    public final void m() {
    }

    @Override // defpackage.zi
    public final void p() {
    }
}
