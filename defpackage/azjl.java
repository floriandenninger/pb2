package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class azjl extends AtomicBoolean implements ayqd, ayqx {
    private static final long serialVersionUID = -7419642935409022375L;
    final ayqd a;
    final azjm b;
    final azjk c;
    ayqx d;

    public azjl(ayqd ayqdVar, azjm azjmVar, azjk azjkVar) {
        this.a = ayqdVar;
        this.b = azjmVar;
        this.c = azjkVar;
    }

    @Override // defpackage.ayqd
    public final void b(Throwable th) {
        if (compareAndSet(false, true)) {
            this.b.b(this.c);
            this.a.b(th);
        } else {
            aynu.j(th);
        }
    }

    @Override // defpackage.ayqd
    public final void c(Object obj) {
        this.a.c(obj);
    }

    @Override // defpackage.ayqx
    public final boolean e() {
        return this.d.e();
    }

    @Override // defpackage.ayqx
    public final void qc() {
        this.d.qc();
        if (compareAndSet(false, true)) {
            azjm azjmVar = this.b;
            azjk azjkVar = this.c;
            synchronized (azjmVar) {
                azjk azjkVar2 = azjmVar.b;
                if (azjkVar2 != null && azjkVar2 == azjkVar) {
                    long j = azjkVar.c - 1;
                    azjkVar.c = j;
                    if (j == 0 && azjkVar.d) {
                        azjmVar.c(azjkVar);
                    }
                }
            }
        }
    }

    @Override // defpackage.ayqd
    public final void se(ayqx ayqxVar) {
        if (ayrz.h(this.d, ayqxVar)) {
            this.d = ayqxVar;
            this.a.se(this);
        }
    }

    @Override // defpackage.ayqd
    public final void sh() {
        if (compareAndSet(false, true)) {
            this.b.b(this.c);
            this.a.sh();
        }
    }
}
