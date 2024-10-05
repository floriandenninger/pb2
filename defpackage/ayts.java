package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ayts extends AtomicReference implements ayqd, ayqx {
    private static final long serialVersionUID = -5417183359794346637L;
    final aytt a;
    final int b;
    public aytf c;
    public volatile boolean d;
    int e;

    public ayts(aytt ayttVar, int i) {
        this.a = ayttVar;
        this.b = i;
    }

    @Override // defpackage.ayqd
    public final void b(Throwable th) {
        azfy azfyVar = (azfy) this.a;
        if (azqi.e(azfyVar.e, th)) {
            if (azfyVar.n == 1) {
                azfyVar.h.qc();
            }
            f();
            azfyVar.f();
            return;
        }
        aynu.j(th);
    }

    @Override // defpackage.ayqd
    public final void c(Object obj) {
        if (this.e == 0) {
            aytt ayttVar = this.a;
            this.c.k(obj);
            ((azfy) ayttVar).f();
            return;
        }
        this.a.f();
    }

    @Override // defpackage.ayqx
    public final boolean e() {
        return ayrz.d((ayqx) get());
    }

    public final void f() {
        this.d = true;
    }

    @Override // defpackage.ayqx
    public final void qc() {
        ayrz.c(this);
    }

    @Override // defpackage.ayqd
    public final void se(ayqx ayqxVar) {
        aytf azogVar;
        if (ayrz.g(this, ayqxVar)) {
            if (ayqxVar instanceof ayta) {
                ayta aytaVar = (ayta) ayqxVar;
                int sf = aytaVar.sf(3);
                if (sf == 1) {
                    this.e = 1;
                    this.c = aytaVar;
                    this.d = true;
                    this.a.g(this);
                    return;
                }
                if (sf == 2) {
                    this.e = 2;
                    this.c = aytaVar;
                    return;
                }
            }
            int i = this.b;
            int i2 = -i;
            if (i2 < 0) {
                azogVar = new azoh(i);
            } else {
                azogVar = new azog(i2);
            }
            this.c = azogVar;
        }
    }

    @Override // defpackage.ayqd
    public final void sh() {
        this.a.g(this);
    }
}
