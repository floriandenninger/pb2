package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class lse extends ajud implements ajth {
    public final Context a;
    public final azrw b;
    public final azrw c;
    public final ajwx d;
    public final ajpd e;
    public boolean f;
    public apux g;
    public kbu h;
    private final azrw m;
    private final lsd n;
    private apuv o;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public lse(android.content.Context r11, defpackage.ajvb r12, defpackage.azrw r13, defpackage.ypa r14, defpackage.zaw r15, defpackage.azrw r16, defpackage.azrw r17, defpackage.aasm r18, defpackage.acra r19, defpackage.ajxe r20, defpackage.ajwx r21) {
        /*
            r10 = this;
            r7 = r10
            r8 = r20
            ajpd r9 = new ajpd
            r9.<init>()
            r12.get()
            r0 = r10
            r1 = r18
            r2 = r14
            r3 = r15
            r4 = r19
            r5 = r20
            r6 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r0 = r11
            r7.a = r0
            r0 = r13
            r7.m = r0
            r0 = r16
            r7.b = r0
            r0 = r17
            r7.c = r0
            r0 = r21
            r7.d = r0
            r7.e = r9
            lsd r0 = new lsd
            r0.<init>(r10)
            r7.n = r0
            java.lang.Class<apux> r0 = defpackage.apux.class
            r1 = r12
            r12.a(r0)
            boolean r0 = r8 instanceof defpackage.lsc
            if (r0 == 0) goto L61
            r0 = r8
            lsc r0 = (defpackage.lsc) r0
            apux r1 = r0.a
            r2 = 0
            r10.m(r1, r2)
            java.util.List r1 = r0.b
            r9.addAll(r1)
            apux r0 = r0.a
            if (r0 == 0) goto L61
            int r1 = r0.b
            r1 = r1 & 16
            if (r1 == 0) goto L61
            acqx r1 = new acqx
            aomf r0 = r0.h
            r1.<init>(r0)
            r0 = r19
            r0.D(r1)
        L61:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lse.<init>(android.content.Context, ajvb, azrw, ypa, zaw, azrw, azrw, aasm, acra, ajxe, ajwx):void");
    }

    public static aqbw c(aqbw aqbwVar, Map map) {
        auar auarVar;
        aqbt aqbtVar = aqbwVar.k;
        if (aqbtVar == null) {
            aqbtVar = aqbt.a;
        }
        if (aqbtVar.b == 135739232) {
            auarVar = (auar) aqbtVar.c;
        } else {
            auarVar = auar.a;
        }
        String str = auarVar.c;
        return map.containsKey(str) ? (aqbw) map.get(str) : aqbwVar;
    }

    public static Object d(List list, int i) {
        if (i < list.size()) {
            return list.get(i);
        }
        return null;
    }

    private final void m(apux apuxVar, boolean z) {
        apuv apuvVar;
        kbu aq;
        apuv apuvVar2;
        apuxVar.getClass();
        this.g = apuxVar;
        apuw apuwVar = apuxVar.d;
        if (apuwVar == null) {
            apuwVar = apuw.a;
        }
        if (apuwVar.b == 140080728) {
            apuvVar = (apuv) apuwVar.c;
        } else {
            apuvVar = apuv.a;
        }
        Iterator it = apuvVar.d.iterator();
        while (true) {
            if (!it.hasNext()) {
                aq = mcy.aq(2, false);
                break;
            }
            aput aputVar = (aput) it.next();
            if (aputVar.d) {
                apuy apuyVar = aputVar.e;
                if (apuyVar == null) {
                    apuyVar = apuy.a;
                }
                int aJ = aobq.aJ(apuyVar.c);
                if (aJ == 0) {
                    aJ = 1;
                }
                aq = mcy.aq(aJ, aputVar.f);
            }
        }
        this.h = aq;
        if (z) {
            lD();
            apuw apuwVar2 = apuxVar.d;
            if (apuwVar2 == null) {
                apuwVar2 = apuw.a;
            }
            if (apuwVar2.b == 140080728) {
                apuw apuwVar3 = apuxVar.d;
                if (apuwVar3 == null) {
                    apuwVar3 = apuw.a;
                }
                if (apuwVar3.b == 140080728) {
                    apuvVar2 = (apuv) apuwVar3.c;
                } else {
                    apuvVar2 = apuv.a;
                }
                this.o = apuvVar2;
            }
            if (apuxVar.e.size() != 0) {
                for (apuz apuzVar : apuxVar.e) {
                    if (apuzVar.b == 48602820) {
                        A((aqbw) apuzVar.c);
                    }
                }
            }
            l();
        }
        apus apusVar = apuxVar.c;
        if (apusVar == null) {
            apusVar = apus.a;
        }
        int aK = aobq.aK(apusVar.c);
        if (aK != 0 && aK == 2) {
            jle jleVar = (jle) this.m.get();
            lsd lsdVar = this.n;
            Set set = jleVar.b;
            lsdVar.getClass();
            set.add(lsdVar);
            jleVar.a();
        }
        this.i.mK(new ajxd(this));
    }

    @Override // defpackage.ajud, defpackage.ajtz, defpackage.zfk
    public final void j() {
        jle jleVar = (jle) this.m.get();
        lsd lsdVar = this.n;
        Set set = jleVar.b;
        lsdVar.getClass();
        set.remove(lsdVar);
        this.h = null;
        this.g = null;
        this.f = false;
    }

    public final void k(apux apuxVar) {
        m(apuxVar, true);
    }

    public final void l() {
        if (!this.f || this.e.size() != 1) {
            if (this.o == null || this.f || this.e.isEmpty()) {
                return;
            }
            C(this.o, 0);
            this.f = true;
            return;
        }
        this.e.clear();
        this.f = false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ajtz
    public final /* bridge */ /* synthetic */ void lB(Object obj, ajcd ajcdVar) {
        apux apuxVar = (apux) obj;
        super.lB(apuxVar, ajcdVar);
        if (apuxVar != null) {
            k(apuxVar);
        }
    }

    @Override // defpackage.ajth
    public final /* synthetic */ void ll(aulm aulmVar, zfi zfiVar, ajug ajugVar, apxf apxfVar) {
        throw null;
    }

    @Override // defpackage.ajth
    public final void lz(aulm aulmVar, apxf apxfVar) {
        lD();
        this.f = false;
        lt(ahbj.o(aulmVar));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ajtz
    public final /* bridge */ /* synthetic */ Object nn(aulp aulpVar) {
        if (aulpVar == null || !aulpVar.pY(apva.a)) {
            return null;
        }
        return (apux) aulpVar.pX(apva.a);
    }

    @Override // defpackage.ajud, defpackage.ajtz, defpackage.ajvz
    public final ajxe ph() {
        ArrayList arrayList = new ArrayList(this.e.size());
        this.e.k(arrayList);
        return new lsc(super.ph(), this.g, arrayList);
    }
}
