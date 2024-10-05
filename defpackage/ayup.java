package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ayup extends ayph {
    final Runnable a;

    public ayup(Runnable runnable) {
        this.a = runnable;
    }

    @Override // defpackage.ayph
    protected final void V(aypi aypiVar) {
        ayqx d = aynu.d();
        aypiVar.se(d);
        try {
            this.a.run();
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
