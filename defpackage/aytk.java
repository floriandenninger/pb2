package defpackage;

import java.util.concurrent.CountDownLatch;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aytk extends CountDownLatch implements ayqk, aypi, aypt {
    Object a;
    Throwable b;
    ayqx c;
    volatile boolean d;

    public aytk() {
        super(1);
    }

    @Override // defpackage.ayqk, defpackage.aypi, defpackage.aypt
    public final void b(Throwable th) {
        this.b = th;
        countDown();
    }

    public final Object c() {
        if (getCount() != 0) {
            try {
                boolean z = aynu.x;
                await();
            } catch (InterruptedException e) {
                this.d = true;
                ayqx ayqxVar = this.c;
                if (ayqxVar != null) {
                    ayqxVar.qc();
                }
                throw azqi.b(e);
            }
        }
        Throwable th = this.b;
        if (th == null) {
            return this.a;
        }
        throw azqi.b(th);
    }

    @Override // defpackage.ayqk, defpackage.aypt
    public final void sc(Object obj) {
        this.a = obj;
        countDown();
    }

    @Override // defpackage.ayqk, defpackage.aypi, defpackage.aypt
    public final void se(ayqx ayqxVar) {
        this.c = ayqxVar;
        if (this.d) {
            ayqxVar.qc();
        }
    }

    @Override // defpackage.aypi, defpackage.aypt
    public final void sh() {
        countDown();
    }
}
