package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aymp implements aymu {
    final /* synthetic */ int a;
    private final /* synthetic */ int b;

    public aymp(int i, int i2) {
        this.b = i2;
        this.a = i;
    }

    @Override // defpackage.aymu
    public final void a(aynj aynjVar) {
        int i = this.b;
        if (i == 0) {
            aynjVar.a.l(this.a);
        } else if (i != 1) {
            aynjVar.a.g(this.a);
        } else {
            aynjVar.a.k(this.a);
        }
    }
}
