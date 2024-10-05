package defpackage;

import java.util.BitSet;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akoo extends dgy {
    akop a;
    private final String[] e = {"analyticsChartType"};
    public final BitSet d = new BitSet(1);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void c(akoo akooVar, dhe dheVar, akop akopVar) {
        super.w(dheVar, akopVar);
        akooVar.a = akopVar;
        akooVar.d.clear();
    }

    @Override // defpackage.dgy
    public final /* bridge */ /* synthetic */ dha a() {
        o(1, this.d, this.e);
        return this.a;
    }

    @Override // defpackage.dgy
    protected final void b(dha dhaVar) {
        this.a = (akop) dhaVar;
    }
}
