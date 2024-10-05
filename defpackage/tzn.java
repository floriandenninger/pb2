package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class tzn {
    private final Context a;
    private final afye b;

    public tzn(Context context, afye afyeVar) {
        this.a = context;
        this.b = afyeVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.concurrent.Future a(java.lang.String r8, int r9, int r10) {
        /*
            r7 = this;
            android.net.Uri r0 = android.net.Uri.parse(r8)
            java.lang.String r1 = r0.getScheme()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L84
            java.lang.String r1 = r0.getScheme()
            int r4 = r1.hashCode()
            r5 = -368816979(0xffffffffea044cad, float:-3.9985075E25)
            r6 = 2
            if (r4 == r5) goto L3d
            r5 = 3143036(0x2ff57c, float:4.404332E-39)
            if (r4 == r5) goto L33
            r5 = 951530617(0x38b73479, float:8.735894E-5)
            if (r4 == r5) goto L29
            goto L47
        L29:
            java.lang.String r4 = "content"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L47
            r1 = 1
            goto L48
        L33:
            java.lang.String r4 = "file"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L47
            r1 = 2
            goto L48
        L3d:
            java.lang.String r4 = "android.resource"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L47
            r1 = 0
            goto L48
        L47:
            r1 = -1
        L48:
            if (r1 == 0) goto L6f
            if (r1 == r2) goto L4f
            if (r1 == r6) goto L4f
            goto L84
        L4f:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r8 = java.lang.String.valueOf(r8)
            java.lang.String r10 = "HTTP Scheme not suported for URL: "
            int r0 = r8.length()
            if (r0 == 0) goto L62
            java.lang.String r8 = r10.concat(r8)
            goto L67
        L62:
            java.lang.String r8 = new java.lang.String
            r8.<init>(r10)
        L67:
            r9.<init>(r8)
            anhy r8 = defpackage.anaf.N(r9)
            return r8
        L6f:
            android.content.Context r8 = r7.a     // Catch: java.io.FileNotFoundException -> L7e
            java.io.InputStream r8 = defpackage.uzm.b(r8, r0)     // Catch: java.io.FileNotFoundException -> L7e
            android.graphics.Bitmap r8 = android.graphics.BitmapFactory.decodeStream(r8)     // Catch: java.io.FileNotFoundException -> L7e
            anhy r8 = defpackage.anaf.O(r8)     // Catch: java.io.FileNotFoundException -> L7e
            goto L83
        L7e:
            r8 = move-exception
            anhy r8 = defpackage.anaf.N(r8)
        L83:
            return r8
        L84:
            afye r0 = r7.b
            if (r9 <= 0) goto L8b
            if (r10 <= 0) goto L8b
            goto L8c
        L8b:
            r2 = 0
        L8c:
            ykm r1 = defpackage.ykm.c()
            ajjz r0 = r0.a
            android.net.Uri r8 = android.net.Uri.parse(r8)
            r0.l(r8, r1)
            afyd r8 = new afyd
            r8.<init>(r2, r9, r10, r3)
            angq r9 = defpackage.angq.a
            anhy r8 = defpackage.anfq.h(r1, r8, r9)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tzn.a(java.lang.String, int, int):java.util.concurrent.Future");
    }
}
