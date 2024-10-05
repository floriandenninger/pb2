package defpackage;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class uc extends ll {
    private static final int[] a = {R.attr.listDivider};
    private final Drawable b;
    private final Rect c = new Rect();

    public uc(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(a);
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        this.b = drawable;
        if (drawable == null) {
            Log.w("DividerItem", "@android:attr/listDivider was not set in the theme used for this DividerItemDecoration. Please set that attribute all call setDrawable()");
        }
        obtainStyledAttributes.recycle();
    }

    @Override // defpackage.ll
    public final void d(Rect rect, View view, RecyclerView recyclerView, ws wsVar) {
        Drawable drawable = this.b;
        if (drawable == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(0, 0, 0, drawable.getIntrinsicHeight());
        }
    }

    @Override // defpackage.ll
    public final void e(Canvas canvas, RecyclerView recyclerView) {
        int width;
        int i;
        if (recyclerView.n == null || this.b == null) {
            return;
        }
        canvas.save();
        if (recyclerView.i) {
            i = recyclerView.getPaddingLeft();
            width = recyclerView.getWidth() - recyclerView.getPaddingRight();
            canvas.clipRect(i, recyclerView.getPaddingTop(), width, recyclerView.getHeight() - recyclerView.getPaddingBottom());
        } else {
            width = recyclerView.getWidth();
            i = 0;
        }
        int childCount = recyclerView.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = recyclerView.getChildAt(i2);
            RecyclerView.L(childAt, this.c);
            int round = this.c.bottom + Math.round(childAt.getTranslationY());
            this.b.setBounds(i, round - this.b.getIntrinsicHeight(), width, round);
            this.b.draw(canvas);
        }
        canvas.restore();
    }
}
