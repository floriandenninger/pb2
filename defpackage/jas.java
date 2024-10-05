package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jas implements aasm {
    public final jau a;
    public final aahd b;
    public ammv c;
    private final abds e;

    public jas(abds abdsVar, jau jauVar, aahd aahdVar) {
        abdsVar.getClass();
        this.e = abdsVar;
        this.a = jauVar;
        aahdVar.getClass();
        this.b = aahdVar;
        this.c = amlr.a;
    }

    @Override // defpackage.aasm
    public final aaru a(ajce ajceVar) {
        return this.e.a(ajceVar);
    }

    @Override // defpackage.aasm
    public final void b(aaru aaruVar, aasl aaslVar, afwx afwxVar) {
        this.e.b(aaruVar, aaslVar, new jar(this, afwxVar));
    }
}
