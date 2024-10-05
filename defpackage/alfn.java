package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class alfn extends alfp {
    public final Rect d;
    final Rect e;
    public int f;
    public int g;

    public alfn() {
        this.d = new Rect();
        this.e = new Rect();
        this.f = 0;
    }

    public final int A(View view) {
        if (this.g == 0) {
            return 0;
        }
        float w = w(view);
        int i = this.g;
        return aii.c((int) (w * i), 0, i);
    }

    @Override // defpackage.alfp
    protected final void rX(CoordinatorLayout coordinatorLayout, View view, int i) {
        View y = y(coordinatorLayout.h(view));
        if (y == null) {
            coordinatorLayout.l(view, i);
            this.f = 0;
            return;
        }
        ahh ahhVar = (ahh) view.getLayoutParams();
        Rect rect = this.d;
        rect.set(coordinatorLayout.getPaddingLeft() + ahhVar.leftMargin, y.getBottom() + ahhVar.topMargin, (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - ahhVar.rightMargin, ((coordinatorLayout.getHeight() + y.getBottom()) - coordinatorLayout.getPaddingBottom()) - ahhVar.bottomMargin);
        ko koVar = coordinatorLayout.f;
        if (koVar != null && jw.af(coordinatorLayout) && !jw.af(view)) {
            rect.left += koVar.d();
            rect.right -= koVar.e();
        }
        Rect rect2 = this.e;
        int i2 = ahhVar.c;
        Gravity.apply(i2 == 0 ? 8388659 : i2, view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i);
        int A = A(y);
        view.layout(rect2.left, rect2.top - A, rect2.right, rect2.bottom - A);
        this.f = rect2.top - y.getBottom();
    }

    public boolean v() {
        return false;
    }

    public float w(View view) {
        throw null;
    }

    public int x(View view) {
        throw null;
    }

    public abstract View y(List list);

    public alfn(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = new Rect();
        this.e = new Rect();
        this.f = 0;
    }
}
