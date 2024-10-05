package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aziu extends ayth implements Runnable, ayqd {
    private static final long serialVersionUID = 6576896619930983584L;
    final ayqd a;
    final ayqh b;
    final int c;
    aytf d;
    ayqx e;
    Throwable f;
    volatile boolean g;
    volatile boolean h;
    int i;
    boolean j;

    public aziu(ayqd ayqdVar, ayqh ayqhVar, int i) {
        this.a = ayqdVar;
        this.b = ayqhVar;
        this.c = i;
    }

    @Override // defpackage.ayqd
    public final void b(Throwable th) {
        if (this.g) {
            aynu.j(th);
            return;
        }
        this.f = th;
        this.g = true;
        f();
    }

    @Override // defpackage.ayqd
    public final void c(Object obj) {
        if (this.g) {
            return;
        }
        if (this.i != 2) {
            this.d.k(obj);
        }
        f();
    }

    @Override // defpackage.aytf
    public final void d() {
        this.d.d();
    }

    @Override // defpackage.ayqx
    public final boolean e() {
        return this.h;
    }

    final void f() {
        if (getAndIncrement() == 0) {
            this.b.a(this);
        }
    }

    final boolean g(boolean z, boolean z2, ayqd ayqdVar) {
        if (this.h) {
            this.d.d();
            return true;
        }
        if (!z) {
            return false;
        }
        Throwable th = this.f;
        if (th != null) {
            this.h = true;
            this.d.d();
            ayqdVar.b(th);
            this.b.qc();
            return true;
        }
        if (!z2) {
            return false;
        }
        this.h = true;
        ayqdVar.sh();
        this.b.qc();
        return true;
    }

    @Override // defpackage.aytf
    public final boolean j() {
        return this.d.j();
    }

    @Override // defpackage.ayqx
    public final void qc() {
        if (this.h) {
            return;
        }
        this.h = true;
        this.e.qc();
        this.b.qc();
        if (getAndIncrement() == 0) {
            this.d.d();
        }
    }

    @Override // defpackage.ayqd
    public final void se(ayqx ayqxVar) {
        if (ayrz.h(this.e, ayqxVar)) {
            this.e = ayqxVar;
            if (ayqxVar instanceof ayta) {
                ayta aytaVar = (ayta) ayqxVar;
                int sf = aytaVar.sf(7);
                if (sf == 1) {
                    this.i = 1;
                    this.d = aytaVar;
                    this.g = true;
                    this.a.se(this);
                    f();
                    return;
                }
                if (sf == 2) {
                    this.i = 2;
                    this.d = aytaVar;
                    this.a.se(this);
                    return;
                }
            }
            this.d = new azoh(this.c);
            this.a.se(this);
        }
    }

    @Override // defpackage.aytb
    public final int sf(int i) {
        if ((i & 2) == 0) {
            return 0;
        }
        this.j = true;
        return 2;
    }

    @Override // defpackage.aytf
    public final Object sg() {
        return this.d.sg();
    }

    @Override // defpackage.ayqd
    public final void sh() {
        if (this.g) {
            return;
        }
        this.g = true;
        f();
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x006f, code lost:
    
        r3 = addAndGet(-r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0074, code lost:
    
        if (r3 != 0) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:?, code lost:
    
        return;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r7 = this;
            boolean r0 = r7.j
            r1 = 1
            if (r0 == 0) goto L4b
            r0 = 1
        L6:
            boolean r2 = r7.h
            if (r2 == 0) goto Lc
            goto L91
        Lc:
            boolean r2 = r7.g
            java.lang.Throwable r3 = r7.f
            if (r2 == 0) goto L24
            if (r3 != 0) goto L15
            goto L24
        L15:
            r7.h = r1
            ayqd r0 = r7.a
            java.lang.Throwable r1 = r7.f
            r0.b(r1)
            ayqh r0 = r7.b
            r0.qc()
            return
        L24:
            ayqd r3 = r7.a
            r4 = 0
            r3.c(r4)
            if (r2 == 0) goto L43
            r7.h = r1
            java.lang.Throwable r0 = r7.f
            if (r0 == 0) goto L38
            ayqd r1 = r7.a
            r1.b(r0)
            goto L3d
        L38:
            ayqd r0 = r7.a
            r0.sh()
        L3d:
            ayqh r0 = r7.b
            r0.qc()
            return
        L43:
            int r0 = -r0
            int r0 = r7.addAndGet(r0)
            if (r0 != 0) goto L6
            goto L91
        L4b:
            aytf r0 = r7.d
            ayqd r2 = r7.a
            r3 = 1
        L50:
            boolean r4 = r7.g
            boolean r5 = r0.j()
            boolean r4 = r7.g(r4, r5, r2)
            if (r4 != 0) goto L91
        L5c:
            boolean r4 = r7.g
            java.lang.Object r5 = r0.sg()     // Catch: java.lang.Throwable -> L7b
            if (r5 != 0) goto L66
            r6 = 1
            goto L67
        L66:
            r6 = 0
        L67:
            boolean r4 = r7.g(r4, r6, r2)
            if (r4 != 0) goto L91
            if (r6 == 0) goto L77
            int r3 = -r3
            int r3 = r7.addAndGet(r3)
            if (r3 != 0) goto L50
            goto L91
        L77:
            r2.c(r5)
            goto L5c
        L7b:
            r3 = move-exception
            defpackage.aynu.c(r3)
            r7.h = r1
            ayqx r1 = r7.e
            r1.qc()
            r0.d()
            r2.b(r3)
            ayqh r0 = r7.b
            r0.qc()
        L91:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aziu.run():void");
    }
}
