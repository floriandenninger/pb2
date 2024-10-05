package com.google.android.apps.youtube.app.settings.accessibility;

import android.os.Bundle;
import android.view.accessibility.AccessibilityManager;
import androidx.preference.Preference;
import com.google.android.apps.youtube.app.settings.accessibility.AccessibilityPrefsFragment;
import com.google.android.libraries.youtube.common.ui.preferences.ProtoDataStoreListPreference;
import com.google.android.libraries.youtube.common.ui.preferences.ProtoDataStoreSwitchPreference;
import com.google.android.youtube.R;
import defpackage.acqx;
import defpackage.acqz;
import defpackage.acsb;
import defpackage.anhy;
import defpackage.brz;
import defpackage.kqh;
import defpackage.llq;
import defpackage.lni;
import defpackage.ynm;
import defpackage.zed;
import defpackage.zev;
import defpackage.zfi;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class AccessibilityPrefsFragment extends lni implements AccessibilityManager.AccessibilityStateChangeListener {
    private ProtoDataStoreSwitchPreference ae;
    public ProtoDataStoreListPreference c;
    public kqh d;
    public acqz e;

    private final void aL() {
        this.ae.ae(Boolean.valueOf(this.d.c()));
        anhy ad = this.ae.ad();
        llq llqVar = llq.e;
        final ProtoDataStoreListPreference protoDataStoreListPreference = this.c;
        protoDataStoreListPreference.getClass();
        ynm.n(this, ad, llqVar, new zfi() { // from class: lnb
            @Override // defpackage.zfi
            public final void a(Object obj) {
                ProtoDataStoreListPreference.this.G(((Boolean) obj).booleanValue());
            }
        });
    }

    @Override // defpackage.bsk
    public final void aH() {
        C().setTitle(R.string.accessibility_settings_title);
        this.e.mM().d(acsb.b(85013), null, null);
        this.e.mM().n(new acqx(acsb.c(85014)));
    }

    @Override // defpackage.bsk, defpackage.ce
    public final void mD() {
        super.mD();
        zev.h(qR(), this);
    }

    @Override // defpackage.bsk, defpackage.ce
    public final void mR(Bundle bundle) {
        super.mR(bundle);
        this.a.g("youtube");
        p(R.xml.accessibility_prefs);
        ProtoDataStoreSwitchPreference protoDataStoreSwitchPreference = (ProtoDataStoreSwitchPreference) ol("accessibility_player_setting_key");
        protoDataStoreSwitchPreference.getClass();
        this.ae = protoDataStoreSwitchPreference;
        ProtoDataStoreListPreference protoDataStoreListPreference = (ProtoDataStoreListPreference) ol("accessibility_hide_player_controls_setting_key");
        protoDataStoreListPreference.getClass();
        this.c = protoDataStoreListPreference;
        final int i = 1;
        this.ae.c = new zed(this) { // from class: lna
            public final /* synthetic */ AccessibilityPrefsFragment a;

            {
                this.a = this;
            }

            @Override // defpackage.zed
            public final void a(Object obj) {
                if (i == 0) {
                    AccessibilityPrefsFragment accessibilityPrefsFragment = this.a;
                    aone createBuilder = asht.a.createBuilder();
                    aone createBuilder2 = ashi.a.createBuilder();
                    long x = ayeq.x((String) obj);
                    createBuilder2.copyOnWrite();
                    ashi ashiVar = (ashi) createBuilder2.instance;
                    ashiVar.b = 1 | ashiVar.b;
                    ashiVar.c = x;
                    createBuilder.copyOnWrite();
                    asht ashtVar = (asht) createBuilder.instance;
                    ashi ashiVar2 = (ashi) createBuilder2.build();
                    ashiVar2.getClass();
                    ashtVar.u = ashiVar2;
                    ashtVar.c |= 2048;
                    accessibilityPrefsFragment.e.mM().I(3, new acqx(acsb.c(85015)), (asht) createBuilder.build());
                    return;
                }
                AccessibilityPrefsFragment accessibilityPrefsFragment2 = this.a;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                accessibilityPrefsFragment2.c.G(booleanValue);
                aone createBuilder3 = asht.a.createBuilder();
                aone createBuilder4 = ashk.a.createBuilder();
                int i2 = true != booleanValue ? 3 : 2;
                createBuilder4.copyOnWrite();
                ashk ashkVar = (ashk) createBuilder4.instance;
                ashkVar.c = i2 - 1;
                ashkVar.b |= 1;
                createBuilder3.copyOnWrite();
                asht ashtVar2 = (asht) createBuilder3.instance;
                ashk ashkVar2 = (ashk) createBuilder4.build();
                ashkVar2.getClass();
                ashtVar2.m = ashkVar2;
                ashtVar2.b |= 32768;
                accessibilityPrefsFragment2.e.mM().I(3, new acqx(acsb.c(85014)), (asht) createBuilder3.build());
            }
        };
        this.c.o = new brz() { // from class: lmz
            @Override // defpackage.brz
            public final boolean b(Preference preference) {
                AccessibilityPrefsFragment.this.e.mM().n(new acqx(acsb.c(85015)));
                return true;
            }
        };
        final int i2 = 0;
        this.c.G = new zed(this) { // from class: lna
            public final /* synthetic */ AccessibilityPrefsFragment a;

            {
                this.a = this;
            }

            @Override // defpackage.zed
            public final void a(Object obj) {
                if (i2 == 0) {
                    AccessibilityPrefsFragment accessibilityPrefsFragment = this.a;
                    aone createBuilder = asht.a.createBuilder();
                    aone createBuilder2 = ashi.a.createBuilder();
                    long x = ayeq.x((String) obj);
                    createBuilder2.copyOnWrite();
                    ashi ashiVar = (ashi) createBuilder2.instance;
                    ashiVar.b = 1 | ashiVar.b;
                    ashiVar.c = x;
                    createBuilder.copyOnWrite();
                    asht ashtVar = (asht) createBuilder.instance;
                    ashi ashiVar2 = (ashi) createBuilder2.build();
                    ashiVar2.getClass();
                    ashtVar.u = ashiVar2;
                    ashtVar.c |= 2048;
                    accessibilityPrefsFragment.e.mM().I(3, new acqx(acsb.c(85015)), (asht) createBuilder.build());
                    return;
                }
                AccessibilityPrefsFragment accessibilityPrefsFragment2 = this.a;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                accessibilityPrefsFragment2.c.G(booleanValue);
                aone createBuilder3 = asht.a.createBuilder();
                aone createBuilder4 = ashk.a.createBuilder();
                int i22 = true != booleanValue ? 3 : 2;
                createBuilder4.copyOnWrite();
                ashk ashkVar = (ashk) createBuilder4.instance;
                ashkVar.c = i22 - 1;
                ashkVar.b |= 1;
                createBuilder3.copyOnWrite();
                asht ashtVar2 = (asht) createBuilder3.instance;
                ashk ashkVar2 = (ashk) createBuilder4.build();
                ashkVar2.getClass();
                ashtVar2.m = ashkVar2;
                ashtVar2.b |= 32768;
                accessibilityPrefsFragment2.e.mM().I(3, new acqx(acsb.c(85014)), (asht) createBuilder3.build());
            }
        };
    }

    @Override // defpackage.bsk, defpackage.ce
    public final void mS() {
        super.mS();
        zev.g(qR(), this);
        aL();
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public final void onAccessibilityStateChanged(boolean z) {
        aL();
    }
}
