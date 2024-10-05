package defpackage;

import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ayuo extends ayph {
    final Callable a;

    public ayuo(Callable callable) {
        this.a = callable;
    }

    @Override // defpackage.ayph
    protected final void V(aypi aypiVar) {
        ayqx d = aynu.d();
        aypiVar.se(d);
        try {
            this.a.call();
            if (d.e()) {
                return;
            }
            aypiVar.sh();
        } catch (Throwable th) {
            aynu.c(th);
            if (!d.e()) {
                aypiVar.b(th);
            } else {
                aynu.j(th);
            }
        }
    }
}
