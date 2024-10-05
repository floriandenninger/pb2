package defpackage;

import android.os.Build;
import android.view.Surface;
import android.view.SurfaceControl;
import android.view.View;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeoutException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class aevl implements afkx {
    final afdf a;
    final aetw b;
    final aewb c;
    final aevk d;
    public plr e;
    public aevr f;
    public aevo g;
    public auc h;
    public int i;
    public int j;
    public int k = 0;
    public int l = 0;
    bgv m;
    public boolean n;
    public volatile SurfaceControl o;
    public volatile SurfaceControl.Transaction p;
    public volatile Surface q;
    public Surface r;
    boolean s;
    private final aetv t;
    private final pkv u;
    private Future v;
    private final ScheduledExecutorService w;

    public aevl(plr plrVar, aetw aetwVar, ScheduledExecutorService scheduledExecutorService, afdf afdfVar, aewb aewbVar, aevr aevrVar, aevo aevoVar, auc aucVar, aevk aevkVar, aetv aetvVar, pkv pkvVar) {
        this.e = plrVar;
        this.b = aetwVar;
        this.w = scheduledExecutorService;
        this.a = afdfVar;
        this.c = aewbVar;
        this.f = aevrVar;
        this.g = aevoVar;
        this.h = aucVar;
        this.d = aevkVar;
        this.t = aetvVar;
        this.u = pkvVar;
        h();
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x008c A[Catch: TimeoutException -> 0x00b1, InterruptedException -> 0x00e9, TryCatch #2 {InterruptedException -> 0x00e9, TimeoutException -> 0x00b1, blocks: (B:3:0x0003, B:5:0x000f, B:7:0x0013, B:9:0x001b, B:11:0x001f, B:13:0x0029, B:14:0x003b, B:16:0x0041, B:20:0x0053, B:22:0x0057, B:23:0x0062, B:26:0x007e, B:28:0x0082, B:30:0x008c, B:31:0x009b, B:33:0x009f, B:34:0x0094, B:35:0x00ac, B:39:0x005e, B:40:0x0068, B:42:0x006e, B:44:0x0077, B:47:0x002c, B:48:0x002f, B:50:0x0035), top: B:2:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009f A[Catch: TimeoutException -> 0x00b1, InterruptedException -> 0x00e9, TryCatch #2 {InterruptedException -> 0x00e9, TimeoutException -> 0x00b1, blocks: (B:3:0x0003, B:5:0x000f, B:7:0x0013, B:9:0x001b, B:11:0x001f, B:13:0x0029, B:14:0x003b, B:16:0x0041, B:20:0x0053, B:22:0x0057, B:23:0x0062, B:26:0x007e, B:28:0x0082, B:30:0x008c, B:31:0x009b, B:33:0x009f, B:34:0x0094, B:35:0x00ac, B:39:0x005e, B:40:0x0068, B:42:0x006e, B:44:0x0077, B:47:0x002c, B:48:0x002f, B:50:0x0035), top: B:2:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0094 A[Catch: TimeoutException -> 0x00b1, InterruptedException -> 0x00e9, TryCatch #2 {InterruptedException -> 0x00e9, TimeoutException -> 0x00b1, blocks: (B:3:0x0003, B:5:0x000f, B:7:0x0013, B:9:0x001b, B:11:0x001f, B:13:0x0029, B:14:0x003b, B:16:0x0041, B:20:0x0053, B:22:0x0057, B:23:0x0062, B:26:0x007e, B:28:0x0082, B:30:0x008c, B:31:0x009b, B:33:0x009f, B:34:0x0094, B:35:0x00ac, B:39:0x005e, B:40:0x0068, B:42:0x006e, B:44:0x0077, B:47:0x002c, B:48:0x002f, B:50:0x0035), top: B:2:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Boolean p(defpackage.aezf r10) {
        /*
            Method dump skipped, instructions count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aevl.p(aezf):java.lang.Boolean");
    }

    private final void q(aezf aezfVar, String str, Exception exc) {
        if (aezfVar != null) {
            aezfVar.b.g(new afih(afif.DEFAULT, str, this.d.g(), "c.MediaViewManager", exc, null));
        }
    }

    private final void r(poe poeVar, bgv bgvVar) {
        long k = this.b.s.k();
        pod d = this.e.d(poeVar);
        d.f(1);
        d.e(bgvVar);
        d.d();
        d.b(k);
    }

    private final boolean s(bgv bgvVar) {
        if (this.m == bgvVar) {
            return false;
        }
        r(this.h, bgvVar);
        r(this.g, bgvVar);
        this.m = bgvVar;
        return true;
    }

    private final boolean t(Surface surface) {
        String sb;
        if (this.r == surface) {
            return false;
        }
        pkv pkvVar = this.u;
        if (pkvVar != null && surface == null) {
            pkvVar.c.execute(new pkk(pkvVar, 0));
        }
        long k = this.b.s.k();
        pod d = this.e.d(this.f);
        d.f(1);
        d.e(surface);
        d.d();
        d.b(k);
        afdf afdfVar = this.a;
        Surface surface2 = this.r;
        afqu afquVar = afqu.ANDROID_EXOPLAYER_V2;
        if (afdfVar.a) {
            if (surface == null) {
                if (surface2 == null) {
                    sb = "oldsur.null";
                } else if (surface2.isValid()) {
                    int identityHashCode = System.identityHashCode(surface2);
                    StringBuilder sb2 = new StringBuilder(35);
                    sb2.append("oldsur.valid-oldsurhash.");
                    sb2.append(identityHashCode);
                    sb = sb2.toString();
                } else {
                    int identityHashCode2 = System.identityHashCode(surface2);
                    StringBuilder sb3 = new StringBuilder(37);
                    sb3.append("oldsur.invalid-oldsurhash.");
                    sb3.append(identityHashCode2);
                    sb = sb3.toString();
                }
                afde afdeVar = afde.SET_NULL_SURFACE;
                aflb aflbVar = aflb.NONE;
                String a = afjz.a(Thread.currentThread().getStackTrace());
                StringBuilder sb4 = new StringBuilder(String.valueOf(a).length() + 1 + String.valueOf(sb).length());
                sb4.append(a);
                sb4.append("-");
                sb4.append(sb);
                afdfVar.p(afdeVar, afquVar, 0, aflbVar, sb4.toString(), null);
            } else {
                afdfVar.p(afde.SET_SURFACE, afquVar, System.identityHashCode(surface), aflb.NONE, null, null);
            }
        }
        this.r = surface;
        return true;
    }

    @Override // defpackage.afkx
    public final void a() {
        p(this.b.n);
    }

    @Override // defpackage.afkx
    public final void b() {
    }

    @Override // defpackage.afkx
    public final void c() {
        this.a.k(afqu.ANDROID_EXOPLAYER_V2);
        afky afkyVar = this.b.m;
        if (this.n && l()) {
            if (afkyVar != null && (this.i != afkyVar.e() || this.j != afkyVar.c())) {
                j();
            }
            g();
        }
        this.t.d(7);
        p(this.b.n);
    }

    @Override // defpackage.afkx
    public final void d() {
        this.a.l(afqu.ANDROID_EXOPLAYER_V2);
        if (this.o != null && this.o.isValid() && this.p != null) {
            this.k = 0;
            this.l = 0;
            this.p.reparent(this.o, null).setBufferSize(this.o, 0, 0).setVisibility(this.o, false).apply();
        }
        this.t.c(7, 13);
        aezf aezfVar = this.b.n;
        p(aezfVar);
        if (aezfVar == null || !aezfVar.a().aS()) {
            return;
        }
        q(aezfVar, "surfaceunavailable", null);
    }

    @Override // defpackage.afkx
    public final void e() {
        this.a.m(afqu.ANDROID_EXOPLAYER_V2);
        this.d.ar();
    }

    public final aflb f(afky afkyVar, aezf aezfVar) {
        afhs afhsVar = this.b.s;
        return aear.n(aezfVar.b(), afkyVar, aezfVar.a(), afhsVar, aezfVar.n.c, aezfVar.a().g, afhsVar.l || this.s, aezfVar.q && !aezfVar.p);
    }

    public final void g() {
        int i;
        int i2;
        afky afkyVar = this.b.m;
        SurfaceControl surfaceControl = this.o;
        if (surfaceControl == null || !surfaceControl.isValid() || this.p == null) {
            return;
        }
        SurfaceControl surfaceControl2 = null;
        SurfaceControl f = afkyVar != null ? afkyVar.f() : null;
        if (f == null || !f.isValid() || (i = this.i) == 0 || (i2 = this.j) == 0) {
            this.k = 0;
            this.l = 0;
        } else {
            this.k = i;
            this.l = i2;
            surfaceControl2 = f;
        }
        this.p.reparent(surfaceControl, surfaceControl2).setBufferSize(surfaceControl, this.k, this.l).setVisibility(surfaceControl, surfaceControl2 != null).apply();
    }

    public final void h() {
        i();
        this.r = null;
    }

    public final void i() {
        boolean z = false;
        if (Build.VERSION.SDK_INT >= 29 && this.b.s.o().I) {
            z = true;
        }
        this.n = z;
        Future future = this.v;
        if (future != null && !future.isDone()) {
            this.v.cancel(true);
            this.v = null;
        }
        if (this.o != null) {
            this.o.release();
        }
        if (this.q != null) {
            this.q.release();
        }
        if (this.p != null) {
            this.p.close();
        }
        this.o = null;
        this.p = null;
        this.q = null;
        if (this.n) {
            this.v = this.w.submit(new Runnable() { // from class: aevj
                @Override // java.lang.Runnable
                public final void run() {
                    aevl aevlVar = aevl.this;
                    aevlVar.p = new SurfaceControl.Transaction();
                    aevlVar.o = new SurfaceControl.Builder().setName("MEDIALIB_SURFACE_CONTROL").setBufferSize(0, 0).build();
                    aevlVar.q = new Surface(aevlVar.o);
                }
            });
        }
    }

    public final void j() {
        afky afkyVar = this.b.m;
        if (afkyVar == null || !afkyVar.E()) {
            return;
        }
        afkyVar.v(this.i, this.j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void k(boolean z) {
        afky afkyVar = this.b.m;
        if (afkyVar != null) {
            if (z) {
                afkyVar.g(1);
                afid.d(afic.MLPLAYER, "Stayawake ON");
            } else {
                afkyVar.rE(1);
                afid.d(afic.MLPLAYER, "Stayawake OFF");
            }
        }
    }

    public final boolean l() {
        afky afkyVar = this.b.m;
        return afkyVar != null && afkyVar.C().equals(aflb.SURFACE);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean m() {
        aezf aezfVar = this.b.n;
        try {
            t(null);
            return true;
        } catch (InterruptedException e) {
            q(aezfVar, "player.fatalexception", e);
            return false;
        } catch (TimeoutException e2) {
            this.r = null;
            q(aezfVar, "player.exception", e2);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean n(aezf aezfVar) {
        if (aezfVar == null) {
            return false;
        }
        aetw aetwVar = this.b;
        afhs afhsVar = aetwVar.s;
        afdt afdtVar = aetwVar.c;
        boolean z = afhsVar.l || (afdtVar.b && !afdtVar.c);
        boolean z2 = this.s != z;
        this.s = z;
        return z2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean o(afky afkyVar, aezf aezfVar, boolean z) {
        afky afkyVar2 = this.b.m;
        if (afkyVar2 != afkyVar) {
            if (afkyVar2 != null) {
                if (!this.b.s.p().aA) {
                    k(false);
                }
                afkyVar2.k();
                afkyVar2.s(null);
                this.a.f(null, afqu.ANDROID_EXOPLAYER_V2);
            }
            boolean z2 = afkyVar2 == null;
            boolean z3 = afkyVar == null;
            this.b.m = afkyVar;
            if (z2 ^ z3) {
                this.c.b(aezfVar);
            }
        }
        if (afkyVar != null) {
            afhs afhsVar = this.b.s;
            afkyVar.s(this);
            this.a.f(this, afqu.ANDROID_EXOPLAYER_V2);
            if (aezfVar != null) {
                afdf afdfVar = this.a;
                aeru aeruVar = aezfVar.b;
                if (afdfVar.a && afdfVar.c == null) {
                    afdfVar.o(afde.UNEXPECTED_NULL_MEDIA_VIEW_LISTENER, afqu.ANDROID_EXOPLAYER_V2);
                    afdfVar.a(aeruVar);
                }
                if (!aezfVar.p) {
                    this.b.c.c();
                    this.b.c.e(aezfVar.c(), aezfVar.a());
                }
                n(aezfVar);
                aflb f = f(afkyVar, aezfVar);
                this.a.g(f, afqu.ANDROID_EXOPLAYER_V2);
                this.b.c.f(aezfVar.a(), aezfVar.b());
                awaz awazVar = aezfVar.a().c.v;
                if (awazVar == null) {
                    awazVar = awaz.a;
                }
                afkyVar.w(awazVar.n);
                afkyVar.t(f);
                if (afkyVar2 != afkyVar) {
                    g();
                }
                View h = afkyVar.h();
                if (afkyVar.C().equals(aflb.GL_GVR) && h != null) {
                    ((afko) h).F(aezfVar.n.c == 4 ? 2 : 1);
                }
                k(z && aezfVar.c.b != 4);
            }
            j();
        }
        return p(aezfVar).booleanValue();
    }
}
