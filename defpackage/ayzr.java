package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ayzr extends AtomicInteger implements aypq, ayqx {
    static final ayzq[] a = new ayzq[0];
    static final ayzq[] b = new ayzq[0];
    private static final long serialVersionUID = -202316842419149694L;
    final AtomicReference c;
    final int d;
    volatile Object h;
    int i;
    volatile aytf j;
    final AtomicReference g = new AtomicReference();
    final AtomicReference e = new AtomicReference(a);
    final AtomicBoolean f = new AtomicBoolean();

    public ayzr(AtomicReference atomicReference, int i) {
        this.c = atomicReference;
        this.d = i;
    }

    @Override // defpackage.banw
    public final void b(Throwable th) {
        if (this.h == null) {
            this.h = azqm.b(th);
            d();
        } else {
            aynu.j(th);
        }
    }

    @Override // defpackage.banw
    public final void c(Object obj) {
        if (this.i != 0 || this.j.k(obj)) {
            d();
        } else {
            b(new ayrg("Prefetch queue is full?!"));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x011a, code lost:
    
        if (r10 == 0) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x011f, code lost:
    
        if (r23.i == 1) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0121, code lost:
    
        ((defpackage.banx) r23.g.get()).sj(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x012d, code lost:
    
        r4 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x012f, code lost:
    
        if (r10 == 0) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0134, code lost:
    
        if (r23.i == 1) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0136, code lost:
    
        ((defpackage.banx) r23.g.get()).sj(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0147, code lost:
    
        if (r12 == 0) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0149, code lost:
    
        if (r0 != false) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x015c, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d() {
        /*
            Method dump skipped, instructions count: 351
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ayzr.d():void");
    }

    @Override // defpackage.ayqx
    public final boolean e() {
        return this.e.get() == b;
    }

    @Override // defpackage.aypq, defpackage.banw
    public final void f(banx banxVar) {
        if (azqb.g(this.g, banxVar)) {
            if (banxVar instanceof aytc) {
                aytc aytcVar = (aytc) banxVar;
                int sf = aytcVar.sf(7);
                if (sf == 1) {
                    this.i = 1;
                    this.j = aytcVar;
                    this.h = azqm.a;
                    d();
                    return;
                }
                if (sf == 2) {
                    this.i = 2;
                    this.j = aytcVar;
                    banxVar.sj(this.d);
                    return;
                }
            }
            this.j = new azog(this.d);
            banxVar.sj(this.d);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void g(ayzq ayzqVar) {
        ayzq[] ayzqVarArr;
        ayzq[] ayzqVarArr2;
        do {
            ayzqVarArr = (ayzq[]) this.e.get();
            int length = ayzqVarArr.length;
            if (length == 0) {
                return;
            }
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (ayzqVarArr[i].equals(ayzqVar)) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                ayzqVarArr2 = a;
            } else {
                ayzq[] ayzqVarArr3 = new ayzq[length - 1];
                System.arraycopy(ayzqVarArr, 0, ayzqVarArr3, 0, i);
                System.arraycopy(ayzqVarArr, i + 1, ayzqVarArr3, i, (length - i) - 1);
                ayzqVarArr2 = ayzqVarArr3;
            }
        } while (!this.e.compareAndSet(ayzqVarArr, ayzqVarArr2));
    }

    final boolean h(Object obj, boolean z) {
        int i = 0;
        if (obj != null) {
            if (!azqm.g(obj)) {
                Throwable d = azqm.d(obj);
                this.c.compareAndSet(this, null);
                ayzq[] ayzqVarArr = (ayzq[]) this.e.getAndSet(b);
                int length = ayzqVarArr.length;
                if (length != 0) {
                    while (i < length) {
                        ayzqVarArr[i].a.b(d);
                        i++;
                    }
                } else {
                    aynu.j(d);
                }
                return true;
            }
            if (z) {
                this.c.compareAndSet(this, null);
                ayzq[] ayzqVarArr2 = (ayzq[]) this.e.getAndSet(b);
                int length2 = ayzqVarArr2.length;
                while (i < length2) {
                    ayzqVarArr2[i].a.sh();
                    i++;
                }
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.ayqx
    public final void qc() {
        Object obj = this.e.get();
        Object obj2 = b;
        if (obj == obj2 || ((ayzq[]) this.e.getAndSet(obj2)) == obj2) {
            return;
        }
        this.c.compareAndSet(this, null);
        azqb.f(this.g);
    }

    @Override // defpackage.banw
    public final void sh() {
        if (this.h == null) {
            this.h = azqm.a;
            d();
        }
    }
}
