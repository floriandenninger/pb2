package defpackage;

import android.support.v7.widget.RecyclerView;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ofp extends lo {
    final /* synthetic */ ofq a;

    public ofp(ofq ofqVar) {
        this.a = ofqVar;
    }

    @Override // defpackage.lo
    public final void b(RecyclerView recyclerView, int i) {
        ofq ofqVar = this.a;
        Runnable runnable = ofqVar.b;
        if (runnable != null) {
            if (i == 1) {
                ofqVar.b = null;
            } else if (i == 0) {
                recyclerView.post(runnable);
                this.a.b = null;
            }
        }
    }

    @Override // defpackage.lo
    public final void c(RecyclerView recyclerView, int i, int i2) {
    }
}
