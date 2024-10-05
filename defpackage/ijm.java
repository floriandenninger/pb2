package defpackage;

import android.os.SystemClock;
import android.view.accessibility.AccessibilityManager;
import com.google.android.apps.youtube.app.extensions.reel.watch.overlay.ReelPlayerProgressPresenter;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ijm implements aioa, ypd {
    public ahej a = null;
    final /* synthetic */ ijo b;

    public ijm(ijo ijoVar) {
        this.b = ijoVar;
    }

    public final void a(aigr aigrVar) {
        ily aG = this.b.aG();
        if (aigrVar.a() && aG != null) {
            aG.f.e();
        }
        synchronized (this.b.bo) {
            ijo ijoVar = this.b;
            ijoVar.br = true;
            ijoVar.aP();
        }
    }

    public final void b(aheg ahegVar) {
        ily aG = this.b.aG();
        if (aG != null) {
            ijo ijoVar = this.b;
            if (ijoVar.ba != null) {
                boolean p = ijoVar.ae.p();
                boolean z = false;
                boolean z2 = !((this.b.ba.b & 8) != 0);
                if (aG.t && !aG.u && ahegVar.f() >= 15000) {
                    aG.u = true;
                    aG.v = false;
                    ily.j(aG.e, 1.0f, 200L, 0L);
                }
                ReelPlayerProgressPresenter reelPlayerProgressPresenter = aG.e;
                reelPlayerProgressPresenter.c = ahegVar.e();
                reelPlayerProgressPresenter.a = ahegVar.f();
                if (ahegVar.j()) {
                    reelPlayerProgressPresenter.b = SystemClock.elapsedRealtime();
                }
                reelPlayerProgressPresenter.c();
                if (this.b.an.d()) {
                    return;
                }
                ilc ilcVar = aG.o;
                if (z2 && !p) {
                    z = true;
                }
                if (z) {
                    long f = ahegVar.f() - ahegVar.e();
                    if (f >= 0) {
                        ikn iknVar = (ikn) ilcVar;
                        if (f >= iknVar.r || etx.N(iknVar.d) || !iknVar.b.b()) {
                            return;
                        }
                        if (!iknVar.s) {
                            iknVar.s = true;
                            iknVar.b.c();
                        }
                        etx.M(iknVar.d, true);
                        if (iknVar.w != null) {
                            iknVar.h.mM().u(new acqx(iknVar.w), null);
                            iknVar.w = null;
                        }
                    }
                }
            }
        }
    }

    public final void c(ahej ahejVar) {
        ijo ijoVar;
        arsd arsdVar;
        this.a = null;
        ily aG = this.b.aG();
        if (aG != null) {
            int a = ahejVar.a();
            if (a == 2) {
                aG.q = true;
                aG.f.b();
                aG.d.b();
                aG.e.d(false);
                aG.q();
            } else if (a == 3) {
                aG.e.d(true);
                aG.q();
            } else if (a == 5 || a == 6) {
                aG.d.e();
            }
        }
        int a2 = ahejVar.a();
        if (a2 != 7) {
            if (a2 != 8) {
                return;
            }
            synchronized (this.b.bo) {
                ijo ijoVar2 = this.b;
                ijoVar2.br = true;
                ijoVar2.aP();
            }
            this.b.ah.h(3);
            this.b.bb(new Runnable() { // from class: ijl
                @Override // java.lang.Runnable
                public final void run() {
                    ijm.this.b.aq.b();
                }
            });
            return;
        }
        arsd arsdVar2 = this.b.ba;
        if (arsdVar2 != null) {
            aujq b = aujq.b(arsdVar2.j);
            if (b == null) {
                b = aujq.REEL_LOOP_BEHAVIOR_UNKNOWN;
            }
            if (b == aujq.REEL_LOOP_BEHAVIOR_REPEAT) {
                this.b.aq.U(0L);
                boolean p = this.b.ae.p();
                ijo ijoVar3 = this.b;
                if ((ijoVar3.ba.b & 8) == 0 && !p) {
                    final ihy ihyVar = ijoVar3.an;
                    if (ihyVar.d() && ihyVar.c.b() && !ihyVar.h) {
                        AccessibilityManager accessibilityManager = ihyVar.e;
                        if (accessibilityManager == null || accessibilityManager.isTouchExplorationEnabled()) {
                            ihyVar.a();
                            return;
                        }
                        if (!ihyVar.h) {
                            ihyVar.h = true;
                            ihyVar.c.c();
                        }
                        etx.M(ihyVar.d, true);
                        ihyVar.c(false);
                        if (ihyVar.i > 0) {
                            ihyVar.d.postDelayed(new Runnable() { // from class: ihw
                                @Override // java.lang.Runnable
                                public final void run() {
                                    ihy.this.a();
                                }
                            }, ihyVar.i);
                        }
                        if (ihyVar.f == null || ihyVar.a != 1) {
                            return;
                        }
                        ihyVar.a = 3;
                        ihyVar.b.mM().u(new acqx(ihyVar.f), null);
                        return;
                    }
                    return;
                }
                return;
            }
        }
        ijo ijoVar4 = this.b;
        if (ijoVar4.ba != null) {
            if (!ijoVar4.as.b()) {
                this.b.bi(true, true);
                return;
            } else {
                if (this.b.aJ().n && (arsdVar = (ijoVar = this.b).ba) != null && (arsdVar.b & 8) == 0) {
                    ijoVar.bh(ihk.a(3), false);
                    return;
                }
                return;
            }
        }
        ammr ammrVar = ijoVar4.by;
        if (ammrVar != null && ammrVar.b.equals(ahejVar.b())) {
            ijo ijoVar5 = this.b;
            ijoVar5.by = null;
            ijoVar5.bh(ihk.a(2), true);
        } else {
            this.a = ahejVar;
            if (aG != null) {
                aG.d.e();
            }
        }
    }

    @Override // defpackage.aioa
    public final ayqx[] kI(aioc aiocVar) {
        return new ayqx[]{aiocVar.G().e.Y(new ijd(this, 4), ggk.u), aiocVar.G().j.Y(new ijd(this, 5), ggk.u), aiocVar.G().h.Y(new ijd(this, 6), ggk.u)};
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{aheg.class, ahej.class, aigr.class};
        }
        if (i == 0) {
            b((aheg) obj);
            return null;
        }
        if (i == 1) {
            c((ahej) obj);
            return null;
        }
        if (i == 2) {
            a((aigr) obj);
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }
}
