package defpackage;

import android.media.DeniedByServerException;
import android.media.NotProvisionedException;
import android.util.Pair;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ays {
    public static boolean a(Throwable th) {
        return th instanceof DeniedByServerException;
    }

    public static boolean b(Throwable th) {
        return th instanceof NotProvisionedException;
    }

    public static Pair c(ayh ayhVar) {
        Map d = ayhVar.d();
        if (d == null) {
            return null;
        }
        return new Pair(Long.valueOf(d(d, "LicenseDurationRemaining")), Long.valueOf(d(d, "PlaybackDurationRemaining")));
    }

    private static long d(Map map, String str) {
        try {
            String str2 = (String) map.get(str);
            if (str2 != null) {
                return Long.parseLong(str2);
            }
            return -9223372036854775807L;
        } catch (NumberFormatException unused) {
            return -9223372036854775807L;
        }
    }
}
