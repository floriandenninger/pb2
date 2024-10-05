package defpackage;

import android.support.v7.widget.StaggeredGridLayoutManager;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xx implements Runnable {
    final /* synthetic */ StaggeredGridLayoutManager a;

    public xx(StaggeredGridLayoutManager staggeredGridLayoutManager) {
        this.a = staggeredGridLayoutManager;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.I();
    }
}
