package defpackage;

import android.view.View;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class mnr implements View.OnAttachStateChangeListener {
    final /* synthetic */ ajok a;
    final /* synthetic */ int b;
    final /* synthetic */ mnt c;

    public mnr(mnt mntVar, ajok ajokVar, int i) {
        this.c = mntVar;
        this.a = ajokVar;
        this.b = i;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.c.d.removeOnAttachStateChangeListener(this);
        this.c.d.measure(View.MeasureSpec.makeMeasureSpec(((View) this.c.d.getParent()).getMeasuredWidth(), 1073741824), 0);
        int measuredWidth = ((int) (this.c.d.getMeasuredWidth() / this.c.f(this.a))) - this.b;
        mnt mntVar = this.c;
        View findViewById = mntVar.d.findViewById(R.id.featured_badge);
        int measuredHeight = findViewById.getVisibility() == 8 ? 0 : findViewById.getMeasuredHeight() + mntVar.a.getResources().getDimensionPixelOffset(R.dimen.promo_panel_text_layout_featured_badge_top_margin);
        int measuredHeight2 = this.c.e.getMeasuredHeight();
        mnt mntVar2 = this.c;
        int i = mntVar2.c;
        whu.I(mntVar2.n, measuredHeight2 + (i + i) <= measuredWidth - measuredHeight);
        this.c.d.requestLayout();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
