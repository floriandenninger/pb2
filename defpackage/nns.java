package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.google.android.apps.youtube.app.player.controls.ListenFirstMenuItemController;
import com.google.android.apps.youtube.app.player.controls.MusicDeeplinkMenuItemController;
import com.google.android.apps.youtube.app.player.controls.SingleLoopMenuItemController;
import com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.service.c;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class nns extends ajxk implements axql {
    private ContextWrapper ae;
    private volatile axqa af;
    private final Object ag = new Object();
    private boolean ah = false;

    private final void aL() {
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
        aL();
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
        nnz nnzVar = (nnz) this;
        ehw ehwVar = (ehw) lM();
        nnzVar.ae = (ypa) ehwVar.b.B.get();
        nnzVar.af = ehwVar.c.ji();
        nnzVar.ag = (ajut) ehwVar.b.lE.get();
        nnzVar.ah = (keo) ehwVar.c.nG.get();
        nnzVar.ai = (kfw) ehwVar.c.eZ.get();
        nnzVar.aj = (ker) ehwVar.c.nH.get();
        nnzVar.ak = (ListenFirstMenuItemController) ehwVar.c.nI.get();
        nnzVar.al = (kfn) ehwVar.c.bk.get();
        nnzVar.am = (kek) ehwVar.c.fb.get();
        nnzVar.an = (kfy) ehwVar.c.fw.get();
        nnzVar.ao = (kex) ehwVar.c.np.get();
        nnzVar.ap = (kfc) ehwVar.c.fg.get();
        nnzVar.aq = (SingleLoopMenuItemController) ehwVar.c.jO.get();
        nnzVar.ar = (ajdh) ehwVar.c.cG.get();
        nnzVar.az = (aadw) ehwVar.b.D.get();
        nnzVar.as = (aioc) ehwVar.c.n.get();
        nnzVar.at = (gvv) ehwVar.c.nJ.get();
        nnzVar.au = (MusicDeeplinkMenuItemController) ehwVar.c.jQ.get();
        nnzVar.av = (acra) ehwVar.c.ay.get();
        nnzVar.aC = (c) ehwVar.c.kD();
        eed eedVar = ehwVar.c;
        nnzVar.aB = new akpq(axqv.b(eedVar.ch), eedVar.cW, (byte[]) null, (byte[]) null);
    }

    @Override // defpackage.ce, defpackage.aoc
    public final apo getDefaultViewModelProviderFactory() {
        return ayaw.v(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // defpackage.bv, defpackage.ce
    public final void ku(Context context) {
        super.ku(context);
        aL();
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
        aL();
        return this.ae;
    }
}
