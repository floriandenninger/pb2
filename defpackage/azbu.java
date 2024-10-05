package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azbu extends ayvs {
    final ayro c;
    final banv d;

    public azbu(aypn aypnVar, ayro ayroVar, banv banvVar) {
        super(aypnVar);
        this.c = ayroVar;
        this.d = banvVar;
    }

    @Override // defpackage.aypn
    protected final void ac(banw banwVar) {
        azrv azrvVar = new azrv(banwVar);
        azbt azbtVar = new azbt(azrvVar, this.c);
        azrvVar.f(azbtVar);
        this.d.ab(new azbs(azbtVar));
        this.b.aa(azbtVar);
    }
}
