package defpackage;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class bsg extends ll {
    public Drawable a;
    public int b;
    public boolean c = true;
    final /* synthetic */ bsk d;

    public bsg(bsk bskVar) {
        this.d = bskVar;
    }

    private final boolean h(View view, RecyclerView recyclerView) {
        wv k = recyclerView.k(view);
        if (!(k instanceof bsx) || !((bsx) k).w) {
            return false;
        }
        boolean z = this.c;
        int indexOfChild = recyclerView.indexOfChild(view);
        if (indexOfChild >= recyclerView.getChildCount() - 1) {
            return z;
        }
        wv k2 = recyclerView.k(recyclerView.getChildAt(indexOfChild + 1));
        return (k2 instanceof bsx) && ((bsx) k2).v;
    }

    @Override // defpackage.ll
    public final void d(Rect rect, View view, RecyclerView recyclerView, ws wsVar) {
        if (h(view, recyclerView)) {
            rect.bottom = this.b;
        }
    }

    @Override // defpackage.ll
    public final void f(Canvas canvas, RecyclerView recyclerView) {
        if (this.a == null) {
            return;
        }
        int childCount = recyclerView.getChildCount();
        int width = recyclerView.getWidth();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            if (h(childAt, recyclerView)) {
                int y = ((int) childAt.getY()) + childAt.getHeight();
                this.a.setBounds(0, y, width, this.b + y);
                this.a.draw(canvas);
            }
        }
    }
}
