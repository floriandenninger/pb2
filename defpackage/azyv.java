package defpackage;

import org.chromium.net.CellularSignalStrengthError;

@aztc(b = "kotlinx.coroutines.flow.DistinctFlowImpl$collect$$inlined$collect$1", c = "Distinct.kt", d = "emit", e = {139})
/* loaded from: classes2.dex */
public final class azyv extends azta {
    /* synthetic */ Object a;
    int b;
    final /* synthetic */ azyw c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public azyv(azyw azywVar, azsq azsqVar) {
        super(azsqVar);
        this.c = azywVar;
    }

    @Override // defpackage.azsy
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= CellularSignalStrengthError.ERROR_NOT_SUPPORTED;
        return this.c.emit(null, this);
    }
}
