package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class hdn extends acri implements axql {
    private ContextWrapper a;
    private volatile axqa b;
    private final Object c = new Object();
    private boolean d = false;

    private final void q() {
        if (this.a == null) {
            this.a = axqa.b(super.qR(), this);
        }
    }

    @Override // defpackage.ce
    public final void U(Activity activity) {
        super.U(activity);
        ContextWrapper contextWrapper = this.a;
        boolean z = true;
        if (contextWrapper != null && axqa.a(contextWrapper) != activity) {
            z = false;
        }
        ayaw.q(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        q();
        n();
    }

    @Override // defpackage.axql
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
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

    @Override // defpackage.ce, defpackage.aoc
    public final apo getDefaultViewModelProviderFactory() {
        return ayaw.v(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // defpackage.ce
    public final void ku(Context context) {
        super.ku(context);
        q();
        n();
    }

    @Override // defpackage.axqk
    public final Object lM() {
        return lL().lM();
    }

    @Override // defpackage.ce
    public final LayoutInflater lW(Bundle bundle) {
        return LayoutInflater.from(axqa.c(az(), this));
    }

    protected final void n() {
        if (this.d) {
            return;
        }
        this.d = true;
        hel helVar = (hel) this;
        ehw ehwVar = (ehw) lM();
        helVar.ae = ehwVar.b.cO();
        helVar.af = axqq.a(ehwVar.c.jp);
        helVar.ag = (hrv) ehwVar.b.a.S.get();
        helVar.ah = (gni) ehwVar.b.eA.get();
        helVar.bg = (hfp) ehwVar.c.hQ.get();
        helVar.ai = (hos) ehwVar.c.jX.get();
        helVar.aj = (hmg) ehwVar.c.hP.get();
        helVar.ak = (hlo) ehwVar.c.mD.get();
        helVar.al = (hmw) ehwVar.c.hR.get();
        helVar.am = ehwVar.l();
        helVar.bj = ehwVar.aF();
        helVar.an = (hrq) ehwVar.c.jq.get();
        helVar.ao = (aahd) ehwVar.c.I.get();
        helVar.bh = (vgz) ehwVar.b.a.aq.get();
        helVar.ap = (hoz) ehwVar.c.mF.get();
        helVar.aq = ehwVar.k();
        helVar.ar = (Executor) ehwVar.b.i.get();
        helVar.as = (Executor) ehwVar.b.f.get();
        helVar.at = new hng((hmg) ehwVar.c.hP.get(), (hmw) ehwVar.c.hR.get());
        helVar.au = new hnd(ehwVar.c.a(), ehwVar.b.a.I(), (hmw) ehwVar.c.hR.get());
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
