package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.apps.youtube.app.application.backup.YouTubeBackupAgent;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class emn implements SharedPreferences.OnSharedPreferenceChangeListener {
    final /* synthetic */ Context a;

    public emn(Context context) {
        this.a = context;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if (emq.a.a(str)) {
            YouTubeBackupAgent.e(this.a);
        }
    }
}
