package defpackage;

import android.graphics.Rect;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes.dex */
final class acjp extends ll {
    final /* synthetic */ acjr a;

    public acjp(acjr acjrVar) {
        this.a = acjrVar;
    }

    @Override // defpackage.ll
    public final void d(Rect rect, View view, RecyclerView recyclerView, ws wsVar) {
        int i = ((GridLayoutManager) recyclerView.n).b;
        int c = recyclerView.c(view) % i;
        int dimensionPixelSize = this.a.qX().getDimensionPixelSize(R.dimen.lc_scheduled_event_padding);
        int i2 = dimensionPixelSize / 2;
        rect.left = i2;
        rect.right = i2;
        rect.bottom = dimensionPixelSize;
        if (c == 0) {
            rect.left = dimensionPixelSize;
            c = 0;
        }
        if (c == i - 1) {
            rect.right = dimensionPixelSize;
        }
    }
}
