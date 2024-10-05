package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bap implements azx {
    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    @Override // defpackage.azx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.azy b(defpackage.azw r5) {
        /*
            r4 = this;
            baa r0 = r5.a     // Catch: java.lang.RuntimeException -> L31 java.io.IOException -> L33
            defpackage.pse.c(r0)     // Catch: java.lang.RuntimeException -> L31 java.io.IOException -> L33
            baa r0 = r5.a     // Catch: java.lang.RuntimeException -> L31 java.io.IOException -> L33
            java.lang.String r0 = r0.a     // Catch: java.lang.RuntimeException -> L31 java.io.IOException -> L33
            java.lang.String r1 = "createCodec:"
            int r2 = r0.length()     // Catch: java.lang.RuntimeException -> L31 java.io.IOException -> L33
            if (r2 == 0) goto L14
            r1.concat(r0)     // Catch: java.lang.RuntimeException -> L31 java.io.IOException -> L33
        L14:
            int r1 = defpackage.pts.a     // Catch: java.lang.RuntimeException -> L31 java.io.IOException -> L33
            android.media.MediaCodec r0 = android.media.MediaCodec.createByCodecName(r0)     // Catch: java.lang.RuntimeException -> L31 java.io.IOException -> L33
            android.media.MediaFormat r1 = r5.b     // Catch: java.lang.RuntimeException -> L2d java.io.IOException -> L2f
            android.view.Surface r2 = r5.d     // Catch: java.lang.RuntimeException -> L2d java.io.IOException -> L2f
            android.media.MediaCrypto r5 = r5.e     // Catch: java.lang.RuntimeException -> L2d java.io.IOException -> L2f
            r3 = 0
            r0.configure(r1, r2, r5, r3)     // Catch: java.lang.RuntimeException -> L2d java.io.IOException -> L2f
            r0.start()     // Catch: java.lang.RuntimeException -> L2d java.io.IOException -> L2f
            baq r5 = new baq     // Catch: java.lang.RuntimeException -> L2d java.io.IOException -> L2f
            r5.<init>(r0)     // Catch: java.lang.RuntimeException -> L2d java.io.IOException -> L2f
            return r5
        L2d:
            r5 = move-exception
            goto L35
        L2f:
            r5 = move-exception
            goto L35
        L31:
            r5 = move-exception
            goto L34
        L33:
            r5 = move-exception
        L34:
            r0 = 0
        L35:
            if (r0 == 0) goto L3a
            r0.release()
        L3a:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bap.b(azw):azy");
    }
}
