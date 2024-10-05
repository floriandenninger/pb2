package defpackage;

import android.widget.AbsListView;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vf implements AbsListView.OnScrollListener {
    final /* synthetic */ vh a;

    public vf(vh vhVar) {
        this.a = vhVar;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i) {
        if (i != 1 || this.a.x() || this.a.p.getContentView() == null) {
            return;
        }
        vh vhVar = this.a;
        vhVar.n.removeCallbacks(vhVar.q);
        this.a.q.run();
    }
}
