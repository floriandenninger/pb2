package defpackage;

import com.google.android.apps.youtube.app.common.player.PlaybackLifecycleMonitor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class kqe implements fle, gge, fgp, fgl, flm, ahwh {
    public final kqa a;
    public final PlaybackLifecycleMonitor b;
    public final fln c;
    public kpz d;
    public boolean e;
    public boolean f;
    public fgq g;
    private final ypa h;
    private final aioc i;
    private kpz m;
    private boolean n;
    private boolean o;
    private boolean p;
    private final aadw q;
    private final kch r;
    private final kqd k = new kqd(this);
    private final kqb l = new kqb(this);
    private final ayqw j = new ayqw();

    public kqe(kqa kqaVar, PlaybackLifecycleMonitor playbackLifecycleMonitor, fln flnVar, ypa ypaVar, aioc aiocVar, aadw aadwVar, kch kchVar) {
        this.a = kqaVar;
        this.b = playbackLifecycleMonitor;
        this.c = flnVar;
        this.h = ypaVar;
        this.i = aiocVar;
        this.q = aadwVar;
        this.r = kchVar;
    }

    @Override // defpackage.fgl
    public final void a(fhf fhfVar, avgg avggVar) {
        if (fhfVar != null) {
            this.d = new kpz(fhfVar.c(), avggVar);
            g();
        }
    }

    @Override // defpackage.fle
    public final void d(int i) {
        if (i == 0) {
            this.d = null;
            g();
        } else if (i == 1) {
            this.n = false;
        }
        h();
    }

    @Override // defpackage.ahwh
    public final void e(boolean z) {
        if (this.n == z) {
            return;
        }
        this.n = z;
        h();
    }

    @Override // defpackage.ahwh
    public final void f(avgg avggVar) {
        kpz kpzVar = this.d;
        if (kpzVar == null || avggVar == null) {
            return;
        }
        this.d = new kpz(kpzVar.a, avggVar);
        g();
    }

    public final void h() {
        int i = this.b.b;
        if (!this.e && !this.f && this.c.b && i != 1 && i != 5) {
            if (i == 3) {
                if (((kcz) this.r.get()).aT.d.E()) {
                    i = 3;
                }
            }
            if (!this.p && ((!this.o || i == 2 || i == 4) && !this.n)) {
                this.a.kV();
                return;
            }
        }
        this.a.kX();
    }

    @Override // defpackage.flm
    public final void kG() {
        if (evr.au(this.q)) {
            this.j.c();
        } else {
            this.h.m(this.k);
        }
        this.h.m(this.l);
        h();
    }

    @Override // defpackage.flm
    public final void kH() {
        if (evr.au(this.q)) {
            this.j.g(this.k.kI(this.i));
        } else {
            this.h.g(this.k);
        }
        this.h.g(this.l);
        h();
    }

    @Override // defpackage.gge
    public final void m(gfq gfqVar, int i, int i2) {
        if (i2 == 0) {
            this.m = null;
        } else if (i2 == 2) {
            this.m = new kpz(gfqVar.b.f(), gfqVar.b.e());
            g();
            h();
        }
    }

    @Override // defpackage.fgp
    public final void oQ(fhg fhgVar) {
        boolean z = this.o;
        boolean z2 = this.p;
        this.o = this.g.g().d();
        boolean z3 = this.g.g() == fhg.WATCH_WHILE_SLIDING_MINIMIZED_DISMISSED;
        this.p = z3;
        boolean z4 = this.o;
        if (z4 == z && z3 == z2) {
            return;
        }
        if (z4 != z) {
            g();
        }
        h();
    }

    @Override // defpackage.fgp
    public final /* synthetic */ void oR(fhg fhgVar, fhg fhgVar2) {
        fav.g(this, fhgVar2);
    }

    public final void g() {
        kpz kpzVar;
        if (!this.o || (kpzVar = this.m) == null) {
            this.a.k(this.d);
        } else {
            this.a.k(kpzVar);
        }
    }
}
