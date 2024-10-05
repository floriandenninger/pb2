package com.google.android.apps.youtube.app.settings.datasaving;

import android.os.Bundle;
import android.view.View;
import androidx.preference.Preference;
import androidx.preference.PreferenceCategory;
import androidx.preference.TwoStatePreference;
import com.google.android.apps.youtube.app.settings.SettingsDataAccess;
import com.google.android.apps.youtube.app.settings.datasaving.DataSavingPrefsFragment;
import com.google.android.libraries.youtube.common.ui.preferences.ProtoDataStoreSwitchPreference;
import com.google.android.youtube.R;
import defpackage.aaea;
import defpackage.acqx;
import defpackage.acra;
import defpackage.acsb;
import defpackage.axze;
import defpackage.ayqi;
import defpackage.ayqx;
import defpackage.ayrv;
import defpackage.azqb;
import defpackage.brz;
import defpackage.ci;
import defpackage.evr;
import defpackage.llu;
import defpackage.loy;
import defpackage.ysy;
import defpackage.ywr;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class DataSavingPrefsFragment extends loy {
    public ProtoDataStoreSwitchPreference ae;
    public ProtoDataStoreSwitchPreference af;
    public ProtoDataStoreSwitchPreference ag;
    public ysy ah;
    public aaea ai;
    public llu aj;
    public SettingsDataAccess ak;
    public ywr al;
    public ayqi am;
    public acra an;
    public axze ao;
    private PreferenceCategory ap;
    private ayqx aq;
    private ayqx ar;
    public ProtoDataStoreSwitchPreference c;
    public ProtoDataStoreSwitchPreference d;
    public ProtoDataStoreSwitchPreference e;

    private final ProtoDataStoreSwitchPreference aM(CharSequence charSequence) {
        ProtoDataStoreSwitchPreference protoDataStoreSwitchPreference = (ProtoDataStoreSwitchPreference) ol(charSequence);
        protoDataStoreSwitchPreference.getClass();
        return protoDataStoreSwitchPreference;
    }

    @Override // defpackage.ce
    public final void V() {
        Object obj = this.aq;
        if (obj != null) {
            azqb.f((AtomicReference) obj);
        }
        Object obj2 = this.ar;
        if (obj2 != null) {
            azqb.f((AtomicReference) obj2);
        }
        this.an.t();
        super.V();
    }

    @Override // defpackage.bsk
    public final void aH() {
        p(R.xml.data_saving_prefs);
        ci C = C();
        if (C == null) {
            return;
        }
        C.setTitle(O(R.string.data_saving_persistent_title));
        this.c = aM("data_saving_mode_key");
        this.d = aM("data_saving_pref_video_quality_key");
        this.e = aM("data_saving_pref_download_quality_key");
        this.ae = aM("data_saving_pref_download_wifi_only_key");
        this.af = aM("data_saving_pref_upload_wifi_only_key");
        this.ag = aM("data_saving_imp_wifi_only_key");
        PreferenceCategory preferenceCategory = (PreferenceCategory) ol("data_saving_monitoring_and_control_category");
        preferenceCategory.getClass();
        this.ap = preferenceCategory;
        aJ();
        final int i = 5;
        this.c.o = new brz(this) { // from class: loo
            public final /* synthetic */ DataSavingPrefsFragment a;

            {
                this.a = this;
            }

            @Override // defpackage.brz
            public final boolean b(Preference preference) {
                int i2 = i;
                if (i2 == 0) {
                    this.a.an.I(3, new acqx(acsb.c(133801)), null);
                    return true;
                }
                if (i2 == 1) {
                    this.a.an.I(3, new acqx(acsb.c(133800)), null);
                    return true;
                }
                if (i2 == 2) {
                    this.a.an.I(3, new acqx(acsb.c(133802)), null);
                    return true;
                }
                if (i2 == 3) {
                    this.a.an.I(3, new acqx(acsb.c(133803)), null);
                    return true;
                }
                if (i2 == 4) {
                    this.a.an.I(3, new acqx(acsb.c(133804)), null);
                    return true;
                }
                DataSavingPrefsFragment dataSavingPrefsFragment = this.a;
                if (!preference.s.equals("data_saving_mode_key")) {
                    return false;
                }
                dataSavingPrefsFragment.an.I(3, new acqx(acsb.c(133799)), null);
                boolean z = !((TwoStatePreference) ((ProtoDataStoreSwitchPreference) preference)).a;
                lox loxVar = (lox) dataSavingPrefsFragment.al.c();
                if (evr.S(dataSavingPrefsFragment.ai)) {
                    ProtoDataStoreSwitchPreference protoDataStoreSwitchPreference = dataSavingPrefsFragment.d;
                    if (((TwoStatePreference) protoDataStoreSwitchPreference).a != z) {
                        protoDataStoreSwitchPreference.k(z || loxVar.m);
                    }
                }
                if (dataSavingPrefsFragment.aj.d()) {
                    ProtoDataStoreSwitchPreference protoDataStoreSwitchPreference2 = dataSavingPrefsFragment.e;
                    if (((TwoStatePreference) protoDataStoreSwitchPreference2).a != z) {
                        protoDataStoreSwitchPreference2.k(z || loxVar.n);
                    }
                }
                if (dataSavingPrefsFragment.aj.d()) {
                    ProtoDataStoreSwitchPreference protoDataStoreSwitchPreference3 = dataSavingPrefsFragment.ae;
                    if (((TwoStatePreference) protoDataStoreSwitchPreference3).a != z) {
                        protoDataStoreSwitchPreference3.k(z || loxVar.o);
                    }
                }
                if (evr.X(dataSavingPrefsFragment.ah, dataSavingPrefsFragment.ai)) {
                    ProtoDataStoreSwitchPreference protoDataStoreSwitchPreference4 = dataSavingPrefsFragment.af;
                    if (((TwoStatePreference) protoDataStoreSwitchPreference4).a != z) {
                        protoDataStoreSwitchPreference4.k(z || loxVar.p);
                    }
                }
                ProtoDataStoreSwitchPreference protoDataStoreSwitchPreference5 = dataSavingPrefsFragment.ag;
                if (((TwoStatePreference) protoDataStoreSwitchPreference5).a == z) {
                    return true;
                }
                protoDataStoreSwitchPreference5.k(z || ((lox) dataSavingPrefsFragment.al.c()).q);
                return true;
            }
        };
        this.ar = this.al.d().n().E(this.am).A(new ayrv() { // from class: lop
            @Override // defpackage.ayrv
            public final Object a(Object obj) {
                DataSavingPrefsFragment dataSavingPrefsFragment = DataSavingPrefsFragment.this;
                lox loxVar = (lox) obj;
                if (!loxVar.g && !loxVar.h && !loxVar.i && !loxVar.j && !loxVar.k) {
                    ProtoDataStoreSwitchPreference protoDataStoreSwitchPreference = dataSavingPrefsFragment.c;
                    if (((TwoStatePreference) protoDataStoreSwitchPreference).a) {
                        protoDataStoreSwitchPreference.k(false);
                    }
                }
                return loxVar;
            }
        }).W();
        final int i2 = 1;
        this.d.o = new brz(this) { // from class: loo
            public final /* synthetic */ DataSavingPrefsFragment a;

            {
                this.a = this;
            }

            @Override // defpackage.brz
            public final boolean b(Preference preference) {
                int i22 = i2;
                if (i22 == 0) {
                    this.a.an.I(3, new acqx(acsb.c(133801)), null);
                    return true;
                }
                if (i22 == 1) {
                    this.a.an.I(3, new acqx(acsb.c(133800)), null);
                    return true;
                }
                if (i22 == 2) {
                    this.a.an.I(3, new acqx(acsb.c(133802)), null);
                    return true;
                }
                if (i22 == 3) {
                    this.a.an.I(3, new acqx(acsb.c(133803)), null);
                    return true;
                }
                if (i22 == 4) {
                    this.a.an.I(3, new acqx(acsb.c(133804)), null);
                    return true;
                }
                DataSavingPrefsFragment dataSavingPrefsFragment = this.a;
                if (!preference.s.equals("data_saving_mode_key")) {
                    return false;
                }
                dataSavingPrefsFragment.an.I(3, new acqx(acsb.c(133799)), null);
                boolean z = !((TwoStatePreference) ((ProtoDataStoreSwitchPreference) preference)).a;
                lox loxVar = (lox) dataSavingPrefsFragment.al.c();
                if (evr.S(dataSavingPrefsFragment.ai)) {
                    ProtoDataStoreSwitchPreference protoDataStoreSwitchPreference = dataSavingPrefsFragment.d;
                    if (((TwoStatePreference) protoDataStoreSwitchPreference).a != z) {
                        protoDataStoreSwitchPreference.k(z || loxVar.m);
                    }
                }
                if (dataSavingPrefsFragment.aj.d()) {
                    ProtoDataStoreSwitchPreference protoDataStoreSwitchPreference2 = dataSavingPrefsFragment.e;
                    if (((TwoStatePreference) protoDataStoreSwitchPreference2).a != z) {
                        protoDataStoreSwitchPreference2.k(z || loxVar.n);
                    }
                }
                if (dataSavingPrefsFragment.aj.d()) {
                    ProtoDataStoreSwitchPreference protoDataStoreSwitchPreference3 = dataSavingPrefsFragment.ae;
                    if (((TwoStatePreference) protoDataStoreSwitchPreference3).a != z) {
                        protoDataStoreSwitchPreference3.k(z || loxVar.o);
                    }
                }
                if (evr.X(dataSavingPrefsFragment.ah, dataSavingPrefsFragment.ai)) {
                    ProtoDataStoreSwitchPreference protoDataStoreSwitchPreference4 = dataSavingPrefsFragment.af;
                    if (((TwoStatePreference) protoDataStoreSwitchPreference4).a != z) {
                        protoDataStoreSwitchPreference4.k(z || loxVar.p);
                    }
                }
                ProtoDataStoreSwitchPreference protoDataStoreSwitchPreference5 = dataSavingPrefsFragment.ag;
                if (((TwoStatePreference) protoDataStoreSwitchPreference5).a == z) {
                    return true;
                }
                protoDataStoreSwitchPreference5.k(z || ((lox) dataSavingPrefsFragment.al.c()).q);
                return true;
            }
        };
        final int i3 = 0;
        this.e.o = new brz(this) { // from class: loo
            public final /* synthetic */ DataSavingPrefsFragment a;

            {
                this.a = this;
            }

            @Override // defpackage.brz
            public final boolean b(Preference preference) {
                int i22 = i3;
                if (i22 == 0) {
                    this.a.an.I(3, new acqx(acsb.c(133801)), null);
                    return true;
                }
                if (i22 == 1) {
                    this.a.an.I(3, new acqx(acsb.c(133800)), null);
                    return true;
                }
                if (i22 == 2) {
                    this.a.an.I(3, new acqx(acsb.c(133802)), null);
                    return true;
                }
                if (i22 == 3) {
                    this.a.an.I(3, new acqx(acsb.c(133803)), null);
                    return true;
                }
                if (i22 == 4) {
                    this.a.an.I(3, new acqx(acsb.c(133804)), null);
                    return true;
                }
                DataSavingPrefsFragment dataSavingPrefsFragment = this.a;
                if (!preference.s.equals("data_saving_mode_key")) {
                    return false;
                }
                dataSavingPrefsFragment.an.I(3, new acqx(acsb.c(133799)), null);
                boolean z = !((TwoStatePreference) ((ProtoDataStoreSwitchPreference) preference)).a;
                lox loxVar = (lox) dataSavingPrefsFragment.al.c();
                if (evr.S(dataSavingPrefsFragment.ai)) {
                    ProtoDataStoreSwitchPreference protoDataStoreSwitchPreference = dataSavingPrefsFragment.d;
                    if (((TwoStatePreference) protoDataStoreSwitchPreference).a != z) {
                        protoDataStoreSwitchPreference.k(z || loxVar.m);
                    }
                }
                if (dataSavingPrefsFragment.aj.d()) {
                    ProtoDataStoreSwitchPreference protoDataStoreSwitchPreference2 = dataSavingPrefsFragment.e;
                    if (((TwoStatePreference) protoDataStoreSwitchPreference2).a != z) {
                        protoDataStoreSwitchPreference2.k(z || loxVar.n);
                    }
                }
                if (dataSavingPrefsFragment.aj.d()) {
                    ProtoDataStoreSwitchPreference protoDataStoreSwitchPreference3 = dataSavingPrefsFragment.ae;
                    if (((TwoStatePreference) protoDataStoreSwitchPreference3).a != z) {
                        protoDataStoreSwitchPreference3.k(z || loxVar.o);
                    }
                }
                if (evr.X(dataSavingPrefsFragment.ah, dataSavingPrefsFragment.ai)) {
                    ProtoDataStoreSwitchPreference protoDataStoreSwitchPreference4 = dataSavingPrefsFragment.af;
                    if (((TwoStatePreference) protoDataStoreSwitchPreference4).a != z) {
                        protoDataStoreSwitchPreference4.k(z || loxVar.p);
                    }
                }
                ProtoDataStoreSwitchPreference protoDataStoreSwitchPreference5 = dataSavingPrefsFragment.ag;
                if (((TwoStatePreference) protoDataStoreSwitchPreference5).a == z) {
                    return true;
                }
                protoDataStoreSwitchPreference5.k(z || ((lox) dataSavingPrefsFragment.al.c()).q);
                return true;
            }
        };
        final int i4 = 2;
        this.ae.o = new brz(this) { // from class: loo
            public final /* synthetic */ DataSavingPrefsFragment a;

            {
                this.a = this;
            }

            @Override // defpackage.brz
            public final boolean b(Preference preference) {
                int i22 = i4;
                if (i22 == 0) {
                    this.a.an.I(3, new acqx(acsb.c(133801)), null);
                    return true;
                }
                if (i22 == 1) {
                    this.a.an.I(3, new acqx(acsb.c(133800)), null);
                    return true;
                }
                if (i22 == 2) {
                    this.a.an.I(3, new acqx(acsb.c(133802)), null);
                    return true;
                }
                if (i22 == 3) {
                    this.a.an.I(3, new acqx(acsb.c(133803)), null);
                    return true;
                }
                if (i22 == 4) {
                    this.a.an.I(3, new acqx(acsb.c(133804)), null);
                    return true;
                }
                DataSavingPrefsFragment dataSavingPrefsFragment = this.a;
                if (!preference.s.equals("data_saving_mode_key")) {
                    return false;
                }
                dataSavingPrefsFragment.an.I(3, new acqx(acsb.c(133799)), null);
                boolean z = !((TwoStatePreference) ((ProtoDataStoreSwitchPreference) preference)).a;
                lox loxVar = (lox) dataSavingPrefsFragment.al.c();
                if (evr.S(dataSavingPrefsFragment.ai)) {
                    ProtoDataStoreSwitchPreference protoDataStoreSwitchPreference = dataSavingPrefsFragment.d;
                    if (((TwoStatePreference) protoDataStoreSwitchPreference).a != z) {
                        protoDataStoreSwitchPreference.k(z || loxVar.m);
                    }
                }
                if (dataSavingPrefsFragment.aj.d()) {
                    ProtoDataStoreSwitchPreference protoDataStoreSwitchPreference2 = dataSavingPrefsFragment.e;
                    if (((TwoStatePreference) protoDataStoreSwitchPreference2).a != z) {
                        protoDataStoreSwitchPreference2.k(z || loxVar.n);
                    }
                }
                if (dataSavingPrefsFragment.aj.d()) {
                    ProtoDataStoreSwitchPreference protoDataStoreSwitchPreference3 = dataSavingPrefsFragment.ae;
                    if (((TwoStatePreference) protoDataStoreSwitchPreference3).a != z) {
                        protoDataStoreSwitchPreference3.k(z || loxVar.o);
                    }
                }
                if (evr.X(dataSavingPrefsFragment.ah, dataSavingPrefsFragment.ai)) {
                    ProtoDataStoreSwitchPreference protoDataStoreSwitchPreference4 = dataSavingPrefsFragment.af;
                    if (((TwoStatePreference) protoDataStoreSwitchPreference4).a != z) {
                        protoDataStoreSwitchPreference4.k(z || loxVar.p);
                    }
                }
                ProtoDataStoreSwitchPreference protoDataStoreSwitchPreference5 = dataSavingPrefsFragment.ag;
                if (((TwoStatePreference) protoDataStoreSwitchPreference5).a == z) {
                    return true;
                }
                protoDataStoreSwitchPreference5.k(z || ((lox) dataSavingPrefsFragment.al.c()).q);
                return true;
            }
        };
        final int i5 = 3;
        this.af.o = new brz(this) { // from class: loo
            public final /* synthetic */ DataSavingPrefsFragment a;

            {
                this.a = this;
            }

            @Override // defpackage.brz
            public final boolean b(Preference preference) {
                int i22 = i5;
                if (i22 == 0) {
                    this.a.an.I(3, new acqx(acsb.c(133801)), null);
                    return true;
                }
                if (i22 == 1) {
                    this.a.an.I(3, new acqx(acsb.c(133800)), null);
                    return true;
                }
                if (i22 == 2) {
                    this.a.an.I(3, new acqx(acsb.c(133802)), null);
                    return true;
                }
                if (i22 == 3) {
                    this.a.an.I(3, new acqx(acsb.c(133803)), null);
                    return true;
                }
                if (i22 == 4) {
                    this.a.an.I(3, new acqx(acsb.c(133804)), null);
                    return true;
                }
                DataSavingPrefsFragment dataSavingPrefsFragment = this.a;
                if (!preference.s.equals("data_saving_mode_key")) {
                    return false;
                }
                dataSavingPrefsFragment.an.I(3, new acqx(acsb.c(133799)), null);
                boolean z = !((TwoStatePreference) ((ProtoDataStoreSwitchPreference) preference)).a;
                lox loxVar = (lox) dataSavingPrefsFragment.al.c();
                if (evr.S(dataSavingPrefsFragment.ai)) {
                    ProtoDataStoreSwitchPreference protoDataStoreSwitchPreference = dataSavingPrefsFragment.d;
                    if (((TwoStatePreference) protoDataStoreSwitchPreference).a != z) {
                        protoDataStoreSwitchPreference.k(z || loxVar.m);
                    }
                }
                if (dataSavingPrefsFragment.aj.d()) {
                    ProtoDataStoreSwitchPreference protoDataStoreSwitchPreference2 = dataSavingPrefsFragment.e;
                    if (((TwoStatePreference) protoDataStoreSwitchPreference2).a != z) {
                        protoDataStoreSwitchPreference2.k(z || loxVar.n);
                    }
                }
                if (dataSavingPrefsFragment.aj.d()) {
                    ProtoDataStoreSwitchPreference protoDataStoreSwitchPreference3 = dataSavingPrefsFragment.ae;
                    if (((TwoStatePreference) protoDataStoreSwitchPreference3).a != z) {
                        protoDataStoreSwitchPreference3.k(z || loxVar.o);
                    }
                }
                if (evr.X(dataSavingPrefsFragment.ah, dataSavingPrefsFragment.ai)) {
                    ProtoDataStoreSwitchPreference protoDataStoreSwitchPreference4 = dataSavingPrefsFragment.af;
                    if (((TwoStatePreference) protoDataStoreSwitchPreference4).a != z) {
                        protoDataStoreSwitchPreference4.k(z || loxVar.p);
                    }
                }
                ProtoDataStoreSwitchPreference protoDataStoreSwitchPreference5 = dataSavingPrefsFragment.ag;
                if (((TwoStatePreference) protoDataStoreSwitchPreference5).a == z) {
                    return true;
                }
                protoDataStoreSwitchPreference5.k(z || ((lox) dataSavingPrefsFragment.al.c()).q);
                return true;
            }
        };
        final int i6 = 4;
        this.ag.o = new brz(this) { // from class: loo
            public final /* synthetic */ DataSavingPrefsFragment a;

            {
                this.a = this;
            }

            @Override // defpackage.brz
            public final boolean b(Preference preference) {
                int i22 = i6;
                if (i22 == 0) {
                    this.a.an.I(3, new acqx(acsb.c(133801)), null);
                    return true;
                }
                if (i22 == 1) {
                    this.a.an.I(3, new acqx(acsb.c(133800)), null);
                    return true;
                }
                if (i22 == 2) {
                    this.a.an.I(3, new acqx(acsb.c(133802)), null);
                    return true;
                }
                if (i22 == 3) {
                    this.a.an.I(3, new acqx(acsb.c(133803)), null);
                    return true;
                }
                if (i22 == 4) {
                    this.a.an.I(3, new acqx(acsb.c(133804)), null);
                    return true;
                }
                DataSavingPrefsFragment dataSavingPrefsFragment = this.a;
                if (!preference.s.equals("data_saving_mode_key")) {
                    return false;
                }
                dataSavingPrefsFragment.an.I(3, new acqx(acsb.c(133799)), null);
                boolean z = !((TwoStatePreference) ((ProtoDataStoreSwitchPreference) preference)).a;
                lox loxVar = (lox) dataSavingPrefsFragment.al.c();
                if (evr.S(dataSavingPrefsFragment.ai)) {
                    ProtoDataStoreSwitchPreference protoDataStoreSwitchPreference = dataSavingPrefsFragment.d;
                    if (((TwoStatePreference) protoDataStoreSwitchPreference).a != z) {
                        protoDataStoreSwitchPreference.k(z || loxVar.m);
                    }
                }
                if (dataSavingPrefsFragment.aj.d()) {
                    ProtoDataStoreSwitchPreference protoDataStoreSwitchPreference2 = dataSavingPrefsFragment.e;
                    if (((TwoStatePreference) protoDataStoreSwitchPreference2).a != z) {
                        protoDataStoreSwitchPreference2.k(z || loxVar.n);
                    }
                }
                if (dataSavingPrefsFragment.aj.d()) {
                    ProtoDataStoreSwitchPreference protoDataStoreSwitchPreference3 = dataSavingPrefsFragment.ae;
                    if (((TwoStatePreference) protoDataStoreSwitchPreference3).a != z) {
                        protoDataStoreSwitchPreference3.k(z || loxVar.o);
                    }
                }
                if (evr.X(dataSavingPrefsFragment.ah, dataSavingPrefsFragment.ai)) {
                    ProtoDataStoreSwitchPreference protoDataStoreSwitchPreference4 = dataSavingPrefsFragment.af;
                    if (((TwoStatePreference) protoDataStoreSwitchPreference4).a != z) {
                        protoDataStoreSwitchPreference4.k(z || loxVar.p);
                    }
                }
                ProtoDataStoreSwitchPreference protoDataStoreSwitchPreference5 = dataSavingPrefsFragment.ag;
                if (((TwoStatePreference) protoDataStoreSwitchPreference5).a == z) {
                    return true;
                }
                protoDataStoreSwitchPreference5.k(z || ((lox) dataSavingPrefsFragment.al.c()).q);
                return true;
            }
        };
    }

    public final void aJ() {
        this.an.n(new acqx(acsb.c(133799)));
        this.an.n(new acqx(acsb.c(133804)));
        if (evr.S(this.ai)) {
            this.an.n(new acqx(acsb.c(133800)));
        } else {
            this.d.N(false);
        }
        if (evr.X(this.ah, this.ai)) {
            this.an.n(new acqx(acsb.c(133803)));
        } else {
            this.af.N(false);
        }
        if (this.aj.d()) {
            this.e.N(true);
            this.ae.N(true);
            this.an.n(new acqx(acsb.c(133801)));
            this.an.n(new acqx(acsb.c(133802)));
        } else {
            this.e.N(false);
            this.ae.N(false);
        }
        this.ap.N(((Boolean) this.ao.b().aB()).booleanValue());
    }

    @Override // defpackage.bsk, defpackage.ce
    public final void aa(View view, Bundle bundle) {
        super.aa(view, bundle);
        this.aq = this.ak.g(new Runnable() { // from class: loq
            @Override // java.lang.Runnable
            public final void run() {
                DataSavingPrefsFragment dataSavingPrefsFragment = DataSavingPrefsFragment.this;
                if (dataSavingPrefsFragment.ar()) {
                    dataSavingPrefsFragment.aJ();
                }
            }
        });
        this.an.d(acsb.b(133798), null, null);
    }
}
