package defpackage;

import android.animation.ObjectAnimator;
import android.util.Property;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aliv extends alje {
    public static final int[] a = {0, 1350, 2700, 4050};
    public static final int[] b = {667, 2017, 3367, 4717};
    public static final int[] c = {1000, 2350, 3700, 5050};
    private static final Property m = new alit(Float.class);
    private static final Property n = new aliu(Float.class);
    public final anq d;
    public final alip e;
    public int f;
    public float g;
    public float h;
    bxe i;
    private ObjectAnimator o;
    private ObjectAnimator p;

    public aliv(aliw aliwVar) {
        super(1);
        this.f = 0;
        this.i = null;
        this.e = aliwVar;
        this.d = new anq();
    }

    @Override // defpackage.alje
    public final void a() {
        ObjectAnimator objectAnimator = this.o;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // defpackage.alje
    public final void b(bxe bxeVar) {
        this.i = bxeVar;
    }

    @Override // defpackage.alje
    public final void c() {
        if (this.p.isRunning()) {
            return;
        }
        if (this.j.isVisible()) {
            this.p.start();
        } else {
            a();
        }
    }

    @Override // defpackage.alje
    public final void d() {
        if (this.o == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, (Property<aliv, Float>) m, 0.0f, 1.0f);
            this.o = ofFloat;
            ofFloat.setDuration(5400L);
            this.o.setInterpolator(null);
            this.o.setRepeatCount(-1);
            this.o.addListener(new alir(this));
        }
        if (this.p == null) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, (Property<aliv, Float>) n, 0.0f, 1.0f);
            this.p = ofFloat2;
            ofFloat2.setDuration(333L);
            this.p.setInterpolator(this.d);
            this.p.addListener(new alis(this));
        }
        this.f = 0;
        this.l[0] = akwg.q(this.e.c[0], this.j.i);
        this.h = 0.0f;
        this.o.start();
    }

    @Override // defpackage.alje
    public final void e() {
        this.i = null;
    }
}
