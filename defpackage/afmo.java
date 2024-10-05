package defpackage;

import android.content.Context;
import android.view.MotionEvent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afmo extends CoordinatorLayout {
    public afnl i;

    public afmo(Context context) {
        super(context);
    }

    private final boolean p() {
        afnl afnlVar = this.i;
        if (afnlVar == null || afnlVar.d.t == 5) {
            return false;
        }
        afnlVar.b();
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (p()) {
            return true;
        }
        performClick();
        return false;
    }

    @Override // android.view.View
    public final boolean performClick() {
        p();
        return super.performClick();
    }
}
