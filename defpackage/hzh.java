package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
abstract class hzh extends hys implements axql {
    private ContextWrapper aj;
    private volatile axqa ak;
    private final Object al = new Object();
    private boolean am = false;

    private final void aM() {
        if (this.aj == null) {
            this.aj = axqa.b(super.qR(), this);
        }
    }

    @Override // defpackage.ce
    public final void U(Activity activity) {
        super.U(activity);
        ContextWrapper contextWrapper = this.aj;
        boolean z = true;
        if (contextWrapper != null && axqa.a(contextWrapper) != activity) {
            z = false;
        }
        ayaw.q(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        aM();
        aK();
    }

    @Override // defpackage.axql
    /* renamed from: aJ, reason: merged with bridge method [inline-methods] */
    public final axqa lL() {
        if (this.ak == null) {
            synchronized (this.al) {
                if (this.ak == null) {
                    this.ak = new axqa(this);
                }
            }
        }
        return this.ak;
    }

    protected final void aK() {
        if (this.am) {
            return;
        }
        this.am = true;
        iac iacVar = (iac) this;
        ehw ehwVar = (ehw) lM();
        iacVar.ae = ehwVar.A();
        iacVar.af = (acqz) ehwVar.c.P.get();
        iacVar.aj = (abdo) ehwVar.b.a.ch.get();
        iacVar.ak = ehwVar.u();
        iacVar.al = ehwVar.w();
        iacVar.am = ehwVar.x();
        iacVar.an = (Executor) ehwVar.b.i.get();
        iacVar.ao = new iaf(ehwVar.aG(), (acqz) ehwVar.c.P.get(), null, null);
        iacVar.ap = new iba(ehwVar.r(), (Handler) ehwVar.b.an.get(), (acqz) ehwVar.c.P.get());
        iacVar.aq = (gni) ehwVar.b.eA.get();
    }

    @Override // defpackage.ce, defpackage.aoc
    public final apo getDefaultViewModelProviderFactory() {
        return ayaw.v(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // defpackage.bv, defpackage.ce
    public final void ku(Context context) {
        super.ku(context);
        aM();
        aK();
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
        if (super.qR() == null && this.aj == null) {
            return null;
        }
        aM();
        return this.aj;
    }
}
