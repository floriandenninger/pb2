package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azfg extends AtomicReference implements ayqd {
    private static final long serialVersionUID = -1185974347409665484L;
    final azff a;
    final int b;
    final ayqd c;
    boolean d;

    public azfg(azff azffVar, int i, ayqd ayqdVar) {
        this.a = azffVar;
        this.b = i;
        this.c = ayqdVar;
    }

    @Override // defpackage.ayqd
    public final void b(Throwable th) {
        if (this.d) {
            this.c.b(th);
        } else if (this.a.a(this.b)) {
            this.d = true;
            this.c.b(th);
        } else {
            aynu.j(th);
        }
    }

    @Override // defpackage.ayqd
    public final void c(Object obj) {
        if (this.d) {
            this.c.c(obj);
        } else if (this.a.a(this.b)) {
            this.d = true;
            this.c.c(obj);
        } else {
            ((ayqx) get()).qc();
        }
    }

    @Override // defpackage.ayqd
    public final void se(ayqx ayqxVar) {
        ayrz.g(this, ayqxVar);
    }

    @Override // defpackage.ayqd
    public final void sh() {
        if (this.d) {
            this.c.sh();
        } else if (this.a.a(this.b)) {
            this.d = true;
            this.c.sh();
        }
    }
}
