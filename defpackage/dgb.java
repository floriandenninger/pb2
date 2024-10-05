package defpackage;

import java.util.AbstractList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dgb extends AbstractList {
    final List a;

    public dgb(dfm dfmVar, ddz... ddzVarArr) {
        deg c = ((deb) dfmVar.m).c();
        if (dfmVar.m.j(dfr.class).isEmpty()) {
            this.a = new axlj(dfmVar.n().a, c);
        } else {
            this.a = new axll(dfmVar.n().a, c, ddzVarArr);
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        return (axlb) this.a.get(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a.size();
    }
}
