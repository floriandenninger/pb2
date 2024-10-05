package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.view.animation.Interpolator;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class obj extends obb implements aiva {
    public ValueAnimator a;
    public Interpolator b;
    public int d;
    private final Context e;
    private final aivb f;
    private final nyk g;
    private int m;
    private int n;
    private ayqx o;
    public float c = 1.0f;
    private final Rect h = new Rect();
    private final Rect i = new Rect();
    private final Rect j = new Rect();
    private final Rect k = new Rect();
    private float l = 1.777f;

    public obj(Context context, aivb aivbVar, nyk nykVar) {
        this.e = context;
        this.f = aivbVar;
        this.g = nykVar;
    }

    private final void c() {
        fav.B(this.l, this.i, this.h);
        J();
    }

    public final void a() {
        if (b()) {
            int i = this.m;
            int i2 = this.n;
            int i3 = (int) (i * (true != yjk.Z(this.e) ? 0.65f : 0.7f));
            int i4 = (int) (i3 / 1.777f);
            this.i.set(0, 0, i3, i4);
            this.j.set(i3, 0, i, i2);
            this.k.set(0, i4, i3, i2);
        } else {
            int i5 = this.m;
            int i6 = this.n;
            int i7 = this.d;
            if (i7 <= 0) {
                i7 = (int) (i5 / 1.777f);
            }
            this.i.set(0, 0, i5, i7);
            this.j.set(0, this.i.height(), i5, i6);
        }
        c();
    }

    public final boolean b() {
        return yjk.aa(this.e) && yjk.Y(this.e) && this.d <= 0;
    }

    @Override // defpackage.aiva
    public final void d(int i, int i2) {
        float f = 1.777f;
        if (i2 > 0 && i > 0) {
            f = i / i2;
        }
        this.l = f;
        c();
    }

    @Override // defpackage.obp
    public final float l() {
        return this.c;
    }

    @Override // defpackage.obp
    public final float m() {
        return 0.0f;
    }

    @Override // defpackage.obp
    public final float n() {
        return 0.0f;
    }

    @Override // defpackage.obp
    public final float o() {
        return 1.0f;
    }

    @Override // defpackage.obp
    public final float p() {
        return 1.0f;
    }

    @Override // defpackage.obp
    public final float q() {
        return b() ? 1.0f : 0.0f;
    }

    @Override // defpackage.obp
    public final Rect r() {
        return this.j;
    }

    @Override // defpackage.obp
    public final Rect s() {
        return u;
    }

    @Override // defpackage.obp
    public final Rect t() {
        return this.i;
    }

    @Override // defpackage.obp
    public final Rect u() {
        return this.k;
    }

    @Override // defpackage.obp
    public final Rect v() {
        return this.h;
    }

    @Override // defpackage.obp
    public final void x() {
        this.o = this.g.b.n().X(new ayrs() { // from class: obh
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                final obj objVar = obj.this;
                Integer num = (Integer) obj;
                ValueAnimator valueAnimator = objVar.a;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    objVar.a = null;
                }
                boolean b = objVar.b();
                objVar.d = num.intValue();
                if (b == objVar.b()) {
                    objVar.a();
                    return;
                }
                if (objVar.b == null) {
                    objVar.b = jg.o(0.05f, 0.0f, 0.0f, 1.0f);
                }
                objVar.a = ValueAnimator.ofFloat(0.01f, 1.0f);
                objVar.a.setDuration(500L);
                objVar.a.setInterpolator(objVar.b);
                objVar.a.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: obg
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        obj objVar2 = obj.this;
                        objVar2.c = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                        objVar2.J();
                    }
                });
                objVar.a.addListener(new obi(objVar));
                objVar.a.start();
            }
        });
        this.f.a(this);
        if (this.f.a > 0.0f) {
            this.l = this.f.a;
            c();
        }
    }

    @Override // defpackage.obp
    public final void y() {
        Object obj = this.o;
        if (obj != null) {
            azqb.f((AtomicReference) obj);
            this.o = null;
        }
        this.f.c(this);
    }

    @Override // defpackage.obp
    public final void z(int i, int i2) {
        ValueAnimator valueAnimator = this.a;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.a = null;
        }
        this.m = i;
        this.n = i2;
        a();
    }
}
