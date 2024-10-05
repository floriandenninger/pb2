package defpackage;

import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bamn implements bamw, bams {
    private final int a;

    public bamn(int i) {
        this.a = i;
    }

    @Override // defpackage.bams
    public final int a() {
        return this.a == 1 ? 4 : 20;
    }

    @Override // defpackage.bamw
    public final int b() {
        return this.a == 1 ? 4 : 20;
    }

    @Override // defpackage.bams
    public final int c(bamv bamvVar, String str, int i) {
        Map map = bajk.a;
        String substring = str.substring(i);
        String str2 = null;
        for (String str3 : map.keySet()) {
            if (substring.startsWith(str3) && (str2 == null || str3.length() > str2.length())) {
                str2 = str3;
            }
        }
        if (str2 == null) {
            return i ^ (-1);
        }
        bamvVar.f((bajn) map.get(str2));
        return i + str2.length();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007f  */
    @Override // defpackage.bamw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(java.lang.StringBuffer r4, long r5, defpackage.bajf r7, int r8, defpackage.bajn r9, java.util.Locale r10) {
        /*
            r3 = this;
            long r7 = (long) r8
            long r5 = r5 - r7
            if (r9 != 0) goto L8
            java.lang.String r5 = ""
            goto L89
        L8:
            int r7 = r3.a
            r8 = 0
            if (r7 == 0) goto L4b
            if (r10 != 0) goto L13
            java.util.Locale r10 = java.util.Locale.getDefault()
        L13:
            java.lang.String r7 = r9.g(r5)
            if (r7 != 0) goto L1d
            java.lang.String r5 = r9.c
            goto L89
        L1d:
            banq r0 = defpackage.bajn.d
            boolean r1 = r0 instanceof defpackage.banq
            r2 = 0
            if (r1 == 0) goto L34
            java.lang.String r7 = r9.c
            boolean r1 = r9.m(r5)
            java.lang.String[] r7 = r0.b(r10, r7, r1)
            if (r7 != 0) goto L31
            goto L3c
        L31:
            r7 = r7[r2]
            goto L40
        L34:
            java.lang.String r1 = r9.c
            java.lang.String[] r7 = r0.a(r10, r1, r7)
            if (r7 != 0) goto L3e
        L3c:
            r7 = r8
            goto L40
        L3e:
            r7 = r7[r2]
        L40:
            if (r7 != 0) goto L88
            int r5 = r9.a(r5)
            java.lang.String r5 = defpackage.bajn.h(r5)
            goto L89
        L4b:
            if (r10 != 0) goto L51
            java.util.Locale r10 = java.util.Locale.getDefault()
        L51:
            java.lang.String r7 = r9.g(r5)
            if (r7 != 0) goto L5a
            java.lang.String r5 = r9.c
            goto L89
        L5a:
            banq r0 = defpackage.bajn.d
            boolean r1 = r0 instanceof defpackage.banq
            r2 = 1
            if (r1 == 0) goto L71
            java.lang.String r7 = r9.c
            boolean r1 = r9.m(r5)
            java.lang.String[] r7 = r0.b(r10, r7, r1)
            if (r7 != 0) goto L6e
            goto L79
        L6e:
            r7 = r7[r2]
            goto L7d
        L71:
            java.lang.String r1 = r9.c
            java.lang.String[] r7 = r0.a(r10, r1, r7)
            if (r7 != 0) goto L7b
        L79:
            r7 = r8
            goto L7d
        L7b:
            r7 = r7[r2]
        L7d:
            if (r7 != 0) goto L88
            int r5 = r9.a(r5)
            java.lang.String r5 = defpackage.bajn.h(r5)
            goto L89
        L88:
            r5 = r7
        L89:
            r4.append(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bamn.d(java.lang.StringBuffer, long, bajf, int, bajn, java.util.Locale):void");
    }
}
