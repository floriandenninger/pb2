package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azap extends ayqj implements aysy {
    final aypn a;
    final Object b;
    private final /* synthetic */ int c;

    public azap(aypn aypnVar, Object obj, int i) {
        this.c = i;
        this.a = aypnVar;
        this.b = obj;
    }

    @Override // defpackage.aysy
    public final aypn a() {
        if (this.c != 0) {
            ayxd ayxdVar = new ayxd(this.a, this.b, true);
            ayrv ayrvVar = aynu.j;
            return ayxdVar;
        }
        azan azanVar = new azan(this.a, this.b);
        ayrv ayrvVar2 = aynu.j;
        return azanVar;
    }

    @Override // defpackage.ayqj
    protected final void aa(ayqk ayqkVar) {
        if (this.c != 0) {
            this.a.aa(new ayxg(ayqkVar, this.b));
        } else {
            this.a.aa(new azao(ayqkVar, this.b));
        }
    }
}
