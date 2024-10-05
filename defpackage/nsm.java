package defpackage;

import android.text.TextUtils;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class nsm {
    public final acra a;
    public aqts b;
    public asht c;
    public String d;
    public apxf e;
    private final fgq f;
    private final azrh g = azrh.e();
    private ayqx h;
    private final aadw i;

    public nsm(aadw aadwVar, fgq fgqVar, acra acraVar) {
        this.f = fgqVar;
        this.a = acraVar;
        this.i = aadwVar;
    }

    public static Queue a() {
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.offer(new acqx(acsb.c(96494)));
        arrayDeque.offer(new acqx(acsb.c(31880)));
        return arrayDeque;
    }

    public final void b() {
        final boolean aI = evr.aI(this.i);
        final aypy p = this.f.h().Y(mmt.l).B().p(nuw.b);
        final aypy p2 = this.f.h().Y(mmt.m).B().p(nuw.b);
        this.h = this.g.aj(new ayrv() { // from class: nsl
            @Override // defpackage.ayrv
            public final Object a(Object obj) {
                boolean z = aI;
                aypy aypyVar = p2;
                aypy aypyVar2 = p;
                if (((Boolean) obj).booleanValue()) {
                    return z ? aypyVar : aypyVar2;
                }
                return aypy.W(false);
            }
        }).ax(new ayrs() { // from class: nsk
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                auov auovVar;
                int i;
                nsm nsmVar = nsm.this;
                if (!((Boolean) obj).booleanValue()) {
                    nsmVar.d = nsmVar.a.k();
                    aqts aqtsVar = nsmVar.b;
                    if (aqtsVar != null) {
                        nsmVar.a.q(acqx.a(aqtsVar), nsmVar.c);
                    }
                    nsmVar.a.t();
                    return;
                }
                aqts aqtsVar2 = nsmVar.b;
                int i2 = 32633;
                if (aqtsVar2 != null && (i = aqtsVar2.w) > 0) {
                    i2 = i;
                }
                if (TextUtils.isEmpty(nsmVar.d)) {
                    acra acraVar = nsmVar.a;
                    acsc b = acsb.b(i2);
                    acrs acrsVar = acrs.OVERLAY;
                    apxf apxfVar = nsmVar.e;
                    acraVar.e(b, acrsVar, apxfVar, adyu.cg(apxfVar, asit.b), adyu.cg(nsmVar.e, asit.a));
                    asuh cf = adyu.cf(nsmVar.b);
                    if (cf == null || (cf.c & 1) == 0) {
                        aqts aqtsVar3 = nsmVar.b;
                        if (aqtsVar3 != null) {
                            aqtq aqtqVar = aqtsVar3.g;
                            if (aqtqVar == null) {
                                aqtqVar = aqtq.a;
                            }
                            if (aqtqVar.b == 49399797) {
                                aqts aqtsVar4 = nsmVar.b;
                                aqtsVar4.getClass();
                                acra acraVar2 = nsmVar.a;
                                aqtq aqtqVar2 = aqtsVar4.g;
                                if (aqtqVar2 == null) {
                                    aqtqVar2 = aqtq.a;
                                }
                                if (aqtqVar2.b == 49399797) {
                                    auovVar = (auov) aqtqVar2.c;
                                } else {
                                    auovVar = auov.a;
                                }
                                acraVar2.D(new acqx(auovVar.m.I()));
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    nsmVar.a.D(new acqx(cf.d));
                    nsmVar.a.v(nsmVar.b, aomf.b, nsmVar.c);
                    return;
                }
                acra acraVar3 = nsmVar.a;
                acsc b2 = acsb.b(i2);
                acrs acrsVar2 = acrs.OVERLAY;
                aong aongVar = (aong) nsmVar.e.toBuilder();
                aonk aonkVar = atmb.b;
                aone builder = ((atmc) nsmVar.e.pX(atmb.b)).toBuilder();
                String str = nsmVar.d;
                str.getClass();
                builder.copyOnWrite();
                atmc atmcVar = (atmc) builder.instance;
                atmcVar.b |= 32;
                atmcVar.f = str;
                aongVar.e(aonkVar, (atmc) builder.build());
                acraVar3.e(b2, acrsVar2, (apxf) aongVar.build(), adyu.cg(nsmVar.e, asit.b), adyu.cg(nsmVar.e, asit.a));
            }
        });
    }

    public final void c() {
        ayqx ayqxVar = this.h;
        if (ayqxVar == null || ayqxVar.e()) {
            return;
        }
        ayrz.c((AtomicReference) this.h);
    }

    public final void d() {
        this.g.c(false);
    }

    public final void e(apxf apxfVar) {
        this.e = apxfVar;
        this.g.c(true);
    }

    public final void f() {
        this.d = null;
    }

    public final void g(aqts aqtsVar, asht ashtVar) {
        this.b = aqtsVar;
        this.c = ashtVar;
    }
}
