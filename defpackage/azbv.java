package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azbv extends AtomicInteger implements aysx, banx {
    private static final long serialVersionUID = 1577321883966341961L;
    final banw a;
    final ayrv b;
    final azbw[] c;
    final AtomicReferenceArray d;
    final AtomicReference e;
    final AtomicLong f;
    final azqf g;
    volatile boolean h;

    public azbv(banw banwVar, ayrv ayrvVar) {
        this.a = banwVar;
        this.b = ayrvVar;
        azbw[] azbwVarArr = new azbw[2];
        for (int i = 0; i < 2; i++) {
            azbwVarArr[i] = new azbw(this, i);
        }
        this.c = azbwVarArr;
        this.d = new AtomicReferenceArray(2);
        this.e = new AtomicReference();
        this.f = new AtomicLong();
        this.g = new azqf();
    }

    @Override // defpackage.banw
    public final void b(Throwable th) {
        if (this.h) {
            aynu.j(th);
            return;
        }
        this.h = true;
        d(-1);
        ayeq.g(this.a, th, this, this.g);
    }

    @Override // defpackage.banw
    public final void c(Object obj) {
        if (e(obj) || this.h) {
            return;
        }
        ((banx) this.e.get()).sj(1L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d(int i) {
        azbw[] azbwVarArr = this.c;
        int i2 = 0;
        while (true) {
            int length = azbwVarArr.length;
            if (i2 >= 2) {
                return;
            }
            if (i2 != i) {
                azqb.f(azbwVarArr[i2]);
            }
            i2++;
        }
    }

    @Override // defpackage.aysx
    public final boolean e(Object obj) {
        if (this.h) {
            return false;
        }
        AtomicReferenceArray atomicReferenceArray = this.d;
        int length = atomicReferenceArray.length();
        Object[] objArr = new Object[length + 1];
        objArr[0] = obj;
        int i = 0;
        while (i < length) {
            Object obj2 = atomicReferenceArray.get(i);
            if (obj2 == null) {
                return false;
            }
            i++;
            objArr[i] = obj2;
        }
        try {
            Object a = this.b.a(objArr);
            aysw.b(a, "The combiner returned a null value");
            ayeq.h(this.a, a, this, this.g);
            return true;
        } catch (Throwable th) {
            aynu.c(th);
            sd();
            b(th);
            return false;
        }
    }

    @Override // defpackage.aypq, defpackage.banw
    public final void f(banx banxVar) {
        azqb.j(this.e, this.f, banxVar);
    }

    @Override // defpackage.banx
    public final void sd() {
        azqb.f(this.e);
        azbw[] azbwVarArr = this.c;
        int length = azbwVarArr.length;
        for (int i = 0; i < 2; i++) {
            azqb.f(azbwVarArr[i]);
        }
    }

    @Override // defpackage.banw
    public final void sh() {
        if (this.h) {
            return;
        }
        this.h = true;
        d(-1);
        ayeq.e(this.a, this, this.g);
    }

    @Override // defpackage.banx
    public final void sj(long j) {
        azqb.a(this.e, this.f, j);
    }
}
