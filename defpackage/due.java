package defpackage;

import java.util.BitSet;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class due extends dgy {
    public dug a;
    private final String[] e = {"childComponent"};
    public final BitSet d = new BitSet(1);

    public static /* bridge */ /* synthetic */ void c(due dueVar, dhe dheVar, dug dugVar) {
        super.w(dheVar, dugVar);
        dueVar.a = dugVar;
        dueVar.d.clear();
    }

    @Override // defpackage.dgy
    public final /* bridge */ /* synthetic */ dha a() {
        o(1, this.d, this.e);
        return this.a;
    }

    @Override // defpackage.dgy
    protected final void b(dha dhaVar) {
        this.a = (dug) dhaVar;
    }
}
