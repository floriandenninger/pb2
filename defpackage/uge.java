package defpackage;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class uge extends ll {
    private final Drawable a;
    private final Rect b = new Rect();
    private final int c;
    private final View d;

    public uge(View view, int i) {
        this.d = view;
        this.a = tyo.S(view.getContext(), R.drawable.og_list_divider, sgf.e(view.getContext(), R.attr.colorHairline));
        this.c = i;
    }

    @Override // defpackage.ll
    public final void e(Canvas canvas, RecyclerView recyclerView) {
        if (recyclerView.getChildCount() == 0) {
            return;
        }
        View childAt = recyclerView.getChildAt(0);
        RecyclerView.L(childAt, this.b);
        int round = this.b.top + Math.round(childAt.getTranslationY());
        int intrinsicHeight = this.a.getIntrinsicHeight() + round;
        if (jw.e(this.d) == 1) {
            this.a.setBounds(0, round, recyclerView.getWidth() - this.c, intrinsicHeight);
        } else {
            this.a.setBounds(this.c, round, recyclerView.getWidth(), intrinsicHeight);
        }
        this.a.draw(canvas);
    }
}
