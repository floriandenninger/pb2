package defpackage;

import com.google.android.apps.youtube.app.common.player.PlaybackLifecycleMonitor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class nyw implements oex, ofd, fkt, fle, xjj {
    static final nzo a = new nyv(1, 1.777f, 1.777f);
    public boolean b;
    private final nzl c;
    private final fku d;
    private final xjl e;
    private final PlaybackLifecycleMonitor f;
    private final nze g;
    private final boolean h;
    private Float i;
    private Float j;
    private String k;
    private float l;
    private boolean m;
    private boolean n;

    public nyw(fku fkuVar, xjl xjlVar, PlaybackLifecycleMonitor playbackLifecycleMonitor, aadw aadwVar, nze nzeVar, nzl nzlVar) {
        this.d = fkuVar;
        this.e = xjlVar;
        this.f = playbackLifecycleMonitor;
        this.c = nzlVar;
        this.g = nzeVar;
        asvu asvuVar = aadwVar.b().e;
        boolean z = false;
        if ((asvuVar == null ? asvu.a : asvuVar).cn) {
            asvu asvuVar2 = aadwVar.b().e;
            if ((asvuVar2 == null ? asvu.a : asvuVar2).co) {
                z = true;
            }
        }
        this.h = z;
    }

    private final void f() {
        float floatValue;
        if (this.m) {
            float f = this.l;
            g(f, f);
            return;
        }
        float f2 = this.l;
        if (f2 == 0.0f) {
            return;
        }
        Float f3 = this.j;
        if (f3 != null) {
            floatValue = f3.floatValue();
        } else {
            Float f4 = this.i;
            floatValue = f4 != null ? f4.floatValue() : f2;
        }
        g(f2, floatValue);
        this.i = null;
        this.j = null;
        this.n = true;
    }

    private final void g(float f, float f2) {
        if (evr.bz(f)) {
            this.c.h(a);
            this.c.A(f);
        } else {
            this.c.A(f);
            this.c.f(1);
        }
        this.c.G(f2, true, false);
    }

    @Override // defpackage.xjj
    public final /* synthetic */ void a(xae xaeVar) {
    }

    @Override // defpackage.xjj
    public final void b(xag xagVar) {
        xaf xafVar = xaf.AD_INTERRUPT_ACQUIRED;
        int ordinal = xagVar.a().ordinal();
        if (ordinal != 1) {
            if (ordinal != 3) {
                return;
            }
            this.m = false;
        } else {
            this.m = true;
            if (xagVar.b() == xfn.MID_ROLL) {
                this.j = Float.valueOf(this.c.i);
            }
        }
    }

    @Override // defpackage.fle
    public final void d(int i) {
        if (i != 2 || this.n) {
            return;
        }
        f();
    }

    @Override // defpackage.ofd
    public final void e(int i, int i2) {
        boolean h = ofe.h(i2);
        if (ofe.h(i) != h) {
            if (h) {
                this.e.b(this);
                this.f.h(this);
            } else {
                this.e.k(this);
                this.f.a.remove(this);
            }
        }
    }

    @Override // defpackage.oex
    public final void oY(ofa ofaVar, ofa ofaVar2) {
        Float f = null;
        String c = ofaVar != null ? ofaVar.h.c() : null;
        String c2 = ofaVar2 != null ? ofaVar2.h.c() : null;
        this.m = false;
        this.j = null;
        this.n = false;
        if (c != null) {
            yjj.x(this.d.a, c, this);
        }
        if (c2 != null) {
            this.l = this.d.e(c2);
            yjj.w(this.d.a, c2, this);
            this.c.B(this.l, this.b && this.h);
            this.c.H(5, 3, false);
            if (this.b && this.h && this.g.d <= 0.0f) {
                f = Float.valueOf(1.333f);
            }
            this.i = f;
        } else {
            g(1.777f, 1.777f);
            this.l = 0.0f;
        }
        this.k = c2;
    }

    @Override // defpackage.fkt
    public final void c(String str, float f) {
        String str2 = this.k;
        if (str != str2 && (str == null || str2 == null || str.length() != str2.length() || !str.equals(str2))) {
            return;
        }
        if (this.m || !evr.bx(this.l, f)) {
            this.l = f;
            f();
        }
    }
}
