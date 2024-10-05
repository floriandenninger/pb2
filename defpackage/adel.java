package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public class adel extends bnq implements axql {
    private ContextWrapper ae;
    private volatile axqa af;
    private final Object ag = new Object();
    private boolean ah = false;

    private final void aJ() {
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
        aJ();
        aI();
    }

    @Override // defpackage.axql
    /* renamed from: aH, reason: merged with bridge method [inline-methods] */
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

    protected final void aI() {
        if (this.ah) {
            return;
        }
        this.ah = true;
        adew adewVar = (adew) this;
        ehw ehwVar = (ehw) lM();
        adewVar.af = (bph) ehwVar.b.jm.get();
        adewVar.ag = ehwVar.b.ju;
        adewVar.ah = (adcu) ehwVar.c.kk.get();
        adewVar.ai = ehwVar.b.m154do();
        adewVar.aj = (ypa) ehwVar.b.B.get();
        adewVar.ak = (adeg) ehwVar.b.jC.get();
        adewVar.al = (acwr) ehwVar.b.jg.get();
        adewVar.am = new acwp((qob) ehwVar.b.a.cT.get(), (acwv) ehwVar.b.jW.get());
        efz efzVar = ehwVar.b;
        adewVar.an = efzVar.jv;
        adewVar.ao = efzVar.hm().booleanValue();
        efz efzVar2 = ehwVar.b;
        adewVar.ap = efzVar2.a.cU;
        adewVar.aq = (acun) efzVar2.iu.get();
        adewVar.ar = (acxi) ehwVar.b.bg.get();
        adewVar.as = (acqz) ehwVar.c.P.get();
        adewVar.at = (Executor) ehwVar.b.i.get();
        adewVar.au = (adee) ehwVar.b.jw.get();
    }

    @Override // defpackage.ce, defpackage.aoc
    public final apo getDefaultViewModelProviderFactory() {
        return ayaw.v(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // defpackage.bv, defpackage.ce
    public final void ku(Context context) {
        super.ku(context);
        aJ();
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
        if (super.qR() == null && this.ae == null) {
            return null;
        }
        aJ();
        return this.ae;
    }
}
