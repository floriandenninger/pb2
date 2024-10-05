package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class oxz extends Exception {
    public final String a;
    public final String b;
    public final String c;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public oxz(com.google.android.exoplayer.MediaFormat r4, java.lang.Throwable r5, int r6) {
        /*
            r3 = this;
            java.lang.String r0 = java.lang.String.valueOf(r4)
            java.lang.String r1 = java.lang.String.valueOf(r0)
            int r1 = r1.length()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            int r1 = r1 + 36
            r2.<init>(r1)
            java.lang.String r1 = "Decoder init failed: ["
            r2.append(r1)
            r2.append(r6)
            java.lang.String r1 = "], "
            r2.append(r1)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r3.<init>(r0, r5)
            java.lang.String r4 = r4.b
            r3.a = r4
            r4 = 0
            r3.b = r4
            int r4 = java.lang.Math.abs(r6)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r6 = 68
            r5.<init>(r6)
            java.lang.String r6 = "com.google.android.exoplayer.MediaCodecTrackRenderer_neg_"
            r5.append(r6)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            r3.c = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oxz.<init>(com.google.android.exoplayer.MediaFormat, java.lang.Throwable, int):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public oxz(com.google.android.exoplayer.MediaFormat r5, java.lang.Throwable r6, java.lang.String r7) {
        /*
            r4 = this;
            java.lang.String r0 = java.lang.String.valueOf(r5)
            java.lang.String r1 = java.lang.String.valueOf(r7)
            int r1 = r1.length()
            java.lang.String r2 = java.lang.String.valueOf(r0)
            int r2 = r2.length()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            int r1 = r1 + 23
            int r1 = r1 + r2
            r3.<init>(r1)
            java.lang.String r1 = "Decoder init failed: "
            r3.append(r1)
            r3.append(r7)
            java.lang.String r1 = ", "
            r3.append(r1)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r4.<init>(r0, r6)
            java.lang.String r5 = r5.b
            r4.a = r5
            r4.b = r7
            int r5 = defpackage.pgz.a
            r7 = 0
            r0 = 21
            if (r5 < r0) goto L4a
            boolean r5 = r6 instanceof android.media.MediaCodec.CodecException
            if (r5 == 0) goto L4a
            android.media.MediaCodec$CodecException r6 = (android.media.MediaCodec.CodecException) r6
            java.lang.String r7 = r6.getDiagnosticInfo()
        L4a:
            r4.c = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oxz.<init>(com.google.android.exoplayer.MediaFormat, java.lang.Throwable, java.lang.String):void");
    }
}
