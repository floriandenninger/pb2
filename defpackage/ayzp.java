package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ayzp implements banv {
    private final AtomicReference a;
    private final int b;

    public ayzp(AtomicReference atomicReference, int i) {
        this.a = atomicReference;
        this.b = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0008, code lost:
    
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0057  */
    @Override // defpackage.banv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void ab(defpackage.banw r7) {
        /*
            r6 = this;
            ayzq r0 = new ayzq
            r0.<init>(r7)
            r7.f(r0)
        L8:
            java.util.concurrent.atomic.AtomicReference r7 = r6.a
            java.lang.Object r7 = r7.get()
            ayzr r7 = (defpackage.ayzr) r7
            if (r7 == 0) goto L18
            boolean r1 = r7.e()
            if (r1 == 0) goto L2a
        L18:
            ayzr r1 = new ayzr
            java.util.concurrent.atomic.AtomicReference r2 = r6.a
            int r3 = r6.b
            r1.<init>(r2, r3)
            java.util.concurrent.atomic.AtomicReference r2 = r6.a
            boolean r7 = r2.compareAndSet(r7, r1)
            if (r7 == 0) goto L8
            r7 = r1
        L2a:
            java.util.concurrent.atomic.AtomicReference r1 = r7.e
            java.lang.Object r1 = r1.get()
            ayzq[] r1 = (defpackage.ayzq[]) r1
            ayzq[] r2 = defpackage.ayzr.b
            if (r1 == r2) goto L8
            int r2 = r1.length
            int r3 = r2 + 1
            ayzq[] r3 = new defpackage.ayzq[r3]
            r4 = 0
            java.lang.System.arraycopy(r1, r4, r3, r4, r2)
            r3[r2] = r0
            java.util.concurrent.atomic.AtomicReference r2 = r7.e
            boolean r1 = r2.compareAndSet(r1, r3)
            if (r1 == 0) goto L2a
            long r1 = r0.get()
            r3 = -9223372036854775808
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L57
            r7.g(r0)
            goto L59
        L57:
            r0.b = r7
        L59:
            r7.d()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ayzp.ab(banw):void");
    }
}
