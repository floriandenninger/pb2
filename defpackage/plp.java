package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class plp extends pns {
    public final int a;
    public final String b;
    public final int c;
    public final pms d;
    public final int e;
    public final ash f;
    final boolean g;

    public plp(int i, Throwable th, int i2) {
        this(i, th, null, i2, null, -1, null, 4, false);
    }

    public static plp b(RuntimeException runtimeException, int i) {
        return new plp(2, runtimeException, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final plp a(ash ashVar) {
        String message = getMessage();
        int i = pts.a;
        return new plp(message, getCause(), this.h, this.a, this.b, this.c, this.d, this.e, ashVar, this.i, this.g);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public plp(int r14, java.lang.Throwable r15, java.lang.String r16, int r17, java.lang.String r18, int r19, defpackage.pms r20, int r21, boolean r22) {
        /*
            r13 = this;
            r4 = r14
            if (r4 == 0) goto L5c
            r0 = 1
            if (r4 == r0) goto L13
            r0 = 3
            if (r4 == r0) goto Lc
            java.lang.String r0 = "Unexpected runtime error"
            goto Le
        Lc:
            java.lang.String r0 = "Remote error"
        Le:
            r5 = r18
            r7 = r19
            goto L62
        L13:
            java.lang.String r0 = java.lang.String.valueOf(r20)
            java.lang.String r1 = defpackage.plh.e(r21)
            java.lang.String r2 = java.lang.String.valueOf(r18)
            int r2 = r2.length()
            java.lang.String r3 = java.lang.String.valueOf(r0)
            int r3 = r3.length()
            int r5 = r1.length()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            int r2 = r2 + 53
            int r2 = r2 + r3
            int r2 = r2 + r5
            r6.<init>(r2)
            r5 = r18
            r6.append(r5)
            java.lang.String r2 = " error, index="
            r6.append(r2)
            r7 = r19
            r6.append(r7)
            java.lang.String r2 = ", format="
            r6.append(r2)
            r6.append(r0)
            java.lang.String r0 = ", format_supported="
            r6.append(r0)
            r6.append(r1)
            java.lang.String r0 = r6.toString()
            goto L62
        L5c:
            r5 = r18
            r7 = r19
            java.lang.String r0 = "Source error"
        L62:
            boolean r1 = android.text.TextUtils.isEmpty(r16)
            if (r1 != 0) goto L95
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = java.lang.String.valueOf(r0)
            int r1 = r1.length()
            java.lang.String r2 = java.lang.String.valueOf(r16)
            int r2 = r2.length()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            int r1 = r1 + 2
            int r1 = r1 + r2
            r3.<init>(r1)
            r3.append(r0)
            java.lang.String r0 = ": "
            r3.append(r0)
            r0 = r16
            r3.append(r0)
            java.lang.String r0 = r3.toString()
        L95:
            r1 = r0
            r9 = 0
            long r10 = android.os.SystemClock.elapsedRealtime()
            r0 = r13
            r2 = r15
            r3 = r17
            r4 = r14
            r5 = r18
            r6 = r19
            r7 = r20
            r8 = r21
            r12 = r22
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.plp.<init>(int, java.lang.Throwable, java.lang.String, int, java.lang.String, int, pms, int, boolean):void");
    }

    private plp(String str, Throwable th, int i, int i2, String str2, int i3, pms pmsVar, int i4, ash ashVar, long j, boolean z) {
        super(str, th, i, j);
        int i5;
        boolean z2;
        if (z) {
            i5 = i2;
            if (i5 != 1) {
                z2 = false;
                pse.e(z2);
                pse.e(th == null || i5 == 3);
                this.a = i5;
                this.b = str2;
                this.c = i3;
                this.d = pmsVar;
                this.e = i4;
                this.f = ashVar;
                this.g = z;
            }
            i5 = 1;
        } else {
            i5 = i2;
        }
        z2 = true;
        pse.e(z2);
        pse.e(th == null || i5 == 3);
        this.a = i5;
        this.b = str2;
        this.c = i3;
        this.d = pmsVar;
        this.e = i4;
        this.f = ashVar;
        this.g = z;
    }
}
