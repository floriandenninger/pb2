package defpackage;

import android.media.AudioRecord;
import android.media.audiofx.AutomaticGainControl;
import android.os.Handler;
import android.util.Log;
import java.nio.ByteBuffer;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acai implements abzo {
    private abzn A;
    public volatile Thread a;
    public volatile boolean b;
    public volatile boolean c;
    public volatile boolean d;
    public volatile boolean e;
    private final Handler f;
    private final AutomaticGainControl g;
    private final double h;
    private AudioRecord l;
    private acaj m;
    private long n;
    private boolean o;
    private byte[] p;
    private volatile boolean q;
    private int r;
    private int s;
    private abzn z;
    private final Runnable i = new acag(this, 0);
    private final Runnable j = new acag(this, 2);
    private final Runnable k = new acag(this, 3);
    private final Runnable t = new acag(this, 4);
    private final ConcurrentLinkedQueue u = new ConcurrentLinkedQueue();
    private final ConcurrentLinkedQueue v = new ConcurrentLinkedQueue();
    private final LinkedList w = new LinkedList();
    private final LinkedList x = new LinkedList();
    private final LinkedList y = new LinkedList();

    public acai(AudioRecord audioRecord, int i, int i2, int i3, Handler handler) {
        this.f = handler;
        this.l = audioRecord;
        int i4 = i != 12 ? 1 : 2;
        double d = i2;
        Double.isNaN(d);
        Double.isNaN(d);
        double d2 = i4;
        Double.isNaN(d2);
        this.h = 1000000.0d / ((d + d) * d2);
        if (AutomaticGainControl.isAvailable()) {
            AutomaticGainControl create = AutomaticGainControl.create(audioRecord.getAudioSessionId());
            this.g = create;
            create.setEnabled(true);
        } else {
            this.g = null;
        }
        for (int i5 = 0; i5 < 30; i5++) {
            acah acahVar = new acah();
            acahVar.b = -1;
            acahVar.a = ByteBuffer.allocateDirect(i3);
            this.x.add(acahVar);
        }
        this.n = Long.MIN_VALUE;
    }

    private final synchronized void m(acah acahVar) {
        this.v.add(acahVar);
        this.f.post(this.t);
    }

    @Override // defpackage.abzo
    public final void a(int i, ByteBuffer byteBuffer) {
        acah acahVar = this.w.isEmpty() ? new acah() : (acah) this.w.removeFirst();
        acahVar.a = byteBuffer;
        acahVar.b = i;
        acahVar.d = 0;
        acahVar.e = 0;
        if (this.e) {
            StringBuilder sb = new StringBuilder(69);
            sb.append("Received buffer fill request with pending error: bufferId=");
            sb.append(i);
            Log.w("MicInput", sb.toString());
            acahVar.d = -1;
            m(acahVar);
            return;
        }
        if (this.c) {
            int i2 = acahVar.b;
            acahVar.e = 4;
            m(acahVar);
        } else {
            if (this.q) {
                this.u.add(acahVar);
                return;
            }
            StringBuilder sb2 = new StringBuilder(74);
            sb2.append("Received buffer fill request before recorder started: bufferId=");
            sb2.append(i);
            Log.w("MicInput", sb2.toString());
            m(acahVar);
        }
    }

    @Override // defpackage.abzo
    public final boolean b() {
        if (this.o) {
            return true;
        }
        d();
        try {
            AutomaticGainControl automaticGainControl = this.g;
            if (automaticGainControl != null) {
                automaticGainControl.release();
            }
            this.l.release();
            this.o = true;
        } catch (Exception unused) {
        }
        return this.o;
    }

    @Override // defpackage.abzo
    public final boolean c() {
        if (this.o) {
            Log.e("MicInput", "Cannot start once released");
            return false;
        }
        if (this.c) {
            Log.e("MicInput", "Cannot restart once stopped");
            return false;
        }
        if (this.q) {
            return true;
        }
        if (this.a != null) {
            Log.e("MicInput", "Mic capture thread already exists");
            return false;
        }
        try {
            this.l.startRecording();
            this.e = false;
            this.b = false;
            this.q = true;
            this.a = new Thread(new acag(this, 1, null), "MicInputThread");
            this.a.start();
            return this.q;
        } catch (IllegalStateException e) {
            Log.e("MicInput", "Could not start audio recorder", e);
            return false;
        }
    }

    @Override // defpackage.abzo
    public final boolean d() {
        if (this.o) {
            Log.e("MicInput", "Cannot stop once released");
            return false;
        }
        if (!this.q) {
            Log.e("MicInput", "Encoder not started");
            return false;
        }
        if (this.c) {
            return true;
        }
        Thread thread = this.a;
        if (thread == null) {
            this.c = true;
            return true;
        }
        this.b = true;
        while (true) {
            try {
                thread.join(250L);
                break;
            } catch (InterruptedException unused) {
            }
        }
        if (thread.isAlive()) {
            thread.interrupt();
            while (true) {
                try {
                    thread.join(250L);
                    break;
                } catch (InterruptedException unused2) {
                }
            }
        }
        if (!thread.isAlive()) {
            this.c = true;
            this.a = null;
        }
        return this.c;
    }

    @Override // defpackage.abzo
    public final void e(abzn abznVar) {
        this.A = abznVar;
    }

    @Override // defpackage.abzo
    public final void f(abzn abznVar) {
        this.z = abznVar;
    }

    @Override // defpackage.abzz
    public final long g() {
        return TimeUnit.NANOSECONDS.toMillis(h());
    }

    @Override // defpackage.abzz
    public final long h() {
        long nanoTime = System.nanoTime();
        acaj acajVar = this.m;
        long j = 0;
        if (acajVar != null && acajVar.a() >= 5000000) {
            j = (long) (this.m.a * 1000.0d);
        }
        long max = Math.max(nanoTime + j, this.n);
        this.n = max;
        return max;
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x01f6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01cf A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i() {
        /*
            Method dump skipped, instructions count: 576
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acai.i():void");
    }

    public final void j() {
        yjk.e();
        this.f.removeCallbacks(this.t);
        while (!this.v.isEmpty()) {
            try {
                acah acahVar = (acah) this.v.remove();
                abzn abznVar = this.z;
                if (abznVar != null) {
                    int i = acahVar.b;
                    ByteBuffer byteBuffer = acahVar.a;
                    abznVar.f(i, acahVar.e, acahVar.d, acahVar.c);
                }
                acahVar.a = null;
                acahVar.d = 0;
                acahVar.c = 0L;
                acahVar.b = -1;
                this.w.addLast(acahVar);
            } catch (NoSuchElementException unused) {
                Log.e("MicInput", "Audio response queue unexpectedly empty");
                return;
            }
        }
    }

    public final void k(int i) {
        abzn abznVar = this.A;
        if (abznVar != null) {
            abznVar.i(i);
        }
    }

    private final void l() {
        int i = this.r;
        if (i <= 0) {
            return;
        }
        int i2 = i - 1;
        this.r = i2;
        if (i2 == 0) {
            if (this.s != 0) {
                this.s = 0;
                this.f.post(this.i);
                return;
            }
            return;
        }
        if (i2 != 30 || this.s == 1) {
            return;
        }
        Log.w("MicInput", "Audio buffer overflow improved.  Re-entering warning state");
        this.s = 1;
        this.f.post(this.j);
    }
}
