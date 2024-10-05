package defpackage;

import java.util.BitSet;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class drf extends dgy {
    public drh a;
    private final String[] e = {"contentProps"};
    public final BitSet d = new BitSet(1);

    public static /* bridge */ /* synthetic */ void c(drf drfVar, dhe dheVar, drh drhVar) {
        super.w(dheVar, drhVar);
        drfVar.a = drhVar;
        drfVar.d.clear();
    }

    @Override // defpackage.dgy
    public final /* bridge */ /* synthetic */ dha a() {
        o(1, this.d, this.e);
        return this.a;
    }

    @Override // defpackage.dgy
    protected final void b(dha dhaVar) {
        this.a = (drh) dhaVar;
    }
}
