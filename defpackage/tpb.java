package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class tpb implements anfz {
    public final /* synthetic */ tpf a;
    public final /* synthetic */ List b;
    private final /* synthetic */ int c;

    public /* synthetic */ tpb(tpf tpfVar, List list, int i) {
        this.c = i;
        this.a = tpfVar;
        this.b = list;
    }

    @Override // defpackage.anfz
    public final anhy a(Object obj) {
        if (this.c == 0) {
            tpf tpfVar = this.a;
            return anfq.i(tpfVar.n(tpfVar.a.m(this.b)), new tox(tpfVar, (ttj) obj, 7), tpfVar.b);
        }
        tpf tpfVar2 = this.a;
        return anfq.i(tpfVar2.n(tpfVar2.a.j(this.b)), new tox(tpfVar2, (ttj) obj, 5), tpfVar2.b);
    }
}
