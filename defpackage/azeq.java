package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azeq extends AtomicInteger implements aypq, banx {
    static final azep a = new azep(null);
    private static final long serialVersionUID = -5402190102429853762L;
    final banw b;
    final ayrv c;
    final azqf d = new azqf();
    final AtomicLong e = new AtomicLong();
    final AtomicReference f = new AtomicReference();
    banx g;
    volatile boolean h;
    volatile boolean i;
    long j;

    public azeq(banw banwVar, ayrv ayrvVar) {
        this.b = banwVar;
        this.c = ayrvVar;
    }

    @Override // defpackage.banw
    public final void b(Throwable th) {
        if (azqi.e(this.d, th)) {
            d();
            this.h = true;
            g();
            return;
        }
        aynu.j(th);
    }

    @Override // defpackage.banw
    public final void c(Object obj) {
        azep azepVar;
        azep azepVar2 = (azep) this.f.get();
        if (azepVar2 != null) {
            ayrz.c(azepVar2);
        }
        try {
            ayqm ayqmVar = (ayqm) this.c.a(obj);
            aysw.b(ayqmVar, "The mapper returned a null SingleSource");
            azep azepVar3 = new azep(this);
            do {
                azepVar = (azep) this.f.get();
                if (azepVar == a) {
                    return;
                }
            } while (!this.f.compareAndSet(azepVar, azepVar3));
            ayqmVar.Z(azepVar3);
        } catch (Throwable th) {
            aynu.c(th);
            this.g.sd();
            this.f.getAndSet(a);
            b(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d() {
        AtomicReference atomicReference = this.f;
        azep azepVar = a;
        azep azepVar2 = (azep) atomicReference.getAndSet(azepVar);
        if (azepVar2 == null || azepVar2 == azepVar) {
            return;
        }
        ayrz.c(azepVar2);
    }

    @Override // defpackage.aypq, defpackage.banw
    public final void f(banx banxVar) {
        if (azqb.i(this.g, banxVar)) {
            this.g = banxVar;
            this.b.f(this);
            banxVar.sj(Long.MAX_VALUE);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0064 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0012 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g() {
        /*
            r11 = this;
            int r0 = r11.getAndIncrement()
            if (r0 == 0) goto L7
            return
        L7:
            banw r0 = r11.b
            azqf r1 = r11.d
            java.util.concurrent.atomic.AtomicReference r2 = r11.f
            java.util.concurrent.atomic.AtomicLong r3 = r11.e
            long r4 = r11.j
            r6 = 1
        L12:
            boolean r7 = r11.i
            if (r7 == 0) goto L17
            return
        L17:
            java.lang.Object r7 = r1.get()
            if (r7 == 0) goto L25
            java.lang.Throwable r1 = defpackage.azqi.d(r1)
            r0.b(r1)
            return
        L25:
            boolean r7 = r11.h
            java.lang.Object r8 = r2.get()
            azep r8 = (defpackage.azep) r8
            if (r7 == 0) goto L3f
            if (r8 != 0) goto L41
            java.lang.Throwable r1 = defpackage.azqi.d(r1)
            if (r1 == 0) goto L3b
            r0.b(r1)
            return
        L3b:
            r0.sh()
            return
        L3f:
            if (r8 == 0) goto L5b
        L41:
            java.lang.Object r7 = r8.b
            if (r7 == 0) goto L5b
            long r9 = r3.get()
            int r7 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r7 != 0) goto L4e
            goto L5b
        L4e:
            r7 = 0
            r2.compareAndSet(r8, r7)
            java.lang.Object r7 = r8.b
            r0.c(r7)
            r7 = 1
            long r4 = r4 + r7
            goto L12
        L5b:
            r11.j = r4
            int r6 = -r6
            int r6 = r11.addAndGet(r6)
            if (r6 != 0) goto L12
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.azeq.g():void");
    }

    @Override // defpackage.banx
    public final void sd() {
        this.i = true;
        this.g.sd();
        d();
    }

    @Override // defpackage.banw
    public final void sh() {
        this.h = true;
        g();
    }

    @Override // defpackage.banx
    public final void sj(long j) {
        ayeq.j(this.e, j);
        g();
    }
}
