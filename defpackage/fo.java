package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fo {
    private static final ThreadLocal a = new ThreadLocal();

    /* JADX WARN: Code restructure failed: missing block: B:24:0x005a, code lost:
    
        if (r6 < r7) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean a(android.graphics.Paint r9, java.lang.String r10) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto Lb
            boolean r9 = r9.hasGlyph(r10)
            return r9
        Lb:
            int r0 = r10.length()
            r1 = 1
            r2 = 0
            if (r0 != r1) goto L20
            char r0 = r10.charAt(r2)
            boolean r0 = java.lang.Character.isWhitespace(r0)
            if (r0 != 0) goto L1f
            r0 = 1
            goto L20
        L1f:
            return r1
        L20:
            java.lang.String r3 = "\udfffd"
            float r4 = r9.measureText(r3)
            java.lang.String r5 = "m"
            float r5 = r9.measureText(r5)
            float r6 = r9.measureText(r10)
            r7 = 0
            int r8 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r8 != 0) goto L36
            return r2
        L36:
            int r8 = r10.length()
            int r8 = r10.codePointCount(r2, r8)
            if (r8 <= r1) goto L5e
            float r5 = r5 + r5
            int r5 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r5 > 0) goto L5d
            r5 = 0
        L46:
            if (r5 >= r0) goto L58
            int r8 = r10.codePointAt(r5)
            int r8 = java.lang.Character.charCount(r8)
            int r8 = r8 + r5
            float r5 = r9.measureText(r10, r5, r8)
            float r7 = r7 + r5
            r5 = r8
            goto L46
        L58:
            int r5 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r5 >= 0) goto L5d
            goto L5e
        L5d:
            return r2
        L5e:
            int r4 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r4 != 0) goto Laa
            java.lang.ThreadLocal r4 = defpackage.fo.a
            java.lang.Object r5 = r4.get()
            hx r5 = (defpackage.hx) r5
            if (r5 != 0) goto L7f
            hx r5 = new hx
            android.graphics.Rect r6 = new android.graphics.Rect
            r6.<init>()
            android.graphics.Rect r7 = new android.graphics.Rect
            r7.<init>()
            r5.<init>(r6, r7)
            r4.set(r5)
            goto L8d
        L7f:
            java.lang.Object r4 = r5.a
            android.graphics.Rect r4 = (android.graphics.Rect) r4
            r4.setEmpty()
            java.lang.Object r4 = r5.b
            android.graphics.Rect r4 = (android.graphics.Rect) r4
            r4.setEmpty()
        L8d:
            r4 = 2
            java.lang.Object r6 = r5.a
            android.graphics.Rect r6 = (android.graphics.Rect) r6
            r9.getTextBounds(r3, r2, r4, r6)
            java.lang.Object r3 = r5.b
            android.graphics.Rect r3 = (android.graphics.Rect) r3
            r9.getTextBounds(r10, r2, r0, r3)
            java.lang.Object r9 = r5.a
            android.graphics.Rect r9 = (android.graphics.Rect) r9
            java.lang.Object r10 = r5.b
            boolean r9 = r9.equals(r10)
            if (r9 != 0) goto La9
            return r1
        La9:
            return r2
        Laa:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fo.a(android.graphics.Paint, java.lang.String):boolean");
    }
}
