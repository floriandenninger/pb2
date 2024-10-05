package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;

/* compiled from: PG */
/* loaded from: classes3.dex */
class lmy extends lms implements axql {
    private ContextWrapper ar;
    private volatile ameq as;
    private final Object at = new Object();
    private boolean au = false;

    private final void aS() {
        if (this.ar == null) {
            this.ar = new amer(super.qR(), this);
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
    public final ameq lL() {
        if (this.as == null) {
            synchronized (this.at) {
                if (this.as == null) {
                    this.as = new ameq(this);
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
        lmn lmnVar = (lmn) this;
        ehv ehvVar = (ehv) lM();
        ((lms) lmnVar).c = (afsy) ehvVar.a.au.get();
        ((lms) lmnVar).d = (aaea) ehvVar.a.K.get();
        lmnVar.ap = (aadw) ehvVar.a.D.get();
        ((lms) lmnVar).e = ehvVar.b.g();
        ((lms) lmnVar).ae = ehvVar.b.d();
        ((lms) lmnVar).af = (ysy) ehvVar.a.as.get();
        ((lms) lmnVar).ag = (aahd) ehvVar.b.k.get();
        llu eh = ((llx) ((axqk) ((ames) ehvVar.b.c.get()).a()).lM()).eh();
        ayaw.k(eh);
        lmnVar.ah = eh;
        lmnVar.ai = (gni) ehvVar.a.eA.get();
        lmnVar.aq = (wcf) ehvVar.a.hM.get();
        lmnVar.aj = (acue) ehvVar.a.mj.get();
        lmnVar.ak = ghe.t(ehvVar.b.a(), (aahd) ehvVar.b.k.get(), ehvVar.b.d(), ehvVar.b.g(), ehvVar.a.li());
        lmnVar.al = (ayqi) ehvVar.a.im.get();
    }

    @Override // defpackage.ce, defpackage.aoc
    public final apo getDefaultViewModelProviderFactory() {
        apo defaultViewModelProviderFactory = super.getDefaultViewModelProviderFactory();
        amee ameeVar = (amee) axfq.n(this, amee.class);
        amef a = ameeVar.a();
        return new amed(this, ((axpl) axfq.n(ameeVar.b().a(), axpl.class)).kh().a(this, defaultViewModelProviderFactory), a.a, a.b);
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
        return LayoutInflater.from(new amer(az(), this));
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
