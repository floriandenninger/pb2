package defpackage;

import android.content.SharedPreferences;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class lhe implements SharedPreferences.OnSharedPreferenceChangeListener {
    private final axpg a;

    public lhe(axpg axpgVar) {
        this.a = axpgVar;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if (sharedPreferences.getBoolean("enable_on_device_suggest", false) || sharedPreferences.getBoolean("enable_on_device_suggest_counterfactual_logging", false)) {
            if ("latest_on_device_suggest_index_url".equals(str) || "enable_on_device_suggest".equals(str) || "enable_on_device_suggest_counterfactual_logging".equals(str)) {
                ((akdp) this.a.get()).a();
            }
        }
    }
}
