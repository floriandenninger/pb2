package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azay extends AtomicReference implements aypq {
    private static final long serialVersionUID = 3837284832786408377L;
    final azaz a;
    final long b;
    final int c;
    volatile aytf d;
    volatile boolean e;
    int f;

    public azay(azaz azazVar, long j, int i) {
        this.a = azazVar;
        this.b = j;
        this.c = i;
    }

    @Override // defpackage.banw
    public final void b(Throwable th) {
        azaz azazVar = this.a;
        if (this.b != azazVar.l || !azqi.e(azazVar.g, th)) {
            aynu.j(th);
            return;
        }
        boolean z = azazVar.e;
        azazVar.i.sd();
        azazVar.f = true;
        this.e = true;
        azazVar.g();
    }

    @Override // defpackage.banw
    public final void c(Object obj) {
        azaz azazVar = this.a;
        if (this.b == azazVar.l) {
            if (this.f != 0 || this.d.k(obj)) {
                azazVar.g();
            } else {
                b(new ayrg("Queue full?!"));
            }
        }
    }

    @Override // defpackage.aypq, defpackage.banw
    public final void f(banx banxVar) {
        if (azqb.g(this, banxVar)) {
            if (banxVar instanceof aytc) {
                aytc aytcVar = (aytc) banxVar;
                int sf = aytcVar.sf(7);
                if (sf == 1) {
                    this.f = 1;
                    this.d = aytcVar;
                    this.e = true;
                    this.a.g();
                    return;
                }
                if (sf == 2) {
                    this.f = 2;
                    this.d = aytcVar;
                    banxVar.sj(this.c);
                    return;
                }
            }
            this.d = new azog(this.c);
            banxVar.sj(this.c);
        }
    }

    @Override // defpackage.banw
    public final void sh() {
        azaz azazVar = this.a;
        if (this.b == azazVar.l) {
            this.e = true;
            azazVar.g();
        }
    }
}
