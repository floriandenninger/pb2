package defpackage;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afxh {
    private static final Pattern a = Pattern.compile("age=(\\d*)");
    private final shf b;

    public afxh(shf shfVar) {
        this.b = shfVar;
    }

    public final long a(String str) {
        long j;
        long c = this.b.c();
        if (str != null) {
            if (str.contains("no-cache")) {
                return c;
            }
            Matcher matcher = a.matcher(str);
            if (matcher.find()) {
                try {
                    j = Long.parseLong(matcher.group(1), 10) * 1000;
                } catch (NumberFormatException unused) {
                }
                return c + j;
            }
        }
        j = 604800000;
        return c + j;
    }
}
