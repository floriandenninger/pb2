package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class tpd implements anfz {
    public final /* synthetic */ tpf a;
    public final /* synthetic */ tld b;
    private final /* synthetic */ int c;

    public /* synthetic */ tpd(tpf tpfVar, tld tldVar, int i) {
        this.c = i;
        this.a = tpfVar;
        this.b = tldVar;
    }

    @Override // defpackage.anfz
    public final anhy a(Object obj) {
        int i = this.c;
        if (i == 0) {
            tpf tpfVar = this.a;
            return anfq.i(tpfVar.n(tpfVar.a.i(this.b)), new tox(tpfVar, (ttj) obj, 9), tpfVar.b);
        }
        if (i == 1) {
            tpf tpfVar2 = this.a;
            return anfq.i(tpfVar2.n(tpfVar2.a.g(this.b)), new tox(tpfVar2, (ttj) obj, 8), tpfVar2.b);
        }
        tpf tpfVar3 = this.a;
        return anfq.i(tpfVar3.n(tpfVar3.a.h(this.b)), new tox(tpfVar3, (ttj) obj, 4), tpfVar3.b);
    }
}
