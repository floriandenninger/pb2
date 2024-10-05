package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azjc implements ayqb {
    private final AtomicReference a;

    public azjc(AtomicReference atomicReference) {
        this.a = atomicReference;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0008, code lost:
    
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.ayqb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void aE(defpackage.ayqd r6) {
        /*
            r5 = this;
            azja r0 = new azja
            r0.<init>(r6)
            r6.se(r0)
        L8:
            java.util.concurrent.atomic.AtomicReference r6 = r5.a
            java.lang.Object r6 = r6.get()
            azjb r6 = (defpackage.azjb) r6
            if (r6 == 0) goto L18
            boolean r1 = r6.e()
            if (r1 == 0) goto L28
        L18:
            azjb r1 = new azjb
            java.util.concurrent.atomic.AtomicReference r2 = r5.a
            r1.<init>(r2)
            java.util.concurrent.atomic.AtomicReference r2 = r5.a
            boolean r6 = r2.compareAndSet(r6, r1)
            if (r6 == 0) goto L8
            r6 = r1
        L28:
            java.util.concurrent.atomic.AtomicReference r1 = r6.d
            java.lang.Object r1 = r1.get()
            azja[] r1 = (defpackage.azja[]) r1
            azja[] r2 = defpackage.azjb.b
            if (r1 == r2) goto L8
            int r2 = r1.length
            int r3 = r2 + 1
            azja[] r3 = new defpackage.azja[r3]
            r4 = 0
            java.lang.System.arraycopy(r1, r4, r3, r4, r2)
            r3[r2] = r0
            java.util.concurrent.atomic.AtomicReference r2 = r6.d
            boolean r1 = r2.compareAndSet(r1, r3)
            if (r1 == 0) goto L28
            r1 = 0
            boolean r1 = r0.compareAndSet(r1, r6)
            if (r1 != 0) goto L51
            r6.f(r0)
        L51:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.azjc.aE(ayqd):void");
    }
}
