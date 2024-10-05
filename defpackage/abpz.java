package defpackage;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.widget.TextView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abpz {
    public ValueAnimator a;
    public ValueAnimator b;
    private final SparseArray e = new SparseArray();
    public int c = 0;
    public int d = 0;

    public static final void b(Drawable drawable, ColorFilter colorFilter, int i) {
        if (drawable == null) {
            return;
        }
        if (colorFilter == null) {
            drawable.setColorFilter(i, PorterDuff.Mode.SRC_IN);
            return;
        }
        ValueAnimator ofObject = ValueAnimator.ofObject(new ArgbEvaluator(), colorFilter, Integer.valueOf(i));
        ofObject.setDuration(250L);
        ofObject.addUpdateListener(new abpw(drawable));
    }

    public final void a(TextView textView, int i) {
        if (i == textView.getCurrentTextColor()) {
            return;
        }
        int id = textView.getId();
        ValueAnimator valueAnimator = (ValueAnimator) this.e.get(id);
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.e.remove(id);
        }
        ValueAnimator ofObject = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(textView.getCurrentTextColor()), Integer.valueOf(i));
        this.e.put(id, ofObject);
        ofObject.setDuration(250L);
        ofObject.addUpdateListener(new abpv(textView, 0));
        ofObject.start();
    }
}
