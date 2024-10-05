package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;

/* compiled from: PG */
/* loaded from: classes3.dex */
class jqf extends gir implements axql {
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
        jqi jqiVar = (jqi) this;
        ehw ehwVar = (ehw) lM();
        jqiVar.ar = axqq.a(ehwVar.b.lO);
        jqiVar.av = (aadw) ehwVar.b.D.get();
        jqiVar.as = (gad) ehwVar.c.eo.get();
        jqiVar.at = (giv) ehwVar.c.ae.get();
        jqiVar.au = (gje) ehwVar.c.l.get();
        jqiVar.a = (ypa) ehwVar.b.B.get();
        jqiVar.b = (ysy) ehwVar.b.as.get();
        jqiVar.c = ehwVar.c.je();
        jqiVar.al = (agof) ehwVar.b.gH.get();
        efz efzVar = ehwVar.b;
        azrw azrwVar = efzVar.ig;
        eed eedVar = ehwVar.c;
        jqiVar.am = new lwk(azrwVar, eedVar.f, efzVar.B, efzVar.K, ehwVar.ao, ehwVar.ap, efzVar.yd, ehwVar.aq, eedVar.no, eedVar.am, ehwVar.ar, efzVar.gH, null);
        jqiVar.d = (jsk) ehwVar.b.a.f.get();
        jqiVar.e = (fjm) ehwVar.b.nM.get();
        jqiVar.ae = axqq.a(ehwVar.c.et);
        jqiVar.af = (juy) ehwVar.b.a.bR.get();
        jqiVar.ag = (gad) ehwVar.c.ep.get();
        jqiVar.an = (axzg) ehwVar.b.ig.get();
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
