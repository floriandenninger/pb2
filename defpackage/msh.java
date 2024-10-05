package defpackage;

import android.animation.Keyframe;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.view.animation.LinearInterpolator;
import com.google.android.libraries.youtube.common.ui.swipelayout.SwipeLayout;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class msh extends ajqi {
    private final axpg b;
    private boolean c = false;
    private ValueAnimator d;
    private long e;
    private long f;
    private long g;

    public msh(axpg axpgVar) {
        this.b = axpgVar;
    }

    @Override // defpackage.ajph
    public final void a() {
        if (this.c) {
            ((ajqb) this.b.get()).a();
            return;
        }
        ValueAnimator valueAnimator = this.d;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        } else {
            c();
        }
    }

    public final void c() {
        this.d = null;
        ajqa ajqaVar = ((ajqi) this).a;
        msi msiVar = (msi) ajqaVar.a;
        msiVar.b.l(0);
        msiVar.a.setAlpha(1.0f);
        ajqaVar.d.run();
    }

    @Override // defpackage.ajqi
    protected final void d() {
        long j;
        ajqa ajqaVar = ((ajqi) this).a;
        msi msiVar = (msi) ajqaVar.a;
        aqkm aqkmVar = msiVar.d;
        if (!msiVar.b.p() || aqkmVar == null || aqkmVar.b != 1) {
            this.c = true;
            ajqb ajqbVar = (ajqb) this.b.get();
            ajpz a = ajqa.a();
            a.e(ajqaVar.a);
            a.b(ajqaVar.b);
            a.d(ajqaVar.c);
            a.c(ajqaVar.d);
            ajqbVar.e(a.a());
            return;
        }
        if (msiVar.b.e == 0) {
            long j2 = ajqaVar.b;
            j = j2 + j2;
        } else {
            j = 0;
        }
        this.e = j;
        long j3 = ajqaVar.b;
        long j4 = ((float) j3) * 2.5f;
        this.f = j4;
        long j5 = j4 - j3;
        this.g = j5;
        g(j + j5);
    }

    @Override // defpackage.ajph
    public final void b() {
        if (this.c) {
            ((ajqb) this.b.get()).b();
            return;
        }
        ajqa ajqaVar = ((ajqi) this).a;
        final msi msiVar = (msi) ajqaVar.a;
        final SwipeLayout swipeLayout = msiVar.b;
        float alpha = msiVar.a.getAlpha();
        ValueAnimator ofPropertyValuesHolder = ValueAnimator.ofPropertyValuesHolder(PropertyValuesHolder.ofKeyframe("alpha", Keyframe.ofFloat(0.0f, alpha), Keyframe.ofFloat(((float) this.g) / ((float) this.f), alpha), Keyframe.ofFloat(1.0f, 0.0f)), PropertyValuesHolder.ofInt("displacement", swipeLayout.e, -swipeLayout.getWidth()));
        this.d = ofPropertyValuesHolder;
        ofPropertyValuesHolder.setStartDelay(this.e);
        this.d.setDuration(this.f);
        this.d.setInterpolator(new LinearInterpolator());
        this.d.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: msf
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                msi msiVar2 = msi.this;
                SwipeLayout swipeLayout2 = swipeLayout;
                msiVar2.a.setAlpha(((Float) valueAnimator.getAnimatedValue("alpha")).floatValue());
                swipeLayout2.l(((Integer) valueAnimator.getAnimatedValue("displacement")).intValue());
            }
        });
        this.d.addListener(new msg(this, ajqaVar));
        this.d.start();
    }
}
