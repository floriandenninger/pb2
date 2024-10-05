package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;

/* compiled from: PG */
/* loaded from: classes4.dex */
abstract class xzd extends xys implements axql {
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
        aM();
    }

    @Override // defpackage.axql
    /* renamed from: aL, reason: merged with bridge method [inline-methods] */
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

    protected final void aM() {
        if (this.ah) {
            return;
        }
        this.ah = true;
        xyr xyrVar = (xyr) this;
        ehw ehwVar = (ehw) lM();
        xyrVar.aF = (aadw) ehwVar.b.D.get();
        xyrVar.ae = (aahd) ehwVar.c.I.get();
        xyrVar.aH = ehwVar.b.t();
        xyrVar.aI = ehwVar.c.mq();
        xyrVar.af = (ajsa) ehwVar.b.xh.get();
        xyrVar.ag = ehwVar.c.jI();
        xyrVar.ah = (ajjs) ehwVar.b.km.get();
        xyrVar.ai = (ajut) ehwVar.b.lE.get();
        xyrVar.aj = ehwVar.b.cO();
        xyrVar.ak = (akbv) ehwVar.aM.get();
        xyrVar.al = (akcy) ehwVar.aL.get();
        xyrVar.am = (Context) ehwVar.c.gQ.get();
    }

    @Override // defpackage.ce, defpackage.aoc
    public final apo getDefaultViewModelProviderFactory() {
        return ayaw.v(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // defpackage.bv, defpackage.ce
    public final void ku(Context context) {
        super.ku(context);
        aF();
        aM();
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
