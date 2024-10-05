package defpackage;

import android.media.MediaCodec;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class akfw {
    public boolean a;
    public MediaCodec b;
    public boolean c;
    public boolean d;
    public int e = 1;

    /* JADX WARN: Removed duplicated region for block: B:33:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(byte[] r23, int r24, int r25, boolean r26, defpackage.aome r27) {
        /*
            r22 = this;
            r0 = r22
            r8 = r25
            r9 = 0
            r10 = 1
            r1 = 4096(0x1000, float:5.74E-42)
            if (r8 > r1) goto Lc
            r1 = 1
            goto Ld
        Lc:
            r1 = 0
        Ld:
            java.lang.String r2 = "length must be less than or equal to CHUNK_SIZE_BYTES!"
            defpackage.amkq.F(r1, r2)
            android.media.MediaCodec$BufferInfo r11 = new android.media.MediaCodec$BufferInfo
            r11.<init>()
            r1 = 0
        L18:
            if (r1 == 0) goto L1e
            if (r26 == 0) goto Lb5
            r2 = 1
            goto L20
        L1e:
            r2 = r26
        L20:
            r12 = -1
            r13 = 1000(0x3e8, double:4.94E-321)
            if (r1 != 0) goto L71
            if (r2 == 0) goto L34
            boolean r3 = r0.c
            if (r3 != 0) goto L2c
            goto L34
        L2c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Already flushed!"
            r1.<init>(r2)
            throw r1
        L34:
            android.media.MediaCodec r3 = r0.b
            int r3 = r3.dequeueInputBuffer(r13)
            if (r3 == r12) goto L71
            if (r2 == 0) goto L52
            android.media.MediaCodec r15 = r0.b
            r17 = 0
            r18 = 0
            r19 = 0
            r21 = 4
            r16 = r3
            r15.queueInputBuffer(r16, r17, r18, r19, r21)
            r0.c = r10
            r15 = r23
            goto L6f
        L52:
            android.media.MediaCodec r1 = r0.b
            java.nio.ByteBuffer r1 = r1.getInputBuffer(r3)
            r15 = r23
            r7 = r24
            r1.put(r15, r7, r8)
            android.media.MediaCodec r1 = r0.b
            r4 = 0
            r5 = 0
            r16 = 0
            r2 = r3
            r3 = r4
            r4 = r25
            r7 = r16
            r1.queueInputBuffer(r2, r3, r4, r5, r7)
        L6f:
            r1 = 1
            goto L73
        L71:
            r15 = r23
        L73:
            android.media.MediaCodec r2 = r0.b
            int r2 = r2.dequeueOutputBuffer(r11, r13)
            if (r2 != r12) goto L7e
        L7b:
            r2 = r27
            goto Lad
        L7e:
            r3 = -2
            if (r2 != r3) goto L90
            boolean r2 = r0.a
            if (r2 != 0) goto L88
            r0.a = r10
            goto L7b
        L88:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "The codec format was unexpectedly changed."
            r1.<init>(r2)
            throw r1
        L90:
            android.media.MediaCodec r3 = r0.b
            java.nio.ByteBuffer r3 = r3.getOutputBuffer(r2)
            int r4 = r11.size
            byte[] r4 = new byte[r4]
            r3.get(r4)
            android.media.MediaCodec r3 = r0.b
            r3.releaseOutputBuffer(r2, r9)
            r2 = r27
            r2.write(r4)     // Catch: java.io.IOException -> La8
            goto Lad
        La8:
            java.lang.String r3 = "Unable to write bytes into buffer!"
            defpackage.zga.b(r3)
        Lad:
            int r3 = r11.flags
            r3 = r3 & 4
            if (r3 == 0) goto L18
            if (r1 == 0) goto Lb6
        Lb5:
            return
        Lb6:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Didn't process input yet."
            r1.<init>(r2)
            goto Lbf
        Lbe:
            throw r1
        Lbf:
            goto Lbe
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akfw.a(byte[], int, int, boolean, aome):void");
    }

    public final void b() {
        aome t = aomf.t();
        try {
            a(null, 0, 0, true, t);
            this.b.stop();
        } catch (MediaCodec.CodecException unused) {
            zga.b("Something went wrong in the underlying codec!");
        }
        this.b.release();
        t.b();
    }
}
