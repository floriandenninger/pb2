package defpackage;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mco {
    public final ValueAnimator a;
    private final View b;
    private final int c;

    public mco(final int i, final int i2, final View view, mcn mcnVar, int i3, int i4, boolean z) {
        view.getClass();
        mcnVar.getClass();
        this.c = i;
        if (view.getLayoutParams() == null) {
            afsi.b(2, 25, "FeedFilterBar HeightAnimator instantiated with null target view.");
            throw new IllegalArgumentException("Target view layout params are null.");
        }
        if (!z || view.getVisibility() == 0) {
            if (view.getLayoutParams().height != i) {
                int i5 = view.getLayoutParams().height;
                StringBuilder sb = new StringBuilder(76);
                sb.append("Target view height does not match expected height (");
                sb.append(i5);
                sb.append("!=");
                sb.append(i);
                sb.append(")");
                String sb2 = sb.toString();
                String valueOf = String.valueOf(sb2);
                afsi.b(1, 25, valueOf.length() != 0 ? "FeedFilterBar HeightAnimator ".concat(valueOf) : new String("FeedFilterBar HeightAnimator "));
                throw new IllegalArgumentException(sb2);
            }
            this.b = view;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.a = ofFloat;
            ofFloat.setStartDelay(i3);
            ofFloat.setDuration(i4);
            ofFloat.setInterpolator(jg.o(0.5f, 0.0f, 0.0f, 1.0f));
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: mcl
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    int i6 = i;
                    int i7 = i2;
                    View view2 = view;
                    if (view2.getLayoutParams() == null) {
                        return;
                    }
                    float animatedFraction = valueAnimator.getAnimatedFraction();
                    yny.z(view2, yny.n(i7 >= i6 ? i6 + ((int) ((i7 - i6) * animatedFraction)) : i6 - ((int) ((i6 - i7) * animatedFraction))), ViewGroup.LayoutParams.class);
                }
            });
            ofFloat.addListener(new mcm(mcnVar));
            return;
        }
        afsi.b(2, 25, "FeedFilterBar HeightAnimator instantiated with non-visible target view.");
        throw new IllegalArgumentException("Target view not visible.");
    }

    public final void a() {
        this.a.cancel();
        yny.z(this.b, yny.n(this.c), ViewGroup.LayoutParams.class);
    }

    public final void b() {
        this.a.start();
    }
}
