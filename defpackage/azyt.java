package defpackage;

import org.chromium.net.CellularSignalStrengthError;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
@aztc(b = "kotlinx.coroutines.flow.AbstractFlow", c = "Flow.kt", d = "collect", e = {212})
/* loaded from: classes2.dex */
public final class azyt extends azta {
    Object a;
    /* synthetic */ Object b;
    final /* synthetic */ azyu c;
    int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public azyt(azyu azyuVar, azsq azsqVar) {
        super(azsqVar);
        this.c = azyuVar;
    }

    @Override // defpackage.azsy
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= CellularSignalStrengthError.ERROR_NOT_SUPPORTED;
        return this.c.a(null, this);
    }
}
