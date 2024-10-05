package defpackage;

import android.content.Context;
import android.provider.Settings;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class uqd {
    static {
        TimeUnit.DAYS.toMillis(365L);
        TimeUnit.HOURS.toMillis(6L);
    }

    public uqd(Context context) {
        uon.b();
        Settings.Secure.getString(context.getContentResolver(), "android_id");
    }
}
