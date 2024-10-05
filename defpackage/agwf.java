package defpackage;

import android.content.SharedPreferences;
import com.google.android.libraries.youtube.offline.transfer.service.OfflineTransferService;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agwf implements SharedPreferences.OnSharedPreferenceChangeListener {
    final /* synthetic */ OfflineTransferService a;

    public agwf(OfflineTransferService offlineTransferService) {
        this.a = offlineTransferService;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if (str.equals(aghv.WIFI_POLICY_STRING) || str.equals(aghv.DOWNLOAD_NETWORK_PREFERENCE)) {
            this.a.q();
        }
    }
}
