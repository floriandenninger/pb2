package defpackage;

import java.util.BitSet;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class tcb extends dgy {
    tcd a;
    private final String[] e = {"componentCallable"};
    public final BitSet d = new BitSet(1);

    public static /* bridge */ /* synthetic */ void d(tcb tcbVar, dhe dheVar, tcd tcdVar) {
        super.w(dheVar, tcdVar);
        tcbVar.a = tcdVar;
        tcbVar.d.clear();
    }

    @Override // defpackage.dgy
    protected final void b(dha dhaVar) {
        this.a = (tcd) dhaVar;
    }

    @Override // defpackage.dgy
    /* renamed from: c */
    public final tcd a() {
        o(1, this.d, this.e);
        return this.a;
    }
}
