package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ayun extends ayph {
    final ayrm a;

    public ayun(ayrm ayrmVar) {
        this.a = ayrmVar;
    }

    @Override // defpackage.ayph
    protected final void V(aypi aypiVar) {
        ayqx d = aynu.d();
        aypiVar.se(d);
        try {
            this.a.a();
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
