package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class pjr {
    public final boolean a;
    public final String b;
    public final bjb c;
    public final int d;
    public final byte[] e;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003a, code lost:
    
        if (r5.equals("cenc") != false) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public pjr(boolean r4, java.lang.String r5, int r6, byte[] r7, int r8, int r9, byte[] r10, byte[] r11) {
        /*
            r3 = this;
            r3.<init>()
            r11 = 0
            r0 = 1
            if (r6 != 0) goto L9
            r1 = 1
            goto La
        L9:
            r1 = 0
        La:
            if (r10 != 0) goto Le
            r2 = 1
            goto Lf
        Le:
            r2 = 0
        Lf:
            r1 = r1 ^ r2
            defpackage.pse.e(r1)
            r3.a = r4
            r3.b = r5
            r3.d = r6
            r3.e = r10
            bjb r4 = new bjb
            r6 = 2
            if (r5 != 0) goto L21
            goto L7d
        L21:
            int r10 = r5.hashCode()
            r1 = 3
            switch(r10) {
                case 3046605: goto L47;
                case 3046671: goto L3d;
                case 3049879: goto L34;
                case 3049895: goto L2a;
                default: goto L29;
            }
        L29:
            goto L51
        L2a:
            java.lang.String r10 = "cens"
            boolean r10 = r5.equals(r10)
            if (r10 == 0) goto L51
            r11 = 1
            goto L52
        L34:
            java.lang.String r10 = "cenc"
            boolean r10 = r5.equals(r10)
            if (r10 == 0) goto L51
            goto L52
        L3d:
            java.lang.String r10 = "cbcs"
            boolean r10 = r5.equals(r10)
            if (r10 == 0) goto L51
            r11 = 3
            goto L52
        L47:
            java.lang.String r10 = "cbc1"
            boolean r10 = r5.equals(r10)
            if (r10 == 0) goto L51
            r11 = 2
            goto L52
        L51:
            r11 = -1
        L52:
            if (r11 == 0) goto L7d
            if (r11 == r0) goto L7d
            if (r11 == r6) goto L7c
            if (r11 == r1) goto L7c
            int r6 = r5.length()
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            int r6 = r6 + 68
            r10.<init>(r6)
            java.lang.String r6 = "Unsupported protection scheme type '"
            r10.append(r6)
            r10.append(r5)
            java.lang.String r5 = "'. Assuming AES-CTR crypto mode."
            r10.append(r5)
            java.lang.String r5 = r10.toString()
            java.lang.String r6 = "TrackEncryptionBox"
            android.util.Log.w(r6, r5)
            goto L7d
        L7c:
            r0 = 2
        L7d:
            r4.<init>(r0, r7, r8, r9)
            r3.c = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pjr.<init>(boolean, java.lang.String, int, byte[], int, int, byte[], byte[]):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003a, code lost:
    
        if (r6.equals("cenc") != false) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public pjr(boolean r5, java.lang.String r6, int r7, byte[] r8, int r9, int r10, byte[] r11) {
        /*
            r4 = this;
            r4.<init>()
            r0 = 0
            r1 = 1
            if (r7 != 0) goto L9
            r2 = 1
            goto La
        L9:
            r2 = 0
        La:
            if (r11 != 0) goto Le
            r3 = 1
            goto Lf
        Le:
            r3 = 0
        Lf:
            r2 = r2 ^ r3
            defpackage.pse.e(r2)
            r4.a = r5
            r4.b = r6
            r4.d = r7
            r4.e = r11
            bjb r5 = new bjb
            r7 = 2
            if (r6 != 0) goto L21
            goto L7d
        L21:
            int r11 = r6.hashCode()
            r2 = 3
            switch(r11) {
                case 3046605: goto L47;
                case 3046671: goto L3d;
                case 3049879: goto L34;
                case 3049895: goto L2a;
                default: goto L29;
            }
        L29:
            goto L51
        L2a:
            java.lang.String r11 = "cens"
            boolean r11 = r6.equals(r11)
            if (r11 == 0) goto L51
            r0 = 1
            goto L52
        L34:
            java.lang.String r11 = "cenc"
            boolean r11 = r6.equals(r11)
            if (r11 == 0) goto L51
            goto L52
        L3d:
            java.lang.String r11 = "cbcs"
            boolean r11 = r6.equals(r11)
            if (r11 == 0) goto L51
            r0 = 3
            goto L52
        L47:
            java.lang.String r11 = "cbc1"
            boolean r11 = r6.equals(r11)
            if (r11 == 0) goto L51
            r0 = 2
            goto L52
        L51:
            r0 = -1
        L52:
            if (r0 == 0) goto L7d
            if (r0 == r1) goto L7d
            if (r0 == r7) goto L7c
            if (r0 == r2) goto L7c
            int r7 = r6.length()
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            int r7 = r7 + 68
            r11.<init>(r7)
            java.lang.String r7 = "Unsupported protection scheme type '"
            r11.append(r7)
            r11.append(r6)
            java.lang.String r6 = "'. Assuming AES-CTR crypto mode."
            r11.append(r6)
            java.lang.String r6 = r11.toString()
            java.lang.String r7 = "TrackEncryptionBox"
            android.util.Log.w(r7, r6)
            goto L7d
        L7c:
            r1 = 2
        L7d:
            r5.<init>(r1, r8, r9, r10)
            r4.c = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pjr.<init>(boolean, java.lang.String, int, byte[], int, int, byte[]):void");
    }
}
