package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public class wji extends wab implements axql {
    private ContextWrapper af;
    private volatile axqa ag;
    private final Object ah = new Object();
    private boolean ai = false;

    private final void aH() {
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
        aH();
        aI();
    }

    @Override // defpackage.axql
    /* renamed from: aG, reason: merged with bridge method [inline-methods] */
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

    protected final void aI() {
        if (this.ai) {
            return;
        }
        this.ai = true;
        wjr wjrVar = (wjr) this;
        ehw ehwVar = (ehw) lM();
        wjrVar.af = (zaw) ehwVar.b.iN.get();
        wjrVar.ag = (aatg) ehwVar.b.mq.get();
        wjrVar.ah = (ypa) ehwVar.b.B.get();
        wjrVar.ai = ehwVar.b.cO();
        wjrVar.aj = (ajjz) ehwVar.b.kp.get();
        wjrVar.ak = (wkk) ehwVar.b.da.get();
        wjrVar.al = (wiz) ehwVar.b.mr.get();
        wjrVar.aq = ehwVar.c.mp();
        wjrVar.am = (afsy) ehwVar.b.au.get();
        wjrVar.an = ehwVar.c.fR();
        wjrVar.ao = (aahd) ehwVar.c.I.get();
    }

    @Override // defpackage.ce, defpackage.aoc
    public final apo getDefaultViewModelProviderFactory() {
        return ayaw.v(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // defpackage.bv, defpackage.ce
    public final void ku(Context context) {
        super.ku(context);
        aH();
        aI();
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
        aH();
        return this.af;
    }
}
