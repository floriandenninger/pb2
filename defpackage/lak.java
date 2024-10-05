package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.provider.SearchRecentSuggestions;
import android.view.LayoutInflater;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
class lak extends gir implements axql {
    private ContextWrapper a;
    private volatile axqa b;
    private final Object c = new Object();
    private boolean d = false;

    private final void q() {
        if (this.a == null) {
            this.a = axqa.b(super.qR(), this);
        }
    }

    @Override // defpackage.gir, defpackage.ce
    public final void U(Activity activity) {
        super.U(activity);
        ContextWrapper contextWrapper = this.a;
        boolean z = true;
        if (contextWrapper != null && axqa.a(contextWrapper) != activity) {
            z = false;
        }
        ayaw.q(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        q();
        p();
    }

    @Override // defpackage.ce, defpackage.aoc
    public final apo getDefaultViewModelProviderFactory() {
        return ayaw.v(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // defpackage.ce
    public final void ku(Context context) {
        super.ku(context);
        q();
        p();
    }

    @Override // defpackage.axqk
    public final Object lM() {
        return lL().lM();
    }

    @Override // defpackage.ce
    public final LayoutInflater lW(Bundle bundle) {
        return LayoutInflater.from(axqa.c(az(), this));
    }

    @Override // defpackage.axql
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public final axqa lL() {
        if (this.b == null) {
            synchronized (this.c) {
                if (this.b == null) {
                    this.b = new axqa(this);
                }
            }
        }
        return this.b;
    }

    protected final void p() {
        if (this.d) {
            return;
        }
        this.d = true;
        lcl lclVar = (lcl) this;
        ehw ehwVar = (ehw) lM();
        lclVar.ar = axqq.a(ehwVar.b.lO);
        lclVar.av = (aadw) ehwVar.b.D.get();
        lclVar.as = (gad) ehwVar.c.eo.get();
        lclVar.at = (giv) ehwVar.c.ae.get();
        lclVar.au = (gje) ehwVar.c.l.get();
        lclVar.a = axqq.a(ehwVar.c.eE);
        lclVar.b = axqq.a(ehwVar.c.et);
        lclVar.c = (SearchRecentSuggestions) ehwVar.b.a.cz.get();
        lclVar.d = (ypa) ehwVar.b.B.get();
        efz efzVar = ehwVar.b;
        lclVar.e = efzVar.a.n;
        lclVar.ae = (lhd) efzVar.us.get();
        lclVar.af = (fzj) ehwVar.c.ej.get();
        lclVar.ag = (jcm) ehwVar.c.ee.get();
        efz efzVar2 = ehwVar.b;
        azrw azrwVar = efzVar2.gH;
        eed eedVar = ehwVar.c;
        lclVar.aL = new agqo(azrwVar, eedVar.nB, efzVar2.a.cA, ehwVar.aq, eedVar.dG, efzVar2.i, efzVar2.iN, efzVar2.D, efzVar2.K, ehwVar.ay, ehwVar.ar, ehwVar.az, efzVar2.kK, (char[]) null);
        efz efzVar3 = ehwVar.b;
        azrw azrwVar2 = efzVar3.me;
        eed eedVar2 = ehwVar.c;
        azrw azrwVar3 = eedVar2.aw;
        azrw azrwVar4 = eedVar2.al;
        azrw azrwVar5 = eedVar2.nC;
        azrw azrwVar6 = ehwVar.aA;
        azrw azrwVar7 = ehwVar.aB;
        azrw azrwVar8 = efzVar3.an;
        azrw azrwVar9 = efzVar3.a.cF;
        azrw azrwVar10 = eedVar2.hj;
        azrw azrwVar11 = eedVar2.hC;
        azrw azrwVar12 = eedVar2.er;
        azrw azrwVar13 = efzVar3.nW;
        azrw azrwVar14 = efzVar3.nX;
        azrw azrwVar15 = efzVar3.B;
        azrw azrwVar16 = efzVar3.iN;
        azrw azrwVar17 = eedVar2.ej;
        azrw azrwVar18 = efzVar3.us;
        azrw azrwVar19 = efzVar3.D;
        azrw azrwVar20 = efzVar3.K;
        azrw b = axqv.b(efzVar3.wz);
        efz efzVar4 = ehwVar.b;
        azrw azrwVar21 = efzVar4.kp;
        azrw azrwVar22 = efzVar4.cK;
        azrw azrwVar23 = efzVar4.ee;
        efc efcVar = efzVar4.a;
        azrw azrwVar24 = efcVar.f203J;
        azrw azrwVar25 = efcVar.cG;
        eed eedVar3 = ehwVar.c;
        lclVar.ah = new lax(azrwVar2, azrwVar3, azrwVar4, azrwVar5, azrwVar6, azrwVar7, azrwVar8, azrwVar9, azrwVar10, azrwVar11, azrwVar12, azrwVar13, azrwVar14, azrwVar15, azrwVar16, azrwVar17, azrwVar18, azrwVar19, azrwVar20, b, azrwVar21, azrwVar22, azrwVar23, azrwVar24, azrwVar25, eedVar3.I, efzVar4.ha, ehwVar.aC, eedVar3.dG, efcVar.bm, eedVar3.gD, efcVar.bt, efcVar.bb);
        lclVar.aN = ehwVar.c.mM();
        lclVar.aK = ehwVar.c.my();
        lclVar.ai = (acsy) ehwVar.b.ee.get();
        lclVar.aj = (aaea) ehwVar.b.K.get();
        lclVar.ak = (afsy) ehwVar.b.au.get();
        lclVar.al = (fwo) ehwVar.c.ah.get();
        lclVar.aJ = (rxm) ehwVar.c.ei.get();
        lclVar.am = (mak) ehwVar.c.es.get();
        lclVar.an = (Executor) ehwVar.b.i.get();
        lclVar.aH = (onf) ehwVar.c.F.get();
        lclVar.aI = (mda) ehwVar.b.xB.get();
        eed eedVar4 = ehwVar.c;
        azrw azrwVar26 = eedVar4.f;
        azrw azrwVar27 = eedVar4.t;
        efz efzVar5 = ehwVar.b;
        lclVar.aM = new ohx(azrwVar26, azrwVar27, efzVar5.jg, efzVar5.jW, efzVar5.jm, efzVar5.jD, efzVar5.jl, efzVar5.xx, efzVar5.yE, efzVar5.ja, efzVar5.iu, null, null, null);
        lclVar.ao = (yzm) ehwVar.b.wT.get();
    }

    @Override // defpackage.ce
    public final Context qR() {
        if (super.qR() == null && this.a == null) {
            return null;
        }
        q();
        return this.a;
    }
}
