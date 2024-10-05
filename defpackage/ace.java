package defpackage;

import android.content.Context;
import android.os.CancellationSignal;
import android.os.StrictMode;
import java.util.LinkedHashSet;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ace {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static CancellationSignal a() {
        return new CancellationSignal();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(CancellationSignal cancellationSignal) {
        cancellationSignal.cancel();
    }

    public static final void c(LinkedHashSet linkedHashSet) {
        linkedHashSet.add(new acg());
    }

    public static final String d(Context context, int i, Object... objArr) {
        return e(Locale.getDefault(), context.getResources().getString(i), objArr);
    }

    public static final String e(Locale locale, String str, Object... objArr) {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            return l.a(locale, str, objArr);
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }
}
