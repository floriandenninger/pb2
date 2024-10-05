package defpackage;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.Property;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aljn extends alje {
    public static final int[] a = {533, 567, 850, 750};
    public static final int[] b = {1267, 1000, 333, 0};
    private static final Property i = new aljm(Float.class);
    public final Interpolator[] c;
    public final alip d;
    public int e;
    public boolean f;
    public float g;
    bxe h;
    private ObjectAnimator m;
    private ObjectAnimator n;

    public aljn(Context context, aljo aljoVar) {
        super(2);
        this.e = 0;
        this.h = null;
        this.d = aljoVar;
        this.c = new Interpolator[]{AnimationUtils.loadInterpolator(context, R.animator.linear_indeterminate_line1_head_interpolator), AnimationUtils.loadInterpolator(context, R.animator.linear_indeterminate_line1_tail_interpolator), AnimationUtils.loadInterpolator(context, R.animator.linear_indeterminate_line2_head_interpolator), AnimationUtils.loadInterpolator(context, R.animator.linear_indeterminate_line2_tail_interpolator)};
    }

    @Override // defpackage.alje
    public final void a() {
        ObjectAnimator objectAnimator = this.m;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // defpackage.alje
    public final void b(bxe bxeVar) {
        this.h = bxeVar;
    }

    @Override // defpackage.alje
    public final void c() {
        if (this.n.isRunning()) {
            return;
        }
        a();
        if (this.j.isVisible()) {
            this.n.setFloatValues(this.g, 1.0f);
            this.n.setDuration((1.0f - this.g) * 1800.0f);
            this.n.start();
        }
    }

    @Override // defpackage.alje
    public final void d() {
        if (this.m == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, (Property<aljn, Float>) i, 0.0f, 1.0f);
            this.m = ofFloat;
            ofFloat.setDuration(1800L);
            this.m.setInterpolator(null);
            this.m.setRepeatCount(-1);
            this.m.addListener(new aljk(this));
        }
        if (this.n == null) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, (Property<aljn, Float>) i, 1.0f);
            this.n = ofFloat2;
            ofFloat2.setDuration(1800L);
            this.n.setInterpolator(null);
            this.n.addListener(new aljl(this));
        }
        this.e = 0;
        int q = akwg.q(this.d.c[0], this.j.i);
        int[] iArr = this.l;
        iArr[0] = q;
        iArr[1] = q;
        this.m.start();
    }

    @Override // defpackage.alje
    public final void e() {
        this.h = null;
    }
}
