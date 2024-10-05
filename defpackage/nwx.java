package defpackage;

import com.google.android.apps.youtube.app.watch.engagementpanel.size.EngagementPanelSizeBehavior;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class nwx {
    public final nwr a;
    public final EngagementPanelSizeBehavior b;
    public final nwy c;
    public final nxp d;
    public final nxl e;
    public final nxg f;
    public final nxc g;
    public final nwh h;
    public final nvy i;
    public final aypn j;
    public final aypn k;
    public final aypn l;
    public final aypn m;
    public int n;
    public nxh o = nxh.HIDDEN;
    public boolean p;

    public nwx(final nwr nwrVar, EngagementPanelSizeBehavior engagementPanelSizeBehavior, nvz nvzVar, nwy nwyVar, nxp nxpVar, nxl nxlVar, nxg nxgVar, nxc nxcVar, nwh nwhVar, nyk nykVar, nvy nvyVar, byte[] bArr) {
        this.a = nwrVar;
        this.b = engagementPanelSizeBehavior;
        this.c = nwyVar;
        this.d = nxpVar;
        this.e = nxlVar;
        this.f = nxgVar;
        this.g = nxcVar;
        this.h = nwhVar;
        this.i = nvyVar;
        azqw av = azqv.aq(nxh.HIDDEN).av();
        aypn h = av.y().q(new nww(this, 0)).h(ntu.f);
        this.j = h;
        aypn aypnVar = nykVar.b;
        final aypn A = aypnVar.A(mmt.r);
        final aypn M = aypnVar.M(mmt.s);
        final aypn n = aypn.sm(nwyVar.c(), nwyVar.d(), h, gii.h).n();
        aypn h2 = h.M(new ayrv() { // from class: nwv
            @Override // defpackage.ayrv
            public final Object a(Object obj) {
                aypn aypnVar2 = aypn.this;
                aypn aypnVar3 = M;
                aypn aypnVar4 = n;
                final aypn I = aypnVar3.S(aypnVar4, knl.r).I(0, knl.p);
                final aypn I2 = aypnVar3.S(aypnVar4, knl.r).I(0, knl.o);
                return aypn.e(aypnVar4, aypnVar2.M(new ayrv() { // from class: nwu
                    @Override // defpackage.ayrv
                    public final Object a(Object obj2) {
                        aypn aypnVar5 = aypn.this;
                        aypn aypnVar6 = I;
                        nxt nxtVar = nxt.NONE;
                        return ((nxt) obj2).ordinal() != 1 ? aypnVar6 : aypnVar5;
                    }
                }), knl.q);
            }
        }).n().h(ntu.f);
        aypn h3 = nxlVar.d.T(h2, nwyVar.d(), new ayrt() { // from class: nwt
            @Override // defpackage.ayrt
            public final Object a(Object obj, Object obj2, Object obj3) {
                aypn c;
                nwr nwrVar2 = nwr.this;
                nxj nxjVar = (nxj) obj;
                int intValue = ((Integer) obj2).intValue();
                int intValue2 = ((Integer) obj3).intValue();
                if (nxjVar.b.h()) {
                    c = (aypn) nxjVar.b.c();
                } else {
                    c = nwrVar2.c(intValue, nwx.a(nwrVar2.b.b().bottom, intValue2, nxjVar.a), nwrVar2.e, nwrVar2.a(), nwr.a);
                }
                return c.A(nxb.b).j(aypn.z(amlr.a));
            }
        }).M(mmt.u).h(ntu.f);
        this.m = aypn.e(h3, h2, knl.n).n().q(new nww(this, 1)).h(ntu.f);
        h3.s(niy.o).S(nxlVar.d, knl.l).ab(av);
        aypn h4 = aypn.e(h3, nvzVar.d(), knl.m).h(ntu.f);
        this.k = h4;
        this.l = aypn.sm(nykVar.a, h4, h3.A(mmt.t), gii.i).n().h(ntu.f);
    }

    public static int a(int i, int i2, nxh nxhVar) {
        if (nxhVar.equals(nxh.FULL_BLEED)) {
            return 0;
        }
        return nxhVar.equals(nxh.HIDDEN) ? i : i2;
    }

    public static int b(int i, int i2, int i3, int i4) {
        int i5 = i + i2;
        return i5 + i3 < i4 ? i4 - i3 : i5;
    }
}
