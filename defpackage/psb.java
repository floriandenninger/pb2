package defpackage;

import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class psb {
    static {
        Pattern.compile("^NOTE([ \t].*)?$");
    }

    public static float a(String str) {
        if (!str.endsWith("%")) {
            throw new NumberFormatException("Percentages must end with %");
        }
        return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
    }

    public static long b(String str) {
        String[] ag = pts.ag(str, "\\.");
        long j = 0;
        for (String str2 : pts.af(ag[0], ":")) {
            j = (j * 60) + Long.parseLong(str2);
        }
        long j2 = j * 1000;
        if (ag.length == 2) {
            j2 += Long.parseLong(ag[1]);
        }
        return j2 * 1000;
    }

    public static void c(pth pthVar) {
        int i = pthVar.b;
        String s = pthVar.s();
        if (s == null || !s.startsWith("WEBVTT")) {
            pthVar.G(i);
            String valueOf = String.valueOf(pthVar.s());
            throw pnr.a(valueOf.length() != 0 ? "Expected WEBVTT. Got ".concat(valueOf) : new String("Expected WEBVTT. Got "), null);
        }
    }
}
