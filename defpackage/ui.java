package defpackage;

import android.support.v7.widget.RecyclerView;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ui extends lo {
    final /* synthetic */ ul a;

    public ui(ul ulVar) {
        this.a = ulVar;
    }

    @Override // defpackage.lo
    public final void c(RecyclerView recyclerView, int i, int i2) {
        ul ulVar = this.a;
        int computeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
        int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
        int computeVerticalScrollRange = ulVar.l.computeVerticalScrollRange();
        int i3 = ulVar.k;
        ulVar.m = computeVerticalScrollRange - i3 > 0 && i3 >= ulVar.a;
        int computeHorizontalScrollRange = ulVar.l.computeHorizontalScrollRange();
        int i4 = ulVar.j;
        boolean z = computeHorizontalScrollRange - i4 > 0 && i4 >= ulVar.a;
        ulVar.n = z;
        if (ulVar.m) {
            float f = i3;
            ulVar.e = (int) ((f * (computeVerticalScrollOffset + (f / 2.0f))) / computeVerticalScrollRange);
            ulVar.d = Math.min(i3, (i3 * i3) / computeVerticalScrollRange);
        } else if (!z) {
            if (ulVar.o != 0) {
                ulVar.j(0);
                return;
            }
            return;
        }
        if (ulVar.n) {
            float f2 = i4;
            ulVar.h = (int) ((f2 * (computeHorizontalScrollOffset + (f2 / 2.0f))) / computeHorizontalScrollRange);
            ulVar.g = Math.min(i4, (i4 * i4) / computeHorizontalScrollRange);
        }
        int i5 = ulVar.o;
        if (i5 == 0 || i5 == 1) {
            ulVar.j(1);
        }
    }
}
