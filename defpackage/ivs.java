package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;

/* compiled from: PG */
/* loaded from: classes3.dex */
class ivs extends gir implements axql {
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
        ixc ixcVar = (ixc) this;
        ehw ehwVar = (ehw) lM();
        ixcVar.ar = axqq.a(ehwVar.b.lO);
        ixcVar.av = (aadw) ehwVar.b.D.get();
        ixcVar.as = (gad) ehwVar.c.eo.get();
        ixcVar.at = (giv) ehwVar.c.ae.get();
        ixcVar.au = (gje) ehwVar.c.l.get();
        ixcVar.a = (afsy) ehwVar.b.au.get();
        ixcVar.b = (abav) ehwVar.b.a.q.get();
        ixcVar.c = (abaz) ehwVar.b.mb.get();
        ixcVar.d = (zaw) ehwVar.b.iN.get();
        ixcVar.e = (ypa) ehwVar.b.B.get();
        ixcVar.ae = (ajjz) ehwVar.b.kp.get();
        ixcVar.af = (aahd) ehwVar.c.I.get();
        ixcVar.an = ehwVar.c.mZ();
        ixcVar.am = ehwVar.aR();
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
