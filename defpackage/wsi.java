package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class wsi implements wsg {
    private final azrw a;
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
    private final Executor l;
    private final Executor m;

    public wsi(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, azrw azrwVar6, azrw azrwVar7, azrw azrwVar8, azrw azrwVar9, azrw azrwVar10, azrw azrwVar11, Executor executor, Executor executor2) {
        this.a = azrwVar;
        this.b = azrwVar2;
        this.c = azrwVar3;
        this.d = azrwVar4;
        this.e = azrwVar5;
        this.f = azrwVar6;
        this.g = azrwVar7;
        this.h = azrwVar8;
        this.i = azrwVar9;
        this.j = azrwVar10;
        this.k = azrwVar11;
        this.l = executor2;
        this.m = executor;
    }

    @Override // defpackage.wsg
    public final wqz a(xgh xghVar) {
        if (whl.d(wrx.class, xghVar)) {
            return new wrx(new wrd((wqy) this.d.get(), xghVar));
        }
        if (whl.d(wsb.class, xghVar)) {
            return new wsb(new wrd((wqy) this.d.get(), xghVar), this.l, this.m, (aaea) this.h.get(), (wnx) this.b.get(), (ahfd) this.c.get(), (wyq) this.f.get(), (wyn) this.e.get(), (wni) ((axqs) this.a).a, (yfl) this.i.get(), (wwg) this.j.get(), (shf) this.k.get(), null, null);
        }
        if (whl.d(wrw.class, xghVar)) {
            return new wrw(new wrd((wqy) this.d.get(), xghVar), this.l, this.m, (wnx) this.b.get(), (ahfd) this.c.get(), (wni) ((axqs) this.a).a, (wyn) this.e.get(), (wyq) this.f.get(), (wxa) this.g.get(), (yfl) this.i.get(), (aaea) this.h.get(), (shf) this.k.get(), null, null);
        }
        throw new wsf("No supported adapters for PlayerBytesFulfillmentAdapterFactory");
    }
}
