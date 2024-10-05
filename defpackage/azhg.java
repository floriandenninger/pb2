package defpackage;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azhg extends AtomicInteger implements ayqx, ayqd {
    static final azhf[] a = new azhf[0];
    static final azhf[] b = new azhf[0];
    private static final long serialVersionUID = -2117620485640801370L;
    final ayqd c;
    final ayrv d;
    final int f;
    final int g;
    volatile ayte h;
    volatile boolean i;
    volatile boolean k;
    final AtomicReference l;
    ayqx m;
    long n;
    long o;
    int p;
    Queue q;
    int r;
    final azqf j = new azqf();
    final boolean e = false;

    public azhg(ayqd ayqdVar, ayrv ayrvVar, int i, int i2) {
        this.c = ayqdVar;
        this.d = ayrvVar;
        this.f = i;
        this.g = i2;
        if (i != Integer.MAX_VALUE) {
            this.q = new ArrayDeque(i);
        }
        this.l = new AtomicReference(a);
    }

    @Override // defpackage.ayqd
    public final void b(Throwable th) {
        if (this.i) {
            aynu.j(th);
        } else if (azqi.e(this.j, th)) {
            this.i = true;
            f();
        } else {
            aynu.j(th);
        }
    }

    @Override // defpackage.ayqd
    public final void c(Object obj) {
        if (this.i) {
            return;
        }
        try {
            ayqb ayqbVar = (ayqb) this.d.a(obj);
            aysw.b(ayqbVar, "The mapper returned a null ObservableSource");
            if (this.f != Integer.MAX_VALUE) {
                synchronized (this) {
                    int i = this.r;
                    if (i == this.f) {
                        this.q.offer(ayqbVar);
                        return;
                    }
                    this.r = i + 1;
                }
            }
            i(ayqbVar);
        } catch (Throwable th) {
            aynu.c(th);
            this.m.qc();
            b(th);
        }
    }

    @Override // defpackage.ayqx
    public final boolean e() {
        return this.k;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void f() {
        if (getAndIncrement() == 0) {
            g();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0003, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00a2, code lost:
    
        if (r10 != null) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00d2, code lost:
    
        r10 = r9.c;
        r11 = r9.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00d6, code lost:
    
        if (r10 == false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00d8, code lost:
    
        if (r11 == null) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00de, code lost:
    
        if (r11.j() == false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00e0, code lost:
    
        h(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00e7, code lost:
    
        if (j() == false) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00ea, code lost:
    
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00e9, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00ec, code lost:
    
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00ee, code lost:
    
        if (r6 != r5) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00f0, code lost:
    
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00f1, code lost:
    
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00a4, code lost:
    
        r11 = r10.sg();
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00a8, code lost:
    
        if (r11 != null) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00ab, code lost:
    
        r0.c(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00b2, code lost:
    
        if (j() == false) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00b4, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00b5, code lost:
    
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00b6, code lost:
    
        defpackage.aynu.c(r10);
        defpackage.ayrz.c(r9);
        defpackage.azqi.e(r13.j, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00c5, code lost:
    
        if (j() != false) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00c8, code lost:
    
        h(r9);
        r3 = r3 + 1;
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00cf, code lost:
    
        if (r6 != r5) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x00c7, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g() {
        /*
            Method dump skipped, instructions count: 299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.azhg.g():void");
    }

    final void h(azhf azhfVar) {
        azhf[] azhfVarArr;
        azhf[] azhfVarArr2;
        do {
            azhfVarArr = (azhf[]) this.l.get();
            int length = azhfVarArr.length;
            if (length == 0) {
                return;
            }
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (azhfVarArr[i] == azhfVar) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                azhfVarArr2 = a;
            } else {
                azhf[] azhfVarArr3 = new azhf[length - 1];
                System.arraycopy(azhfVarArr, 0, azhfVarArr3, 0, i);
                System.arraycopy(azhfVarArr, i + 1, azhfVarArr3, i, (length - i) - 1);
                azhfVarArr2 = azhfVarArr3;
            }
        } while (!this.l.compareAndSet(azhfVarArr, azhfVarArr2));
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0027, code lost:
    
        if (decrementAndGet() != 0) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final void i(defpackage.ayqb r7) {
        /*
            r6 = this;
        L0:
            boolean r0 = r7 instanceof java.util.concurrent.Callable
            r1 = 0
            if (r0 == 0) goto L8d
            java.util.concurrent.Callable r7 = (java.util.concurrent.Callable) r7
            r0 = 2147483647(0x7fffffff, float:NaN)
            r2 = 1
            java.lang.Object r7 = r7.call()     // Catch: java.lang.Throwable -> L5e
            if (r7 != 0) goto L12
            goto L6a
        L12:
            int r3 = r6.get()
            if (r3 != 0) goto L2a
            boolean r3 = r6.compareAndSet(r1, r2)
            if (r3 == 0) goto L2a
            ayqd r3 = r6.c
            r3.c(r7)
            int r7 = r6.decrementAndGet()
            if (r7 == 0) goto L6a
            goto L5a
        L2a:
            ayte r3 = r6.h
            if (r3 != 0) goto L42
            int r3 = r6.f
            if (r3 != r0) goto L3a
            azoh r3 = new azoh
            int r4 = r6.g
            r3.<init>(r4)
            goto L40
        L3a:
            azog r4 = new azog
            r4.<init>(r3)
            r3 = r4
        L40:
            r6.h = r3
        L42:
            boolean r7 = r3.k(r7)
            if (r7 != 0) goto L53
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r3 = "Scalar queue full?!"
            r7.<init>(r3)
            r6.b(r7)
            goto L6a
        L53:
            int r7 = r6.getAndIncrement()
            if (r7 == 0) goto L5a
            goto L8c
        L5a:
            r6.g()
            goto L6a
        L5e:
            r7 = move-exception
            defpackage.aynu.c(r7)
            azqf r3 = r6.j
            defpackage.azqi.e(r3, r7)
            r6.f()
        L6a:
            int r7 = r6.f
            if (r7 == r0) goto L8c
            monitor-enter(r6)
            java.util.Queue r7 = r6.q     // Catch: java.lang.Throwable -> L89
            java.lang.Object r7 = r7.poll()     // Catch: java.lang.Throwable -> L89
            ayqb r7 = (defpackage.ayqb) r7     // Catch: java.lang.Throwable -> L89
            if (r7 != 0) goto L80
            int r0 = r6.r     // Catch: java.lang.Throwable -> L89
            int r0 = r0 + (-1)
            r6.r = r0     // Catch: java.lang.Throwable -> L89
            r1 = 1
        L80:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L89
            if (r1 != 0) goto L85
            goto L0
        L85:
            r6.f()
            return
        L89:
            r7 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L89
            throw r7
        L8c:
            return
        L8d:
            azhf r0 = new azhf
            long r2 = r6.n
            r4 = 1
            long r4 = r4 + r2
            r6.n = r4
            r0.<init>(r6, r2)
        L99:
            java.util.concurrent.atomic.AtomicReference r2 = r6.l
            java.lang.Object r2 = r2.get()
            azhf[] r2 = (defpackage.azhf[]) r2
            azhf[] r3 = defpackage.azhg.b
            if (r2 != r3) goto La9
            defpackage.ayrz.c(r0)
            return
        La9:
            int r3 = r2.length
            int r4 = r3 + 1
            azhf[] r4 = new defpackage.azhf[r4]
            java.lang.System.arraycopy(r2, r1, r4, r1, r3)
            r4[r3] = r0
            java.util.concurrent.atomic.AtomicReference r3 = r6.l
            boolean r2 = r3.compareAndSet(r2, r4)
            if (r2 == 0) goto L99
            r7.aE(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.azhg.i(ayqb):void");
    }

    final boolean j() {
        if (this.k) {
            return true;
        }
        if (((Throwable) this.j.get()) == null) {
            return false;
        }
        k();
        Throwable d = azqi.d(this.j);
        if (d != azqi.a) {
            this.c.b(d);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean k() {
        azhf[] azhfVarArr;
        this.m.qc();
        azhf[] azhfVarArr2 = (azhf[]) this.l.get();
        azhf[] azhfVarArr3 = b;
        if (azhfVarArr2 == azhfVarArr3 || (azhfVarArr = (azhf[]) this.l.getAndSet(azhfVarArr3)) == azhfVarArr3) {
            return false;
        }
        for (azhf azhfVar : azhfVarArr) {
            ayrz.c(azhfVar);
        }
        return true;
    }

    @Override // defpackage.ayqx
    public final void qc() {
        Throwable d;
        if (this.k) {
            return;
        }
        this.k = true;
        if (!k() || (d = azqi.d(this.j)) == null || d == azqi.a) {
            return;
        }
        aynu.j(d);
    }

    @Override // defpackage.ayqd
    public final void se(ayqx ayqxVar) {
        if (ayrz.h(this.m, ayqxVar)) {
            this.m = ayqxVar;
            this.c.se(this);
        }
    }

    @Override // defpackage.ayqd
    public final void sh() {
        if (this.i) {
            return;
        }
        this.i = true;
        f();
    }
}
