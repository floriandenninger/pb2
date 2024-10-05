package defpackage;

import android.support.v7.widget.RecyclerView;

/* compiled from: PG */
/* loaded from: classes.dex */
final class abof extends lo {
    final /* synthetic */ abog a;

    public abof(abog abogVar) {
        this.a = abogVar;
    }

    @Override // defpackage.lo
    public final void b(RecyclerView recyclerView, int i) {
        abog abogVar = this.a;
        if (recyclerView == abogVar.a()) {
            abogVar.i = i;
            if (i == 1) {
                abogVar.h = false;
            } else if (!abogVar.h || abogVar.G()) {
                abogVar.h = false;
            } else {
                abogVar.h();
            }
            abogVar.D(!abogVar.j());
            return;
        }
        if (recyclerView == abogVar.b()) {
            abogVar.F();
            abogVar.k = i;
            if (i == 1) {
                abogVar.j = false;
                return;
            }
            if (abogVar.H()) {
                abogVar.j = false;
            } else if (abogVar.j) {
                abogVar.i();
            } else {
                abogVar.E();
            }
        }
    }

    @Override // defpackage.lo
    public final void c(RecyclerView recyclerView, int i, int i2) {
        abog abogVar = this.a;
        if (recyclerView != abogVar.a() || i2 >= 0) {
            return;
        }
        abogVar.D(!abogVar.j());
    }
}
