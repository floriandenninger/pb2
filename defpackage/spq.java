package defpackage;

import java.util.BitSet;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class spq extends dgy {
    sps a;
    private final String[] e = {"child"};
    public final BitSet d = new BitSet(1);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void c(spq spqVar, dhe dheVar, sps spsVar) {
        super.w(dheVar, spsVar);
        spqVar.a = spsVar;
        spqVar.d.clear();
    }

    @Override // defpackage.dgy
    public final /* bridge */ /* synthetic */ dha a() {
        o(1, this.d, this.e);
        return this.a;
    }

    @Override // defpackage.dgy
    protected final void b(dha dhaVar) {
        this.a = (sps) dhaVar;
    }
}
