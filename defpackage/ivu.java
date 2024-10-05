package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;

/* compiled from: PG */
/* loaded from: classes3.dex */
class ivu extends bv implements axql {
    private ContextWrapper ae;
    private volatile axqa af;
    private final Object ag = new Object();
    private boolean ah = false;

    private final void aH() {
        if (this.ae == null) {
            this.ae = axqa.b(super.qR(), this);
        }
    }

    @Override // defpackage.ce
    public final void U(Activity activity) {
        super.U(activity);
        ContextWrapper contextWrapper = this.ae;
        boolean z = true;
        if (contextWrapper != null && axqa.a(contextWrapper) != activity) {
            z = false;
        }
        ayaw.q(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        aH();
        aG();
    }

    @Override // defpackage.axql
    /* renamed from: aF, reason: merged with bridge method [inline-methods] */
    public final axqa lL() {
        if (this.af == null) {
            synchronized (this.ag) {
                if (this.af == null) {
                    this.af = new axqa(this);
                }
            }
        }
        return this.af;
    }

    protected final void aG() {
        if (this.ah) {
            return;
        }
        this.ah = true;
        ixj ixjVar = (ixj) this;
        ehw ehwVar = (ehw) lM();
        ixjVar.ah = ehwVar.c.jd();
        ixjVar.ai = (ajjz) ehwVar.b.kp.get();
        ixjVar.ak = (adlt) ehwVar.b.ja.get();
        ixjVar.al = ehwVar.c.ji();
        ixjVar.am = ehwVar.c.jg();
        ixjVar.an = (ypa) ehwVar.b.B.get();
        ixjVar.ao = (jgf) ehwVar.c.af.get();
        ixjVar.ap = ehwVar.c.je();
        ixjVar.aq = (nne) ehwVar.c.af.get();
        ixjVar.ar = (obr) ehwVar.c.r.get();
        ixjVar.aE = (aadw) ehwVar.b.D.get();
        ixjVar.as = (gcl) ehwVar.c.bj.get();
        ixjVar.aA = (zaw) ehwVar.b.iN.get();
        ixjVar.aB = ehwVar.b.cO();
    }

    @Override // defpackage.ce, defpackage.aoc
    public final apo getDefaultViewModelProviderFactory() {
        return ayaw.v(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // defpackage.bv, defpackage.ce
    public final void ku(Context context) {
        super.ku(context);
        aH();
        aG();
    }

    @Override // defpackage.axqk
    public final Object lM() {
        return lL().lM();
    }

    @Override // defpackage.bv, defpackage.ce
    public final LayoutInflater lW(Bundle bundle) {
        return LayoutInflater.from(axqa.c(super.lW(bundle), this));
    }

    @Override // defpackage.ce
    public final Context qR() {
        if (super.qR() == null && this.ae == null) {
            return null;
        }
        aH();
        return this.ae;
    }
}
