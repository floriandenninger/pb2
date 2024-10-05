package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public class hzi extends ce implements axql {
    private ContextWrapper a;
    private volatile axqa b;
    private final Object c = new Object();
    private boolean d = false;

    private final void o() {
        if (this.a == null) {
            this.a = axqa.b(super.qR(), this);
        }
    }

    @Override // defpackage.ce
    public final void U(Activity activity) {
        super.U(activity);
        ContextWrapper contextWrapper = this.a;
        boolean z = true;
        if (contextWrapper != null && axqa.a(contextWrapper) != activity) {
            z = false;
        }
        ayaw.q(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        o();
        n();
    }

    @Override // defpackage.axql
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final axqa lL() {
        if (this.b == null) {
            synchronized (this.c) {
                if (this.b == null) {
                    this.b = new axqa(this);
                }
            }
        }
        return this.b;
    }

    @Override // defpackage.ce, defpackage.aoc
    public final apo getDefaultViewModelProviderFactory() {
        return ayaw.v(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // defpackage.ce
    public final void ku(Context context) {
        super.ku(context);
        o();
        n();
    }

    @Override // defpackage.axqk
    public final Object lM() {
        return lL().lM();
    }

    @Override // defpackage.ce
    public final LayoutInflater lW(Bundle bundle) {
        return LayoutInflater.from(axqa.c(az(), this));
    }

    protected final void n() {
        if (this.d) {
            return;
        }
        this.d = true;
        ehw ehwVar = (ehw) lM();
        Activity a = ehwVar.c.a();
        ehwVar.A();
        hzu u = ehwVar.u();
        ibe w = ehwVar.w();
        hyh s = ehwVar.s();
        ibw y = ehwVar.y();
        ico icoVar = (ico) ((efk) ehwVar.q()).p.get();
        ayaw.k(icoVar);
        ico icoVar2 = (ico) ((efk) ehwVar.q()).m.get();
        ayaw.k(icoVar2);
        icg z = ehwVar.z();
        ick ickVar = (ick) ((efk) ehwVar.q()).o.get();
        ayaw.k(ickVar);
        acqz acqzVar = (acqz) ehwVar.c.P.get();
        ica icaVar = (ica) ((efk) ehwVar.q()).k.get();
        ayaw.k(icaVar);
        agcm aG = ehwVar.aG();
        icn icnVar = (icn) ((efk) ehwVar.q()).j.get();
        ayaw.k(icnVar);
        ((iao) this).a = new iai(a, u, w, s, y, icoVar, icoVar2, z, ickVar, acqzVar, icaVar, aG, icnVar, ehwVar.x(), null, null, null);
    }

    @Override // defpackage.ce
    public final Context qR() {
        if (super.qR() == null && this.a == null) {
            return null;
        }
        o();
        return this.a;
    }
}
