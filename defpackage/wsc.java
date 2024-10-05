package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class wsc implements wsg {
    private final azrw a;
    private final azrw b;
    private final Executor c;
    private final Executor d;
    private final whu e;

    public wsc(azrw azrwVar, azrw azrwVar2, Executor executor, Executor executor2, whu whuVar, byte[] bArr, byte[] bArr2) {
        this.a = azrwVar;
        this.b = azrwVar2;
        this.c = executor;
        this.d = executor2;
        this.e = whuVar;
    }

    @Override // defpackage.wsg
    public final wqz a(xgh xghVar) {
        if (whl.d(wrn.class, xghVar)) {
            return new wrn(new wrd((wqy) this.a.get(), xghVar), this.c, this.d, (wyn) this.b.get(), xghVar);
        }
        if (whl.d(wqn.class, xghVar)) {
            return new wqn(new wrd((wqy) this.a.get(), xghVar), (wyn) this.b.get());
        }
        if (whl.d(wql.class, xghVar)) {
            return new wql(new wrd((wqy) this.a.get(), xghVar), (wyn) this.b.get(), xghVar);
        }
        throw new wsf("No supported adapters for BelowPlayerFulfillmentAdapterFactory");
    }
}
