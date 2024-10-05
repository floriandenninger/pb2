package defpackage;

import com.google.android.apps.youtube.app.common.ui.inline.InlinePlaybackLifecycleController;
import com.google.android.apps.youtube.app.ui.inline.spotlight.SpotlightScrimLayout;
import j$.util.Optional;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mit implements miv, miw, gge {
    public final mir a;
    public final min b;
    public final mis c;
    public final mio d;
    public final mip e;
    public final mim f;
    public final InlinePlaybackLifecycleController g;
    public final gje h;
    public final SpotlightScrimLayout i;
    public Optional j;
    public Optional k;
    public Optional l;
    public Optional m;
    public final azrh n;
    miq o;
    public final yzr p;
    private ayqx r;

    public mit(yqw yqwVar, gje gjeVar, InlinePlaybackLifecycleController inlinePlaybackLifecycleController, SpotlightScrimLayout spotlightScrimLayout) {
        mir mirVar = new mir(this);
        this.a = mirVar;
        this.b = new min(this);
        this.c = new mis(this);
        this.d = new mio(this);
        this.e = new mip(this);
        this.f = new mim(this);
        this.r = aynu.d();
        this.n = azrh.aN(false);
        this.o = mirVar;
        inlinePlaybackLifecycleController.getClass();
        this.g = inlinePlaybackLifecycleController;
        gjeVar.getClass();
        this.h = gjeVar;
        this.k = Optional.empty();
        this.l = Optional.empty();
        this.m = Optional.empty();
        this.j = Optional.empty();
        this.o = mirVar;
        this.i = spotlightScrimLayout;
        spotlightScrimLayout.getClass();
        yzr yzrVar = new yzr(spotlightScrimLayout, null);
        this.p = yzrVar;
        yzrVar.h(new zch() { // from class: mih
            @Override // defpackage.zch
            public final void nE(int i, yzr yzrVar2) {
                mit mitVar = mit.this;
                if (i == 2) {
                    mitVar.n.c(true);
                } else if (i == 0) {
                    mitVar.n.c(false);
                }
            }
        });
        yzrVar.e = 400L;
        yzrVar.d = 0L;
        yqwVar.f(new Callable() { // from class: mik
            @Override // java.util.concurrent.Callable
            public final Object call() {
                final mit mitVar = mit.this;
                return mitVar.h.h().aj(luw.p).ax(new ayrs() { // from class: mii
                    @Override // defpackage.ayrs
                    public final void a(Object obj) {
                        mit mitVar2 = mit.this;
                        Optional optional = (Optional) obj;
                        optional.isPresent();
                        if (!optional.isPresent()) {
                            mitVar2.e(mitVar2.a);
                            mitVar2.k = Optional.empty();
                            return;
                        }
                        mitVar2.e(mitVar2.a);
                        if (!mitVar2.j.isPresent()) {
                            mitVar2.j = Optional.of(new mil(mitVar2));
                        }
                        mitVar2.k = optional;
                        ((gfr) mitVar2.k.get()).l().aD((lo) mitVar2.j.get());
                        mitVar2.e(mitVar2.b);
                    }
                });
            }
        });
    }

    public static final String i(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? i != 7 ? "UNKNOWN" : "ADVANCE_TO_NEXT_REQUESTED" : "SCRIM_SHOWN" : "SCRIM_ALLOCATED" : "WAITING_FOR_PLAYBACK_POSITION" : "INITIALIZED" : "UNINITIALIZED";
    }

    private static final String j(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? "?" : "PLAYING" : "POSITIONED" : "SELECTED" : "DESELECTED";
    }

    private static final void k(gfq gfqVar) {
        String.valueOf(String.valueOf(gfqVar)).length();
    }

    @Override // defpackage.miv
    public final azrh a() {
        return this.n;
    }

    public final void b() {
        this.p.b(false);
    }

    public final void c() {
        if (this.o == this.e) {
            e(this.b);
        }
    }

    @Override // defpackage.miw
    public final void d() {
        c();
    }

    public final void e(miq miqVar) {
        String valueOf = String.valueOf(this.o);
        String valueOf2 = String.valueOf(miqVar);
        String.valueOf(valueOf).length();
        String.valueOf(valueOf2).length();
        this.o.c(miqVar.a());
        this.o = miqVar;
        miqVar.b();
    }

    public final void f(final boolean z) {
        amkq.E(this.k.isPresent());
        this.r = ((gfr) this.k.get()).j().Y(new ayrs() { // from class: mij
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                mit mitVar = mit.this;
                boolean z2 = z;
                Optional optional = (Optional) obj;
                String.valueOf(String.valueOf(optional)).length();
                if (!z2) {
                    amkq.E(mitVar.o == mitVar.c);
                    amkq.E(mitVar.k.isPresent());
                    if (optional.isPresent() && ((Integer) optional.get()).intValue() >= 0 && ((gfr) mitVar.k.get()).l().F == 0) {
                        mitVar.m = optional;
                        mitVar.e(mitVar.d);
                        return;
                    }
                    return;
                }
                amkq.E(mitVar.o == mitVar.f);
                amkq.E(mitVar.k.isPresent());
                if (!optional.isPresent() || ((Integer) optional.get()).intValue() < 0) {
                    return;
                }
                mitVar.m = optional;
                mitVar.e(mitVar.e);
            }
        }, ktf.p);
    }

    public final void g() {
        this.r.qc();
    }

    @Override // defpackage.miv
    public final boolean h() {
        if (this.o != this.e) {
            return false;
        }
        e(this.b);
        return true;
    }

    @Override // defpackage.gge
    public final void m(gfq gfqVar, int i, int i2) {
        j(i).length();
        j(i2).length();
        if (i2 == 3) {
            if (this.o.a() == 2) {
                k(gfqVar);
                this.l = Optional.of(gfqVar);
                e(this.c);
                return;
            } else {
                if (this.o.a() == 7) {
                    k(gfqVar);
                    this.l = Optional.of(gfqVar);
                    return;
                }
                return;
            }
        }
        if (i2 != 0 || this.o.a() == 7) {
            return;
        }
        this.l = Optional.empty();
        this.m = Optional.empty();
        if (this.o.a() != 2) {
            e(this.b);
        }
    }
}
