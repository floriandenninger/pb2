package defpackage;

import java.util.BitSet;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class slg extends dgy {
    slh a;
    private final String[] e = {"componentElementSubscription", "delegate", "elementConverterFlat", "templateLoggerFactory"};
    public final BitSet d = new BitSet(4);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void d(slg slgVar, dhe dheVar, slh slhVar) {
        super.w(dheVar, slhVar);
        slgVar.a = slhVar;
        slgVar.d.clear();
    }

    @Override // defpackage.dgy
    protected final void b(dha dhaVar) {
        this.a = (slh) dhaVar;
    }

    @Override // defpackage.dgy
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final slh a() {
        o(4, this.d, this.e);
        return this.a;
    }
}
