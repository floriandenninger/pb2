package com.google.android.apps.youtube.app.settings.accessibility;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import androidx.preference.Preference;
import com.google.android.apps.youtube.app.settings.accessibility.AccessibilitySettingsActivity;
import com.google.android.youtube.R;
import defpackage.acqx;
import defpackage.acqz;
import defpackage.acra;
import defpackage.acsb;
import defpackage.bsh;
import defpackage.ce;
import defpackage.cn;
import defpackage.dd;
import defpackage.dn;
import defpackage.etx;
import defpackage.gng;
import defpackage.gni;
import defpackage.lnc;
import defpackage.lnh;
import defpackage.lnk;
import defpackage.whu;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class AccessibilitySettingsActivity extends lnk implements bsh, acqz {
    public gni a;
    public acra b;
    boolean c = false;

    @Override // defpackage.bsh
    public final boolean a(Preference preference) {
        if (!"accessibility_hide_player_controls_setting_key".equals(preference.s)) {
            return false;
        }
        if (getSupportFragmentManager().f("PREF_DIALOG") != null) {
            return true;
        }
        lnh aM = lnh.aM(preference.s);
        aM.aE(getSupportFragmentManager().e(R.id.settings_fragments));
        aM.qh(getSupportFragmentManager(), "PREF_DIALOG");
        return true;
    }

    @Override // defpackage.lnk
    public final void b() {
        if (this.c) {
            return;
        }
        super.b();
        this.c = true;
    }

    @Override // defpackage.acqz
    public final acra mM() {
        return this.b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ci, defpackage.zv, defpackage.er, android.app.Activity
    public final void onCreate(Bundle bundle) {
        b();
        if (this.a.a() == gng.DARK) {
            setTheme(R.style.Theme_YouTube_Settings_Dark);
        } else {
            setTheme(R.style.Theme_YouTube_Settings);
            etx.h(this);
        }
        super.onCreate(bundle);
        setContentView(R.layout.single_column_settings_with_toolbar);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        if (toolbar != null) {
            setSupportActionBar(toolbar);
            getSupportActionBar().j(true);
            toolbar.q(whu.y(this, R.drawable.yt_outline_arrow_left_black_24, R.attr.ytTextPrimary));
            toolbar.r(new View.OnClickListener() { // from class: lnd
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AccessibilitySettingsActivity.this.onBackPressed();
                }
            });
        }
        if (bundle == null) {
            cn h = getSupportFragmentManager().h();
            getClassLoader();
            ce c = h.c(AccessibilityPrefsFragment.class.getName());
            dn k = getSupportFragmentManager().k();
            k.i = 0;
            k.y(R.id.settings_fragments, c);
            k.d();
            setTitle(R.string.accessibility_settings_title);
            dd supportFragmentManager = getSupportFragmentManager();
            lnc lncVar = new lnc(this);
            if (supportFragmentManager.i == null) {
                supportFragmentManager.i = new ArrayList();
            }
            supportFragmentManager.i.add(lncVar);
        }
        this.b.d(acsb.b(85013), null, null);
        this.b.n(new acqx(acsb.c(85014)));
    }
}
