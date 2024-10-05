package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aznu extends ayqj {
    final ayqm a;
    final ayqi b;

    public aznu(ayqm ayqmVar, ayqi ayqiVar) {
        this.a = ayqmVar;
        this.b = ayqiVar;
    }

    @Override // defpackage.ayqj
    protected final void aa(ayqk ayqkVar) {
        aznt azntVar = new aznt(ayqkVar, this.a);
        ayqkVar.se(azntVar);
        ayrz.i(azntVar.b, this.b.f(azntVar));
    }
}
