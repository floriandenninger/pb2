package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.google.android.apps.youtube.app.extensions.reel.common.browse.ReelBrowseFragmentFeedController;
import com.google.android.apps.youtube.app.extensions.reel.common.browse.ReelBrowseFragmentToolbarController;

/* compiled from: PG */
/* loaded from: classes3.dex */
class hbs extends algk implements axql {
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
        hbx hbxVar = (hbx) this;
        ehw ehwVar = (ehw) lM();
        efz efzVar = ehwVar.b;
        hbxVar.am = new akht(efzVar.ka, efzVar.i, ehwVar.c.P, efzVar.a.cb, efzVar.ee, (byte[]) null, (char[]) null, (byte[]) null, (byte[]) null);
        hbxVar.ae = (ReelBrowseFragmentToolbarController) ehwVar.h.get();
        hbxVar.af = (ReelBrowseFragmentFeedController) ehwVar.i.get();
        hbxVar.ag = (hcd) ehwVar.j.get();
        hbxVar.ah = ehwVar.c.g();
        hbxVar.ai = (acqz) ehwVar.c.P.get();
        hbxVar.ak = (aaea) ehwVar.b.K.get();
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
