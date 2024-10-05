package defpackage;

import android.media.MediaDrmResetException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ayu {
    public static boolean a(Throwable th) {
        return th instanceof MediaDrmResetException;
    }

    public static long b(String str) {
        long j = 0;
        if (str != null) {
            for (int i = 0; i < str.length(); i++) {
                long charAt = j ^ str.charAt(i);
                j = charAt + charAt + charAt + (charAt << 4) + (charAt << 5) + (charAt << 7) + (charAt << 8) + (charAt << 40);
            }
        }
        return j;
    }
}
