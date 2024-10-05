package defpackage;

import android.animation.ObjectAnimator;
import android.util.Property;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aljj extends alje {
    public static final /* synthetic */ int f = 0;
    private static final Property g = new alji(Float.class);
    public final anq a;
    public final alip b;
    public int c;
    public boolean d;
    public float e;
    private ObjectAnimator h;

    public aljj(aljo aljoVar) {
        super(3);
        this.c = 1;
        this.b = aljoVar;
        this.a = new anq();
    }

    @Override // defpackage.alje
    public final void a() {
        ObjectAnimator objectAnimator = this.h;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // defpackage.alje
    public final void b(bxe bxeVar) {
    }

    @Override // defpackage.alje
    public final void c() {
    }

    @Override // defpackage.alje
    public final void d() {
        if (this.h == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, (Property<aljj, Float>) g, 0.0f, 1.0f);
            this.h = ofFloat;
            ofFloat.setDuration(333L);
            this.h.setInterpolator(null);
            this.h.setRepeatCount(-1);
            this.h.addListener(new aljh(this));
        }
        this.d = true;
        this.c = 1;
        Arrays.fill(this.l, akwg.q(this.b.c[0], this.j.i));
        this.h.start();
    }

    @Override // defpackage.alje
    public final void e() {
    }
}
