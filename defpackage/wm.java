package defpackage;

import android.support.v7.widget.RecyclerView;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class wm extends js {
    final /* synthetic */ RecyclerView a;

    public wm(RecyclerView recyclerView) {
        this.a = recyclerView;
    }

    @Override // defpackage.js
    public final void c() {
        this.a.w(null);
        RecyclerView recyclerView = this.a;
        recyclerView.M.f = true;
        recyclerView.V(true);
        if (this.a.f.l()) {
            return;
        }
        this.a.requestLayout();
    }

    @Override // defpackage.js
    public final void e(int i, int i2, Object obj) {
        this.a.w(null);
        sh shVar = this.a.f;
        if (i2 <= 0) {
            return;
        }
        shVar.a.add(shVar.c(4, i, i2, obj));
        shVar.d |= 4;
        if (shVar.a.size() == 1) {
            l();
        }
    }

    @Override // defpackage.js
    public final void f(int i, int i2) {
        this.a.w(null);
        sh shVar = this.a.f;
        if (i2 <= 0) {
            return;
        }
        shVar.a.add(shVar.c(1, i, i2, null));
        shVar.d |= 1;
        if (shVar.a.size() == 1) {
            l();
        }
    }

    @Override // defpackage.js
    public final void g(int i, int i2) {
        this.a.w(null);
        sh shVar = this.a.f;
        if (i2 <= 0) {
            return;
        }
        shVar.a.add(shVar.c(2, i, i2, null));
        shVar.d |= 2;
        if (shVar.a.size() == 1) {
            l();
        }
    }

    @Override // defpackage.js
    public final void h(int i, int i2) {
        this.a.w(null);
        sh shVar = this.a.f;
        if (i == i2) {
            return;
        }
        shVar.a.add(shVar.c(8, i, i2, null));
        shVar.d |= 8;
        if (shVar.a.size() == 1) {
            l();
        }
    }

    final void l() {
        int i = RecyclerView.V;
        RecyclerView recyclerView = this.a;
        if (!recyclerView.s || !recyclerView.r) {
            recyclerView.w = true;
            recyclerView.requestLayout();
        } else {
            jw.H(recyclerView, recyclerView.j);
        }
    }
}
