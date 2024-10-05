package defpackage;

import java.math.BigDecimal;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class reh {
    final String b;
    final int c;
    Boolean d;
    Boolean e;
    Long f;
    Long g;

    public reh(String str, int i) {
        this.b = str;
        this.c = i;
    }

    private static Boolean d(String str, int i, boolean z, String str2, List list, String str3, rfp rfpVar) {
        if (i == 7) {
            if (list == null || list.size() == 0) {
                return null;
            }
        } else if (str2 == null) {
            return null;
        }
        if (!z && i != 2) {
            str = str.toUpperCase(Locale.ENGLISH);
        }
        switch (i - 1) {
            case 1:
                if (str3 == null) {
                    return null;
                }
                try {
                    return Boolean.valueOf(Pattern.compile(str3, true != z ? 66 : 0).matcher(str).matches());
                } catch (PatternSyntaxException unused) {
                    if (rfpVar != null) {
                        rfpVar.f.b("Invalid regular expression in REGEXP audience filter. expression", str3);
                    }
                    return null;
                }
            case 2:
                return Boolean.valueOf(str.startsWith(str2));
            case 3:
                return Boolean.valueOf(str.endsWith(str2));
            case 4:
                return Boolean.valueOf(str.contains(str2));
            case 5:
                return Boolean.valueOf(str.equals(str2));
            case 6:
                if (list == null) {
                    return null;
                }
                return Boolean.valueOf(list.contains(str));
            default:
                return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:92:0x0031, code lost:
    
        if ((r10.b & 4) != 0) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static java.lang.Boolean e(java.math.BigDecimal r9, defpackage.rkq r10, double r11) {
        /*
            Method dump skipped, instructions count: 279
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.reh.e(java.math.BigDecimal, rkq, double):java.lang.Boolean");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0032, code lost:
    
        if ((r13.b & 2) != 0) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Boolean f(java.lang.String r12, defpackage.rks r13, defpackage.rfp r14) {
        /*
            defpackage.qip.an(r13)
            r0 = 0
            if (r12 != 0) goto L7
            return r0
        L7:
            int r1 = r13.b
            r2 = 1
            r1 = r1 & r2
            if (r1 == 0) goto L96
            int r1 = r13.c
            int r1 = defpackage.rqr.o(r1)
            if (r1 != 0) goto L17
            goto L96
        L17:
            if (r1 == r2) goto L96
            int r1 = r13.c
            int r1 = defpackage.rqr.o(r1)
            r3 = 7
            r4 = 2
            if (r1 != 0) goto L24
            goto L2f
        L24:
            if (r1 != r3) goto L2f
            aony r1 = r13.f
            int r1 = r1.size()
            if (r1 != 0) goto L34
            return r0
        L2f:
            int r1 = r13.b
            r1 = r1 & r4
            if (r1 == 0) goto L96
        L34:
            int r1 = r13.c
            int r1 = defpackage.rqr.o(r1)
            if (r1 != 0) goto L3e
            r6 = 1
            goto L3f
        L3e:
            r6 = r1
        L3f:
            boolean r7 = r13.e
            if (r7 != 0) goto L51
            if (r6 == r4) goto L51
            if (r6 != r3) goto L48
            goto L51
        L48:
            java.lang.String r1 = r13.d
            java.util.Locale r2 = java.util.Locale.ENGLISH
            java.lang.String r1 = r1.toUpperCase(r2)
            goto L53
        L51:
            java.lang.String r1 = r13.d
        L53:
            r8 = r1
            aony r1 = r13.f
            int r1 = r1.size()
            if (r1 != 0) goto L5e
            r9 = r0
            goto L8a
        L5e:
            aony r13 = r13.f
            if (r7 != 0) goto L89
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r13.size()
            r1.<init>(r2)
            java.util.Iterator r13 = r13.iterator()
        L6f:
            boolean r2 = r13.hasNext()
            if (r2 == 0) goto L85
            java.lang.Object r2 = r13.next()
            java.lang.String r2 = (java.lang.String) r2
            java.util.Locale r3 = java.util.Locale.ENGLISH
            java.lang.String r2 = r2.toUpperCase(r3)
            r1.add(r2)
            goto L6f
        L85:
            java.util.List r13 = java.util.Collections.unmodifiableList(r1)
        L89:
            r9 = r13
        L8a:
            if (r6 != r4) goto L8e
            r10 = r8
            goto L8f
        L8e:
            r10 = r0
        L8f:
            r5 = r12
            r11 = r14
            java.lang.Boolean r12 = d(r5, r6, r7, r8, r9, r10, r11)
            return r12
        L96:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.reh.f(java.lang.String, rks, rfp):java.lang.Boolean");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Boolean g(double d, rkq rkqVar) {
        try {
            return e(new BigDecimal(d), rkqVar, Math.ulp(d));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Boolean h(long j, rkq rkqVar) {
        try {
            return e(new BigDecimal(j), rkqVar, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Boolean i(String str, rkq rkqVar) {
        if (!rkj.s(str)) {
            return null;
        }
        try {
            return e(new BigDecimal(str), rkqVar, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Boolean j(Boolean bool, boolean z) {
        if (bool == null) {
            return null;
        }
        return Boolean.valueOf(bool.booleanValue() != z);
    }

    public abstract int a();

    public abstract boolean b();

    public abstract boolean c();
}
