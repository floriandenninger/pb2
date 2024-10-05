package defpackage;

import android.content.SharedPreferences;

/* compiled from: PG */
/* loaded from: classes.dex */
final class akyj implements SharedPreferences.OnSharedPreferenceChangeListener {
    final /* synthetic */ akyk a;

    public akyj(akyk akykVar) {
        this.a = akykVar;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if (yny.UPLOAD_NETWORK_POLICY.equals(str)) {
            this.a.c();
        }
    }
}
