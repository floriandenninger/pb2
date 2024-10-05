package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class wuc implements wub {
    private final azrw a;
    private final azrw b;
    private final azrw c;
    private final azrw d;
    private final Executor e;

    public wuc(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, Executor executor) {
        this.a = azrwVar;
        this.b = azrwVar2;
        this.c = azrwVar3;
        this.d = azrwVar4;
        this.e = executor;
    }

    @Override // defpackage.wub
    public final wsx a(wsw wswVar, xgh xghVar, xev xevVar) {
        if (whl.e(wtf.class, xghVar, xevVar)) {
            return new wtf((wsw) this.a.get(), this.e, (xcl) this.b.get(), (wog) this.c.get(), (wot) this.d.get(), xghVar, xevVar);
        }
        if (whl.e(wtd.class, xghVar, xevVar)) {
            return new wtd((wsw) this.a.get(), this.e, (xcl) this.b.get(), (wog) this.c.get(), (wot) this.d.get(), xghVar, xevVar);
        }
        throw new wua("LockScreenLayoutRenderingAdapterFactory received unrecognized slot/layout pairing");
    }
}
