package defpackage;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ayxx extends azpv implements aypq {
    private static final long serialVersionUID = -3096000382929934955L;
    final banw a;
    final ayrv b;
    final int c;
    final int d;
    banx f;
    aytf g;
    volatile boolean h;
    volatile boolean i;
    Iterator k;
    int l;
    int m;
    final AtomicReference j = new AtomicReference();
    final AtomicLong e = new AtomicLong();

    public ayxx(banw banwVar, ayrv ayrvVar, int i) {
        this.a = banwVar;
        this.b = ayrvVar;
        this.c = i;
        this.d = i - (i >> 2);
    }

    @Override // defpackage.banw
    public final void b(Throwable th) {
        if (this.h || !azqi.e(this.j, th)) {
            aynu.j(th);
        } else {
            this.h = true;
            h();
        }
    }

    @Override // defpackage.banw
    public final void c(Object obj) {
        if (this.h) {
            return;
        }
        if (this.m != 0 || this.g.k(obj)) {
            h();
        } else {
            b(new ayrg("Queue is full?!"));
        }
    }

    @Override // defpackage.aytf
    public final void d() {
        this.k = null;
        this.g.d();
    }

    @Override // defpackage.aypq, defpackage.banw
    public final void f(banx banxVar) {
        if (azqb.i(this.f, banxVar)) {
            this.f = banxVar;
            if (banxVar instanceof aytc) {
                aytc aytcVar = (aytc) banxVar;
                int sf = aytcVar.sf(3);
                if (sf == 1) {
                    this.m = 1;
                    this.g = aytcVar;
                    this.h = true;
                    this.a.f(this);
                    return;
                }
                if (sf == 2) {
                    this.m = 2;
                    this.g = aytcVar;
                    this.a.f(this);
                    banxVar.sj(this.c);
                    return;
                }
            }
            this.g = new azog(this.c);
            this.a.f(this);
            banxVar.sj(this.c);
        }
    }

    final void g(boolean z) {
        if (z) {
            int i = this.l + 1;
            if (i != this.d) {
                this.l = i;
            } else {
                this.l = 0;
                this.f.sj(i);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00f5, code lost:
    
        if (r13 != r9) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00f7, code lost:
    
        r4 = r18.h;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00fd, code lost:
    
        if (r3.j() == false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ff, code lost:
    
        if (r6 != null) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0101, code lost:
    
        r15 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0108, code lost:
    
        if (i(r4, r15, r2, r3) != false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x010b, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0103, code lost:
    
        r15 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x010e, code lost:
    
        if (r13 == 0) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0117, code lost:
    
        if (r9 == Long.MAX_VALUE) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0119, code lost:
    
        r18.e.addAndGet(-r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x011f, code lost:
    
        if (r6 == null) goto L72;
     */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.Object, java.lang.Iterable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final void h() {
        /*
            Method dump skipped, instructions count: 300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ayxx.h():void");
    }

    final boolean i(boolean z, boolean z2, banw banwVar, aytf aytfVar) {
        if (this.i) {
            this.k = null;
            aytfVar.d();
            return true;
        }
        if (!z) {
            return false;
        }
        if (((Throwable) this.j.get()) == null) {
            if (!z2) {
                return false;
            }
            banwVar.sh();
            return true;
        }
        Throwable d = azqi.d(this.j);
        this.k = null;
        aytfVar.d();
        banwVar.b(d);
        return true;
    }

    @Override // defpackage.aytf
    public final boolean j() {
        return this.k == null && this.g.j();
    }

    @Override // defpackage.banx
    public final void sd() {
        if (this.i) {
            return;
        }
        this.i = true;
        this.f.sd();
        if (getAndIncrement() == 0) {
            this.g.d();
        }
    }

    @Override // defpackage.aytb
    public final int sf(int i) {
        return ((i & 1) == 0 || this.m != 1) ? 0 : 1;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, java.lang.Iterable] */
    @Override // defpackage.aytf
    public final Object sg() {
        Iterator it = this.k;
        while (true) {
            if (it == null) {
                Object sg = this.g.sg();
                if (sg != null) {
                    it = this.b.a(sg).iterator();
                    if (it.hasNext()) {
                        this.k = it;
                        break;
                    }
                    it = null;
                } else {
                    return null;
                }
            } else {
                break;
            }
        }
        Object next = it.next();
        aysw.b(next, "The iterator returned a null value");
        if (!it.hasNext()) {
            this.k = null;
        }
        return next;
    }

    @Override // defpackage.banw
    public final void sh() {
        if (this.h) {
            return;
        }
        this.h = true;
        h();
    }

    @Override // defpackage.banx
    public final void sj(long j) {
        if (azqb.h(j)) {
            ayeq.j(this.e, j);
            h();
        }
    }
}
