package defpackage;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class badq {
    public static final SharedPreferences a;

    static {
        baec b = baec.b();
        try {
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(ayeq.a);
            b.close();
            a = defaultSharedPreferences;
        } catch (Throwable th) {
            try {
                b.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }
}
