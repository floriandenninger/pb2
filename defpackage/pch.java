package defpackage;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class pch {
    private static final Pattern c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");
    public final int a;
    public final int b;

    private pch(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public static pch a(String str, String str2) {
        if (!"iTunSMPB".equals(str)) {
            return null;
        }
        Matcher matcher = c.matcher(str2);
        if (!matcher.find()) {
            return null;
        }
        try {
            int parseInt = Integer.parseInt(matcher.group(1), 16);
            int parseInt2 = Integer.parseInt(matcher.group(2), 16);
            if (parseInt == 0) {
                if (parseInt2 == 0) {
                    return null;
                }
                parseInt = 0;
            }
            return new pch(parseInt, parseInt2);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static pch b(int i) {
        int i2 = i >> 12;
        int i3 = i & 4095;
        if (i2 == 0 && i3 == 0) {
            return null;
        }
        return new pch(i2, i3);
    }
}
