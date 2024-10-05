package com.google.android.apps.youtube.app.settings;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.preference.Preference;
import androidx.preference.SwitchPreference;
import com.google.android.apps.youtube.app.bedtime.BedtimeReminderPreference;
import com.google.android.apps.youtube.app.settings.GeneralPrefsFragment;
import com.google.android.apps.youtube.app.wellness.WatchBreakFrequencyPickerPreference;
import com.google.android.libraries.youtube.common.ui.preferences.ProtoDataStoreListPreference;
import com.google.android.libraries.youtube.common.ui.preferences.ProtoDataStoreSwitchPreference;
import com.google.android.youtube.R;
import defpackage.aadw;
import defpackage.aaea;
import defpackage.acqx;
import defpackage.acqz;
import defpackage.acsb;
import defpackage.adyu;
import defpackage.aear;
import defpackage.agaf;
import defpackage.agcm;
import defpackage.ajcq;
import defpackage.akgk;
import defpackage.aqyg;
import defpackage.aupu;
import defpackage.aupv;
import defpackage.aupw;
import defpackage.auqw;
import defpackage.ayqx;
import defpackage.azqb;
import defpackage.azrw;
import defpackage.bry;
import defpackage.brz;
import defpackage.cnd;
import defpackage.eow;
import defpackage.evr;
import defpackage.fav;
import defpackage.gkx;
import defpackage.gni;
import defpackage.jnh;
import defpackage.lkh;
import defpackage.lkq;
import defpackage.llu;
import defpackage.lmw;
import defpackage.ose;
import defpackage.ynm;
import defpackage.yny;
import defpackage.ysy;
import defpackage.ywr;
import defpackage.zfi;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class GeneralPrefsFragment extends lkq implements SharedPreferences.OnSharedPreferenceChangeListener, bry, brz {
    public aaea ae;
    public cnd af;
    public llu ag;
    public gkx ah;
    public acqz ai;
    public gni aj;
    public lmw ak;
    public ywr al;
    public akgk am;
    public SettingsDataAccess an;
    public eow ao;
    public azrw ap;
    public Handler aq;
    public aadw ar;
    public agcm as;
    private ayqx at;
    public ysy c;
    public SharedPreferences d;
    public agaf e;

    private final void aM(CharSequence charSequence) {
        Preference ol = ol(charSequence);
        if (ol != null) {
            o().af(ol);
        }
    }

    @Override // defpackage.ce
    public final void V() {
        this.d.unregisterOnSharedPreferenceChangeListener(this);
        Object obj = this.at;
        if (obj != null) {
            azqb.f((AtomicReference) obj);
            this.at = null;
        }
        super.V();
    }

    @Override // defpackage.bry
    public final boolean a(Preference preference, Object obj) {
        if (!preference.s.equals("voice_language")) {
            return true;
        }
        this.ai.mM().I(3, new acqx(acsb.c(95981)), null);
        return true;
    }

    @Override // defpackage.bsk
    public final void aH() {
        this.a.g("youtube");
        p(R.xml.general_prefs);
        this.d.registerOnSharedPreferenceChangeListener(this);
        if (!evr.bf(this.ar)) {
            aM("watch_break_frequency_picker_preference");
        }
        if (!this.ao.i()) {
            aM("bedtime_reminder_toggle");
        }
        if (this.aj.e()) {
            aM("app_theme_dark");
            ProtoDataStoreListPreference protoDataStoreListPreference = (ProtoDataStoreListPreference) ol("app_theme_appearance");
            if (protoDataStoreListPreference != null) {
                protoDataStoreListPreference.G = new lkh(this, 3);
            }
        } else {
            aM("app_theme_appearance");
            ProtoDataStoreSwitchPreference protoDataStoreSwitchPreference = (ProtoDataStoreSwitchPreference) ol("app_theme_dark");
            if (protoDataStoreSwitchPreference != null) {
                protoDataStoreSwitchPreference.c = new lkh(this, 0);
            }
        }
        if (!this.c.n() || evr.S(this.ae)) {
            aM(adyu.LIMIT_MOBILE_DATA_USAGE);
        }
        if (!evr.X(this.c, this.ae)) {
            aM(yny.UPLOAD_NETWORK_POLICY);
        }
        C().setTitle(O(R.string.pref_general_category));
        this.a.d = this;
        if (this.an.n()) {
            aJ();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x014d, code lost:
    
        if ((java.lang.Math.max(r10, r7) / java.lang.Math.min(r10, r7)) >= r9.a) goto L64;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void aJ() {
        /*
            Method dump skipped, instructions count: 671
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.youtube.app.settings.GeneralPrefsFragment.aJ():void");
    }

    @Override // defpackage.bsk, defpackage.ce
    public final void aa(View view, Bundle bundle) {
        super.aa(view, bundle);
        this.at = this.an.g(new Runnable() { // from class: lkl
            @Override // java.lang.Runnable
            public final void run() {
                GeneralPrefsFragment.this.aJ();
            }
        });
    }

    @Override // defpackage.brz
    public final boolean b(Preference preference) {
        if (!preference.s.equals("voice_language")) {
            return true;
        }
        this.ai.mM().I(3, new acqx(acsb.c(95982)), null);
        this.ai.mM().n(new acqx(acsb.c(95981)));
        return true;
    }

    @Override // defpackage.bsk, defpackage.ce
    public final void mS() {
        aqyg aqygVar;
        aupu aupuVar;
        super.mS();
        SettingsDataAccess settingsDataAccess = this.an;
        auqw auqwVar = auqw.SAFETY_MODE;
        Iterator it = settingsDataAccess.i().iterator();
        loop0: while (true) {
            aqygVar = null;
            if (!it.hasNext()) {
                aupuVar = null;
                break;
            }
            Object next = it.next();
            if (next instanceof aupv) {
                Iterator it2 = ((aupv) next).d.iterator();
                while (it2.hasNext()) {
                    aupuVar = ((aupw) it2.next()).e;
                    if (aupuVar == null) {
                        aupuVar = aupu.a;
                    }
                    if (akgk.b(aupuVar) == auqwVar) {
                        break loop0;
                    }
                }
            }
        }
        ProtoDataStoreSwitchPreference protoDataStoreSwitchPreference = (ProtoDataStoreSwitchPreference) ol("innertube_safety_mode_enabled");
        char c = 1;
        if (protoDataStoreSwitchPreference != null) {
            if (aupuVar != null) {
                if ((aupuVar.b & 16) != 0) {
                    aqyg aqygVar2 = aupuVar.d;
                    if (aqygVar2 == null) {
                        aqygVar2 = aqyg.a;
                    }
                    protoDataStoreSwitchPreference.M(ajcq.b(aqygVar2));
                }
                if ((aupuVar.b & 32) != 0) {
                    aqyg aqygVar3 = aupuVar.e;
                    if (aqygVar3 == null) {
                        aqygVar3 = aqyg.a;
                    }
                    protoDataStoreSwitchPreference.n(ajcq.b(aqygVar3));
                }
                protoDataStoreSwitchPreference.c = new lkh(this, c == true ? 1 : 0);
            } else {
                aM("innertube_safety_mode_enabled");
            }
        }
        if (aupuVar == null || !aupuVar.g) {
            aM("innertube_managed_restricted_mode");
        } else {
            SwitchPreference switchPreference = (SwitchPreference) ol("innertube_managed_restricted_mode");
            if (switchPreference != null) {
                if ((aupuVar.b & 4096) != 0 && (aqygVar = aupuVar.k) == null) {
                    aqygVar = aqyg.a;
                }
                switchPreference.n(ajcq.b(aqygVar));
                switchPreference.k((aupuVar.b & 64) != 0 ? aupuVar.f : true);
                aM("innertube_safety_mode_enabled");
            }
        }
        boolean c2 = this.ag.c();
        int b = this.ah.b();
        if (b != 2 ? b == 3 : c2) {
            ynm.n(this, this.ah.a(), jnh.t, new zfi() { // from class: lki
                @Override // defpackage.zfi
                public final void a(Object obj) {
                    ProtoDataStoreSwitchPreference protoDataStoreSwitchPreference2;
                    GeneralPrefsFragment generalPrefsFragment = GeneralPrefsFragment.this;
                    if (((gkw) obj) != gkw.SYSTEM_DISABLED || (protoDataStoreSwitchPreference2 = (ProtoDataStoreSwitchPreference) generalPrefsFragment.ol(fav.PIP_POLICY)) == null) {
                        return;
                    }
                    protoDataStoreSwitchPreference2.w = false;
                    protoDataStoreSwitchPreference2.G(false);
                    protoDataStoreSwitchPreference2.k(false);
                }
            });
        } else {
            aM(fav.PIP_POLICY);
        }
    }

    @Override // defpackage.bsk
    public final RecyclerView n(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        RecyclerView n = super.n(layoutInflater, viewGroup, bundle);
        n.ae(null);
        return n;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if ("video_notifications_enabled".equals(str)) {
            aear.B(this.e);
        }
    }

    @Override // defpackage.bsk, defpackage.bsr
    public final void r(Preference preference) {
        if (preference instanceof BedtimeReminderPreference) {
            return;
        }
        if (preference instanceof WatchBreakFrequencyPickerPreference) {
            String str = preference.s;
            Bundle bundle = new Bundle();
            bundle.putString("key", str);
            ose oseVar = new ose();
            oseVar.af(bundle);
            oseVar.aE(this);
            oseVar.qh(mO(), ose.class.getName());
            return;
        }
        super.r(preference);
    }
}
