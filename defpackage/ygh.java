package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ygh implements ViewTreeObserver.OnGlobalLayoutListener {
    final /* synthetic */ ygi a;

    public ygh(ygi ygiVar) {
        this.a = ygiVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        if (this.a.a.getParent() == null) {
            return;
        }
        this.a.a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        View view = this.a.a;
        view.measure(View.MeasureSpec.makeMeasureSpec(((View) view.getParent()).getMeasuredWidth(), 1073741824), 0);
        if (this.a.b.getMeasuredWidth() > this.a.a.getMeasuredWidth() / 2) {
            this.a.g(1);
        } else {
            this.a.g(0);
        }
        this.a.a.requestLayout();
    }
}
