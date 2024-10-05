package defpackage;

import android.content.Context;
import android.os.Build;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahhk extends afko {
    public boolean i;
    private final ahhc j;
    private final View k;

    public ahhk(Context context, final ahhc ahhcVar, boolean z, boolean z2) {
        super(context);
        ahgs ahgqVar;
        int i;
        this.j = ahhcVar;
        ahhj ahhjVar = new ahhj(this);
        if ("com.google.android.apps.youtube.mango".equals(ahhcVar.a.getPackageName())) {
            ahgqVar = new ahgq(context);
        } else if (z2) {
            ahgqVar = new ahgl(context);
        } else {
            ahgqVar = new ahgr(context);
        }
        ahhcVar.j = ahgqVar;
        ahhcVar.j.j(false);
        ahhcVar.j.h(ahhcVar.q);
        ahhcVar.h.b(z);
        int i2 = 8;
        if (z && ahhcVar.h.c() == 1) {
            i2 = 10;
            i = 2;
        } else {
            i = 8;
        }
        ahhcVar.j.l(i2, i2, i2, i);
        ahhcVar.j.f(ahhcVar.h);
        ahfz ahfzVar = ahhcVar.k;
        if (ahfzVar != null) {
            ahfzVar.onRendererShutdown();
        }
        ahhcVar.k = (ahfz) ahhcVar.d.get();
        ahfz ahfzVar2 = ahhcVar.k;
        azrw azrwVar = new azrw() { // from class: ahgu
            @Override // defpackage.azrw
            public final Object get() {
                return ahhc.this.j.c();
            }
        };
        if (!ahfzVar2.k) {
            ahfzVar2.f = ahhcVar;
            ahfzVar2.e = ahhcVar;
            ahfzVar2.d = azrwVar;
        }
        ahhcVar.s = ahhjVar;
        ahhcVar.j.i(ahhcVar.k);
        if (ahhcVar.u) {
            ahhcVar.p();
        }
        ViewGroup a = ahhcVar.j.a();
        this.k = a;
        addView(a);
        setSystemUiVisibility(4096);
    }

    @Override // defpackage.afko, defpackage.afky
    public final Surface A() {
        return this.a;
    }

    @Override // defpackage.afko, defpackage.afkr, defpackage.afky
    public final SurfaceHolder B() {
        return null;
    }

    @Override // defpackage.afky
    public final aflb C() {
        return aflb.GL_GVR;
    }

    @Override // defpackage.afkl
    public final void D() {
        ahhc ahhcVar = this.j;
        ahgs ahgsVar = ahhcVar.j;
        if (ahgsVar != null) {
            ahgsVar.j(false);
        }
        ahki ahkiVar = ahhcVar.o;
        ahkm ahkmVar = ahhcVar.m;
        if (ahkmVar != null) {
            ahkmVar.b.b();
            ahhcVar.m = null;
            ahhcVar.o = null;
            ahhcVar.p = null;
        }
        ahix ahixVar = ahhcVar.i;
        if (ahixVar != null) {
            ahixVar.a();
            ahhcVar.i = null;
        }
        ahfz ahfzVar = ahhcVar.k;
        if (ahfzVar != null) {
            ahfzVar.a();
        }
        ahgs ahgsVar2 = ahhcVar.j;
        if (ahgsVar2 != null) {
            ahgsVar2.d();
            ahhcVar.j.k();
            ahhcVar.j = null;
        }
        ahhcVar.k = null;
        if (ahhcVar.v) {
            ahhcVar.b.p(false);
        }
        if (ahkiVar != null) {
            Iterator it = ahhcVar.f.iterator();
            while (it.hasNext()) {
                ((ahhb) it.next()).qG();
            }
        }
    }

    @Override // defpackage.afko
    public final void F(int i) {
        ahhc ahhcVar = this.j;
        ahkm ahkmVar = ahhcVar.m;
        if (ahkmVar != null) {
            ahkmVar.m(i);
        }
        ahhcVar.C = i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.afkr
    public final void H() {
        ahkm ahkmVar;
        if (this.b == null && this.c == null && (ahkmVar = this.j.m) != null) {
            ahkmVar.b.i = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.afkr
    public final void I() {
        ahkm ahkmVar = this.j.m;
        if (ahkmVar != null) {
            ahkmVar.b.i = true;
        }
    }

    @Override // defpackage.afkr
    protected final boolean K() {
        return this.i;
    }

    @Override // defpackage.afkr
    protected final boolean L() {
        return this.j.s();
    }

    @Override // defpackage.afko, defpackage.afky
    public final void o() {
    }

    @Override // defpackage.afkr, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        J(i, i2, i3, i4);
        if (this.j.s()) {
            G(this.k, i3 - i, i4 - i2);
        } else {
            this.k.layout(0, 0, i3 - i, i4 - i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.afkr, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        measureChild(this.k, View.MeasureSpec.makeMeasureSpec(this.e, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f, 1073741824));
    }

    @Override // defpackage.afkr, defpackage.afky
    public final void r(boolean z, byte[] bArr, long j, long j2) {
        ahja ahjaVar = this.j.n;
        if (ahjaVar != null) {
            ahjaVar.p.a(z, bArr, j, j2);
        }
    }

    @Override // defpackage.afkr, defpackage.afky
    public final void u(afld afldVar) {
        ahhc ahhcVar = this.j;
        ahja ahjaVar = ahhcVar.n;
        if (ahjaVar != null) {
            ahjaVar.j(afldVar);
        }
        ahhcVar.r = afldVar;
    }

    @Override // defpackage.afkr, defpackage.afkl
    public final void v(int i, int i2) {
        float f = i / i2;
        if (this.j.y == aapb.RECTANGULAR_3D && ahkt.j(f, 3.5555556f, 0.01f)) {
            double d = i;
            Double.isNaN(d);
            i2 = (int) Math.floor((d * 9.0d) / 16.0d);
        } else if (this.j.y == aapb.RECTANGULAR_3D && ahkt.j(f, 0.8888889f, 0.01f)) {
            double d2 = i2;
            Double.isNaN(d2);
            i = (int) Math.floor((d2 * 16.0d) / 9.0d);
        }
        super.v(i, i2);
        final ahhc ahhcVar = this.j;
        ahhcVar.w = i;
        ahhcVar.x = i2;
        final float f2 = i / i2;
        ahhcVar.n(new Runnable() { // from class: ahgy
            @Override // java.lang.Runnable
            public final void run() {
                ahhc ahhcVar2 = ahhc.this;
                float f3 = f2;
                ahkm ahkmVar = ahhcVar2.m;
                if (ahkmVar != null) {
                    try {
                        ahkmVar.c(f3);
                    } catch (ahkr e) {
                        ahhcVar2.i(e);
                    }
                }
            }
        });
        ahhcVar.r(ahhcVar.a());
    }

    @Override // defpackage.afkr, defpackage.afky
    public final void y(boolean z, float f, float f2, int i) {
        super.y(z, f, f2, i);
        if (Build.VERSION.SDK_INT >= 26) {
            ahhc ahhcVar = this.j;
            ahhh ahhhVar = ahhcVar.h;
            boolean z2 = ahhhVar.b;
            ahhhVar.b(z);
            ahhcVar.B = i;
            ahja ahjaVar = ahhcVar.n;
            if (ahjaVar != null) {
                ahjaVar.m(ahhcVar.h.c(), ahhcVar.h.d(), ahhcVar.h.a, i);
            }
            if (z2 != z) {
                ahhcVar.k();
                ahhcVar.l();
            }
        }
    }
}
