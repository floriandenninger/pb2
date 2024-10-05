package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLongArray;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azlv extends AtomicInteger implements aypq {
    private static final long serialVersionUID = -4470634016609963609L;
    final banw[] a;
    final AtomicLongArray b;
    final long[] c;
    final int d;
    final int e;
    banx f;
    aytf g;
    Throwable h;
    volatile boolean i;
    int j;
    volatile boolean k;
    final AtomicInteger l = new AtomicInteger();
    int m;
    int n;

    public azlv(banw[] banwVarArr, int i) {
        this.a = banwVarArr;
        this.d = i;
        this.e = i - (i >> 2);
        int length = banwVarArr.length;
        int i2 = length + length;
        AtomicLongArray atomicLongArray = new AtomicLongArray(i2 + 1);
        this.b = atomicLongArray;
        atomicLongArray.lazySet(i2, length);
        this.c = new long[length];
    }

    @Override // defpackage.banw
    public final void b(Throwable th) {
        this.h = th;
        this.i = true;
        d();
    }

    @Override // defpackage.banw
    public final void c(Object obj) {
        if (this.n != 0 || this.g.k(obj)) {
            d();
        } else {
            this.f.sd();
            b(new ayrg("Queue is full?"));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:100:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x014b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d() {
        /*
            Method dump skipped, instructions count: 337
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.azlv.d():void");
    }

    final void e() {
        banw[] banwVarArr = this.a;
        int length = banwVarArr.length;
        int i = 0;
        while (i < length && !this.k) {
            int i2 = i + 1;
            this.l.lazySet(i2);
            banwVarArr[i].f(new azlu(this, i, length));
            i = i2;
        }
    }

    @Override // defpackage.aypq, defpackage.banw
    public final void f(banx banxVar) {
        if (azqb.i(this.f, banxVar)) {
            this.f = banxVar;
            if (banxVar instanceof aytc) {
                aytc aytcVar = (aytc) banxVar;
                int sf = aytcVar.sf(7);
                if (sf == 1) {
                    this.n = 1;
                    this.g = aytcVar;
                    this.i = true;
                    e();
                    d();
                    return;
                }
                if (sf == 2) {
                    this.n = 2;
                    this.g = aytcVar;
                    e();
                    banxVar.sj(this.d);
                    return;
                }
            }
            this.g = new azog(this.d);
            e();
            banxVar.sj(this.d);
        }
    }

    @Override // defpackage.banw
    public final void sh() {
        this.i = true;
        d();
    }
}
