package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ayuc extends AtomicInteger implements aypq, ayqx {
    private static final long serialVersionUID = 9032184911934499404L;
    final aypi a;
    int f;
    int g;
    aytf h;
    banx i;
    volatile boolean j;
    volatile boolean k;
    final int b = 2;
    final ayub d = new ayub(this);
    final AtomicBoolean e = new AtomicBoolean();
    final int c = 2;

    public ayuc(aypi aypiVar) {
        this.a = aypiVar;
    }

    @Override // defpackage.banw
    public final void b(Throwable th) {
        if (this.e.compareAndSet(false, true)) {
            ayrz.c(this.d);
            this.a.b(th);
        } else {
            aynu.j(th);
        }
    }

    @Override // defpackage.banw
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        aypk aypkVar = (aypk) obj;
        if (this.f != 0 || this.h.k(aypkVar)) {
            d();
        } else {
            b(new ayrg());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x002f, code lost:
    
        if (r1 != null) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d() {
        /*
            r4 = this;
            int r0 = r4.getAndIncrement()
            if (r0 != 0) goto L5d
        L6:
            boolean r0 = r4.e()
            if (r0 == 0) goto Ld
            return
        Ld:
            boolean r0 = r4.k
            if (r0 != 0) goto L57
            boolean r0 = r4.j
            aytf r1 = r4.h     // Catch: java.lang.Throwable -> L4f
            java.lang.Object r1 = r1.sg()     // Catch: java.lang.Throwable -> L4f
            aypk r1 = (defpackage.aypk) r1     // Catch: java.lang.Throwable -> L4f
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L2f
            if (r1 != 0) goto L31
            java.util.concurrent.atomic.AtomicBoolean r0 = r4.e
            boolean r0 = r0.compareAndSet(r2, r3)
            if (r0 == 0) goto L2e
            aypi r0 = r4.a
            r0.sh()
        L2e:
            return
        L2f:
            if (r1 == 0) goto L57
        L31:
            r4.k = r3
            ayub r0 = r4.d
            r1.U(r0)
            int r0 = r4.f
            if (r0 == r3) goto L57
            int r0 = r4.g
            int r0 = r0 + r3
            int r1 = r4.c
            if (r0 != r1) goto L4c
            r4.g = r2
            banx r1 = r4.i
            long r2 = (long) r0
            r1.sj(r2)
            goto L57
        L4c:
            r4.g = r0
            goto L57
        L4f:
            r0 = move-exception
            defpackage.aynu.c(r0)
            r4.g(r0)
            return
        L57:
            int r0 = r4.decrementAndGet()
            if (r0 != 0) goto L6
        L5d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ayuc.d():void");
    }

    @Override // defpackage.ayqx
    public final boolean e() {
        return ayrz.d((ayqx) this.d.get());
    }

    @Override // defpackage.aypq, defpackage.banw
    public final void f(banx banxVar) {
        if (azqb.i(this.i, banxVar)) {
            this.i = banxVar;
            long j = this.b;
            if (banxVar instanceof aytc) {
                aytc aytcVar = (aytc) banxVar;
                int sf = aytcVar.sf(3);
                if (sf == 1) {
                    this.f = 1;
                    this.h = aytcVar;
                    this.j = true;
                    this.a.se(this);
                    d();
                    return;
                }
                if (sf == 2) {
                    this.f = 2;
                    this.h = aytcVar;
                    this.a.se(this);
                    banxVar.sj(j);
                    return;
                }
            }
            this.h = new azog(this.b);
            this.a.se(this);
            banxVar.sj(j);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void g(Throwable th) {
        if (this.e.compareAndSet(false, true)) {
            this.i.sd();
            this.a.b(th);
        } else {
            aynu.j(th);
        }
    }

    @Override // defpackage.ayqx
    public final void qc() {
        this.i.sd();
        ayrz.c(this.d);
    }

    @Override // defpackage.banw
    public final void sh() {
        this.j = true;
        d();
    }
}
