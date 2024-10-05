package defpackage;

import java.util.BitSet;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fpm extends dgy {
    fpo a;
    private final String[] e = {"children", "flexDirection", "playerTrackerComponent", "uiHandler"};
    public final BitSet d = new BitSet(4);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void c(fpm fpmVar, dhe dheVar, fpo fpoVar) {
        super.w(dheVar, fpoVar);
        fpmVar.a = fpoVar;
        fpmVar.d.clear();
    }

    @Override // defpackage.dgy
    public final /* bridge */ /* synthetic */ dha a() {
        o(4, this.d, this.e);
        return this.a;
    }

    @Override // defpackage.dgy
    protected final void b(dha dhaVar) {
        this.a = (fpo) dhaVar;
    }
}
