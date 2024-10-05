package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ybg {
    public final Rect a = new Rect();
    public final List b = new ArrayList();
    public int c;
    public int d;

    public final int a() {
        return Math.min(this.a.width(), this.c);
    }

    public final boolean b(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i = measuredWidth + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
        int i2 = measuredHeight + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
        int width = this.c - this.a.width();
        if (i <= width) {
            this.a.right += i;
            if (this.a.height() < i2) {
                Rect rect = this.a;
                rect.bottom = rect.top + i2;
            }
            this.b.add(view);
            return true;
        }
        if (!this.b.isEmpty()) {
            return false;
        }
        this.a.right += width;
        Rect rect2 = this.a;
        rect2.bottom = rect2.top + i2;
        this.b.add(view);
        return true;
    }

    public final void c(int i, int i2, int i3, int i4) {
        this.a.set(i3, i2, i3, i2);
        this.b.clear();
        this.c = i4;
        this.d = i;
    }
}
