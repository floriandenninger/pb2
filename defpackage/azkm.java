package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azkm extends AtomicInteger implements ayqd, ayqx {
    static final azkl a;
    private static final long serialVersionUID = -3491074160481096299L;
    final ayqd b;
    final ayrv c;
    final int d;
    volatile boolean f;
    volatile boolean g;
    ayqx h;
    volatile long j;
    final AtomicReference i = new AtomicReference();
    final azqf e = new azqf();

    static {
        azkl azklVar = new azkl(null, -1L, 1);
        a = azklVar;
        ayrz.c(azklVar);
    }

    public azkm(ayqd ayqdVar, ayrv ayrvVar, int i) {
        this.b = ayqdVar;
        this.c = ayrvVar;
        this.d = i;
    }

    @Override // defpackage.ayqd
    public final void b(Throwable th) {
        if (this.f || !azqi.e(this.e, th)) {
            aynu.j(th);
            return;
        }
        f();
        this.f = true;
        g();
    }

    @Override // defpackage.ayqd
    public final void c(Object obj) {
        azkl azklVar;
        long j = this.j + 1;
        this.j = j;
        azkl azklVar2 = (azkl) this.i.get();
        if (azklVar2 != null) {
            ayrz.c(azklVar2);
        }
        try {
            ayqb ayqbVar = (ayqb) this.c.a(obj);
            aysw.b(ayqbVar, "The ObservableSource returned is null");
            azkl azklVar3 = new azkl(this, j, this.d);
            do {
                azklVar = (azkl) this.i.get();
                if (azklVar == a) {
                    return;
                }
            } while (!this.i.compareAndSet(azklVar, azklVar3));
            ayqbVar.aE(azklVar3);
        } catch (Throwable th) {
            aynu.c(th);
            this.h.qc();
            b(th);
        }
    }

    @Override // defpackage.ayqx
    public final boolean e() {
        return this.g;
    }

    final void f() {
        azkl azklVar;
        azkl azklVar2 = (azkl) this.i.get();
        azkl azklVar3 = a;
        if (azklVar2 == azklVar3 || (azklVar = (azkl) this.i.getAndSet(azklVar3)) == azklVar3 || azklVar == null) {
            return;
        }
        ayrz.c(azklVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x000d, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g() {
        /*
            r10 = this;
            int r0 = r10.getAndIncrement()
            if (r0 == 0) goto L7
            return
        L7:
            ayqd r0 = r10.b
            java.util.concurrent.atomic.AtomicReference r1 = r10.i
            r2 = 1
            r3 = 1
        Ld:
            boolean r4 = r10.g
            if (r4 == 0) goto L12
            return
        L12:
            boolean r4 = r10.f
            if (r4 == 0) goto L35
            java.lang.Object r4 = r1.get()
            azqf r5 = r10.e
            java.lang.Object r5 = r5.get()
            java.lang.Throwable r5 = (java.lang.Throwable) r5
            if (r5 == 0) goto L2e
            azqf r1 = r10.e
            java.lang.Throwable r1 = defpackage.azqi.d(r1)
            r0.b(r1)
            return
        L2e:
            if (r4 == 0) goto L31
            goto L35
        L31:
            r0.sh()
            return
        L35:
            java.lang.Object r4 = r1.get()
            azkl r4 = (defpackage.azkl) r4
            if (r4 == 0) goto Lb5
            aytf r5 = r4.d
            if (r5 == 0) goto Lb5
            boolean r6 = r4.e
            r7 = 0
            r8 = 0
            if (r6 == 0) goto L65
            boolean r6 = r5.j()
            azqf r9 = r10.e
            java.lang.Object r9 = r9.get()
            java.lang.Throwable r9 = (java.lang.Throwable) r9
            if (r9 == 0) goto L5f
            azqf r1 = r10.e
            java.lang.Throwable r1 = defpackage.azqi.d(r1)
            r0.b(r1)
            return
        L5f:
            if (r6 == 0) goto L65
            r1.compareAndSet(r4, r8)
            goto Ld
        L65:
            boolean r6 = r10.g
            if (r6 == 0) goto L6a
            return
        L6a:
            java.lang.Object r6 = r1.get()
            if (r4 != r6) goto Ld
            azqf r6 = r10.e
            java.lang.Object r6 = r6.get()
            java.lang.Throwable r6 = (java.lang.Throwable) r6
            if (r6 != 0) goto Lab
            boolean r6 = r4.e
            java.lang.Object r9 = r5.sg()     // Catch: java.lang.Throwable -> L81
            goto L99
        L81:
            r7 = move-exception
            defpackage.aynu.c(r7)
            azqf r9 = r10.e
            defpackage.azqi.e(r9, r7)
            r1.compareAndSet(r4, r8)
            r10.f()
            ayqx r7 = r10.h
            r7.qc()
            r10.f = r2
            r9 = r8
            r7 = 1
        L99:
            if (r6 == 0) goto La2
            if (r9 != 0) goto La7
            r1.compareAndSet(r4, r8)
            goto Ld
        La2:
            if (r9 != 0) goto La7
            if (r7 != 0) goto Ld
            goto Lb5
        La7:
            r0.c(r9)
            goto L65
        Lab:
            azqf r1 = r10.e
            java.lang.Throwable r1 = defpackage.azqi.d(r1)
            r0.b(r1)
            return
        Lb5:
            int r3 = -r3
            int r3 = r10.addAndGet(r3)
            if (r3 != 0) goto Ld
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.azkm.g():void");
    }

    @Override // defpackage.ayqx
    public final void qc() {
        if (this.g) {
            return;
        }
        this.g = true;
        this.h.qc();
        f();
    }

    @Override // defpackage.ayqd
    public final void se(ayqx ayqxVar) {
        if (ayrz.h(this.h, ayqxVar)) {
            this.h = ayqxVar;
            this.b.se(this);
        }
    }

    @Override // defpackage.ayqd
    public final void sh() {
        if (this.f) {
            return;
        }
        this.f = true;
        g();
    }
}
