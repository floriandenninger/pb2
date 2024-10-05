package defpackage;

import android.text.TextUtils;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adtt {
    private static final Pattern a = Pattern.compile("RQ.*");

    public static boolean a(String str) {
        return !TextUtils.isEmpty(str) && a.matcher(str).matches();
    }

    public static boolean b(String str, String str2) {
        if (str != null && str2 != null) {
            if (str.equals(str2)) {
                return true;
            }
            if (a(str)) {
                return a(str2);
            }
        }
        return false;
    }
}
