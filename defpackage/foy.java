package defpackage;

import java.util.BitSet;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class foy extends dgy {
    foz a;
    private final String[] e = {"children", "conversionContext", "flexDirection"};
    public final BitSet d = new BitSet(3);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void c(foy foyVar, dhe dheVar, foz fozVar) {
        super.w(dheVar, fozVar);
        foyVar.a = fozVar;
        foyVar.d.clear();
    }

    @Override // defpackage.dgy
    public final /* bridge */ /* synthetic */ dha a() {
        o(3, this.d, this.e);
        return this.a;
    }

    @Override // defpackage.dgy
    protected final void b(dha dhaVar) {
        this.a = (foz) dhaVar;
    }
}
