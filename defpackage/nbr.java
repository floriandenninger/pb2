package defpackage;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import android.widget.TextView;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class nbr extends Animation {
    final /* synthetic */ TextView a;
    final /* synthetic */ int b;
    final /* synthetic */ int c;
    final /* synthetic */ int d;

    public nbr(TextView textView, int i, int i2, int i3) {
        this.a = textView;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    @Override // android.view.animation.Animation
    protected final void applyTransformation(float f, Transformation transformation) {
        this.a.getLayoutParams().height = ((int) (this.b * f)) + this.c;
        if (f >= 1.0f) {
            this.a.getLayoutParams().height = -2;
            if (this.d == 0) {
                this.a.setVisibility(8);
            }
        }
        this.a.requestLayout();
    }

    @Override // android.view.animation.Animation
    public final boolean willChangeBounds() {
        return true;
    }
}
