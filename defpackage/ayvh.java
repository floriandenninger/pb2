package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ayvh extends ayph {
    final aypk a;
    final ayqi b;

    public ayvh(aypk aypkVar, ayqi ayqiVar) {
        this.a = aypkVar;
        this.b = ayqiVar;
    }

    @Override // defpackage.ayph
    protected final void V(aypi aypiVar) {
        ayvg ayvgVar = new ayvg(aypiVar, this.a);
        aypiVar.se(ayvgVar);
        ayrz.i(ayvgVar.b, this.b.f(ayvgVar));
    }
}
