package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class wsd implements wsg {
    private final azrw a;
    private final azrw b;
    private final Executor c;
    private final Executor d;
    private final aaea e;
    private final /* synthetic */ int f;

    public wsd(azrw azrwVar, azrw azrwVar2, aaea aaeaVar, Executor executor, Executor executor2, int i) {
        this.f = i;
        this.a = azrwVar;
        this.b = azrwVar2;
        this.c = executor;
        this.d = executor2;
        this.e = aaeaVar;
    }

    public wsd(azrw azrwVar, azrw azrwVar2, Executor executor, Executor executor2, aaea aaeaVar, int i) {
        this.f = i;
        this.a = azrwVar;
        this.b = azrwVar2;
        this.c = executor2;
        this.d = executor;
        this.e = aaeaVar;
    }

    @Override // defpackage.wsg
    public final wqz a(xgh xghVar) {
        if (this.f == 0) {
            if (wbs.x(this.e)) {
                if (whl.d(wqr.class, xghVar)) {
                    return new wqr(new wrd((wqy) this.a.get(), xghVar), (wyn) this.b.get(), xghVar);
                }
            } else if (whl.d(wrp.class, xghVar)) {
                return new wrp(new wrd((wqy) this.a.get(), xghVar), this.c, this.d, (wyn) this.b.get(), xghVar);
            }
            if (whl.d(wqp.class, xghVar)) {
                return new wqp(new wrd((wqy) this.a.get(), xghVar), (wyn) this.b.get(), xghVar);
            }
            throw new wsf("No supported adapters for BelowPlayerImmersiveFulfillmentAdapterFactory");
        }
        if (wbs.x(this.e)) {
            if (whl.d(ejv.class, xghVar)) {
                return new ejv(new wrd((wqy) this.a.get(), xghVar), (wyn) this.b.get(), xghVar);
            }
        } else if (whl.d(ejx.class, xghVar)) {
            return new ejx(new wrd((wqy) this.a.get(), xghVar), (wyn) this.b.get(), this.c, this.d, xghVar);
        }
        throw new wsf("No supported adapters for FullscreenEngagementSlotFulfillmentAdapterFactory");
    }
}
