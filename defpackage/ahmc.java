package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahmc extends ahhi implements ahkk, ahkl, ahke, ahkg, ahkf, ahig {
    public final Handler a;
    public ahfx b;
    public ahlv c;
    public ahmv e;
    public ahjv f;
    public ahvb g;
    public ahyt h;
    public ahxd i;
    public boolean j;
    public boolean k;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public int q;
    private final ahhp r;
    private final ahhp s;
    private final ahhp t;
    private final ahfp u;
    private final ahkm v;
    private final ahki w;
    private long x;
    private boolean y;

    public ahmc(ahkm ahkmVar, ahki ahkiVar) {
        this.w = ahkiVar;
        this.v = ahkmVar;
        ahfp ahfpVar = new ahfp();
        this.u = ahfpVar;
        ahfpVar.a = 500;
        this.a = new Handler(Looper.getMainLooper());
        this.r = new ahhp(ahkmVar.c.clone(), 40.0f, 30.0f);
        this.s = new ahhp(ahkmVar.c.clone(), ahkmVar.h, ahkmVar.i);
        this.t = new ahhp(ahkmVar.c.clone(), ahkmVar.h, ahkmVar.i);
    }

    public final void a() {
        this.k = true;
        this.e.b(2);
        this.o = false;
        this.y = false;
        j();
    }

    @Override // defpackage.ahkl
    public final void b(float f, float f2) {
        this.t.a(f, f2);
        this.s.a(f, f2);
    }

    public final void c() {
        this.a.post(new ahlw(this, 2));
        j();
        a();
        this.k = true;
    }

    @Override // defpackage.ahig
    public final boolean f(ahjq ahjqVar) {
        return !v() && this.r.b(ahjqVar).b();
    }

    @Override // defpackage.ahig
    public final boolean g(ahjq ahjqVar) {
        return v() && this.k && (this.q != 1 || this.t.b(ahjqVar).b());
    }

    @Override // defpackage.ahig
    public final boolean h(ahjq ahjqVar) {
        if (s()) {
            return false;
        }
        return (this.q != 3 && this.k && this.s.b(ahjqVar).b()) ? false : true;
    }

    @Override // defpackage.ahhi, defpackage.ahim
    public final void i() {
        super.i();
        this.v.g(this);
        this.v.h(this);
    }

    public final void j() {
        boolean z = true;
        this.n = this.w.x() || !(!this.k || this.y || this.j || this.o || this.w.y());
        Iterator it = iterator();
        while (it.hasNext()) {
            ((ahim) it.next()).qE(this.n);
        }
        this.b.qE(!this.j);
        this.w.k();
        this.c.a(this.w.h);
        ahjv ahjvVar = this.f;
        boolean z2 = this.n;
        if (!z2 && !this.p) {
            z = false;
        }
        ahjvVar.l = z;
        this.w.h(z2);
    }

    @Override // defpackage.ahhi, defpackage.ahim
    public final void p(ahjq ahjqVar) {
        Iterator it = this.w.c.iterator();
        while (true) {
            if (it.hasNext()) {
                if (((ahim) it.next()).r(ahjqVar)) {
                    break;
                }
            } else {
                if (!this.r.b(ahjqVar).b()) {
                    this.m = true;
                }
                boolean z = !this.y;
                this.y = z;
                if (z) {
                    this.x = ahjqVar.b + 2500;
                }
                j();
            }
        }
        super.p(ahjqVar);
    }

    @Override // defpackage.ahhi, defpackage.ahim
    public final void q(ahjq ahjqVar) {
        boolean z = false;
        if (this.m) {
            this.v.t(ahjqVar);
            this.m = false;
        }
        if (!v() && (r(ahjqVar) || this.w.y())) {
            this.x = ahjqVar.b + 2500;
        } else if (!v()) {
            this.y = this.y && this.x > ahjqVar.b;
            j();
        }
        boolean b = this.r.b(ahjqVar).b();
        ahfp ahfpVar = this.u;
        if (!v() && b) {
            z = true;
        }
        ahfpVar.b(z, ahjqVar.b);
        this.v.j(this.u.a() * 0.66f);
        super.q(ahjqVar);
    }

    @Override // defpackage.ahhi, defpackage.ahim
    public final void qD(boolean z, ahjq ahjqVar) {
        boolean r = r(ahjqVar);
        if (!z || r) {
            super.qD(z, ahjqVar);
        }
    }

    @Override // defpackage.ahio, defpackage.ahim
    public final boolean v() {
        return super.v() || this.n;
    }

    @Override // defpackage.ahkk
    public final void z(int i) {
        this.q = i;
        this.c.c.l = i != 1;
    }
}
