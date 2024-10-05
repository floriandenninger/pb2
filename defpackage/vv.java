package defpackage;

import android.support.v7.widget.RecyclerView;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vv implements Runnable {
    final /* synthetic */ RecyclerView a;
    private final /* synthetic */ int b;

    public vv(RecyclerView recyclerView, int i) {
        this.b = i;
        this.a = recyclerView;
    }

    public /* synthetic */ vv(RecyclerView recyclerView, int i, byte[] bArr) {
        this.b = i;
        this.a = recyclerView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        if (i == 0) {
            vz vzVar = this.a.E;
            if (vzVar != null) {
                vzVar.d();
            }
            this.a.P = false;
            return;
        }
        if (i == 1) {
            RecyclerView recyclerView = this.a;
            if (!recyclerView.t || recyclerView.isLayoutRequested()) {
                return;
            }
            RecyclerView recyclerView2 = this.a;
            if (!recyclerView2.r) {
                recyclerView2.requestLayout();
                return;
            } else if (recyclerView2.v) {
                recyclerView2.u = true;
                return;
            } else {
                recyclerView2.A();
                return;
            }
        }
        this.a.requestLayout();
    }
}
