package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class juq implements ayrs {
    public final /* synthetic */ jur a;
    private final /* synthetic */ int b;

    public /* synthetic */ juq(jur jurVar, int i) {
        this.b = i;
        this.a = jurVar;
    }

    @Override // defpackage.ayrs
    public final void a(Object obj) {
        if (this.b == 0) {
            jur jurVar = this.a;
            if (((Boolean) obj).booleanValue()) {
                jurVar.a.d(jur.d(2));
                return;
            } else {
                jurVar.a.d(jur.d(3));
                return;
            }
        }
        jur jurVar2 = this.a;
        jurVar2.c();
        jurVar2.b.g(jurVar2);
    }
}
