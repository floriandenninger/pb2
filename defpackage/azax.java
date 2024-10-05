package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azax extends ayvs {
    final ayqi c;
    final boolean d;

    public azax(aypn aypnVar, ayqi ayqiVar, boolean z) {
        super(aypnVar);
        this.c = ayqiVar;
        this.d = z;
    }

    @Override // defpackage.aypn
    public final void ac(banw banwVar) {
        ayqh a = this.c.a();
        azaw azawVar = new azaw(banwVar, a, this.b, this.d);
        banwVar.f(azawVar);
        a.a(azawVar);
    }
}
