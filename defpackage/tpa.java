package defpackage;

import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class tpa implements anfz {
    public final /* synthetic */ tpf a;
    public final /* synthetic */ Comparator b;
    private final /* synthetic */ int c;

    public /* synthetic */ tpa(tpf tpfVar, Comparator comparator, int i) {
        this.c = i;
        this.a = tpfVar;
        this.b = comparator;
    }

    @Override // defpackage.anfz
    public final anhy a(Object obj) {
        if (this.c == 0) {
            final tpf tpfVar = this.a;
            final Comparator comparator = this.b;
            final ttj ttjVar = (ttj) obj;
            final int i = 0;
            return anfq.i(tpfVar.n(tpfVar.a.d()), new anfz() { // from class: toy
                @Override // defpackage.anfz
                public final anhy a(Object obj2) {
                    if (i == 0) {
                        return tpfVar.p(ttjVar, (ttj) obj2, comparator, 1092);
                    }
                    return tpfVar.p(ttjVar, (ttj) obj2, comparator, 1093);
                }
            }, tpfVar.b);
        }
        final tpf tpfVar2 = this.a;
        final Comparator comparator2 = this.b;
        final ttj ttjVar2 = (ttj) obj;
        final int i2 = 1;
        return anfq.i(tpfVar2.n(tpfVar2.a.c()), new anfz() { // from class: toy
            @Override // defpackage.anfz
            public final anhy a(Object obj2) {
                if (i2 == 0) {
                    return tpfVar2.p(ttjVar2, (ttj) obj2, comparator2, 1092);
                }
                return tpfVar2.p(ttjVar2, (ttj) obj2, comparator2, 1093);
            }
        }, tpfVar2.b);
    }
}
