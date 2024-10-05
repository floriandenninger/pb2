package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public class hgn extends ce implements axql {
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
        p();
    }

    @Override // defpackage.ce, defpackage.aoc
    public final apo getDefaultViewModelProviderFactory() {
        return ayaw.v(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // defpackage.ce
    public final void ku(Context context) {
        super.ku(context);
        a();
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
        hhd hhdVar = (hhd) this;
        ehw ehwVar = (ehw) lM();
        hhdVar.a = ehwVar.b.cO();
        hhdVar.b = (hht) ehwVar.k.get();
        hhdVar.aA = (hfp) ehwVar.c.hQ.get();
        hhdVar.c = (hrv) ehwVar.b.a.S.get();
        hhdVar.d = (hjs) ehwVar.l.get();
        hhdVar.aD = ehwVar.aF();
        hhdVar.e = ehwVar.c.g();
        hhdVar.ae = ehwVar.l();
        hhdVar.af = (ida) ehwVar.p.get();
        hhdVar.ag = (hii) ehwVar.q.get();
        hhdVar.ah = ehwVar.k();
        hhdVar.ai = (hrq) ehwVar.c.jq.get();
        eed eedVar = ehwVar.c;
        azrw azrwVar = eedVar.gP;
        azrw azrwVar2 = eedVar.s;
        efz efzVar = ehwVar.b;
        hhdVar.aC = new jlb(azrwVar, azrwVar2, efzVar.lO, eedVar.hR, efzVar.i, efzVar.a.S, (short[]) null);
        hhdVar.aj = ehwVar.v;
        hhdVar.aE = (aoae) ehwVar.c.hS.get();
        hhdVar.ak = (hos) ehwVar.c.jX.get();
        hhdVar.al = (ayqi) ehwVar.b.im.get();
        hhdVar.am = new hne((hmw) ehwVar.c.hR.get());
        hhdVar.an = (gni) ehwVar.b.eA.get();
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
