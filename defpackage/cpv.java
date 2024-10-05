package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cpv implements cvz {
    private final cps a;
    private final cpl b;

    public cpv(cpl cplVar, ajkn ajknVar) {
        this.b = cplVar;
        this.a = new cps(ajknVar);
    }

    @Override // defpackage.cvz
    public final /* bridge */ /* synthetic */ cvy a(Object obj, int i, int i2, cqn cqnVar) {
        cvo cvoVar = (cvo) obj;
        return new cvy(cvoVar, new cpt(this.a, this.b, cvoVar));
    }

    @Override // defpackage.cvz
    public final /* bridge */ /* synthetic */ boolean b(Object obj) {
        return true;
    }
}
