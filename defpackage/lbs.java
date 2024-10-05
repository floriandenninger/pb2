package defpackage;

import android.widget.AbsListView;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class lbs implements AbsListView.OnScrollListener {
    final /* synthetic */ lbz a;

    public lbs(lbz lbzVar) {
        this.a = lbzVar;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        lbz lbzVar = this.a;
        lbzVar.aG = Math.max(lbzVar.aG, lbzVar.aE.getLastVisiblePosition());
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i) {
        if (i == 1) {
            whu.C(this.a.aD);
        }
    }
}
