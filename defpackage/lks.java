package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import com.google.android.apps.youtube.app.settings.OfflinePrefsFragment;
import com.google.android.apps.youtube.app.settings.SettingsDataAccess;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class lks extends lnr implements axql {
    private ContextWrapper c;
    private volatile axqa d;
    private final Object e = new Object();
    private boolean ae = false;

    private final void aL() {
        if (this.c == null) {
            this.c = axqa.b(super.qR(), this);
        }
    }

    @Override // defpackage.ce
    public final void U(Activity activity) {
        super.U(activity);
        ContextWrapper contextWrapper = this.c;
        boolean z = true;
        if (contextWrapper != null && axqa.a(contextWrapper) != activity) {
            z = false;
        }
        ayaw.q(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        aL();
        aK();
    }

    @Override // defpackage.axql
    /* renamed from: aJ, reason: merged with bridge method [inline-methods] */
    public final axqa lL() {
        if (this.d == null) {
            synchronized (this.e) {
                if (this.d == null) {
                    this.d = new axqa(this);
                }
            }
        }
        return this.d;
    }

    protected final void aK() {
        if (this.ae) {
            return;
        }
        this.ae = true;
        OfflinePrefsFragment offlinePrefsFragment = (OfflinePrefsFragment) this;
        ehw ehwVar = (ehw) lM();
        offlinePrefsFragment.aD = ehwVar.ar();
        offlinePrefsFragment.aE = (zaw) ehwVar.b.iN.get();
        offlinePrefsFragment.ay = (agof) ehwVar.b.gH.get();
        offlinePrefsFragment.e = (agsg) ehwVar.b.gU.get();
        offlinePrefsFragment.az = (ffs) ehwVar.b.wR.get();
        offlinePrefsFragment.ae = (yxn) ehwVar.b.gF.get();
        offlinePrefsFragment.af = (llu) ehwVar.c.kc.get();
        offlinePrefsFragment.ag = (Handler) ehwVar.b.an.get();
        offlinePrefsFragment.ah = ehwVar.c.hW();
        offlinePrefsFragment.ai = (fka) ehwVar.b.gN.get();
        offlinePrefsFragment.aj = (agaf) ehwVar.b.et.get();
        eed eedVar = ehwVar.c;
        offlinePrefsFragment.aB = new ajyw(eedVar.f, eedVar.s, ehwVar.b.gU, (char[]) null, (char[]) null);
        offlinePrefsFragment.ak = (fjq) ehwVar.b.mv.get();
        offlinePrefsFragment.al = (agel) ehwVar.b.lh.get();
        offlinePrefsFragment.am = (agzr) ehwVar.b.gP.get();
        offlinePrefsFragment.aC = (axzf) ehwVar.b.a.cI.get();
        offlinePrefsFragment.an = axqq.a(ehwVar.b.yw);
        offlinePrefsFragment.ao = (SettingsDataAccess) ehwVar.c.jI.get();
        offlinePrefsFragment.aA = (axzg) ehwVar.b.kt.get();
        offlinePrefsFragment.ap = ehwVar.b.cO();
        offlinePrefsFragment.aq = (gcl) ehwVar.c.bj.get();
        offlinePrefsFragment.ar = (jyu) ehwVar.b.oQ.get();
        offlinePrefsFragment.as = (agpd) ehwVar.b.la.get();
        offlinePrefsFragment.at = (ayqi) ehwVar.b.aq.get();
    }

    @Override // defpackage.ce, defpackage.aoc
    public final apo getDefaultViewModelProviderFactory() {
        return ayaw.v(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // defpackage.ce
    public final void ku(Context context) {
        super.ku(context);
        aL();
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
        if (super.qR() == null && this.c == null) {
            return null;
        }
        aL();
        return this.c;
    }
}
