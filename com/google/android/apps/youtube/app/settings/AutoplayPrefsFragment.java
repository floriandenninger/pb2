package com.google.android.apps.youtube.app.settings;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import androidx.preference.Preference;
import androidx.preference.PreferenceScreen;
import com.google.android.apps.youtube.app.settings.AutoplayPrefsFragment;
import com.google.android.apps.youtube.app.settings.IntListPreference;
import com.google.android.libraries.youtube.common.ui.preferences.ProtoDataStoreSwitchPreference;
import defpackage.aaea;
import defpackage.acqz;
import defpackage.akgk;
import defpackage.ayqx;
import defpackage.azqb;
import defpackage.lko;
import defpackage.llb;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class AutoplayPrefsFragment extends lko implements SharedPreferences.OnSharedPreferenceChangeListener {
    public aaea ae;
    public SettingsDataAccess af;
    private ayqx ag;
    public SharedPreferences c;
    public acqz d;
    public akgk e;

    @Override // defpackage.ce
    public final void V() {
        this.c.unregisterOnSharedPreferenceChangeListener(this);
        azqb.f((AtomicReference) this.ag);
        super.V();
    }

    @Override // defpackage.bsk
    public final void aH() {
        this.a.g("youtube");
        this.c.registerOnSharedPreferenceChangeListener(this);
    }

    @Override // defpackage.bsk, defpackage.ce
    public final void aa(View view, Bundle bundle) {
        super.aa(view, bundle);
        this.ag = this.af.g(new Runnable() { // from class: lkf
            @Override // java.lang.Runnable
            public final void run() {
                aupv o;
                aqyg aqygVar;
                Preference preference;
                aqyg aqygVar2;
                aqyg aqygVar3;
                AutoplayPrefsFragment autoplayPrefsFragment = AutoplayPrefsFragment.this;
                if (autoplayPrefsFragment.ar() && (o = autoplayPrefsFragment.af.o(10058)) != null) {
                    ci C = autoplayPrefsFragment.C();
                    if ((o.b & 1) != 0) {
                        aqygVar = o.c;
                        if (aqygVar == null) {
                            aqygVar = aqyg.a;
                        }
                    } else {
                        aqygVar = null;
                    }
                    C.setTitle(ajcq.b(aqygVar));
                    PreferenceScreen e = autoplayPrefsFragment.a.e(autoplayPrefsFragment.C());
                    for (aupw aupwVar : o.d) {
                        aooy X = whu.X(aupwVar);
                        auqw b = akgk.b(X);
                        if (b == auqw.AUTONAV) {
                            if (X instanceof aupu) {
                                aupu aupuVar = (aupu) X;
                                ProtoDataStoreSwitchPreference protoDataStoreSwitchPreference = new ProtoDataStoreSwitchPreference(autoplayPrefsFragment.C());
                                protoDataStoreSwitchPreference.I(ahbw.AUTONAV);
                                if ((aupuVar.b & 16) != 0) {
                                    aqygVar2 = aupuVar.d;
                                    if (aqygVar2 == null) {
                                        aqygVar2 = aqyg.a;
                                    }
                                } else {
                                    aqygVar2 = null;
                                }
                                protoDataStoreSwitchPreference.M(ajcq.b(aqygVar2));
                                if ((aupuVar.b & 32) != 0) {
                                    aqygVar3 = aupuVar.e;
                                    if (aqygVar3 == null) {
                                        aqygVar3 = aqyg.a;
                                    }
                                } else {
                                    aqygVar3 = null;
                                }
                                protoDataStoreSwitchPreference.n(ajcq.b(aqygVar3));
                                preference = protoDataStoreSwitchPreference;
                            } else {
                                preference = null;
                            }
                        } else if (b == auqw.INLINE_MUTED) {
                            IntListPreference intListPreference = new IntListPreference(autoplayPrefsFragment.C());
                            llb.a(autoplayPrefsFragment.ae, intListPreference, X);
                            preference = intListPreference;
                        } else {
                            preference = autoplayPrefsFragment.e.a(aupwVar, "");
                        }
                        if (preference != null) {
                            preference.Z();
                            e.ae(preference);
                        }
                    }
                    autoplayPrefsFragment.aF(e);
                }
            }
        });
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if ("inline_global_play_pause".equals(str)) {
            llb.d(this.c, this.d);
        }
    }
}
