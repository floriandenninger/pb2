package defpackage;

import android.content.Context;
import com.google.android.gms.gmscompliance.GmsDeviceComplianceResponse;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class qyl {
    private final Context a;
    private qym b;

    public qyl(Context context) {
        this.a = context;
    }

    private final File c() {
        return new File(this.a.getCacheDir(), "gms_cache");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a6 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a8 A[Catch: all -> 0x00c5, TRY_ENTER, TryCatch #0 {, blocks: (B:4:0x0003, B:9:0x0010, B:12:0x001b, B:16:0x0022, B:36:0x002f, B:42:0x0095, B:45:0x009f, B:23:0x00a8, B:27:0x00b1, B:30:0x00ba, B:32:0x00c0, B:64:0x009d, B:69:0x000a), top: B:3:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized com.google.android.gms.gmscompliance.GmsDeviceComplianceResponse a() {
        /*
            r20 = this;
            r1 = r20
            monitor-enter(r20)
            qym r0 = r1.b     // Catch: java.lang.Throwable -> Lc5
            r2 = 0
            if (r0 != 0) goto La
            r3 = r2
            goto Lc
        La:
            com.google.android.gms.gmscompliance.GmsDeviceComplianceResponse r3 = r0.a     // Catch: java.lang.Throwable -> Lc5
        Lc:
            if (r0 == 0) goto L22
            if (r3 == 0) goto L22
            long r4 = r0.b     // Catch: java.lang.Throwable -> Lc5
            long r6 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> Lc5
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 > 0) goto L1b
            goto L22
        L1b:
            com.google.android.gms.gmscompliance.GmsDeviceComplianceResponse r0 = new com.google.android.gms.gmscompliance.GmsDeviceComplianceResponse     // Catch: java.lang.Throwable -> Lc5
            r0.<init>(r3)     // Catch: java.lang.Throwable -> Lc5
            monitor-exit(r20)
            return r0
        L22:
            r1.b = r2     // Catch: java.lang.Throwable -> Lc5
            java.io.File r3 = r20.c()     // Catch: java.lang.Throwable -> Lc5
            boolean r0 = r3.exists()     // Catch: java.lang.Throwable -> Lc5
            r4 = 1
            if (r0 == 0) goto La3
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch: java.io.IOException -> L9e java.lang.Throwable -> Lc5
            r5.<init>(r3)     // Catch: java.io.IOException -> L9e java.lang.Throwable -> Lc5
            java.io.BufferedInputStream r0 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> L99
            r6 = 4096(0x1000, float:5.74E-42)
            r0.<init>(r5, r6)     // Catch: java.lang.Throwable -> L99
            r6 = 16
            byte[] r7 = new byte[r6]     // Catch: java.lang.Throwable -> L99
            int r0 = r0.read(r7)     // Catch: java.lang.Throwable -> L99
            r8 = 0
            r10 = 2
            if (r0 == r6) goto L4d
            qym r0 = defpackage.qym.a(r2, r10, r8)     // Catch: java.lang.Throwable -> L99
            goto L95
        L4d:
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r7)     // Catch: java.lang.Throwable -> L99
            int r6 = r0.getInt()     // Catch: java.lang.Throwable -> L99
            if (r6 == r4) goto L5c
            qym r0 = defpackage.qym.a(r2, r10, r8)     // Catch: java.lang.Throwable -> L99
            goto L95
        L5c:
            long r6 = r0.getLong()     // Catch: java.lang.Throwable -> L99
            long r11 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L99
            r13 = 3600000(0x36ee80, double:1.7786363E-317)
            long r13 = r13 + r11
            int r15 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1))
            if (r15 <= 0) goto L71
            qym r0 = defpackage.qym.a(r2, r10, r8)     // Catch: java.lang.Throwable -> L99
            goto L95
        L71:
            int r0 = r0.getInt()     // Catch: java.lang.Throwable -> L99
            if (r0 != r4) goto L79
            r0 = 1
            goto L7a
        L79:
            r0 = 0
        L7a:
            com.google.android.gms.gmscompliance.GmsDeviceComplianceResponse r8 = new com.google.android.gms.gmscompliance.GmsDeviceComplianceResponse     // Catch: java.lang.Throwable -> L99
            r14 = 1
            r15 = 1
            r16 = 0
            r17 = 0
            r18 = 0
            r13 = r8
            r13.<init>(r14, r15, r16, r17, r18)     // Catch: java.lang.Throwable -> L99
            r8.b = r0     // Catch: java.lang.Throwable -> L99
            int r0 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r0 <= 0) goto L90
            r0 = 3
            goto L91
        L90:
            r0 = 1
        L91:
            qym r0 = defpackage.qym.a(r8, r0, r6)     // Catch: java.lang.Throwable -> L99
        L95:
            r5.close()     // Catch: java.io.IOException -> L9f java.lang.Throwable -> Lc5
            goto La4
        L99:
            r0 = move-exception
            r5.close()     // Catch: java.lang.Throwable -> L9d
        L9d:
            throw r0     // Catch: java.io.IOException -> L9e java.lang.Throwable -> Lc5
        L9e:
            r0 = r2
        L9f:
            r3.delete()     // Catch: java.lang.Throwable -> Lc5
            goto La4
        La3:
            r0 = r2
        La4:
            if (r0 != 0) goto La8
            monitor-exit(r20)
            return r2
        La8:
            com.google.android.gms.gmscompliance.GmsDeviceComplianceResponse r5 = r0.a     // Catch: java.lang.Throwable -> Lc5
            int r6 = r0.c     // Catch: java.lang.Throwable -> Lc5
            if (r6 != r4) goto Lba
            if (r5 != 0) goto Lb1
            goto Lba
        Lb1:
            r1.b = r0     // Catch: java.lang.Throwable -> Lc5
            com.google.android.gms.gmscompliance.GmsDeviceComplianceResponse r0 = new com.google.android.gms.gmscompliance.GmsDeviceComplianceResponse     // Catch: java.lang.Throwable -> Lc5
            r0.<init>(r5)     // Catch: java.lang.Throwable -> Lc5
            monitor-exit(r20)
            return r0
        Lba:
            boolean r0 = r3.exists()     // Catch: java.lang.Throwable -> Lc5
            if (r0 == 0) goto Lc3
            r3.delete()     // Catch: java.lang.Throwable -> Lc5
        Lc3:
            monitor-exit(r20)
            return r2
        Lc5:
            r0 = move-exception
            monitor-exit(r20)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qyl.a():com.google.android.gms.gmscompliance.GmsDeviceComplianceResponse");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void b(GmsDeviceComplianceResponse gmsDeviceComplianceResponse) {
        this.b = null;
        qym a = qym.a(gmsDeviceComplianceResponse, 1, 0L);
        long j = a.b;
        long currentTimeMillis = System.currentTimeMillis();
        if (j < 1 || j > currentTimeMillis + 3600000) {
            j = currentTimeMillis + 3600000;
        }
        GmsDeviceComplianceResponse gmsDeviceComplianceResponse2 = a.a;
        int i = 0;
        if (gmsDeviceComplianceResponse2 != null && gmsDeviceComplianceResponse2.b) {
            i = 1;
        }
        byte[] array = ByteBuffer.allocate(16).putInt(1).putLong(j).putInt(i).array();
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(c());
            try {
                fileOutputStream.write(array);
                fileOutputStream.close();
                this.b = a;
            } catch (Throwable th) {
                try {
                    fileOutputStream.close();
                } catch (Throwable unused) {
                }
                throw th;
            }
        } catch (IOException unused2) {
        }
    }
}
