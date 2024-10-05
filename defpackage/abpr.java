package defpackage;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abpr extends ll {
    private final int a;

    public abpr(int i) {
        this.a = i;
    }

    @Override // defpackage.ll
    public final void d(Rect rect, View view, RecyclerView recyclerView, ws wsVar) {
        super.d(rect, view, recyclerView, wsVar);
        if (recyclerView.c(view) > 0) {
            return;
        }
        if (jw.e(recyclerView) == 0) {
            rect.left = this.a;
            rect.right = 0;
        } else {
            rect.left = 0;
            rect.right = this.a;
        }
    }
}
