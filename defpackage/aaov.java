package defpackage;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aaov {
    private static final zgd b = new aaot();
    public static final zgd a = new aaou();

    public static String a(String str) {
        Matcher matcher = ((Pattern) b.get()).matcher(str);
        if (matcher.find()) {
            return matcher.group(1);
        }
        return null;
    }

    public static String b(String str) {
        return str.split(";", 2)[0];
    }

    public static boolean c(String str) {
        return str.startsWith("audio");
    }

    public static boolean d(String str) {
        return str.startsWith("video");
    }

    public static boolean e(String str) {
        return b(str).endsWith("webm");
    }
}
