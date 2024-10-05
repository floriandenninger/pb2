package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import com.google.android.apps.youtube.app.settings.GeneralPrefsFragment;
import com.google.android.apps.youtube.app.settings.SettingsDataAccess;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class lkq extends lnr implements axql {
    private ContextWrapper c;
    private volatile axqa d;
    private final Object e = new Object();
    private boolean ae = false;

    private final void aJ() {
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
        aJ();
        aL();
    }

    @Override // defpackage.axql
    /* renamed from: aK, reason: merged with bridge method [inline-methods] */
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

    protected final void aL() {
        if (this.ae) {
            return;
        }
        this.ae = true;
        GeneralPrefsFragment generalPrefsFragment = (GeneralPrefsFragment) this;
        ehw ehwVar = (ehw) lM();
        generalPrefsFragment.aD = ehwVar.ar();
        generalPrefsFragment.aE = (zaw) ehwVar.b.iN.get();
        generalPrefsFragment.c = (ysy) ehwVar.b.as.get();
        generalPrefsFragment.d = (SharedPreferences) ehwVar.b.z.get();
        generalPrefsFragment.e = (agaf) ehwVar.b.et.get();
        generalPrefsFragment.ar = (aadw) ehwVar.b.D.get();
        generalPrefsFragment.ae = (aaea) ehwVar.b.K.get();
        generalPrefsFragment.af = (cnd) ehwVar.b.dr.get();
        generalPrefsFragment.ag = (llu) ehwVar.c.kc.get();
        generalPrefsFragment.ah = ehwVar.c.ba();
        generalPrefsFragment.ai = (acqz) ehwVar.c.P.get();
        generalPrefsFragment.aj = (gni) ehwVar.b.eA.get();
        generalPrefsFragment.ak = new lmw((aadw) ehwVar.b.D.get());
        generalPrefsFragment.al = (ywr) ehwVar.b.ez.get();
        generalPrefsFragment.am = (akgk) ehwVar.c.nl.get();
        generalPrefsFragment.as = (agcm) ehwVar.b.a.bb.get();
        generalPrefsFragment.an = (SettingsDataAccess) ehwVar.c.jI.get();
        generalPrefsFragment.ao = (eow) ehwVar.b.ih.get();
        efz efzVar = ehwVar.b;
        generalPrefsFragment.ap = efzVar.a.bv;
        generalPrefsFragment.aq = (Handler) efzVar.an.get();
    }

    @Override // defpackage.ce, defpackage.aoc
    public final apo getDefaultViewModelProviderFactory() {
        return ayaw.v(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // defpackage.ce
    public final void ku(Context context) {
        super.ku(context);
        aJ();
        aL();
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
        aJ();
        return this.c;
    }
}
