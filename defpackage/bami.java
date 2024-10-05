package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
abstract class bami implements bamw, bams {
    protected final bajj a;
    protected final int b;
    protected final boolean c;

    public bami(bajj bajjVar, int i, boolean z) {
        this.a = bajjVar;
        this.b = i;
        this.c = z;
    }

    @Override // defpackage.bams
    public final int a() {
        return this.b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x005d, code lost:
    
        return r12 ^ (-1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int c(defpackage.bamv r10, java.lang.String r11, int r12) {
        /*
            r9 = this;
            int r0 = r9.b
            int r1 = r11.length()
            int r1 = r1 - r12
            int r0 = java.lang.Math.min(r0, r1)
            r1 = 0
            r2 = 0
            r3 = 0
        Le:
            if (r2 >= r0) goto L58
            int r4 = r12 + r2
            char r4 = r11.charAt(r4)
            r5 = 57
            r6 = 48
            if (r2 != 0) goto L50
            r2 = 43
            r7 = 45
            if (r4 == r7) goto L29
            if (r4 != r2) goto L27
            r4 = 43
            goto L29
        L27:
            r2 = 0
            goto L50
        L29:
            boolean r2 = r9.c
            if (r2 == 0) goto L27
            r2 = 1
            if (r4 != r7) goto L32
            r3 = 1
            goto L33
        L32:
            r3 = 0
        L33:
            if (r0 <= r2) goto L59
            int r2 = r12 + 1
            char r8 = r11.charAt(r2)
            if (r8 < r6) goto L59
            if (r8 <= r5) goto L40
            goto L59
        L40:
            if (r4 == r7) goto L43
            r12 = r2
        L43:
            int r0 = r0 + 1
            int r2 = r11.length()
            int r2 = r2 - r12
            int r0 = java.lang.Math.min(r0, r2)
            r2 = r3
            goto Le
        L50:
            if (r4 < r6) goto L58
            if (r4 <= r5) goto L55
            goto L58
        L55:
            int r2 = r2 + 1
            goto Le
        L58:
            r1 = r2
        L59:
            if (r1 != 0) goto L5e
            r10 = r12 ^ (-1)
            return r10
        L5e:
            r0 = 9
            if (r1 < r0) goto L6c
            int r1 = r1 + r12
            java.lang.String r11 = r11.substring(r12, r1)
            int r11 = java.lang.Integer.parseInt(r11)
            goto L91
        L6c:
            if (r3 == 0) goto L71
            int r0 = r12 + 1
            goto L72
        L71:
            r0 = r12
        L72:
            int r2 = r0 + 1
            char r0 = r11.charAt(r0)     // Catch: java.lang.StringIndexOutOfBoundsException -> L97
            int r0 = r0 + (-48)
            int r1 = r1 + r12
        L7b:
            if (r2 >= r1) goto L8c
            int r12 = r2 + 1
            int r4 = r0 << 3
            int r0 = r0 + r0
            int r4 = r4 + r0
            char r0 = r11.charAt(r2)
            int r4 = r4 + r0
            int r0 = r4 + (-48)
            r2 = r12
            goto L7b
        L8c:
            if (r3 == 0) goto L90
            int r11 = -r0
            goto L91
        L90:
            r11 = r0
        L91:
            bajj r12 = r9.a
            r10.d(r12, r11)
            return r1
        L97:
            r10 = r12 ^ (-1)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bami.c(bamv, java.lang.String, int):int");
    }
}
