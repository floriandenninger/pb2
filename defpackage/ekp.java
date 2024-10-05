package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ekp implements wsg {
    private final azrw a;
    private final azrw b;
    private final Executor c;
    private final Executor d;

    public ekp(azrw azrwVar, azrw azrwVar2, Executor executor, Executor executor2) {
        this.a = azrwVar;
        this.b = azrwVar2;
        this.d = executor;
        this.c = executor2;
    }

    @Override // defpackage.wsg
    public final wqz a(xgh xghVar) {
        if (whl.d(eko.class, xghVar)) {
            return new eko(new wrd((wqy) this.a.get(), xghVar), this.c, this.d, (wyn) this.b.get());
        }
        throw new wsf("No supported adapters for SequenceItemInPlayerFulfillmentAdapterFactory");
    }
}
