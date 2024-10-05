package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ayyf extends ayye {
    private static final long serialVersionUID = -6022804456014692607L;
    final aysx d;

    public ayyf(aysx aysxVar, Iterator it) {
        super(it);
        this.d = aysxVar;
    }

    @Override // defpackage.ayye
    public final void b() {
        Iterator it = this.a;
        aysx aysxVar = this.d;
        while (!this.b) {
            try {
                Object next = it.next();
                if (this.b) {
                    return;
                }
                if (next != null) {
                    aysxVar.e(next);
                    if (this.b) {
                        return;
                    }
                    try {
                        if (!it.hasNext()) {
                            if (this.b) {
                                return;
                            }
                            aysxVar.sh();
                            return;
                        }
                    } catch (Throwable th) {
                        aynu.c(th);
                        aysxVar.b(th);
                        return;
                    }
                } else {
                    aysxVar.b(new NullPointerException("Iterator.next() returned a null value"));
                    return;
                }
            } catch (Throwable th2) {
                aynu.c(th2);
                aysxVar.b(th2);
                return;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x005b, code lost:
    
        r9 = addAndGet(-r4);
     */
    @Override // defpackage.ayye
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(long r9) {
        /*
            r8 = this;
            java.util.Iterator r0 = r8.a
            aysx r1 = r8.d
            r2 = 0
        L6:
            r4 = r2
        L7:
            int r6 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r6 == 0) goto L53
            boolean r6 = r8.b
            if (r6 == 0) goto L10
            return
        L10:
            java.lang.Object r6 = r0.next()     // Catch: java.lang.Throwable -> L4b
            boolean r7 = r8.b
            if (r7 == 0) goto L19
            return
        L19:
            if (r6 != 0) goto L26
            java.lang.NullPointerException r9 = new java.lang.NullPointerException
            java.lang.String r10 = "Iterator.next() returned a null value"
            r9.<init>(r10)
            r1.b(r9)
            return
        L26:
            boolean r6 = r1.e(r6)
            boolean r7 = r8.b
            if (r7 == 0) goto L2f
            return
        L2f:
            boolean r7 = r0.hasNext()     // Catch: java.lang.Throwable -> L43
            if (r7 != 0) goto L3d
            boolean r9 = r8.b
            if (r9 != 0) goto L3c
            r1.sh()
        L3c:
            return
        L3d:
            if (r6 == 0) goto L7
            r6 = 1
            long r4 = r4 + r6
            goto L7
        L43:
            r9 = move-exception
            defpackage.aynu.c(r9)
            r1.b(r9)
            return
        L4b:
            r9 = move-exception
            defpackage.aynu.c(r9)
            r1.b(r9)
            return
        L53:
            long r9 = r8.get()
            int r6 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r6 != 0) goto L7
            long r9 = -r4
            long r9 = r8.addAndGet(r9)
            int r4 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r4 == 0) goto L65
            goto L6
        L65:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ayyf.f(long):void");
    }
}
