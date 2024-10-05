package defpackage;

import android.graphics.Canvas;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abpf extends ll {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static void h(float f, View view) {
        view.getContext();
        view.setAlpha(f);
        view.animate().setStartDelay(6000L).alpha(0.0f).setDuration(4000L).start();
    }

    @Override // defpackage.ll
    public final void f(Canvas canvas, RecyclerView recyclerView) {
        for (int i = 0; i < recyclerView.getChildCount(); i++) {
            View childAt = recyclerView.getChildAt(i);
            int measuredHeight = (int) (recyclerView.getMeasuredHeight() * 0.3f);
            int top = (childAt.getTop() + childAt.getBottom()) / 2;
            h(top < measuredHeight ? ((top * 0.7f) / measuredHeight) + 0.2f : 0.9f, childAt);
        }
    }
}
