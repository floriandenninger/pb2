package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class akdo extends yvo {
    private final cnl a;

    public akdo(String str, cnl cnlVar, cnk cnkVar) {
        super(1, str, cnkVar);
        this.a = cnlVar;
    }

    @Override // defpackage.yvo
    public final cnm qk(cnh cnhVar) {
        return cnm.b(cnhVar.b, ach.k(cnhVar));
    }

    @Override // defpackage.yvo
    public final /* bridge */ /* synthetic */ void ql(Object obj) {
        this.a.kZ((byte[]) obj);
    }
}
