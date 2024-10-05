package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
class laj extends gir implements axql {
    private ContextWrapper a;
    private volatile axqa b;
    private final Object c = new Object();
    private boolean d = false;

    private final void n() {
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
        n();
        q();
    }

    @Override // defpackage.ce, defpackage.aoc
    public final apo getDefaultViewModelProviderFactory() {
        return ayaw.v(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // defpackage.ce
    public final void ku(Context context) {
        super.ku(context);
        n();
        q();
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
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
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

    protected final void q() {
        if (this.d) {
            return;
        }
        this.d = true;
        lbz lbzVar = (lbz) this;
        ehw ehwVar = (ehw) lM();
        lbzVar.ar = axqq.a(ehwVar.b.lO);
        lbzVar.av = (aadw) ehwVar.b.D.get();
        lbzVar.as = (gad) ehwVar.c.eo.get();
        lbzVar.at = (giv) ehwVar.c.ae.get();
        lbzVar.au = (gje) ehwVar.c.l.get();
        efz efzVar = ehwVar.b;
        efc efcVar = efzVar.a;
        lbzVar.a = efcVar.n;
        lbzVar.b = efcVar.bm;
        lbzVar.c = (Executor) efzVar.f.get();
        lbzVar.d = (Executor) ehwVar.b.i.get();
        lbzVar.e = (lhd) ehwVar.b.us.get();
        lbzVar.aK = (rxm) ehwVar.c.ei.get();
        lbzVar.ae = (acsy) ehwVar.b.ee.get();
        lbzVar.aJ = (aadw) ehwVar.b.D.get();
        lbzVar.af = (SharedPreferences) ehwVar.b.z.get();
        lbzVar.ag = (aaea) ehwVar.b.K.get();
        lbzVar.ah = (fgq) ehwVar.c.A.get();
        lbzVar.ai = (akei) ehwVar.b.xF.get();
        lbzVar.aj = (afsy) ehwVar.b.au.get();
        lbzVar.ak = (mak) ehwVar.c.es.get();
        lbzVar.al = (akcp) ehwVar.c.er.get();
        lbzVar.aO = ehwVar.c.mM();
        lbzVar.am = (akeh) ehwVar.b.uo.get();
        lbzVar.aN = ehwVar.c.my();
        lbzVar.aP = enq.R((aaea) ehwVar.b.a.dm.c.K.get());
        lbzVar.an = (aksl) ehwVar.b.ha.get();
        lbzVar.ao = (aahd) ehwVar.c.I.get();
        lbzVar.aw = (ajjz) ehwVar.b.kp.get();
        lbzVar.aL = (axzg) ehwVar.b.uk.get();
        lbzVar.aM = (axzg) ehwVar.b.a.bt.get();
    }

    @Override // defpackage.ce
    public final Context qR() {
        if (super.qR() == null && this.a == null) {
            return null;
        }
        n();
        return this.a;
    }
}
