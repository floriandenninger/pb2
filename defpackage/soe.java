package defpackage;

import java.util.BitSet;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class soe extends dgy {
    sog a;
    private final String[] e = {"conversionContext", "crashOnTemplateResolutionError", "debuggerClient", "debuggerStatus", "devServerEnabled", "elementSource", "logger", "templatePerformanceLogger", "typeAndProperties"};
    public final BitSet d = new BitSet(9);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void c(soe soeVar, dhe dheVar, sog sogVar) {
        super.w(dheVar, sogVar);
        soeVar.a = sogVar;
        soeVar.d.clear();
    }

    @Override // defpackage.dgy
    public final /* bridge */ /* synthetic */ dha a() {
        o(9, this.d, this.e);
        return this.a;
    }

    @Override // defpackage.dgy
    protected final void b(dha dhaVar) {
        this.a = (sog) dhaVar;
    }
}
