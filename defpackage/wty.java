package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class wty implements wub, wos {
    private final wni a;
    private final azrw b;
    private final azrw c;
    private final azrw d;
    private final azrw e;
    private final azrw f;
    private final azrw g;
    private final azrw h;
    private final azrw i;
    private final azrw j;
    private final azrw k;
    private final aifw l;
    private final Executor m;
    private final ypa n;
    private wor o;
    private final whu p;

    public wty(wni wniVar, azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, azrw azrwVar6, azrw azrwVar7, azrw azrwVar8, azrw azrwVar9, azrw azrwVar10, wor worVar, aifw aifwVar, Executor executor, ypa ypaVar, whu whuVar, byte[] bArr, byte[] bArr2) {
        this.a = wniVar;
        this.b = azrwVar;
        this.c = azrwVar2;
        this.d = azrwVar3;
        this.e = azrwVar4;
        this.g = azrwVar6;
        this.h = azrwVar7;
        this.i = azrwVar8;
        this.j = azrwVar9;
        this.k = azrwVar10;
        this.f = azrwVar5;
        this.o = worVar;
        this.l = aifwVar;
        this.m = executor;
        this.n = ypaVar;
        this.p = whuVar;
    }

    @Override // defpackage.wub
    public final wsx a(wsw wswVar, xgh xghVar, xev xevVar) {
        if (whl.e(wsv.class, xghVar, xevVar)) {
            return new wsv((wsw) this.b.get(), (aaea) this.d.get(), this.a, (xcl) this.f.get(), (wzq) this.c.get(), (wpn) this.j.get(), (woc) this.e.get(), this.n, this.m, this.l, (wpl) this.k.get(), (xjl) this.i.get(), this.o, (wog) this.g.get(), (wpv) this.h.get(), xghVar, xevVar);
        }
        if (whl.e(wsz.class, xghVar, xevVar)) {
            return new wsz((wsw) this.b.get(), this.m, (xjl) this.i.get(), xghVar, xevVar);
        }
        if (whl.e(wsr.class, xghVar, xevVar)) {
            if (this.o != wor.b) {
                return new wsr((wsw) this.b.get(), (wzq) this.c.get(), this.o, (wog) this.g.get(), (wpl) this.k.get(), (wpn) this.j.get(), this.l, xghVar, xevVar);
            }
            throw new wua("No-op cta overlay api set when trying to build discovery InPlayer LRA");
        }
        if (whl.e(wsq.class, xghVar, xevVar)) {
            return new wsq((wsw) this.b.get(), (xjl) this.i.get(), (wpl) this.k.get(), this.m, xghVar, xevVar);
        }
        throw new wua("InPlayerLayoutRenderingAdapterFactory received unrecognized slot/layout pairing");
    }

    @Override // defpackage.wos
    public final void b(wor worVar) {
        if (worVar == null) {
            whu.l(null, "Received null CtaOverlayApi for registration request");
        } else {
            this.o = worVar;
        }
    }

    @Override // defpackage.wos
    public final void c() {
        this.o = wor.b;
    }
}
