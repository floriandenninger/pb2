package defpackage;

import android.animation.ValueAnimator;
import android.graphics.ColorFilter;
import android.widget.ImageView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes.dex */
final class abok implements ValueAnimator.AnimatorUpdateListener {
    long a = 0;
    final /* synthetic */ ImageView b;
    final /* synthetic */ abol c;

    public abok(abol abolVar, ImageView imageView) {
        this.c = abolVar;
        this.b = imageView;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        if (valueAnimator.getCurrentPlayTime() - this.a < 500) {
            return;
        }
        this.a = valueAnimator.getCurrentPlayTime();
        if (this.b.getColorFilter() == null) {
            this.b.setColorFilter(wbs.Q(this.c.a, R.attr.ytThemedBlue));
        } else {
            this.b.setColorFilter((ColorFilter) null);
        }
    }
}
