package defpackage;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class gmy extends ll {
    final /* synthetic */ View a;
    final /* synthetic */ int b;
    final /* synthetic */ gna c;

    public gmy(gna gnaVar, View view, int i) {
        this.c = gnaVar;
        this.a = view;
        this.b = i;
    }

    @Override // defpackage.ll
    public final void d(Rect rect, View view, final RecyclerView recyclerView, ws wsVar) {
        super.d(rect, view, recyclerView, wsVar);
        View view2 = this.a;
        if (view != view2) {
            return;
        }
        rect.bottom = (int) ((-this.b) * (1.0f - gna.e(view2, this.c.g)));
        gna gnaVar = this.c;
        if (gnaVar.o != null || gnaVar.m <= this.a.getY()) {
            return;
        }
        gna gnaVar2 = this.c;
        final int i = this.b;
        final View view3 = this.a;
        gnaVar2.o = new Runnable() { // from class: gmx
            @Override // java.lang.Runnable
            public final void run() {
                gmy gmyVar = gmy.this;
                int i2 = i;
                View view4 = view3;
                RecyclerView recyclerView2 = recyclerView;
                gna gnaVar3 = gmyVar.c;
                if (gnaVar3.o != null) {
                    gnaVar3.o = null;
                    int e = (int) (i2 * gna.e(view4, gnaVar3.g));
                    recyclerView2.scrollBy(0, e - gmyVar.c.n);
                    gmyVar.c.n = e;
                }
            }
        };
        recyclerView.post(this.c.o);
    }
}
