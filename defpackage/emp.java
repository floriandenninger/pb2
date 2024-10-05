package defpackage;

import android.app.backup.RestoreObserver;
import android.content.SharedPreferences;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class emp extends RestoreObserver {
    final /* synthetic */ SharedPreferences a;

    public emp(SharedPreferences sharedPreferences) {
        this.a = sharedPreferences;
    }

    @Override // android.app.backup.RestoreObserver
    public final void onUpdate(int i, String str) {
    }

    @Override // android.app.backup.RestoreObserver
    public final void restoreFinished(int i) {
        if (i == 0) {
            this.a.edit().putBoolean("got_future_restore", false).apply();
            zga.g("Manual restore succeeded.");
        } else {
            StringBuilder sb = new StringBuilder(45);
            sb.append("Manual restore failed with error: ");
            sb.append(i);
            zga.l(sb.toString());
        }
    }

    @Override // android.app.backup.RestoreObserver
    public final void restoreStarting(int i) {
    }
}
