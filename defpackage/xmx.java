package defpackage;

import android.content.res.Resources;
import android.os.Handler;
import android.os.Looper;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xmx implements xhx, xkl, ahhb {
    public xla a;
    private final xlb b;
    private xmu c;
    private boolean d;
    private int e;
    private int f;
    private int g;
    private final Resources h;

    public xmx(Resources resources, acra acraVar, xcl xclVar) {
        this.h = resources;
        xlb xlbVar = new xlb(acraVar, xclVar);
        this.b = xlbVar;
        xlbVar.c(this);
    }

    private final void o() {
        xmu xmuVar = this.c;
        if (xmuVar == null || this.a == null) {
            return;
        }
        xmuVar.b = new xmw(this);
    }

    @Override // defpackage.xkl
    public final void a(boolean z, boolean z2, boolean z3, boolean z4) {
    }

    @Override // defpackage.xkl
    public final void b() {
    }

    @Override // defpackage.xkl
    public final void c(int i) {
    }

    @Override // defpackage.xkl
    public final void d(int i) {
        xmu xmuVar = this.c;
        if (xmuVar != null) {
            xmuVar.d(i);
        }
        this.e = i;
    }

    @Override // defpackage.xkl
    public final void e(xcf xcfVar) {
    }

    @Override // defpackage.xkl
    public final void f(xfn xfnVar) {
    }

    @Override // defpackage.xkl
    public final void g(float f, int i) {
    }

    @Override // defpackage.xkl
    public final void h(aoxw aoxwVar) {
    }

    @Override // defpackage.xkl
    public final void i(auvf auvfVar) {
    }

    @Override // defpackage.xkl
    public final void j(int i, boolean z) {
        this.g = i;
        if (z) {
            n(false);
            return;
        }
        if (i == 0) {
            n(true);
            xmu xmuVar = this.c;
            if (xmuVar != null) {
                xmuVar.d(this.e);
                return;
            }
            return;
        }
        if (i == 1) {
            n(true);
            xmu xmuVar2 = this.c;
            if (xmuVar2 != null) {
                xmuVar2.a();
                return;
            }
            return;
        }
        if (i == 2 || i == 3) {
            xmu xmuVar3 = this.c;
            if (xmuVar3 != null) {
                xmuVar3.e(false);
                xmuVar3.a.d(0);
                xmv xmvVar = xmuVar3.a;
                xmvVar.l = true;
                xmvVar.c(false);
            }
            this.d = false;
            this.e = 0;
            n(false);
        }
    }

    @Override // defpackage.xkl
    public final void k(float f) {
    }

    @Override // defpackage.xkl
    public final void l(xki xkiVar, boolean z, int i) {
    }

    public final void m(xmu xmuVar) {
        this.c = xmuVar;
        if (xmuVar != null) {
            o();
            this.c.e(this.d);
            this.c.d(this.e);
            this.c.b(this.f);
            boolean z = true;
            if (this.g == 1) {
                this.c.a();
            }
            int i = this.g;
            if (i != 0 && i != 1) {
                z = false;
            }
            n(z);
        }
    }

    public final void n(boolean z) {
        xmu xmuVar = this.c;
        if (xmuVar != null) {
            xmuVar.a.l = !z;
        }
    }

    @Override // defpackage.xhx
    public final void nM(xla xlaVar) {
        this.a = xlaVar;
        o();
    }

    @Override // defpackage.ahhb
    public final void qF(ahkm ahkmVar, ahki ahkiVar) {
        m(new xmu(this.h, new Handler(Looper.getMainLooper()), ahkiVar.a(), ahkmVar, ahkiVar));
        ahkiVar.c(this.c);
    }

    @Override // defpackage.ahhb
    public final void qG() {
        m(null);
    }

    @Override // defpackage.xhx
    public final void qH(xjq xjqVar) {
        boolean z = xjqVar.a;
        xmu xmuVar = this.c;
        if (xmuVar != null) {
            xmuVar.e(z);
        }
        this.d = z;
        int i = xjqVar.e.a;
        if (this.f != i) {
            xmu xmuVar2 = this.c;
            if (xmuVar2 != null) {
                xmuVar2.b(i);
            }
            this.f = i;
        }
        this.b.e(xjqVar.c, xjqVar.a);
    }
}
