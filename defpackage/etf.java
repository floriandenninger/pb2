package defpackage;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class etf extends ll {
    private final int a;

    public etf(int i) {
        this.a = i;
    }

    @Override // defpackage.ll
    public final void d(Rect rect, View view, RecyclerView recyclerView, ws wsVar) {
        rect.right = this.a / 2;
        rect.left = this.a / 2;
    }
}
