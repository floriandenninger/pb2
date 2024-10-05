package defpackage;

import android.os.Handler;
import android.text.TextUtils;
import java.util.PriorityQueue;
import java.util.Queue;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fwe implements fgp, aioa, fxi {
    public final shf a;
    final Runnable b;
    public final Queue c;
    public String d;
    long e;
    long f;
    public String g;
    String h;
    boolean i;
    private final Handler j;
    private final fgq k;
    private final ayqw l;
    private final aioc m;

    public fwe(shf shfVar, fgq fgqVar, Handler handler, aioc aiocVar, fxj fxjVar) {
        shfVar.getClass();
        this.a = shfVar;
        this.j = handler;
        fgqVar.getClass();
        this.k = fgqVar;
        aiocVar.getClass();
        this.m = aiocVar;
        this.l = new ayqw();
        this.c = new PriorityQueue();
        this.b = new Runnable() { // from class: fwb
            @Override // java.lang.Runnable
            public final void run() {
                fwe fweVar = fwe.this;
                fweVar.i = false;
                while (true) {
                    if (!fweVar.c.isEmpty()) {
                        if (!fweVar.h() || fweVar.c() < ((fwd) fweVar.c.peek()).b) {
                            break;
                        } else {
                            ((fwd) fweVar.c.poll()).g(fweVar.g);
                        }
                    } else {
                        fweVar.d = null;
                        break;
                    }
                }
                fweVar.f();
            }
        };
        this.f = -1L;
        if (fxjVar.b) {
            b();
        }
        fxjVar.g(this);
    }

    private final boolean i() {
        fhg g = this.k.g();
        return (g == null || !g.f() || g.b()) ? false : true;
    }

    @Override // defpackage.fxi
    public final void a() {
        this.l.c();
        this.k.j(this);
    }

    @Override // defpackage.fxi
    public final void b() {
        this.l.g(kI(this.m));
        this.k.i(this);
    }

    public final long c() {
        return this.e + (this.f == -1 ? 0L : this.a.c() - this.f);
    }

    public final void d() {
        this.c.clear();
        this.d = null;
    }

    public final void f() {
        g();
        if (!h() || this.f == -1 || this.c.isEmpty()) {
            return;
        }
        this.j.postDelayed(this.b, Math.max(0L, ((fwd) this.c.peek()).b - c()));
        this.i = true;
    }

    public final void g() {
        if (this.i) {
            this.j.removeCallbacks(this.b);
            this.i = false;
        }
    }

    public final boolean h() {
        String str = this.g;
        if (str == null || str.equals(this.d)) {
            return i();
        }
        d();
        return false;
    }

    @Override // defpackage.aioa
    public final ayqx[] kI(aioc aiocVar) {
        final int i = 1;
        final int i2 = 0;
        return new ayqx[]{aiocVar.G().b.Y(new ayrs(this) { // from class: fwa
            public final /* synthetic */ fwe a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                if (i == 0) {
                    fwe fweVar = this.a;
                    ahej ahejVar = (ahej) obj;
                    if (TextUtils.isEmpty(fweVar.g)) {
                        return;
                    }
                    fweVar.e = fweVar.c();
                    fweVar.f = ahejVar.a() == 2 ? fweVar.a.c() : -1L;
                    fweVar.f();
                    return;
                }
                fwe fweVar2 = this.a;
                ahef ahefVar = (ahef) obj;
                if (ahefVar.c() == aign.VIDEO_PLAYING) {
                    fweVar2.g = ahefVar.b().y();
                    if (!fweVar2.g.equals(fweVar2.h)) {
                        fweVar2.e = 0L;
                        fweVar2.h = fweVar2.g;
                    }
                    fweVar2.f();
                    return;
                }
                fweVar2.g = null;
                fweVar2.f = -1L;
                fweVar2.g();
            }
        }, eoo.o), aiocVar.G().j.Y(new ayrs(this) { // from class: fwa
            public final /* synthetic */ fwe a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                if (i2 == 0) {
                    fwe fweVar = this.a;
                    ahej ahejVar = (ahej) obj;
                    if (TextUtils.isEmpty(fweVar.g)) {
                        return;
                    }
                    fweVar.e = fweVar.c();
                    fweVar.f = ahejVar.a() == 2 ? fweVar.a.c() : -1L;
                    fweVar.f();
                    return;
                }
                fwe fweVar2 = this.a;
                ahef ahefVar = (ahef) obj;
                if (ahefVar.c() == aign.VIDEO_PLAYING) {
                    fweVar2.g = ahefVar.b().y();
                    if (!fweVar2.g.equals(fweVar2.h)) {
                        fweVar2.e = 0L;
                        fweVar2.h = fweVar2.g;
                    }
                    fweVar2.f();
                    return;
                }
                fweVar2.g = null;
                fweVar2.f = -1L;
                fweVar2.g();
            }
        }, eoo.o)};
    }

    @Override // defpackage.fgp
    public final void oQ(fhg fhgVar) {
        if (!i()) {
            g();
        } else {
            if (this.i) {
                return;
            }
            f();
        }
    }

    @Override // defpackage.fgp
    public final /* synthetic */ void oR(fhg fhgVar, fhg fhgVar2) {
        fav.g(this, fhgVar2);
    }
}
