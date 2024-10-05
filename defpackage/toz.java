package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class toz implements anfz {
    public final /* synthetic */ tpf a;
    private final /* synthetic */ int b;

    public /* synthetic */ toz(tpf tpfVar, int i) {
        this.b = i;
        this.a = tpfVar;
    }

    @Override // defpackage.anfz
    public final anhy a(Object obj) {
        int i = this.b;
        if (i == 0) {
            tpf tpfVar = this.a;
            return anfq.i(tpfVar.n(tpfVar.a.e()), new tox(tpfVar, (ttj) obj, 3), tpfVar.b);
        }
        if (i == 1) {
            tpf tpfVar2 = this.a;
            return anfq.i(tpfVar2.n(tpfVar2.a.b()), new tox(tpfVar2, (ttj) obj, 2), tpfVar2.b);
        }
        tpf tpfVar3 = this.a;
        return anfq.i(tpfVar3.n(tpfVar3.a.k()), new tox(tpfVar3, (ttj) obj, 6), tpfVar3.b);
    }
}
