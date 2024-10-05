package defpackage;

import android.os.Handler;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class aevy extends bbc implements Handler.Callback, aewk {
    public aeru d;
    public aevw e;
    public aevw g;
    public final boolean h;
    private int l;
    private final Handler m;
    private bbr n;
    private Handler o;
    private final Callable p;
    private final Callable q;
    private final afhs r;
    private final List i = new ArrayList();
    private final IdentityHashMap j = new IdentityHashMap(2);
    private final AtomicInteger k = new AtomicInteger();
    public final HashSet f = new HashSet();

    public aevy(bbr bbrVar, aeru aeruVar, Handler handler, afhs afhsVar) {
        this.d = aeru.c;
        final int i = 1;
        this.p = new Callable(this) { // from class: aevt
            public final /* synthetic */ aevy a;

            {
                this.a = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                if (i != 0) {
                    aevy aevyVar = this.a;
                    if (aevyVar.g == null) {
                        return false;
                    }
                    aevyVar.e.c(-1L);
                    aevw aevwVar = aevyVar.g;
                    if (aevwVar.c == null) {
                        if (!aevyVar.h || aevyVar.f.contains(aevwVar)) {
                            aevyVar.y(aevyVar.g);
                        } else {
                            aevyVar.d.g(new afih("player.exception", aevyVar.e.b, "c.clearNextMediaSource"));
                        }
                        aevyVar.f.remove(aevyVar.g);
                    } else {
                        aevwVar.d = true;
                    }
                    aevyVar.g = null;
                    return true;
                }
                aevy aevyVar2 = this.a;
                if (aevyVar2.g == null) {
                    return false;
                }
                aevw aevwVar2 = aevyVar2.e;
                if (aevwVar2.c == null) {
                    if (!aevyVar2.h || aevyVar2.f.contains(aevwVar2)) {
                        aevyVar2.y(aevyVar2.e);
                    } else {
                        aevyVar2.d.g(new afih("player.exception", aevyVar2.e.f, "c.doPostTransitionCleanup"));
                    }
                    aevyVar2.f.remove(aevyVar2.e);
                } else {
                    aevwVar2.d = true;
                }
                aevyVar2.e = aevyVar2.g;
                aevyVar2.g = null;
                aevyVar2.e.b(0L);
                return true;
            }
        };
        final int i2 = 0;
        this.q = new Callable(this) { // from class: aevt
            public final /* synthetic */ aevy a;

            {
                this.a = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                if (i2 != 0) {
                    aevy aevyVar = this.a;
                    if (aevyVar.g == null) {
                        return false;
                    }
                    aevyVar.e.c(-1L);
                    aevw aevwVar = aevyVar.g;
                    if (aevwVar.c == null) {
                        if (!aevyVar.h || aevyVar.f.contains(aevwVar)) {
                            aevyVar.y(aevyVar.g);
                        } else {
                            aevyVar.d.g(new afih("player.exception", aevyVar.e.b, "c.clearNextMediaSource"));
                        }
                        aevyVar.f.remove(aevyVar.g);
                    } else {
                        aevwVar.d = true;
                    }
                    aevyVar.g = null;
                    return true;
                }
                aevy aevyVar2 = this.a;
                if (aevyVar2.g == null) {
                    return false;
                }
                aevw aevwVar2 = aevyVar2.e;
                if (aevwVar2.c == null) {
                    if (!aevyVar2.h || aevyVar2.f.contains(aevwVar2)) {
                        aevyVar2.y(aevyVar2.e);
                    } else {
                        aevyVar2.d.g(new afih("player.exception", aevyVar2.e.f, "c.doPostTransitionCleanup"));
                    }
                    aevyVar2.f.remove(aevyVar2.e);
                } else {
                    aevwVar2.d = true;
                }
                aevyVar2.e = aevyVar2.g;
                aevyVar2.g = null;
                aevyVar2.e.b(0L);
                return true;
            }
        };
        this.e = new aevw(bbrVar);
        this.d = aeruVar;
        this.m = handler;
        this.r = afhsVar;
        this.h = afhsVar.v();
    }

    private final void E() {
        int i = this.k.get();
        int i2 = this.l;
        if (i > i2) {
            return;
        }
        rw(new aevv(this.e, this.g, this.k, i2));
    }

    @Override // defpackage.aewk
    public final long A(long j) {
        bbr bbrVar = this.e.a;
        if (bbrVar instanceof aewk) {
            return ((aewk) bbrVar).A(j);
        }
        return -1L;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void B() {
        if (this.n != null) {
            this.i.add(this.p);
            this.n = null;
            this.k.incrementAndGet();
            Handler handler = this.o;
            if (handler != null) {
                handler.obtainMessage(1).sendToTarget();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void C() {
        if (this.n != null) {
            this.i.add(this.q);
            this.n = null;
            this.k.incrementAndGet();
            Handler handler = this.o;
            if (handler != null) {
                handler.obtainMessage(1).sendToTarget();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void D(bbr bbrVar, long j, long j2) {
        if (this.n != bbrVar) {
            this.i.add(new aevx(this, bbrVar, j, j2, this.r));
            this.n = bbrVar;
            this.k.incrementAndGet();
            Handler handler = this.o;
            if (handler != null) {
                handler.obtainMessage(1).sendToTarget();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005b  */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean handleMessage(android.os.Message r6) {
        /*
            r5 = this;
            int r0 = r6.what
            r1 = 0
            r2 = 1
            if (r0 != r2) goto L62
            monitor-enter(r5)
            java.util.List r6 = r5.i     // Catch: java.lang.Throwable -> L5f
            boolean r6 = r6.isEmpty()     // Catch: java.lang.Throwable -> L5f
            if (r6 == 0) goto L11
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L5f
            return r2
        L11:
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L5f
            java.util.List r0 = r5.i     // Catch: java.lang.Throwable -> L5f
            r6.<init>(r0)     // Catch: java.lang.Throwable -> L5f
            java.util.List r0 = r5.i     // Catch: java.lang.Throwable -> L5f
            r0.clear()     // Catch: java.lang.Throwable -> L5f
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L5f
            java.util.Iterator r6 = r6.iterator()     // Catch: java.lang.Exception -> L42
            r0 = 0
        L23:
            boolean r3 = r6.hasNext()     // Catch: java.lang.Exception -> L40
            if (r3 == 0) goto L59
            java.lang.Object r3 = r6.next()     // Catch: java.lang.Exception -> L40
            java.util.concurrent.Callable r3 = (java.util.concurrent.Callable) r3     // Catch: java.lang.Exception -> L40
            int r4 = r5.l     // Catch: java.lang.Exception -> L40
            int r4 = r4 + r2
            r5.l = r4     // Catch: java.lang.Exception -> L40
            java.lang.Object r3 = r3.call()     // Catch: java.lang.Exception -> L40
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch: java.lang.Exception -> L40
            boolean r3 = r3.booleanValue()     // Catch: java.lang.Exception -> L40
            r0 = r0 | r3
            goto L23
        L40:
            r6 = move-exception
            goto L44
        L42:
            r6 = move-exception
            r0 = 0
        L44:
            afic r3 = defpackage.afic.MLPLAYER
            java.lang.Object[] r4 = new java.lang.Object[r2]
            r4[r1] = r6
            java.lang.String r1 = "Exception in MedialibMediaSource: %s"
            defpackage.afid.e(r3, r1, r4)
            android.os.Handler r1 = r5.m
            aevs r3 = new aevs
            r3.<init>()
            r1.post(r3)
        L59:
            if (r0 == 0) goto L5e
            r5.E()
        L5e:
            return r2
        L5f:
            r6 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L5f
            throw r6
        L62:
            afic r0 = defpackage.afic.MLPLAYER
            java.lang.Object[] r2 = new java.lang.Object[r2]
            int r6 = r6.what
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r2[r1] = r6
            java.lang.String r6 = "Unrecognized MedialibMediaSource message: %s"
            defpackage.afid.e(r0, r6, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aevy.handleMessage(android.os.Message):boolean");
    }

    @Override // defpackage.bbc, defpackage.bar
    public final synchronized void k() {
        super.k();
        this.f.clear();
        this.o = null;
    }

    @Override // defpackage.bbr
    public final pnd r() {
        return this.e.a.r();
    }

    @Override // defpackage.bbc, defpackage.bar
    public final synchronized void rq(att attVar) {
        super.rq(attVar);
        this.o = new Handler(this);
        aevw aevwVar = this.e;
        x(aevwVar, aevwVar.a);
        if (this.r.v()) {
            this.f.add(this.e);
        }
        this.o.obtainMessage(1).sendToTarget();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.bbc
    public final /* bridge */ /* synthetic */ void t(Object obj, bbr bbrVar, pou pouVar) {
        aevw aevwVar = (aevw) obj;
        if (aevwVar.e == pouVar) {
            return;
        }
        aevwVar.e = pouVar;
        E();
    }

    @Override // defpackage.bbr
    public final void u(bbp bbpVar) {
        aevw aevwVar = (aevw) this.j.remove(bbpVar);
        afki.a(aevwVar);
        afki.a(aevwVar.c);
        aevwVar.a.u(aevwVar.c.a);
        aevwVar.c = null;
        if (aevwVar.d) {
            y(aevwVar);
            this.f.remove(aevwVar);
        }
    }

    @Override // defpackage.bbr
    public final bbp v(ash ashVar, bfg bfgVar, long j) {
        afki.d(ashVar.a instanceof aevw);
        aevw aevwVar = (aevw) ashVar.a;
        afki.d(aevwVar.c == null);
        pou pouVar = aevwVar.e;
        afki.a(pouVar);
        bav bavVar = new bav(aevwVar.a.v(ashVar.b(pouVar.i(0)), bfgVar, j), false, 0L, aevwVar.a());
        this.j.put(bavVar, aevwVar);
        aevwVar.c = bavVar;
        return bavVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.bbc
    public final /* bridge */ /* synthetic */ int w(Object obj, int i) {
        return ((aevw) obj) == this.e ? 0 : 1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.bbc
    public final /* synthetic */ ash z(Object obj, ash ashVar) {
        return ashVar.b((aevw) obj);
    }
}
