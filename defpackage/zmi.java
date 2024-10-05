package defpackage;

import android.media.AudioRecord;
import android.media.audiofx.NoiseSuppressor;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class zmi implements Runnable {
    public zmh a;
    private final int b;
    private AudioRecord c;
    private Thread d;
    private boolean e;
    private NoiseSuppressor f;

    /* JADX WARN: Removed duplicated region for block: B:11:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public zmi(int r10) {
        /*
            r9 = this;
            r9.<init>()
            r0 = 2
            r1 = 1
            if (r10 == r1) goto Ld
            if (r10 != r0) goto Lb
            r10 = 2
            goto Ld
        Lb:
            r2 = 0
            goto Le
        Ld:
            r2 = 1
        Le:
            defpackage.amkq.E(r2)
            r9.b = r10
            if (r10 != r1) goto L1a
            r2 = 16
            r6 = 16
            goto L1e
        L1a:
            r2 = 12
            r6 = 12
        L1e:
            r2 = 44100(0xac44, float:6.1797E-41)
            int r0 = android.media.AudioRecord.getMinBufferSize(r2, r6, r0)
            int r10 = r10 + r10
            int r10 = r10 * 16384
            int r8 = java.lang.Math.max(r10, r0)
            android.media.AudioRecord r10 = new android.media.AudioRecord
            r4 = 5
            r5 = 44100(0xac44, float:6.1797E-41)
            r7 = 2
            r3 = r10
            r3.<init>(r4, r5, r6, r7, r8)
            r9.c = r10
            boolean r10 = android.media.audiofx.NoiseSuppressor.isAvailable()
            if (r10 == 0) goto L8b
            r10 = 0
            android.media.AudioRecord r0 = r9.c     // Catch: java.lang.Exception -> L61
            int r0 = r0.getAudioSessionId()     // Catch: java.lang.Exception -> L61
            android.media.audiofx.NoiseSuppressor r0 = android.media.audiofx.NoiseSuppressor.create(r0)     // Catch: java.lang.Exception -> L61
            r9.f = r0     // Catch: java.lang.Exception -> L61
            if (r0 == 0) goto L8b
            int r0 = r0.setEnabled(r1)     // Catch: java.lang.Exception -> L61
            if (r0 == 0) goto L8b
            java.lang.String r0 = "Failed to enable noise suppressor."
            defpackage.zga.b(r0)     // Catch: java.lang.Exception -> L61
            android.media.audiofx.NoiseSuppressor r0 = r9.f     // Catch: java.lang.Exception -> L61
            r0.release()     // Catch: java.lang.Exception -> L61
            r9.f = r10     // Catch: java.lang.Exception -> L61
            return
        L61:
            r0 = move-exception
            java.lang.Class r0 = r0.getClass()
            java.lang.String r0 = r0.getName()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r2 = "youtubeAudioCapture: Exception while creating noise suppressor - "
            int r3 = r0.length()
            if (r3 == 0) goto L7b
            java.lang.String r0 = r2.concat(r0)
            goto L80
        L7b:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r2)
        L80:
            r2 = 6
            defpackage.afsi.b(r1, r2, r0)
            android.media.audiofx.NoiseSuppressor r0 = r9.f
            r0.release()
            r9.f = r10
        L8b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zmi.<init>(int):void");
    }

    public final long a(long j) {
        int i = this.b;
        double d = j / (i + i);
        Double.isNaN(d);
        return Math.round((d * 1000000.0d) / 44100.0d);
    }

    public final void b() {
        amkq.E(this.d == null);
        this.c.release();
        this.c = null;
        NoiseSuppressor noiseSuppressor = this.f;
        if (noiseSuppressor != null) {
            noiseSuppressor.release();
            this.f = null;
        }
    }

    public final void c() {
        this.e = false;
        this.c.startRecording();
        Thread thread = new Thread(this, "editRecordAudio");
        this.d = thread;
        thread.start();
    }

    public final void d() {
        this.d.getClass();
        this.e = true;
        while (true) {
            Thread thread = this.d;
            if (thread == null) {
                return;
            }
            try {
                thread.join();
                this.d = null;
            } catch (InterruptedException unused) {
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        ByteBuffer byteBuffer;
        int i = this.b;
        int i2 = (i + i) * 1024;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(1024);
        allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
        while (!this.e) {
            int read = this.c.read(allocateDirect, i2);
            if (read > 0) {
                zmh zmhVar = this.a;
                synchronized (zmhVar) {
                    if (((zmv) zmhVar).m()) {
                        zmv zmvVar = (zmv) zmhVar;
                        zmvVar.c.b(0L);
                        if (zmv.k(zmvVar.r)) {
                            zmvVar.d.e(allocateDirect);
                            byteBuffer = zmvVar.d.b();
                        } else {
                            byteBuffer = allocateDirect;
                        }
                        long a = zmvVar.e.a(zmvVar.D);
                        int limit = byteBuffer.limit();
                        zmvVar.c.d(byteBuffer, limit, a);
                        zmvVar.D += limit;
                    }
                }
            }
        }
        this.c.stop();
    }
}
