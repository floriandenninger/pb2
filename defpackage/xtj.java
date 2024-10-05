package defpackage;

import android.support.v7.widget.RecyclerView;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xtj extends lo {
    final /* synthetic */ xtk a;

    public xtj(xtk xtkVar) {
        this.a = xtkVar;
    }

    @Override // defpackage.lo
    public final void c(RecyclerView recyclerView, int i, int i2) {
        ow owVar = this.a.f;
        if (owVar.c()) {
            return;
        }
        owVar.b();
        owVar.k = true;
    }
}
