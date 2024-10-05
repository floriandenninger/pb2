package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public class xzb extends xxr implements axql {
    private ContextWrapper ae;
    private volatile axqa af;
    private final Object ag = new Object();
    private boolean ah = false;

    private final void aF() {
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
        aF();
        aX();
    }

    @Override // defpackage.axql
    /* renamed from: aW, reason: merged with bridge method [inline-methods] */
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

    protected final void aX() {
        if (this.ah) {
            return;
        }
        this.ah = true;
        xxp xxpVar = (xxp) this;
        ehw ehwVar = (ehw) lM();
        xxpVar.ae = (ajjz) ehwVar.b.kp.get();
        xxpVar.af = (aahd) ehwVar.c.I.get();
        xxpVar.ag = (xun) ehwVar.b.a.bJ.get();
        xxpVar.ah = (ajvb) ehwVar.c.al.get();
        xxpVar.ai = (afsy) ehwVar.b.au.get();
        xxpVar.aj = (akvq) ehwVar.b.mM.get();
        xxpVar.ak = ehwVar.b.cO();
        xxpVar.al = ehwVar.c.jz();
        xxpVar.am = new xwp(ehwVar.c.a(), (ajut) ehwVar.b.lE.get());
        xxpVar.an = (ajjs) ehwVar.b.km.get();
        efc efcVar = ehwVar.b.a;
        xxpVar.bj = new ajyw(efcVar.cN, ehwVar.c.I, efcVar.bL, (int[]) null, (byte[]) null);
        xxpVar.ao = (xtb) ehwVar.b.a.bL.get();
        ehwVar.c.jq();
        xxpVar.ap = (aahv) ehwVar.b.dB.get();
        xxpVar.aq = (akbv) ehwVar.aK.get();
        xxpVar.ar = (akcy) ehwVar.aJ.get();
        xxpVar.bk = ehwVar.c.mW();
        xxpVar.as = (Executor) ehwVar.b.i.get();
        xxpVar.at = (ayqi) ehwVar.b.im.get();
        xxpVar.au = (shf) ehwVar.b.g.get();
        xxpVar.av = (xud) ehwVar.b.a.cN.get();
        xxpVar.aw = new xtn((xud) ehwVar.b.a.cN.get(), (xun) ehwVar.b.a.bJ.get());
        xxpVar.ax = (xuv) ehwVar.b.a.U.get();
        xxpVar.bi = (vgz) ehwVar.b.a.cO.get();
    }

    @Override // defpackage.ce, defpackage.aoc
    public final apo getDefaultViewModelProviderFactory() {
        return ayaw.v(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // defpackage.bv, defpackage.ce
    public final void ku(Context context) {
        super.ku(context);
        aF();
        aX();
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
        aF();
        return this.ae;
    }
}
