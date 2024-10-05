package defpackage;

import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes2.dex */
abstract class ayyz extends azpv implements Runnable, aypq {
    private static final long serialVersionUID = -8241002408341274697L;
    final ayqh a;
    final int b;
    final int c;
    final AtomicLong d = new AtomicLong();
    banx e;
    aytf f;
    volatile boolean g;
    volatile boolean h;
    Throwable i;
    int j;
    long k;
    boolean l;

    public ayyz(ayqh ayqhVar, int i) {
        this.a = ayqhVar;
        this.b = i;
        this.c = i - (i >> 2);
    }

    @Override // defpackage.banw
    public final void b(Throwable th) {
        if (this.h) {
            aynu.j(th);
            return;
        }
        this.i = th;
        this.h = true;
        l();
    }

    @Override // defpackage.banw
    public final void c(Object obj) {
        if (this.h) {
            return;
        }
        if (this.j == 2) {
            l();
            return;
        }
        if (!this.f.k(obj)) {
            this.e.sd();
            this.i = new ayrg("Queue is full?!");
            this.h = true;
        }
        l();
    }

    @Override // defpackage.aytf
    public final void d() {
        this.f.d();
    }

    public abstract void g();

    public abstract void h();

    public abstract void i();

    @Override // defpackage.aytf
    public final boolean j() {
        return this.f.j();
    }

    final void l() {
        if (getAndIncrement() != 0) {
            return;
        }
        this.a.a(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean m(boolean z, boolean z2, banw banwVar) {
        if (this.g) {
            d();
            return true;
        }
        if (!z) {
            return false;
        }
        Throwable th = this.i;
        if (th != null) {
            this.g = true;
            d();
            banwVar.b(th);
            this.a.qc();
            return true;
        }
        if (!z2) {
            return false;
        }
        this.g = true;
        banwVar.sh();
        this.a.qc();
        return true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.l) {
            h();
        } else if (this.j == 1) {
            i();
        } else {
            g();
        }
    }

    @Override // defpackage.banx
    public final void sd() {
        if (this.g) {
            return;
        }
        this.g = true;
        this.e.sd();
        this.a.qc();
        if (getAndIncrement() == 0) {
            this.f.d();
        }
    }

    @Override // defpackage.aytb
    public final int sf(int i) {
        if ((i & 2) == 0) {
            return 0;
        }
        this.l = true;
        return 2;
    }

    @Override // defpackage.banw
    public final void sh() {
        if (this.h) {
            return;
        }
        this.h = true;
        l();
    }

    @Override // defpackage.banx
    public final void sj(long j) {
        if (azqb.h(j)) {
            ayeq.j(this.d, j);
            l();
        }
    }
}
