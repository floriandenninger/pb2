package defpackage;

import android.content.Context;
import android.opengl.Matrix;
import android.os.Handler;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahmt extends ahiy implements ahkk, ahkl, ahig {
    public final Handler i;
    public final ViewGroup j;
    public ahms k;
    public boolean o;
    private final float p;
    private final ahkm q;
    private final ahki r;
    private int s;

    public ahmt(final ViewGroup viewGroup, final Context context, Handler handler, ahkv ahkvVar, float f, float f2, ahkm ahkmVar, ahki ahkiVar) {
        super(f * context.getResources().getDisplayMetrics().scaledDensity, f2 * context.getResources().getDisplayMetrics().scaledDensity, ahku.a(1.0f, 1.0f, ahiy.m), ahkvVar, ahkmVar.a.c());
        this.i = handler;
        this.j = viewGroup;
        this.q = ahkmVar;
        this.r = ahkiVar;
        rJ(f, f2, 1.0f);
        float f3 = context.getResources().getDisplayMetrics().scaledDensity;
        this.p = f3;
        final int s = s(f * f3);
        final int s2 = s(f3 * f2);
        handler.post(new Runnable() { // from class: ahmk
            @Override // java.lang.Runnable
            public final void run() {
                ahmt ahmtVar = ahmt.this;
                Context context2 = context;
                ViewGroup viewGroup2 = viewGroup;
                int i = s;
                int i2 = s2;
                ahmtVar.k = new ahms(context2, ahmtVar);
                viewGroup2.addView(ahmtVar.k, i, i2);
            }
        });
        this.s = ahkmVar.k;
        B();
        ahkmVar.a(this);
        ahkmVar.b(this);
        y();
    }

    private final void B() {
        ((ahfr) this).a.e(this.s != 3);
        if (this.s == 3) {
            D(true);
        } else {
            C(true);
        }
    }

    private final void C(boolean z) {
        if (z) {
            ahkm ahkmVar = this.q;
            E(ahkmVar.h, ahkmVar.i);
            ((ahfr) this).a.j(0.0f);
        }
    }

    private final void D(boolean z) {
        float a = ahkt.a(-100.0f);
        if (z) {
            E(56.0f, 31.5f);
            l(0.0f, a, 0.0f);
        } else {
            l(0.0f, -a, 0.0f);
        }
    }

    private final void E(float f, float f2) {
        rJ(f, f2, 1.0f);
        float f3 = this.p;
        w(f * f3, f3 * f2);
        this.i.post(new ahmr(this, new FrameLayout.LayoutParams(s(f * this.p), s(f2 * this.p))));
    }

    public final void A() {
        boolean z = true;
        if (this.r.g && this.o) {
            z = false;
        }
        this.l = z;
    }

    @Override // defpackage.ahkl
    public final void b(float f, float f2) {
        if (this.s != 3) {
            E(f, f2);
        }
    }

    @Override // defpackage.ahig
    public final boolean f(ahjq ahjqVar) {
        return false;
    }

    @Override // defpackage.ahig
    public final boolean g(ahjq ahjqVar) {
        return false;
    }

    @Override // defpackage.ahig
    public final boolean h(ahjq ahjqVar) {
        return true;
    }

    @Override // defpackage.ahiy, defpackage.ahfr, defpackage.ahim
    public final void i() {
        super.i();
        this.i.post(new ahmm(this, 2));
        this.q.g(this);
        this.q.h(this);
    }

    @Override // defpackage.ahfr, defpackage.ahim
    public final void p(ahjq ahjqVar) {
    }

    @Override // defpackage.ahiy, defpackage.ahfr, defpackage.ahim
    public final void q(ahjq ahjqVar) {
        super.q(ahjqVar);
        if (this.s == 3) {
            float[] fArr = ahjqVar.a;
            float length = Matrix.length(fArr[0], fArr[1], fArr[2]);
            float f = fArr[10];
            float degrees = (float) Math.toDegrees(Math.atan2(r0 / length, f / Matrix.length(fArr[8], fArr[9], f)));
            if (true == Float.isNaN(degrees)) {
                degrees = 0.0f;
            }
            ((ahfr) this).a.j(degrees);
        }
    }

    public final void y() {
        this.i.post(new ahmm(this, 0));
        this.o = false;
        A();
    }

    @Override // defpackage.ahkk
    public final void z(int i) {
        int i2 = this.s;
        if (i2 != i) {
            if (i2 == 3) {
                D(false);
            } else {
                C(false);
            }
            this.s = i;
            B();
        }
    }
}
