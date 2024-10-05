package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
class erv extends gir implements axql {
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
        aJ();
    }

    @Override // defpackage.axql
    /* renamed from: aI, reason: merged with bridge method [inline-methods] */
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

    protected final void aJ() {
        if (this.d) {
            return;
        }
        this.d = true;
        eru eruVar = (eru) this;
        ehw ehwVar = (ehw) lM();
        eruVar.ar = axqq.a(ehwVar.b.lO);
        eruVar.av = (aadw) ehwVar.b.D.get();
        eruVar.as = (gad) ehwVar.c.eo.get();
        eruVar.at = (giv) ehwVar.c.ae.get();
        eruVar.au = (gje) ehwVar.c.l.get();
        eruVar.b = (afsy) ehwVar.b.au.get();
        eruVar.c = (ypa) ehwVar.b.B.get();
        eruVar.d = (zaw) ehwVar.b.iN.get();
        eruVar.e = (aaux) ehwVar.b.a.t.get();
        eruVar.ae = (ajjz) ehwVar.b.kp.get();
        eruVar.af = (wdt) ehwVar.c.hi.get();
        eruVar.ag = (eqg) ehwVar.c.ia.get();
        eruVar.ah = (aahd) ehwVar.c.I.get();
        eruVar.ai = (akgl) ehwVar.b.a.bd.get();
        eruVar.aj = (Executor) ehwVar.b.i.get();
        eruVar.ak = ehwVar.c.hZ;
    }

    @Override // defpackage.ce, defpackage.aoc
    public final apo getDefaultViewModelProviderFactory() {
        return ayaw.v(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // defpackage.ce
    public final void ku(Context context) {
        super.ku(context);
        n();
        aJ();
    }

    @Override // defpackage.axqk
    public final Object lM() {
        return lL().lM();
    }

    @Override // defpackage.ce
    public final LayoutInflater lW(Bundle bundle) {
        return LayoutInflater.from(axqa.c(az(), this));
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
