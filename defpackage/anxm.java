package defpackage;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class anxm {
    public static final long a = TimeUnit.HOURS.toSeconds(1);
    public static final Pattern b = Pattern.compile("\\AA[\\w-]{38}\\z");
    private static anxm c;

    private anxm() {
    }

    public static anxm b() {
        if (aocz.d == null) {
            aocz.d = new aocz();
        }
        if (c == null) {
            c = new anxm();
        }
        return c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean d(String str) {
        return str.contains(":");
    }

    public final long a() {
        return TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
    }

    public final boolean c(anxr anxrVar) {
        return TextUtils.isEmpty(anxrVar.b) || anxrVar.e + anxrVar.d < a() + a;
    }
}
