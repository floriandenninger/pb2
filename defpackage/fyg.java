package defpackage;

import android.support.v7.widget.RecyclerView;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fyg extends lo {
    private final RecyclerView[] a;
    private boolean b;

    public fyg(RecyclerView[] recyclerViewArr) {
        this.a = recyclerViewArr;
    }

    @Override // defpackage.lo
    public final void c(RecyclerView recyclerView, int i, int i2) {
        if (this.b) {
            return;
        }
        this.b = true;
        RecyclerView[] recyclerViewArr = this.a;
        for (int i3 = 0; i3 < 2; i3++) {
            RecyclerView recyclerView2 = recyclerViewArr[i3];
            if (recyclerView2 != recyclerView) {
                recyclerView2.scrollBy(i, i2);
            }
        }
        this.b = false;
    }
}
