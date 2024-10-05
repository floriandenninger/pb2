package defpackage;

import java.util.concurrent.CountDownLatch;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aytj extends CountDownLatch implements ayqd, ayqx {
    Object a;
    Throwable b;
    ayqx c;
    volatile boolean d;

    public aytj() {
        super(1);
    }

    @Override // defpackage.ayqd
    public final void b(Throwable th) {
        if (this.a == null) {
            this.b = th;
        }
        countDown();
    }

    @Override // defpackage.ayqd
    public final void c(Object obj) {
        if (this.a == null) {
            this.a = obj;
            this.c.qc();
            countDown();
        }
    }

    @Override // defpackage.ayqx
    public final boolean e() {
        return this.d;
    }

    public final Object f() {
        if (getCount() != 0) {
            try {
                boolean z = aynu.x;
                await();
            } catch (InterruptedException e) {
                qc();
                throw azqi.b(e);
            }
        }
        Throwable th = this.b;
        if (th == null) {
            return this.a;
        }
        throw azqi.b(th);
    }

    @Override // defpackage.ayqx
    public final void qc() {
        this.d = true;
        ayqx ayqxVar = this.c;
        if (ayqxVar != null) {
            ayqxVar.qc();
        }
    }

    @Override // defpackage.ayqd
    public final void se(ayqx ayqxVar) {
        this.c = ayqxVar;
        if (this.d) {
            ayqxVar.qc();
        }
    }

    @Override // defpackage.ayqd
    public final void sh() {
        countDown();
    }
}
