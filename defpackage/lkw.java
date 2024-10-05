package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.google.android.apps.youtube.app.settings.SettingsDataAccess;

/* compiled from: PG */
/* loaded from: classes3.dex */
class lkw extends lms implements axql {
    private ContextWrapper ar;
    private volatile axqa as;
    private final Object at = new Object();
    private boolean au = false;

    private final void aS() {
        if (this.ar == null) {
            this.ar = axqa.b(super.qR(), this);
        }
    }

    @Override // defpackage.ce
    public final void U(Activity activity) {
        super.U(activity);
        ContextWrapper contextWrapper = this.ar;
        boolean z = true;
        if (contextWrapper != null && axqa.a(contextWrapper) != activity) {
            z = false;
        }
        ayaw.q(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        aS();
        aK();
    }

    @Override // defpackage.axql
    /* renamed from: aJ, reason: merged with bridge method [inline-methods] */
    public final axqa lL() {
        if (this.as == null) {
            synchronized (this.at) {
                if (this.as == null) {
                    this.as = new axqa(this);
                }
            }
        }
        return this.as;
    }

    protected final void aK() {
        if (this.au) {
            return;
        }
        this.au = true;
        lmm lmmVar = (lmm) this;
        ehw ehwVar = (ehw) lM();
        ((lms) lmmVar).c = (afsy) ehwVar.b.au.get();
        ((lms) lmmVar).d = (aaea) ehwVar.b.K.get();
        lmmVar.ap = (aadw) ehwVar.b.D.get();
        ((lms) lmmVar).e = (acra) ehwVar.c.O.get();
        ((lms) lmmVar).ae = (SettingsDataAccess) ehwVar.c.jI.get();
        ((lms) lmmVar).af = (ysy) ehwVar.b.as.get();
        ((lms) lmmVar).ag = (aahd) ehwVar.c.I.get();
        lmmVar.ah = (llu) ehwVar.c.kc.get();
        lmmVar.ai = (gni) ehwVar.b.eA.get();
        lmmVar.aq = (wcf) ehwVar.b.hM.get();
        lmmVar.aj = (acue) ehwVar.b.mj.get();
        lmmVar.ak = ghe.t(ehwVar.c.a(), (aahd) ehwVar.c.I.get(), (SettingsDataAccess) ehwVar.c.jI.get(), (acra) ehwVar.c.O.get(), ehwVar.b.li());
        lmmVar.al = (ayqi) ehwVar.b.im.get();
    }

    @Override // defpackage.ce, defpackage.aoc
    public final apo getDefaultViewModelProviderFactory() {
        return ayaw.v(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // defpackage.ce
    public final void ku(Context context) {
        super.ku(context);
        aS();
        aK();
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
        if (super.qR() == null && this.ar == null) {
            return null;
        }
        aS();
        return this.ar;
    }
}
