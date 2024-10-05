package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ayvc implements aypi {
    final /* synthetic */ ayvd a;
    private final aypi b;

    public ayvc(ayvd ayvdVar, aypi aypiVar) {
        this.a = ayvdVar;
        this.b = aypiVar;
    }

    @Override // defpackage.aypi, defpackage.aypt
    public final void b(Throwable th) {
        try {
            if (this.a.b.a(th)) {
                this.b.sh();
            } else {
                this.b.b(th);
            }
        } catch (Throwable th2) {
            aynu.c(th2);
            this.b.b(new ayrf(th, th2));
        }
    }

    @Override // defpackage.aypi, defpackage.aypt
    public final void se(ayqx ayqxVar) {
        this.b.se(ayqxVar);
    }

    @Override // defpackage.aypi, defpackage.aypt
    public final void sh() {
        this.b.sh();
    }
}
