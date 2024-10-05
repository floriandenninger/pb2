package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class clg {
    final String[] a;
    final bada b;

    private clg(String[] strArr, bada badaVar) {
        this.a = strArr;
        this.b = badaVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0038 A[Catch: IOException -> 0x0070, TryCatch #0 {IOException -> 0x0070, blocks: (B:2:0x0000, B:3:0x000a, B:5:0x000d, B:7:0x001c, B:9:0x0024, B:13:0x0044, B:15:0x0038, B:16:0x003b, B:27:0x0049, B:29:0x004c, B:32:0x0060), top: B:1:0x0000 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.clg a(java.lang.String... r11) {
        /*
            int r0 = r11.length     // Catch: java.io.IOException -> L70
            bacx[] r0 = new defpackage.bacx[r0]     // Catch: java.io.IOException -> L70
            bacu r1 = new bacu     // Catch: java.io.IOException -> L70
            r1.<init>()     // Catch: java.io.IOException -> L70
            r2 = 0
            r3 = 0
        La:
            int r4 = r11.length     // Catch: java.io.IOException -> L70
            if (r3 >= r4) goto L60
            r4 = r11[r3]     // Catch: java.io.IOException -> L70
            java.lang.String[] r5 = defpackage.clh.a     // Catch: java.io.IOException -> L70
            r1.r()     // Catch: java.io.IOException -> L70
            int r6 = r4.length()     // Catch: java.io.IOException -> L70
            r7 = 0
            r8 = 0
        L1a:
            if (r7 >= r6) goto L47
            char r9 = r4.charAt(r7)     // Catch: java.io.IOException -> L70
            r10 = 128(0x80, float:1.8E-43)
            if (r9 >= r10) goto L29
            r9 = r5[r9]     // Catch: java.io.IOException -> L70
            if (r9 != 0) goto L36
            goto L44
        L29:
            r10 = 8232(0x2028, float:1.1535E-41)
            if (r9 != r10) goto L30
            java.lang.String r9 = "\\u2028"
            goto L36
        L30:
            r10 = 8233(0x2029, float:1.1537E-41)
            if (r9 != r10) goto L44
            java.lang.String r9 = "\\u2029"
        L36:
            if (r8 >= r7) goto L3b
            r1.t(r4, r8, r7)     // Catch: java.io.IOException -> L70
        L3b:
            int r8 = r9.length()     // Catch: java.io.IOException -> L70
            r1.t(r9, r2, r8)     // Catch: java.io.IOException -> L70
            int r8 = r7 + 1
        L44:
            int r7 = r7 + 1
            goto L1a
        L47:
            if (r8 >= r6) goto L4c
            r1.t(r4, r8, r6)     // Catch: java.io.IOException -> L70
        L4c:
            r1.r()     // Catch: java.io.IOException -> L70
            r1.b()     // Catch: java.io.IOException -> L70
            bacx r4 = new bacx     // Catch: java.io.IOException -> L70
            byte[] r5 = r1.o()     // Catch: java.io.IOException -> L70
            r4.<init>(r5)     // Catch: java.io.IOException -> L70
            r0[r3] = r4     // Catch: java.io.IOException -> L70
            int r3 = r3 + 1
            goto La
        L60:
            clg r1 = new clg     // Catch: java.io.IOException -> L70
            java.lang.Object r11 = r11.clone()     // Catch: java.io.IOException -> L70
            java.lang.String[] r11 = (java.lang.String[]) r11     // Catch: java.io.IOException -> L70
            bada r0 = defpackage.bada.a(r0)     // Catch: java.io.IOException -> L70
            r1.<init>(r11, r0)     // Catch: java.io.IOException -> L70
            return r1
        L70:
            r11 = move-exception
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>(r11)
            goto L78
        L77:
            throw r0
        L78:
            goto L77
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.clg.a(java.lang.String[]):clg");
    }
}
