package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.google.android.apps.youtube.app.settings.SettingsDataAccess;
import com.google.android.apps.youtube.app.settings.datasaving.DataSavingPrefsFragment;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class loy extends lnr implements axql {
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
        DataSavingPrefsFragment dataSavingPrefsFragment = (DataSavingPrefsFragment) this;
        ehw ehwVar = (ehw) lM();
        dataSavingPrefsFragment.aD = ehwVar.ar();
        dataSavingPrefsFragment.aE = (zaw) ehwVar.b.iN.get();
        dataSavingPrefsFragment.ah = (ysy) ehwVar.b.as.get();
        dataSavingPrefsFragment.ai = (aaea) ehwVar.b.K.get();
        dataSavingPrefsFragment.aj = (llu) ehwVar.c.kc.get();
        dataSavingPrefsFragment.ak = (SettingsDataAccess) ehwVar.c.jI.get();
        dataSavingPrefsFragment.al = (ywr) ehwVar.b.a.be.get();
        dataSavingPrefsFragment.am = (ayqi) ehwVar.b.im.get();
        dataSavingPrefsFragment.an = ehwVar.b.cO();
        dataSavingPrefsFragment.ao = (axze) ehwVar.b.a.bg.get();
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
