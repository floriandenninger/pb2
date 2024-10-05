package defpackage;

import android.view.ViewTreeObserver;
import android.widget.FrameLayout;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class mnq implements ViewTreeObserver.OnPreDrawListener {
    final /* synthetic */ float a;
    final /* synthetic */ mnt b;

    public mnq(mnt mntVar, float f) {
        this.b = mntVar;
        this.a = f;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        this.b.d.getViewTreeObserver().removeOnPreDrawListener(this);
        int ceil = (int) Math.ceil(this.b.d.getMeasuredHeight() * this.a);
        yny.A(this.b.p, new mkw(ceil, 3), yny.y(ceil, -1), FrameLayout.LayoutParams.class);
        float measuredWidth = (this.b.d.getMeasuredWidth() - ceil) / 2.0f;
        if (jw.e(this.b.d) == 1) {
            measuredWidth = -measuredWidth;
        }
        this.b.p.setX(measuredWidth);
        return true;
    }
}
