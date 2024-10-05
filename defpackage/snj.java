package defpackage;

import java.util.BitSet;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class snj extends dgy {
    snk a;
    private final String[] e = {"commandResolver", "conversionContext", "logger", "onFrameCompleteCommandFuture", "onProgressCompleteCommandFuture", "type"};
    public final BitSet d = new BitSet(6);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void c(snj snjVar, dhe dheVar, snk snkVar) {
        super.w(dheVar, snkVar);
        snjVar.a = snkVar;
        snjVar.d.clear();
    }

    @Override // defpackage.dgy
    public final /* bridge */ /* synthetic */ dha a() {
        o(6, this.d, this.e);
        return this.a;
    }

    @Override // defpackage.dgy
    protected final void b(dha dhaVar) {
        this.a = (snk) dhaVar;
    }
}
