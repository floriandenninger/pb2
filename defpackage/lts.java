package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public class lts extends bv implements axql {
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
        lux luxVar = (lux) this;
        ehw ehwVar = (ehw) lM();
        luxVar.ae = ehwVar.c.G();
        luxVar.af = ehwVar.aD;
        luxVar.ag = ehwVar.aE;
        luxVar.ah = ehwVar.ay;
        luxVar.ai = ehwVar.aF;
        luxVar.aj = (ypa) ehwVar.b.B.get();
        luxVar.ak = (gad) ehwVar.c.eo.get();
        luxVar.al = (adsw) ehwVar.c.jS.get();
        luxVar.am = ehwVar.c.jz();
        luxVar.an = (afsy) ehwVar.b.au.get();
        luxVar.ao = (gfz) ehwVar.c.aq.get();
        luxVar.ap = (aahd) ehwVar.c.I.get();
        luxVar.aq = (gni) ehwVar.b.eA.get();
        luxVar.ar = (aaea) ehwVar.b.K.get();
        luxVar.as = (ayqi) ehwVar.b.im.get();
    }

    @Override // defpackage.ce, defpackage.aoc
    public final apo getDefaultViewModelProviderFactory() {
        return ayaw.v(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // defpackage.bv, defpackage.ce
    public void ku(Context context) {
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
