package defpackage;

import android.content.Context;
import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class crp implements cqw {
    private final Uri a;
    private final crr b;
    private InputStream c;

    public crp(Uri uri, crr crrVar) {
        this.a = uri;
        this.b = crrVar;
    }

    public static crp f(Context context, Uri uri, crq crqVar) {
        return new crp(uri, new crr(cnv.b(context).c.b(), crqVar, cnv.b(context).d, context.getContentResolver()));
    }

    @Override // defpackage.cqw
    public final Class a() {
        return InputStream.class;
    }

    @Override // defpackage.cqw
    public final void b() {
    }

    @Override // defpackage.cqw
    public final void c() {
        InputStream inputStream = this.c;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0021, code lost:
    
        if (r2 != null) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x009f A[Catch: FileNotFoundException -> 0x00d7, TRY_LEAVE, TryCatch #6 {FileNotFoundException -> 0x00d7, blocks: (B:2:0x0000, B:58:0x0018, B:10:0x0033, B:15:0x009f, B:20:0x00cb, B:21:0x00d1, B:37:0x00c2, B:43:0x003b, B:45:0x0046, B:47:0x0050, B:49:0x0054, B:52:0x005c, B:53:0x009b, B:8:0x0023, B:66:0x002a, B:67:0x002d, B:17:0x00a3), top: B:1:0x0000, inners: #1, #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00cb A[Catch: FileNotFoundException -> 0x00d7, TRY_ENTER, TryCatch #6 {FileNotFoundException -> 0x00d7, blocks: (B:2:0x0000, B:58:0x0018, B:10:0x0033, B:15:0x009f, B:20:0x00cb, B:21:0x00d1, B:37:0x00c2, B:43:0x003b, B:45:0x0046, B:47:0x0050, B:49:0x0054, B:52:0x005c, B:53:0x009b, B:8:0x0023, B:66:0x002a, B:67:0x002d, B:17:0x00a3), top: B:1:0x0000, inners: #1, #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x003b A[Catch: FileNotFoundException -> 0x00d7, TryCatch #6 {FileNotFoundException -> 0x00d7, blocks: (B:2:0x0000, B:58:0x0018, B:10:0x0033, B:15:0x009f, B:20:0x00cb, B:21:0x00d1, B:37:0x00c2, B:43:0x003b, B:45:0x0046, B:47:0x0050, B:49:0x0054, B:52:0x005c, B:53:0x009b, B:8:0x0023, B:66:0x002a, B:67:0x002d, B:17:0x00a3), top: B:1:0x0000, inners: #1, #10 }] */
    @Override // defpackage.cqw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(defpackage.cof r9, defpackage.cqv r10) {
        /*
            r8 = this;
            crr r9 = r8.b     // Catch: java.io.FileNotFoundException -> Ld7
            android.net.Uri r0 = r8.a     // Catch: java.io.FileNotFoundException -> Ld7
            r1 = 0
            crq r2 = r9.a     // Catch: java.lang.Throwable -> L27 java.lang.SecurityException -> L2e
            android.database.Cursor r2 = r2.a(r0)     // Catch: java.lang.Throwable -> L27 java.lang.SecurityException -> L2e
            if (r2 == 0) goto L21
            boolean r3 = r2.moveToFirst()     // Catch: java.lang.Throwable -> L1c java.lang.SecurityException -> L1f
            if (r3 == 0) goto L21
            r3 = 0
            java.lang.String r3 = r2.getString(r3)     // Catch: java.lang.Throwable -> L1c java.lang.SecurityException -> L1f
            r2.close()     // Catch: java.io.FileNotFoundException -> Ld7
            goto L33
        L1c:
            r9 = move-exception
            r1 = r2
            goto L28
        L1f:
            goto L2f
        L21:
            if (r2 == 0) goto L32
        L23:
            r2.close()     // Catch: java.io.FileNotFoundException -> Ld7
            goto L32
        L27:
            r9 = move-exception
        L28:
            if (r1 == 0) goto L2d
            r1.close()     // Catch: java.io.FileNotFoundException -> Ld7
        L2d:
            throw r9     // Catch: java.io.FileNotFoundException -> Ld7
        L2e:
            r2 = r1
        L2f:
            if (r2 == 0) goto L32
            goto L23
        L32:
            r3 = r1
        L33:
            boolean r2 = android.text.TextUtils.isEmpty(r3)     // Catch: java.io.FileNotFoundException -> Ld7
            if (r2 == 0) goto L3b
        L39:
            r9 = r1
            goto L9c
        L3b:
            java.io.File r2 = new java.io.File     // Catch: java.io.FileNotFoundException -> Ld7
            r2.<init>(r3)     // Catch: java.io.FileNotFoundException -> Ld7
            boolean r3 = r2.exists()     // Catch: java.io.FileNotFoundException -> Ld7
            if (r3 == 0) goto L39
            long r3 = r2.length()     // Catch: java.io.FileNotFoundException -> Ld7
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 <= 0) goto L39
            android.net.Uri r2 = android.net.Uri.fromFile(r2)     // Catch: java.io.FileNotFoundException -> Ld7
            android.content.ContentResolver r9 = r9.c     // Catch: java.lang.NullPointerException -> L5b java.io.FileNotFoundException -> Ld7
            java.io.InputStream r9 = r9.openInputStream(r2)     // Catch: java.lang.NullPointerException -> L5b java.io.FileNotFoundException -> Ld7
            goto L9c
        L5b:
            r9 = move-exception
            java.io.FileNotFoundException r1 = new java.io.FileNotFoundException     // Catch: java.io.FileNotFoundException -> Ld7
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch: java.io.FileNotFoundException -> Ld7
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch: java.io.FileNotFoundException -> Ld7
            java.lang.String r3 = java.lang.String.valueOf(r0)     // Catch: java.io.FileNotFoundException -> Ld7
            int r3 = r3.length()     // Catch: java.io.FileNotFoundException -> Ld7
            int r3 = r3 + 21
            java.lang.String r4 = java.lang.String.valueOf(r2)     // Catch: java.io.FileNotFoundException -> Ld7
            int r4 = r4.length()     // Catch: java.io.FileNotFoundException -> Ld7
            int r3 = r3 + r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.io.FileNotFoundException -> Ld7
            r4.<init>(r3)     // Catch: java.io.FileNotFoundException -> Ld7
            java.lang.String r3 = "NPE opening uri: "
            r4.append(r3)     // Catch: java.io.FileNotFoundException -> Ld7
            r4.append(r0)     // Catch: java.io.FileNotFoundException -> Ld7
            java.lang.String r0 = " -> "
            r4.append(r0)     // Catch: java.io.FileNotFoundException -> Ld7
            r4.append(r2)     // Catch: java.io.FileNotFoundException -> Ld7
            java.lang.String r0 = r4.toString()     // Catch: java.io.FileNotFoundException -> Ld7
            r1.<init>(r0)     // Catch: java.io.FileNotFoundException -> Ld7
            java.lang.Throwable r9 = r1.initCause(r9)     // Catch: java.io.FileNotFoundException -> Ld7
            java.io.FileNotFoundException r9 = (java.io.FileNotFoundException) r9     // Catch: java.io.FileNotFoundException -> Ld7
            throw r9     // Catch: java.io.FileNotFoundException -> Ld7
        L9c:
            r0 = -1
            if (r9 == 0) goto Lc8
            crr r2 = r8.b     // Catch: java.io.FileNotFoundException -> Ld7
            android.net.Uri r3 = r8.a     // Catch: java.io.FileNotFoundException -> Ld7
            android.content.ContentResolver r4 = r2.c     // Catch: java.lang.Throwable -> Lb9 java.lang.Throwable -> Lbb
            java.io.InputStream r1 = r4.openInputStream(r3)     // Catch: java.lang.Throwable -> Lb9 java.lang.Throwable -> Lbb
            java.util.List r3 = r2.d     // Catch: java.lang.Throwable -> Lb9 java.lang.Throwable -> Lbb
            ctk r2 = r2.b     // Catch: java.lang.Throwable -> Lb9 java.lang.Throwable -> Lbb
            int r2 = defpackage.gm.w(r3, r1, r2)     // Catch: java.lang.Throwable -> Lb9 java.lang.Throwable -> Lbb
            if (r1 == 0) goto Lc9
            r1.close()     // Catch: java.io.IOException -> Lb7
            goto Lc9
        Lb7:
            goto Lc9
        Lb9:
            r9 = move-exception
            goto Lbd
        Lbb:
            goto Lc3
        Lbd:
            if (r1 == 0) goto Lc2
            r1.close()     // Catch: java.io.IOException -> Lc2
        Lc2:
            throw r9     // Catch: java.io.FileNotFoundException -> Ld7
        Lc3:
            if (r1 == 0) goto Lc8
            r1.close()     // Catch: java.io.IOException -> Lc8
        Lc8:
            r2 = -1
        Lc9:
            if (r2 == r0) goto Ld1
            crc r0 = new crc     // Catch: java.io.FileNotFoundException -> Ld7
            r0.<init>(r9, r2)     // Catch: java.io.FileNotFoundException -> Ld7
            r9 = r0
        Ld1:
            r8.c = r9     // Catch: java.io.FileNotFoundException -> Ld7
            r10.f(r9)     // Catch: java.io.FileNotFoundException -> Ld7
            return
        Ld7:
            r9 = move-exception
            r10.g(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.crp.d(cof, cqv):void");
    }

    @Override // defpackage.cqw
    public final int e() {
        return 1;
    }
}
