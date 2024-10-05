package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azhf extends AtomicReference implements ayqd {
    private static final long serialVersionUID = -4606175640614850599L;
    final long a;
    final azhg b;
    volatile boolean c;
    volatile aytf d;
    int e;

    public azhf(azhg azhgVar, long j) {
        this.a = j;
        this.b = azhgVar;
    }

    @Override // defpackage.ayqd
    public final void b(Throwable th) {
        if (azqi.e(this.b.j, th)) {
            azhg azhgVar = this.b;
            boolean z = azhgVar.e;
            azhgVar.k();
            this.c = true;
            this.b.f();
            return;
        }
        aynu.j(th);
    }

    @Override // defpackage.ayqd
    public final void c(Object obj) {
        if (this.e != 0) {
            this.b.f();
            return;
        }
        azhg azhgVar = this.b;
        if (azhgVar.get() != 0 || !azhgVar.compareAndSet(0, 1)) {
            aytf aytfVar = this.d;
            if (aytfVar == null) {
                aytfVar = new azoh(azhgVar.g);
                this.d = aytfVar;
            }
            aytfVar.k(obj);
            if (azhgVar.getAndIncrement() != 0) {
                return;
            }
        } else {
            azhgVar.c.c(obj);
            if (azhgVar.decrementAndGet() == 0) {
                return;
            }
        }
        azhgVar.g();
    }

    @Override // defpackage.ayqd
    public final void se(ayqx ayqxVar) {
        if (ayrz.g(this, ayqxVar) && (ayqxVar instanceof ayta)) {
            ayta aytaVar = (ayta) ayqxVar;
            int sf = aytaVar.sf(7);
            if (sf == 1) {
                this.e = 1;
                this.d = aytaVar;
                this.c = true;
                this.b.f();
                return;
            }
            if (sf == 2) {
                this.e = 2;
                this.d = aytaVar;
            }
        }
    }

    @Override // defpackage.ayqd
    public final void sh() {
        this.c = true;
        this.b.f();
    }
}
