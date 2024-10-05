package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class hln extends hxz implements axql {
    private ContextWrapper a;
    private volatile axqa b;
    private final Object c = new Object();
    private boolean d = false;

    private final void a() {
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
        a();
        o();
    }

    @Override // defpackage.ce, defpackage.aoc
    public final apo getDefaultViewModelProviderFactory() {
        return ayaw.v(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // defpackage.ce
    public final void ku(Context context) {
        super.ku(context);
        a();
        o();
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

    /* JADX WARN: Type inference failed for: r2v25, types: [hrs, java.lang.Object] */
    protected final void o() {
        if (this.d) {
            return;
        }
        this.d = true;
        hmc hmcVar = (hmc) this;
        ehw ehwVar = (ehw) lM();
        hmcVar.aA = new efi(ehwVar.b, ehwVar.aS, ehwVar.c);
        hmcVar.c = (Handler) ehwVar.b.an.get();
        hmcVar.d = (hlo) ehwVar.c.mD.get();
        hmcVar.e = (gni) ehwVar.b.eA.get();
        hmcVar.ae = (hrv) ehwVar.b.a.S.get();
        hmcVar.af = (aahd) ehwVar.c.I.get();
        hmcVar.az = new hol(ehwVar.c.j(), (hrv) ehwVar.b.a.S.get());
        hmcVar.ag = ehwVar.c.kw();
        hmcVar.ax = (hfp) ehwVar.c.hQ.get();
        hmcVar.ah = ehwVar.b.cO();
        hmcVar.ai = (hos) ehwVar.c.jX.get();
        hmcVar.ay = (vgz) ehwVar.b.a.ce.get();
        hmcVar.aj = (hmw) ehwVar.c.hR.get();
        hmcVar.ak = (hrq) ehwVar.c.jq.get();
        hmcVar.al = (hoz) ehwVar.c.mF.get();
    }

    @Override // defpackage.ce
    public final Context qR() {
        if (super.qR() == null && this.a == null) {
            return null;
        }
        a();
        return this.a;
    }
}
