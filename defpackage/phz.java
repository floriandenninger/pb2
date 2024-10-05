package defpackage;

import java.io.File;
import java.util.regex.Pattern;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class phz extends phl {
    private static final Pattern g = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v1\\.exo$", 32);
    private static final Pattern h = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v2\\.exo$", 32);
    private static final Pattern i = Pattern.compile("^(\\d+)\\.(\\d+)\\.(\\d+)\\.v3\\.exo$", 32);

    public phz(String str, long j, long j2, long j3, File file) {
        super(str, j, j2, j3, file);
    }

    public static phz d(String str, long j) {
        return new phz(str, j, -1L, -9223372036854775807L, null);
    }

    public static File e(File file, int i2, long j, long j2) {
        StringBuilder sb = new StringBuilder(60);
        sb.append(i2);
        sb.append(".");
        sb.append(j);
        sb.append(".");
        sb.append(j2);
        sb.append(".v3.exo");
        return new File(file, sb.toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x002a, code lost:
    
        if (r1 == null) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0063, code lost:
    
        if (r16.renameTo(r1) == false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.phz f(java.io.File r16, long r17, defpackage.php r19) {
        /*
            r0 = r19
            java.lang.String r1 = r16.getName()
            java.lang.String r2 = ".v3.exo"
            boolean r2 = r1.endsWith(r2)
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 != 0) goto L70
            java.lang.String r1 = r16.getName()
            java.util.regex.Pattern r2 = defpackage.phz.h
            java.util.regex.Matcher r2 = r2.matcher(r1)
            boolean r7 = r2.matches()
            if (r7 == 0) goto L2d
            java.lang.String r1 = r2.group(r5)
            java.lang.String r1 = defpackage.pts.L(r1)
            if (r1 != 0) goto L3f
            goto L39
        L2d:
            java.util.regex.Pattern r2 = defpackage.phz.g
            java.util.regex.Matcher r2 = r2.matcher(r1)
            boolean r1 = r2.matches()
            if (r1 != 0) goto L3b
        L39:
            r1 = r6
            goto L66
        L3b:
            java.lang.String r1 = r2.group(r5)
        L3f:
            java.io.File r7 = r16.getParentFile()
            phm r1 = r0.b(r1)
            int r8 = r1.a
            java.lang.String r1 = r2.group(r4)
            long r9 = java.lang.Long.parseLong(r1)
            java.lang.String r1 = r2.group(r3)
            long r11 = java.lang.Long.parseLong(r1)
            java.io.File r1 = e(r7, r8, r9, r11)
            r2 = r16
            boolean r2 = r2.renameTo(r1)
            if (r2 != 0) goto L66
            goto L39
        L66:
            if (r1 != 0) goto L69
            return r6
        L69:
            java.lang.String r2 = r1.getName()
            r15 = r1
            r1 = r2
            goto L73
        L70:
            r2 = r16
            r15 = r2
        L73:
            java.util.regex.Pattern r2 = defpackage.phz.i
            java.util.regex.Matcher r1 = r2.matcher(r1)
            boolean r2 = r1.matches()
            if (r2 != 0) goto L80
            return r6
        L80:
            java.lang.String r2 = r1.group(r5)
            int r2 = java.lang.Integer.parseInt(r2)
            android.util.SparseArray r0 = r0.b
            java.lang.Object r0 = r0.get(r2)
            r8 = r0
            java.lang.String r8 = (java.lang.String) r8
            if (r8 != 0) goto L94
            return r6
        L94:
            r9 = -1
            int r0 = (r17 > r9 ? 1 : (r17 == r9 ? 0 : -1))
            if (r0 != 0) goto La1
            long r9 = r15.length()     // Catch: java.lang.IllegalArgumentException -> La0
            r11 = r9
            goto La3
        La0:
            return r6
        La1:
            r11 = r17
        La3:
            r9 = 0
            int r0 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r0 != 0) goto Laa
            return r6
        Laa:
            java.lang.String r0 = r1.group(r4)
            long r9 = java.lang.Long.parseLong(r0)
            java.lang.String r0 = r1.group(r3)
            long r13 = java.lang.Long.parseLong(r0)
            phz r0 = new phz
            r7 = r0
            r7.<init>(r8, r9, r11, r13, r15)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.phz.f(java.io.File, long, php):phz");
    }
}
