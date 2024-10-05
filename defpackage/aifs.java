package defpackage;

import com.google.android.libraries.youtube.player.modality.PlaybackModalityState;
import java.util.Observable;
import java.util.Observer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aifs implements Observer, aifw {
    public final aifv a;
    public final aift b;
    public boolean e;
    public afkl f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    private aifp v;
    public owg r = owg.AUDIO_ROUTE_UNSPECIFIED;
    public aige s = aige.a();
    public aigm t = aigm.DEFAULT_VALUE;
    public final afkn c = new aifr(this);
    public float d = 1.0f;
    public int u = 1;

    public aifs(aifv aifvVar, aift aiftVar) {
        this.j = true;
        this.a = aifvVar;
        this.b = aiftVar;
        this.j = true;
    }

    private final aigf v() {
        if (this.h) {
            return aigf.FULLSCREEN;
        }
        if (this.g) {
            return aigf.MINIMIZED;
        }
        if (this.n) {
            return aigf.INLINE_IN_FEED;
        }
        return aigf.DEFAULT;
    }

    public final float a() {
        if (this.s.b()) {
            return 0.0f;
        }
        if (this.e) {
            return 0.1f;
        }
        return this.d;
    }

    public final afkm b() {
        aifp aifpVar = this.v;
        if (aifpVar != null) {
            aigf aigfVar = aigf.DEFAULT;
            int ordinal = v().ordinal();
            if (ordinal == 0) {
                return (afkm) aifpVar.a.get();
            }
            if (ordinal == 1) {
                return (afkm) aifpVar.d.get();
            }
            if (ordinal == 2) {
                return (afkm) aifpVar.b.get();
            }
            if (ordinal == 4) {
                return (afkm) aifpVar.c.get();
            }
        }
        return afkm.a;
    }

    public final ahcx c() {
        afkm b = b();
        aigf g = g();
        aigf v = v();
        int i = b.c;
        int i2 = b.d;
        afkl afklVar = this.f;
        return new ahcx(g, v, i, i2, afklVar != null && afklVar.x(), this.q);
    }

    @Override // defpackage.aifw
    public final ahcx d() {
        return c();
    }

    public final PlaybackModalityState e() {
        return new PlaybackModalityState(this.g, this.h, this.k, this.l, this.m, this.n, this.o, this.q, this.i, this.s, this.t);
    }

    @Override // defpackage.aifw
    public final aige f() {
        return this.s;
    }

    @Override // defpackage.aifw
    public final aigf g() {
        if (this.m) {
            return aigf.REMOTE;
        }
        if (this.k) {
            return aigf.BACKGROUND;
        }
        if (this.o) {
            return aigf.VIRTUAL_REALITY;
        }
        if (this.i) {
            return aigf.PICTURE_IN_PICTURE;
        }
        return v();
    }

    @Override // defpackage.aifw
    public final aigm h() {
        return this.t;
    }

    public final void i() {
        this.a.f.c(c());
        this.c.notifyObservers();
    }

    public final void j() {
        this.a.e.c(new ahed(this.t, this.l));
    }

    public final void k() {
        n(null);
        this.f = null;
        this.b.b.c(aiev.a);
    }

    public final void l() {
        m(false);
    }

    public final void m(boolean z) {
        if (z != this.k) {
            this.k = z;
            i();
        }
    }

    public final void n(aifp aifpVar) {
        aifp aifpVar2 = this.v;
        if (aifpVar2 != null) {
            aifpVar2.deleteObserver(this);
        }
        this.v = aifpVar;
        if (aifpVar != null) {
            aifpVar.addObserver(this);
        }
    }

    public final void o(aige aigeVar) {
        if (aigeVar.equals(this.s)) {
            return;
        }
        this.s = aigeVar;
    }

    public final void p(boolean z) {
        if (z != this.o) {
            this.o = z;
            i();
        }
    }

    public final void q(boolean z) {
        if (z) {
            if (this.l) {
                return;
            }
            this.b.b.c(aiev.a);
            u(true);
            return;
        }
        if (this.l) {
            u(false);
            afkl afklVar = this.f;
            if (afklVar != null) {
                this.b.b.c(new aiev(afklVar));
            } else {
                zga.b("Error: no UI elements available to display video");
            }
        }
    }

    @Override // defpackage.aifw
    public final boolean r() {
        return this.l;
    }

    public final boolean s() {
        return v() == aigf.DEFAULT;
    }

    public final void t(int i) {
        this.u = i;
        if (i != 1) {
            this.a.i.c(new ahdo(i == 2));
        }
    }

    final void u(boolean z) {
        if (z != this.l) {
            this.l = z;
            i();
            j();
        }
    }

    @Override // java.util.Observer
    public final void update(Observable observable, Object obj) {
        if (observable == this.v && (obj instanceof Integer)) {
            aigf v = v();
            int intValue = ((Integer) obj).intValue();
            if (intValue == 0) {
                if (v == aigf.DEFAULT) {
                    i();
                }
            } else if (intValue == 1) {
                if (v == aigf.FULLSCREEN) {
                    i();
                }
            } else {
                if (intValue != 2) {
                    if (intValue == 3 && v == aigf.MINIMIZED) {
                        i();
                        return;
                    }
                    return;
                }
                if (v == aigf.INLINE_IN_FEED) {
                    i();
                }
            }
        }
    }
}
