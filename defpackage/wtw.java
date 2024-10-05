package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class wtw implements wub {
    private final azrw a;
    private final azrw b;
    private final Executor c;
    private final azrw d;
    private final azrw e;
    private final azrw f;
    private final azrw g;

    public wtw(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, azrw azrwVar6, Executor executor) {
        this.a = azrwVar;
        this.b = azrwVar2;
        this.c = executor;
        this.d = azrwVar3;
        this.e = azrwVar4;
        this.f = azrwVar5;
        this.g = azrwVar6;
    }

    @Override // defpackage.wub
    public final wsx a(wsw wswVar, xgh xghVar, xev xevVar) {
        if (whl.e(wtb.class, xghVar, xevVar)) {
            return new wtb((wsw) this.a.get(), (xcl) this.b.get(), (xjl) this.d.get(), this.c, (wog) this.e.get(), (wpl) this.f.get(), (ajoy) this.g.get(), xghVar, xevVar, null, null);
        }
        throw new wua("FixedFooterLayoutRenderingAdapterFactory received unrecognized slot/layout pairing");
    }
}
