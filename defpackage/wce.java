package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;

/* compiled from: PG */
/* loaded from: classes4.dex */
class wce extends wab implements axql {
    private ContextWrapper af;
    private volatile axqa ag;
    private final Object ah = new Object();
    private boolean ai = false;

    private final void aG() {
        if (this.af == null) {
            this.af = axqa.b(super.qR(), this);
        }
    }

    @Override // defpackage.ce
    public final void U(Activity activity) {
        super.U(activity);
        ContextWrapper contextWrapper = this.af;
        boolean z = true;
        if (contextWrapper != null && axqa.a(contextWrapper) != activity) {
            z = false;
        }
        ayaw.q(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        aG();
        aJ();
    }

    @Override // defpackage.axql
    /* renamed from: aI, reason: merged with bridge method [inline-methods] */
    public final axqa lL() {
        if (this.ag == null) {
            synchronized (this.ah) {
                if (this.ag == null) {
                    this.ag = new axqa(this);
                }
            }
        }
        return this.ag;
    }

    protected final void aJ() {
        if (this.ai) {
            return;
        }
        this.ai = true;
        wcb wcbVar = (wcb) this;
        ehw ehwVar = (ehw) lM();
        wcbVar.af = (zaw) ehwVar.b.iN.get();
        wcbVar.ag = (aatg) ehwVar.b.mq.get();
        wcbVar.ah = ehwVar.c.fR();
        wcbVar.ai = (wiz) ehwVar.b.mr.get();
        eed eedVar = ehwVar.c;
        wcbVar.aj = eedVar.I;
        wcbVar.as = eedVar.ml();
        wcbVar.ak = (ypa) ehwVar.b.B.get();
        wcbVar.al = (afsy) ehwVar.b.au.get();
        wcbVar.am = ehwVar.b.cO();
        wcbVar.an = (ajjz) ehwVar.b.kp.get();
        wcbVar.ao = (wkk) ehwVar.b.da.get();
        wcbVar.at = ehwVar.c.mp();
        wcbVar.ar = (wbz) ehwVar.c.nR.get();
        wcbVar.ap = (ajut) ehwVar.b.lE.get();
    }

    @Override // defpackage.ce, defpackage.aoc
    public final apo getDefaultViewModelProviderFactory() {
        return ayaw.v(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // defpackage.bv, defpackage.ce
    public final void ku(Context context) {
        super.ku(context);
        aG();
        aJ();
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
        if (super.qR() == null && this.af == null) {
            return null;
        }
        aG();
        return this.af;
    }
}
