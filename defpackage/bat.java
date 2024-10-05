package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bat implements bcf {
    public bih a;
    public bii b;
    private final bil c;

    public bat(bil bilVar) {
        this.c = bilVar;
    }

    @Override // defpackage.bcf
    public final long a() {
        bii biiVar = this.b;
        if (biiVar != null) {
            return ((bid) biiVar).c;
        }
        return -1L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0045, code lost:
    
        if (r6.c != r11) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0067, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0064, code lost:
    
        if (r6.c != r11) goto L37;
     */
    @Override // defpackage.bcf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(defpackage.atc r8, android.net.Uri r9, java.util.Map r10, long r11, long r13, defpackage.bik r15) {
        /*
            r7 = this;
            bid r6 = new bid
            r0 = r6
            r1 = r8
            r2 = r11
            r4 = r13
            r0.<init>(r1, r2, r4)
            r7.b = r6
            bih r8 = r7.a
            if (r8 == 0) goto L10
            return
        L10:
            bil r8 = r7.c
            bih[] r8 = r8.a(r9, r10)
            int r9 = r8.length
            r10 = 0
            r13 = 1
            if (r9 != r13) goto L20
            r8 = r8[r10]
            r7.a = r8
            goto L77
        L20:
            r14 = 0
        L21:
            if (r14 >= r9) goto L73
            r0 = r8[r14]
            boolean r1 = r0.g(r6)     // Catch: java.lang.Throwable -> L48 java.io.EOFException -> L5b
            if (r1 == 0) goto L3d
            r7.a = r0     // Catch: java.lang.Throwable -> L48 java.io.EOFException -> L5b
            if (r0 != 0) goto L35
            long r0 = r6.c
            int r9 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r9 != 0) goto L36
        L35:
            r10 = 1
        L36:
            defpackage.pse.g(r10)
            r6.l()
            goto L73
        L3d:
            bih r0 = r7.a
            if (r0 != 0) goto L69
            long r0 = r6.c
            int r2 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r2 != 0) goto L67
            goto L69
        L48:
            r8 = move-exception
            bih r9 = r7.a
            if (r9 != 0) goto L53
            long r14 = r6.c
            int r9 = (r14 > r11 ? 1 : (r14 == r11 ? 0 : -1))
            if (r9 != 0) goto L54
        L53:
            r10 = 1
        L54:
            defpackage.pse.g(r10)
            r6.l()
            throw r8
        L5b:
            bih r0 = r7.a
            if (r0 != 0) goto L69
            long r0 = r6.c
            int r2 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r2 != 0) goto L67
            goto L69
        L67:
            r0 = 0
            goto L6a
        L69:
            r0 = 1
        L6a:
            defpackage.pse.g(r0)
            r6.l()
            int r14 = r14 + 1
            goto L21
        L73:
            bih r9 = r7.a
            if (r9 == 0) goto L7d
        L77:
            bih r8 = r7.a
            r8.d(r15)
            return
        L7d:
            bdh r9 = new bdh
            java.lang.String r8 = defpackage.pts.G(r8)
            java.lang.String r10 = java.lang.String.valueOf(r8)
            int r10 = r10.length()
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            int r10 = r10 + 58
            r11.<init>(r10)
            java.lang.String r10 = "None of the available extractors ("
            r11.append(r10)
            r11.append(r8)
            java.lang.String r8 = ") could read the stream."
            r11.append(r8)
            java.lang.String r8 = r11.toString()
            r9.<init>(r8)
            goto La8
        La7:
            throw r9
        La8:
            goto La7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bat.b(atc, android.net.Uri, java.util.Map, long, long, bik):void");
    }
}
