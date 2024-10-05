package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agds implements wsg {
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
    private final azrw l;
    private final azrw m;
    private final azrw n;
    private final azrw o;
    private final azrw p;
    private final azrw q;
    private final Executor r;
    private final Executor s;

    public agds(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, azrw azrwVar6, azrw azrwVar7, azrw azrwVar8, azrw azrwVar9, azrw azrwVar10, azrw azrwVar11, azrw azrwVar12, azrw azrwVar13, azrw azrwVar14, azrw azrwVar15, azrw azrwVar16, azrw azrwVar17, Executor executor, Executor executor2) {
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
        this.l = azrwVar12;
        this.m = azrwVar13;
        this.n = azrwVar14;
        this.o = azrwVar15;
        this.p = azrwVar16;
        this.q = azrwVar17;
        this.r = executor2;
        this.s = executor;
    }

    @Override // defpackage.wsg
    public final wqz a(xgh xghVar) {
        if (((wni) this.a.get()).k) {
            if (whl.d(wry.class, xghVar)) {
                return new wry(new wrd((wqy) this.d.get(), xghVar));
            }
            throw new wsf("Unable to build PlayerBytesEmptyFulfillmentAdapter despite ads being blocked");
        }
        if (whl.d(wrx.class, xghVar)) {
            return new wrx(new wrd((wqy) this.d.get(), xghVar));
        }
        if (whl.d(wsb.class, xghVar)) {
            return new wsb(new wrd((wqy) this.d.get(), xghVar), this.r, this.s, (aaea) this.h.get(), (wnx) this.b.get(), (ahfd) this.c.get(), (wyq) this.f.get(), (wyn) this.e.get(), (wni) this.a.get(), (yfl) this.i.get(), (wwg) this.j.get(), (shf) this.p.get(), null, null);
        }
        if (whl.d(wrw.class, xghVar)) {
            return new wrw(new wrd((wqy) this.d.get(), xghVar), this.r, this.s, (wnx) this.b.get(), (ahfd) this.c.get(), (wni) this.a.get(), (wyn) this.e.get(), (wyq) this.f.get(), (wxa) this.g.get(), (yfl) this.i.get(), (aaea) this.h.get(), (shf) this.p.get(), null, null);
        }
        if (whl.d(agdr.class, xghVar)) {
            return new agdr(new wrd((wqy) this.d.get(), xghVar), (ajoy) this.k.get(), (wyn) this.e.get(), (yfl) this.i.get(), (wzn) this.l.get(), new acud((afuh) this.m.get(), (afxf) this.n.get(), "adtracking"), (aapf) this.o.get(), (shf) this.p.get(), this.r, this.s, (aghr) this.q.get(), null, null, null, null);
        }
        throw new wsf("No supported adapters for PlayerBytesFulfillmentAdapterFactory");
    }
}
