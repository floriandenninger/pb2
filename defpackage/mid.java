package defpackage;

import android.graphics.Rect;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mid implements View.OnLayoutChangeListener {
    final /* synthetic */ Rect a;

    public mid(Rect rect) {
        this.a = rect;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        View view2 = (View) view.getParent();
        Rect rect = new Rect();
        view.getHitRect(rect);
        rect.left += this.a.left;
        rect.top += this.a.top;
        rect.right -= this.a.right;
        rect.bottom -= this.a.bottom;
        view2.setTouchDelegate(new mie(rect, view));
    }
}
