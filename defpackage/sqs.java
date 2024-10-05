package defpackage;

import java.util.BitSet;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class sqs extends dgy {
    public sqt a;
    private final String[] e = {"children", "commandResolver", "conversionContext", "flexDirection", "logger", "onScrollBeganDraggingCommandFuture", "onScrollCommandFuture", "onScrollDidStopCommandFuture", "scrollableContainerType"};
    public final BitSet d = new BitSet(9);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void c(sqs sqsVar, dhe dheVar, sqt sqtVar) {
        super.w(dheVar, sqtVar);
        sqsVar.a = sqtVar;
        sqsVar.d.clear();
    }

    @Override // defpackage.dgy
    public final /* bridge */ /* synthetic */ dha a() {
        o(9, this.d, this.e);
        return this.a;
    }

    @Override // defpackage.dgy
    protected final void b(dha dhaVar) {
        this.a = (sqt) dhaVar;
    }
}
