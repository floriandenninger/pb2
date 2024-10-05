package defpackage;

import android.support.v7.widget.RecyclerView;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class bsf implements Runnable {
    final /* synthetic */ bsk a;

    public bsf(bsk bskVar) {
        this.a = bskVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        RecyclerView recyclerView = this.a.b;
        recyclerView.focusableViewAvailable(recyclerView);
    }
}
