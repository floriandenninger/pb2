package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azkl extends AtomicReference implements ayqd {
    private static final long serialVersionUID = 3837284832786408377L;
    final azkm a;
    final long b;
    final int c;
    volatile aytf d;
    volatile boolean e;

    public azkl(azkm azkmVar, long j, int i) {
        this.a = azkmVar;
        this.b = j;
        this.c = i;
    }

    @Override // defpackage.ayqd
    public final void b(Throwable th) {
        azkm azkmVar = this.a;
        if (this.b != azkmVar.j || !azqi.e(azkmVar.e, th)) {
            aynu.j(th);
            return;
        }
        azkmVar.h.qc();
        azkmVar.f = true;
        this.e = true;
        azkmVar.g();
    }

    @Override // defpackage.ayqd
    public final void c(Object obj) {
        if (this.b == this.a.j) {
            if (obj != null) {
                this.d.k(obj);
            }
            this.a.g();
        }
    }

    @Override // defpackage.ayqd
    public final void se(ayqx ayqxVar) {
        if (ayrz.g(this, ayqxVar)) {
            if (ayqxVar instanceof ayta) {
                ayta aytaVar = (ayta) ayqxVar;
                int sf = aytaVar.sf(7);
                if (sf == 1) {
                    this.d = aytaVar;
                    this.e = true;
                    this.a.g();
                    return;
                } else if (sf == 2) {
                    this.d = aytaVar;
                    return;
                }
            }
            this.d = new azoh(this.c);
        }
    }

    @Override // defpackage.ayqd
    public final void sh() {
        if (this.b == this.a.j) {
            this.e = true;
            this.a.g();
        }
    }
}
