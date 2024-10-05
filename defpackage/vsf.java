package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.util.Property;
import android.view.View;
import android.view.ViewOverlay;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vsf {
    public final View a;
    public final ViewOverlay b;
    public vsd c;
    public float d = 1.0f;
    public int e;
    public int f;
    public float g;
    public float h;
    private final int i;
    private final Context j;
    private final int k;

    public vsf(Context context, View view) {
        this.j = context;
        this.a = view;
        Resources resources = context.getResources();
        this.i = resources.getInteger(R.integer.callout_animation_duration_ms);
        this.b = view.getOverlay();
        this.e = resources.getColor(R.color.callout_drawable_background_color);
        this.k = resources.getColor(R.color.callout_drawable_text_color);
        this.h = resources.getDimension(R.dimen.callout_drawable_padding);
    }

    public final void a() {
        vsd vsdVar;
        if (this.b == null || (vsdVar = this.c) == null) {
            return;
        }
        ObjectAnimator ofInt = ObjectAnimator.ofInt(vsdVar, "alpha", 0);
        ofInt.setDuration(this.i);
        ofInt.addListener(new vse(this, vsdVar));
        ofInt.start();
        this.c = null;
    }

    public final void b() {
        if (this.b == null) {
            return;
        }
        a();
        vsd vsdVar = new vsd(this.j, this.d, this.h, this.e, this.k);
        this.c = vsdVar;
        vsdVar.c.setShadowLayer(this.g, 0.0f, 0.0f, this.f);
        this.b.add(this.c);
        ObjectAnimator ofInt = ObjectAnimator.ofInt(this.c, (Property<vsd, Integer>) vsd.a, 0, this.c.a());
        ObjectAnimator ofInt2 = ObjectAnimator.ofInt(this.c, (Property<vsd, Integer>) vsd.b, 0, this.c.b());
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ofInt, ofInt2);
        animatorSet.setDuration(this.i);
        animatorSet.start();
    }

    public final int[] c(int i, int i2, View view) {
        while (view != this.a) {
            i = (int) (i + view.getX());
            i2 = (int) (i2 + view.getY());
            Object parent = view.getParent();
            amkq.N(parent instanceof View);
            view = (View) parent;
        }
        return new int[]{i, i2};
    }
}
