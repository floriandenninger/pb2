package defpackage;

import android.content.Context;
import android.content.SharedPreferences;

/* compiled from: PG */
/* loaded from: classes.dex */
final class anwh {
    private static anwh a;
    private final SharedPreferences b;

    private anwh(Context context) {
        this.b = context.getSharedPreferences("FirebaseAppHeartBeat", 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static synchronized anwh a(Context context) {
        anwh anwhVar;
        synchronized (anwh.class) {
            if (a == null) {
                a = new anwh(context);
            }
            anwhVar = a;
        }
        return anwhVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized boolean b(long j) {
        return c("fire-global", j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized boolean c(String str, long j) {
        if (!this.b.contains(str)) {
            this.b.edit().putLong(str, j).apply();
            return true;
        }
        if (j - this.b.getLong(str, -1L) < 86400000) {
            return false;
        }
        this.b.edit().putLong(str, j).apply();
        return true;
    }
}
