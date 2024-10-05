package defpackage;

import java.util.BitSet;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class snu extends dgy {
    snw a;
    private final String[] e = {"children", "collectionType", "commandResolver", "conversionContext", "onScrollBeganDraggingCommandFuture", "onScrollCommandFuture", "onScrollDidStopCommandFuture", "scrollToItemCommandHandler"};
    public final BitSet d = new BitSet(8);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void c(snu snuVar, dhe dheVar, snw snwVar) {
        super.w(dheVar, snwVar);
        snuVar.a = snwVar;
        snuVar.d.clear();
    }

    @Override // defpackage.dgy
    public final /* bridge */ /* synthetic */ dha a() {
        o(8, this.d, this.e);
        return this.a;
    }

    @Override // defpackage.dgy
    protected final void b(dha dhaVar) {
        this.a = (snw) dhaVar;
    }
}
