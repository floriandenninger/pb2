package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class aggp implements amml {
    public final /* synthetic */ aghc a;
    private final /* synthetic */ int b;

    public /* synthetic */ aggp(aghc aghcVar, int i) {
        this.b = i;
        this.a = aghcVar;
    }

    @Override // defpackage.amml
    public final Object apply(Object obj) {
        if (this.b == 0) {
            return ((agil) this.a.k.get()).s();
        }
        return ((agil) this.a.k.get()).r();
    }
}
