package defpackage;

import android.media.MediaFormat;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vtx implements vty {
    private vuj a;
    private long b = 0;
    private int c;
    private int d;
    private final vue e;

    public vtx(vue vueVar) {
        this.e = vueVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x004b, code lost:
    
        if (r7 != null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004e, code lost:
    
        r1 = (java.nio.ByteBuffer) r7.a.position(r7.b.offset);
        r1 = (java.nio.ByteBuffer) r7.a.limit(r7.b.offset + r7.b.size);
        r1 = r20.c;
        r2 = r20.d;
        r3 = r20.a.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0073, code lost:
    
        if (r3 == null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0075, code lost:
    
        r1 = r3.getInteger("sample-rate");
        r2 = r3.getInteger("channel-count");
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0081, code lost:
    
        r3 = r20.e;
        r6 = r7.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x008a, code lost:
    
        if (r6.remaining() <= 0) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x008c, code lost:
    
        r8 = r6.remaining();
        r11 = new byte[7];
        r12 = defpackage.vue.a(defpackage.vue.a(defpackage.vue.a(defpackage.vue.a(defpackage.vue.a(0, 12, 4095), 1, 0), 2, 0), 1, 1), 2, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b7, code lost:
    
        switch(r1) {
            case 7350: goto L40;
            case 8000: goto L39;
            case 11025: goto L38;
            case 12000: goto L37;
            case 16000: goto L36;
            case 22050: goto L35;
            case 24000: goto L34;
            case 32000: goto L33;
            case 44100: goto L32;
            case 48000: goto L31;
            case 64000: goto L30;
            case 88200: goto L29;
            case 96000: goto L28;
            default: goto L65;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00d3, code lost:
    
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00f1, code lost:
    
        r12 = defpackage.vue.a(defpackage.vue.a(r12, 4, r1), 1, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00f9, code lost:
    
        switch(r2) {
            case 1: goto L51;
            case 2: goto L50;
            case 3: goto L49;
            case 4: goto L48;
            case 5: goto L47;
            case 6: goto L46;
            case 7: goto L69;
            case 8: goto L45;
            default: goto L69;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0115, code lost:
    
        r1 = 7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0122, code lost:
    
        r1 = defpackage.vue.a(defpackage.vue.a(defpackage.vue.a(defpackage.vue.a(defpackage.vue.a(defpackage.vue.a(defpackage.vue.a(defpackage.vue.a(r12, 3, r1), 1, 0), 1, 0), 1, 0), 1, 0), 13, r8 + 7), 11, 2047), 2, 0);
        r11[0] = (byte) ((r1 >>> 48) & 255);
        r11[1] = (byte) ((r1 >>> 40) & 255);
        r11[2] = (byte) ((r1 >>> 32) & 255);
        r11[3] = (byte) ((r1 >>> 24) & 255);
        r11[4] = (byte) ((r1 >>> 16) & 255);
        r11[5] = (byte) ((r1 >>> 8) & 255);
        r11[6] = (byte) r1;
        r3.b.write(r11, 0, 7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x018c, code lost:
    
        if (r6.isDirect() == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x018e, code lost:
    
        r1 = r6.remaining();
        r2 = new byte[r1];
        r6.get(r2);
        r3.b.write(r2, 0, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x019d, code lost:
    
        r3.b.write(r6.array(), r6.position(), r6.remaining());
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0117, code lost:
    
        r1 = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0119, code lost:
    
        r1 = 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x011b, code lost:
    
        r1 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x011d, code lost:
    
        r1 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x011f, code lost:
    
        r1 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0121, code lost:
    
        r1 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00fc, code lost:
    
        r3 = new java.lang.StringBuilder(34);
        r3.append("Invalid channel count: ");
        r3.append(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0114, code lost:
    
        throw new java.lang.IllegalArgumentException(r3.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00d5, code lost:
    
        r1 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00d7, code lost:
    
        r1 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00d9, code lost:
    
        r1 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00db, code lost:
    
        r1 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00dd, code lost:
    
        r1 = 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00df, code lost:
    
        r1 = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00e1, code lost:
    
        r1 = 7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00e3, code lost:
    
        r1 = 8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00e6, code lost:
    
        r1 = 9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00e9, code lost:
    
        r1 = 10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00ec, code lost:
    
        r1 = 11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00ef, code lost:
    
        r1 = 12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00ba, code lost:
    
        r3 = new java.lang.StringBuilder(32);
        r3.append("Invalid sample rate: ");
        r3.append(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00d2, code lost:
    
        throw new java.lang.IllegalArgumentException(r3.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x004d, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void c() {
        /*
            Method dump skipped, instructions count: 564
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vtx.c():void");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:1|(10:29|12|13|14|(1:16)(1:25)|17|18|(1:20)|21|22)|(1:3)|6|(2:7|(1:9)(1:10))|11|12|13|14|(0)(0)|17|18|(0)|21|22) */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0080, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0081, code lost:
    
        r0.c = r2;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004d A[Catch: IOException -> 0x0080, TryCatch #0 {IOException -> 0x0080, blocks: (B:14:0x003f, B:16:0x004d, B:25:0x007a), top: B:13:0x003f }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007a A[Catch: IOException -> 0x0080, TRY_LEAVE, TryCatch #0 {IOException -> 0x0080, blocks: (B:14:0x003f, B:16:0x004d, B:25:0x007a), top: B:13:0x003f }] */
    @Override // defpackage.vty
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            r6 = this;
            vuj r0 = r6.a
            r1 = 1
            if (r0 == 0) goto L38
        L5:
            r6.c()
            vuj r0 = r6.a
            long r2 = r6.b
            android.media.MediaCodec r0 = r0.b
            vun r0 = defpackage.vun.a(r0)
            if (r0 == 0) goto L5
            r4 = 0
            java.nio.ByteBuffer r4 = java.nio.ByteBuffer.allocate(r4)
            r5 = 4
            r0.b(r4, r2, r5)
        L1d:
            vuj r0 = r6.a
            int r2 = r0.c
            if (r2 != r1) goto L27
            r6.c()
            goto L1d
        L27:
            r2 = 3
            r0.c = r2
            android.media.MediaCodec r2 = r0.b
            r2.stop()
            android.media.MediaCodec r0 = r0.b
            r0.release()
            r0 = 0
            r6.a = r0
            goto L3d
        L38:
            java.lang.String r0 = "Encoder not started!"
            defpackage.vtv.b(r0)
        L3d:
            vue r0 = r6.e
            java.io.ByteArrayOutputStream r2 = r0.b     // Catch: java.io.IOException -> L80
            byte[] r2 = r2.toByteArray()     // Catch: java.io.IOException -> L80
            java.io.ByteArrayOutputStream r3 = r0.b     // Catch: java.io.IOException -> L80
            r3.close()     // Catch: java.io.IOException -> L80
            int r3 = r2.length     // Catch: java.io.IOException -> L80
            if (r3 <= 0) goto L7a
            axkw r3 = new axkw     // Catch: java.io.IOException -> L80
            r3.<init>(r2)     // Catch: java.io.IOException -> L80
            axlo r2 = new axlo     // Catch: java.io.IOException -> L80
            r2.<init>(r3)     // Catch: java.io.IOException -> L80
            axkz r3 = new axkz     // Catch: java.io.IOException -> L80
            r3.<init>()     // Catch: java.io.IOException -> L80
            r3.b(r2)     // Catch: java.io.IOException -> L80
            java.util.Date r2 = r0.d     // Catch: java.io.IOException -> L80
            r3.c = r2     // Catch: java.io.IOException -> L80
            java.util.Date r2 = r0.d     // Catch: java.io.IOException -> L80
            r3.b = r2     // Catch: java.io.IOException -> L80
            axlf r2 = new axlf     // Catch: java.io.IOException -> L80
            r2.<init>()     // Catch: java.io.IOException -> L80
            deg r2 = r2.c(r3)     // Catch: java.io.IOException -> L80
            java.io.OutputStream r3 = r0.a     // Catch: java.io.IOException -> L80
            java.nio.channels.WritableByteChannel r3 = java.nio.channels.Channels.newChannel(r3)     // Catch: java.io.IOException -> L80
            r2.k(r3)     // Catch: java.io.IOException -> L80
            goto L83
        L7a:
            java.lang.String r2 = "No audio data to write!"
            defpackage.vtv.b(r2)     // Catch: java.io.IOException -> L80
            goto L83
        L80:
            r2 = move-exception
            r0.c = r2
        L83:
            vxe r2 = r0.e
            java.lang.Exception r0 = r0.c
            if (r0 == 0) goto Lab
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r3 = java.lang.String.valueOf(r0)
            int r3 = r3.length()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r3 = r3 + 35
            r4.<init>(r3)
            java.lang.String r3 = "Audioswap mixing ended with error: "
            r4.append(r3)
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            defpackage.vtv.b(r0)
        Lab:
            android.os.Handler r0 = r2.a
            r0.sendEmptyMessage(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vtx.a():void");
    }

    @Override // defpackage.vty
    public final void b(ShortBuffer shortBuffer, int i, int i2) {
        vun a;
        if (this.a == null) {
            StringBuilder sb = new StringBuilder(54);
            sb.append("Creating encoder rate:");
            sb.append(i);
            sb.append(" channels:");
            sb.append(i2);
            vtv.a(sb.toString());
            MediaFormat createAudioFormat = MediaFormat.createAudioFormat("audio/mp4a-latm", i, i2);
            createAudioFormat.setInteger("bitrate", 128000);
            try {
                this.a = new vuj(createAudioFormat);
                this.c = i;
                this.d = i2;
            } catch (IOException e) {
                throw new RuntimeException("Cannot create an audio encoder", e);
            }
        } else {
            int i3 = this.c;
            vcp.c(i3 == i, "samplesPerSec changed from %s to %s", Integer.valueOf(i3), Integer.valueOf(i));
            int i4 = this.d;
            vcp.c(i4 == i2, "channelCount changed from %s to %s", Integer.valueOf(i4), Integer.valueOf(i2));
        }
        do {
            c();
            long remaining = ((shortBuffer.remaining() * 1000000) / i) / i2;
            int position = shortBuffer.position();
            int remaining2 = shortBuffer.remaining();
            ByteBuffer allocate = ByteBuffer.allocate(remaining2 + remaining2);
            allocate.order(ByteOrder.LITTLE_ENDIAN);
            vuj vujVar = this.a;
            long j = this.b;
            do {
                a = vun.a(vujVar.b);
                if (a == null) {
                    break;
                }
            } while (a.b(allocate, j, 0));
            this.b += remaining;
        } while (shortBuffer.remaining() > 0);
    }
}
