package defpackage;

import android.support.v7.widget.RecyclerView;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dsd implements Runnable {
    final /* synthetic */ dsx a;
    private final /* synthetic */ int b;

    public dsd(dsx dsxVar, int i) {
        this.b = i;
        this.a = dsxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        if (i == 0) {
            this.a.e.mw();
            return;
        }
        if (i == 1) {
            diy diyVar = this.a.y;
            if (diyVar != null) {
                diyVar.a(new drt());
                return;
            }
            return;
        }
        RecyclerView recyclerView = this.a.t;
        if (recyclerView == null || !recyclerView.as()) {
            if (this.a.D.d()) {
                this.a.D.b(1);
            }
            this.a.E = 0;
            return;
        }
        RecyclerView recyclerView2 = this.a.t;
        if (!recyclerView2.r || recyclerView2.getVisibility() == 8) {
            this.a.E = 0;
            return;
        }
        dsx dsxVar = this.a;
        int i2 = dsxVar.E;
        if (i2 >= 3) {
            dsxVar.E = 0;
            if (dsxVar.D.d()) {
                this.a.D.b(1);
                return;
            }
            return;
        }
        dsxVar.E = i2 + 1;
        jw.H(dsxVar.t, dsxVar.G);
    }
}
