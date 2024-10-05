package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azod extends ayqj {
    final ayqm[] a;
    final ayrv b;

    public azod(ayqm[] ayqmVarArr, ayrv ayrvVar) {
        this.a = ayqmVarArr;
        this.b = ayrvVar;
    }

    @Override // defpackage.ayqj
    protected final void aa(ayqk ayqkVar) {
        ayqm[] ayqmVarArr = this.a;
        azob azobVar = new azob(ayqkVar, this.b);
        ayqkVar.se(azobVar);
        for (int i = 0; i < 2 && !azobVar.e(); i++) {
            ayqm ayqmVar = ayqmVarArr[i];
            if (ayqmVar != null) {
                ayqmVar.Z(azobVar.c[i]);
            } else {
                azobVar.a(new NullPointerException("One of the sources is null"), i);
                return;
            }
        }
    }
}
