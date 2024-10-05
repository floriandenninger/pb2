package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.google.android.apps.youtube.app.ui.YpcOffersListDialogFragmentController;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public class ivv extends bv implements axql {
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
    public void U(Activity activity) {
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
        ixu ixuVar = (ixu) this;
        ehw ehwVar = (ehw) lM();
        ixuVar.af = (aahd) ehwVar.c.I.get();
        ixuVar.ag = (afsy) ehwVar.b.au.get();
        ixuVar.ah = (aftn) ehwVar.b.uZ.get();
        ixuVar.ai = (acqz) ehwVar.c.P.get();
        ehwVar.c.hW();
        ixuVar.aA = ehwVar.c.mU();
        ixuVar.aj = (zaw) ehwVar.b.iN.get();
        ixuVar.ak = ehwVar.ag;
        eed eedVar = ehwVar.c;
        ixuVar.av = new akht(eedVar.f, eedVar.I, ehwVar.b.xK, eedVar.ib, eedVar.ic, (char[]) null, (byte[]) null);
        eed eedVar2 = ehwVar.c;
        ixuVar.aw = new zzw(eedVar2.f, eedVar2.I, ehwVar.b.a.av, eedVar2.ic, (char[]) null);
        ixuVar.ay = (aoae) ehwVar.b.a.av.get();
        ixuVar.ax = new ajyw(ehwVar.c.f, ehwVar.ah, ehwVar.ai, (char[]) null, (byte[]) null, (char[]) null);
        ixuVar.au = (YpcOffersListDialogFragmentController) ehwVar.c.hk.get();
        ixuVar.al = ehwVar.c.jz();
        ixuVar.am = (fma) ehwVar.b.wk.get();
        ixuVar.az = new aoae((char[]) null, (byte[]) null, (byte[]) null);
    }

    @Override // defpackage.ce, defpackage.aoc
    public final apo getDefaultViewModelProviderFactory() {
        return ayaw.v(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // defpackage.bv, defpackage.ce
    public final void ku(Context context) {
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
