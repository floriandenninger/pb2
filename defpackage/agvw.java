package defpackage;

import android.content.SharedPreferences;

/* compiled from: PG */
/* loaded from: classes.dex */
final class agvw implements SharedPreferences.OnSharedPreferenceChangeListener {
    final /* synthetic */ agvx a;

    public agvw(agvx agvxVar) {
        this.a = agvxVar;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if (str.equals(aghv.WIFI_POLICY_STRING) || str.equals(aghv.DOWNLOAD_NETWORK_PREFERENCE)) {
            this.a.b();
        }
    }
}
