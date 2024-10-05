package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.libraries.youtube.livecreation.controller.StreamConfig;
import com.google.android.libraries.youtube.livecreation.ui.LiveCreationActivity;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acff implements Runnable {
    private final boolean a;
    private final Context b;
    private final abya c;
    private final shf d;
    private final SharedPreferences e;

    public acff(boolean z, Context context, abya abyaVar, shf shfVar, SharedPreferences sharedPreferences) {
        this.a = z;
        this.b = context;
        this.c = abyaVar;
        this.d = shfVar;
        this.e = sharedPreferences;
    }

    @Override // java.lang.Runnable
    public final void run() {
        StreamConfig a;
        new abrx(this.b, this.d).c();
        String string = this.e.getString("SHARED_PREF_STREAM_CONFIG_KEY", null);
        if (TextUtils.isEmpty(string)) {
            return;
        }
        SharedPreferences.Editor edit = this.e.edit();
        edit.remove("SHARED_PREF_STREAM_CONFIG_KEY");
        edit.remove("SHARED_PREF_LS_TIMESTAMP_KEY");
        edit.commit();
        if (!this.a || (a = StreamConfig.a(string)) == null || TextUtils.isEmpty(a.c)) {
            return;
        }
        this.c.e(a.c, LiveCreationActivity.e);
    }
}
