package defpackage;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class usd {
    private static final amxj a = amxj.l("com/google/android/libraries/performance/primes/metrics/network/NetworkMetricCollector");
    private static final amsx b = amsx.u("googleapis.com", "adwords.google.com", "m.google.com", "sandbox.google.com");
    private static final Pattern c = Pattern.compile("(?:[^\\/]*\\/)([^;]*)");
    private static final Pattern d = Pattern.compile("([^\\?]+)(\\?+)");
    private static final Pattern e = Pattern.compile("((?:https?:\\/\\/|)[a-zA-Z0-9-_\\.]+(?::\\d+)?)(.*)?");
    private static final Pattern f = Pattern.compile("([a-zA-Z0-9-_]+)");
    private static final Pattern g = Pattern.compile("\\b([0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3})(:\\d{1,5})?\\b");
    private final azrw h;

    public usd(azrw azrwVar) {
        this.h = azrwVar;
    }

    static String a(String str) {
        Matcher matcher = e.matcher(str);
        if (matcher.matches()) {
            return matcher.group(1);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static java.lang.String b(java.lang.String r3, defpackage.usj r4, boolean r5) {
        /*
            boolean r0 = defpackage.ammx.e(r3)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            if (r4 == 0) goto L10
            if (r5 != 0) goto L10
            java.lang.String r3 = r4.a(r3)
        L10:
            r4 = 1
            if (r5 == 0) goto L15
        L13:
            r5 = 1
            goto L1e
        L15:
            java.lang.String r5 = a(r3)
            if (r5 == 0) goto L1d
            r3 = r5
            goto L13
        L1d:
            r5 = 0
        L1e:
            java.util.regex.Pattern r0 = defpackage.usd.d
            java.util.regex.Matcher r0 = r0.matcher(r3)
            boolean r2 = r0.find()
            if (r2 == 0) goto L2f
            java.lang.String r3 = r0.group(r4)
            r5 = 1
        L2f:
            java.lang.String r0 = c(r3)
            if (r0 == 0) goto L3c
            boolean r3 = r0.equals(r3)
            if (r3 != 0) goto L3c
            r5 = 1
        L3c:
            if (r0 == 0) goto L51
            java.util.regex.Pattern r3 = defpackage.usd.g
            java.util.regex.Matcher r3 = r3.matcher(r0)
            boolean r2 = r3.find()
            if (r2 == 0) goto L51
            java.lang.String r5 = "<ip>"
            java.lang.String r0 = r3.replaceFirst(r5)
            r5 = 1
        L51:
            if (r0 == 0) goto L67
            if (r5 != 0) goto L67
            java.util.regex.Pattern r3 = defpackage.usd.f
            java.util.regex.Matcher r3 = r3.matcher(r0)
            boolean r5 = r3.find()
            if (r5 != 0) goto L62
            goto L68
        L62:
            java.lang.String r3 = r3.group(r4)
            return r3
        L67:
            r1 = r0
        L68:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.usd.b(java.lang.String, usj, boolean):java.lang.String");
    }

    static String c(String str) {
        if (str == null) {
            return null;
        }
        Matcher matcher = g.matcher(str);
        return matcher.find() ? matcher.replaceFirst("<ip>") : str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01cc, code lost:
    
        if (r12 != 2) goto L86;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0351 A[LOOP:0: B:2:0x000c->B:68:0x0351, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x03a0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0210  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.bact d(defpackage.usc... r17) {
        /*
            Method dump skipped, instructions count: 998
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.usd.d(usc[]):bact");
    }
}
