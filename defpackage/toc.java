package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class toc implements amml {
    public final /* synthetic */ tov a;
    private final /* synthetic */ int b;

    public /* synthetic */ toc(tov tovVar, int i) {
        this.b = i;
        this.a = tovVar;
    }

    @Override // defpackage.amml
    public final Object apply(Object obj) {
        if (this.b == 0) {
            tov tovVar = this.a;
            if (!((Boolean) obj).booleanValue()) {
                tovVar.b.g(1036);
            }
            return null;
        }
        tov tovVar2 = this.a;
        if (!((Boolean) obj).booleanValue()) {
            tovVar2.b.g(1036);
        }
        return null;
    }
}
