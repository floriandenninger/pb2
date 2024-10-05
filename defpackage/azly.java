package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class azly extends AtomicInteger implements banx {
    private static final long serialVersionUID = 3100232009247827843L;
    final banw a;
    final azlx[] b;
    volatile boolean e;
    final azqf c = new azqf();
    final AtomicLong d = new AtomicLong();
    final AtomicInteger f = new AtomicInteger();

    public azly(banw banwVar, int i, int i2) {
        this.a = banwVar;
        azlx[] azlxVarArr = new azlx[i];
        for (int i3 = 0; i3 < i; i3++) {
            azlxVarArr[i3] = new azlx(this, i2);
        }
        this.b = azlxVarArr;
        this.f.lazySet(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        for (azlx azlxVar : this.b) {
            azlxVar.e = null;
        }
    }

    public abstract void b();

    public abstract void d();

    public abstract void f(Throwable th);

    public abstract void g(azlx azlxVar, Object obj);

    @Override // defpackage.banx
    public final void sd() {
        if (this.e) {
            return;
        }
        this.e = true;
        for (azlx azlxVar : this.b) {
            azqb.f(azlxVar);
        }
        if (getAndIncrement() == 0) {
            a();
        }
    }

    @Override // defpackage.banx
    public final void sj(long j) {
        if (azqb.h(j)) {
            ayeq.j(this.d, j);
            b();
        }
    }
}
