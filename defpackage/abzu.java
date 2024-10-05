package defpackage;

import android.media.MediaFormat;
import android.os.Handler;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abzu implements abzo {
    public Thread a;
    public volatile boolean b;
    public volatile boolean c;
    public volatile boolean d;
    public volatile boolean e;
    private final Handler f;
    private byte[] g;
    private boolean h;
    private volatile boolean i;
    private int j;
    private long k;
    private long l;
    private long m;
    private final double n;
    private final acaj o;
    private final Runnable p = new abzt(this, 0);
    private final ConcurrentLinkedDeque q = new ConcurrentLinkedDeque();
    private final ConcurrentLinkedDeque r = new ConcurrentLinkedDeque();
    private final ArrayDeque s = new ArrayDeque();
    private final ArrayDeque t = new ArrayDeque();
    private final ArrayDeque u = new ArrayDeque();
    private abzn v;

    public abzu(Handler handler, MediaFormat mediaFormat) {
        this.f = handler;
        int integer = mediaFormat.getInteger("channel-count");
        int integer2 = mediaFormat.getInteger("sample-rate");
        int integer3 = mediaFormat.getInteger("max-input-size");
        double d = integer;
        Double.isNaN(d);
        Double.isNaN(d);
        double d2 = integer2;
        Double.isNaN(d2);
        this.n = 1000000.0d / ((d + d) * d2);
        for (int i = 0; i < 30; i++) {
            acah acahVar = new acah();
            acahVar.b = -1;
            acahVar.a = ByteBuffer.allocateDirect(integer3);
            this.t.add(acahVar);
        }
        this.k = Long.MIN_VALUE;
        this.j = 0;
        this.m = 0L;
        this.l = 0L;
        this.o = new acaj(50);
    }

    private final synchronized void l() {
        if (this.q.isEmpty()) {
            return;
        }
        try {
            acah acahVar = (acah) this.q.remove();
            int i = acahVar.b;
            acahVar.e = 4;
            n(acahVar);
        } catch (NoSuchElementException e) {
            zga.f("ExternalAudioInput", "Encoder audio request queue unexpectedly empty while copying results", e);
            this.e = true;
        }
    }

    private final synchronized void m() {
        if (this.q.isEmpty() || this.u.isEmpty() || this.e) {
            return;
        }
        try {
            acah acahVar = (acah) this.q.remove();
            try {
                acah acahVar2 = (acah) this.u.removeFirst();
                acahVar.c = acahVar2.c;
                acahVar.d = acahVar2.d;
                try {
                    acahVar.a.put(acahVar2.a);
                } catch (Exception e) {
                    zga.f("ExternalAudioInput", "Error copying received audio data to client buffer", e);
                    this.e = true;
                    acahVar.d = -1;
                }
                this.t.add(acahVar2);
                n(acahVar);
            } catch (NoSuchElementException e2) {
                zga.f("ExternalAudioInput", "Audio full list unexpectedly empty while copying results", e2);
                this.e = true;
                acahVar.d = -1;
                n(acahVar);
            }
        } catch (NoSuchElementException e3) {
            zga.f("ExternalAudioInput", "Encoder audio request queue unexpectedly empty while copying results", e3);
            this.e = true;
        }
    }

    private final void n(acah acahVar) {
        this.r.add(acahVar);
        this.f.post(this.p);
    }

    @Override // defpackage.abzo
    public final void a(int i, ByteBuffer byteBuffer) {
        acah acahVar = this.s.isEmpty() ? new acah() : (acah) this.s.removeFirst();
        acahVar.a = byteBuffer;
        acahVar.b = i;
        acahVar.d = 0;
        acahVar.e = 0;
        if (this.e) {
            StringBuilder sb = new StringBuilder(69);
            sb.append("Received buffer fill request with pending error: bufferId=");
            sb.append(i);
            zga.m("ExternalAudioInput", sb.toString());
            acahVar.d = -1;
            n(acahVar);
            return;
        }
        if (this.i) {
            this.q.add(acahVar);
            return;
        }
        StringBuilder sb2 = new StringBuilder(74);
        sb2.append("Received buffer fill request before recorder started: bufferId=");
        sb2.append(i);
        zga.m("ExternalAudioInput", sb2.toString());
        n(acahVar);
    }

    @Override // defpackage.abzo
    public final boolean b() {
        if (this.h) {
            return true;
        }
        d();
        this.h = true;
        return true;
    }

    @Override // defpackage.abzo
    public final boolean c() {
        if (this.h) {
            zga.c("ExternalAudioInput", "Cannot start once released");
            return false;
        }
        if (this.c) {
            zga.c("ExternalAudioInput", "Cannot restart once stopped");
            return false;
        }
        if (this.i) {
            return true;
        }
        if (this.a != null) {
            zga.c("ExternalAudioInput", "Process thread already exists");
            return false;
        }
        this.e = false;
        this.b = false;
        this.i = true;
        Thread thread = new Thread(new abzt(this, 1), "ProcessThread");
        this.a = thread;
        thread.start();
        return this.i;
    }

    @Override // defpackage.abzo
    public final boolean d() {
        if (this.h) {
            zga.c("ExternalAudioInput", "Cannot stop once released");
            return false;
        }
        if (!this.i) {
            zga.c("ExternalAudioInput", "Encoder not started");
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
    }

    @Override // defpackage.abzo
    public final void f(abzn abznVar) {
        this.v = abznVar;
    }

    @Override // defpackage.abzz
    public final long g() {
        return TimeUnit.NANOSECONDS.toMillis(h());
    }

    @Override // defpackage.abzz
    public final long h() {
        long nanoTime = System.nanoTime();
        acaj acajVar = this.o;
        long j = 0;
        if (acajVar != null && acajVar.a() >= 5000000) {
            j = (long) (this.o.a * 1000.0d);
        }
        long max = Math.max(nanoTime + j, this.k);
        this.k = max;
        return max;
    }

    public final void i() {
        yjk.e();
        this.f.removeCallbacks(this.p);
        while (!this.r.isEmpty()) {
            try {
                acah acahVar = (acah) this.r.remove();
                abzn abznVar = this.v;
                if (abznVar != null) {
                    int i = acahVar.b;
                    ByteBuffer byteBuffer = acahVar.a;
                    abznVar.f(i, acahVar.e, acahVar.d, acahVar.c);
                }
                acahVar.a = null;
                acahVar.d = 0;
                acahVar.c = 0L;
                acahVar.b = -1;
                this.s.addLast(acahVar);
            } catch (NoSuchElementException unused) {
                zga.c("ExternalAudioInput", "Audio response queue unexpectedly empty");
                return;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0039 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j() {
        /*
            r3 = this;
            defpackage.yjk.e()
        L3:
            boolean r0 = r3.b
            if (r0 == 0) goto Lb
            r3.l()
            return
        Lb:
            boolean r0 = r3.e
            if (r0 == 0) goto L5b
        Lf:
            monitor-enter(r3)
            java.util.concurrent.ConcurrentLinkedDeque r0 = r3.q     // Catch: java.lang.Throwable -> L58
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L58
            if (r0 != 0) goto L32
            java.util.concurrent.ConcurrentLinkedDeque r0 = r3.q     // Catch: java.util.NoSuchElementException -> L28 java.lang.Throwable -> L58
            java.lang.Object r0 = r0.remove()     // Catch: java.util.NoSuchElementException -> L28 java.lang.Throwable -> L58
            acah r0 = (defpackage.acah) r0     // Catch: java.util.NoSuchElementException -> L28 java.lang.Throwable -> L58
            r1 = -1
            r0.d = r1     // Catch: java.util.NoSuchElementException -> L28 java.lang.Throwable -> L58
            r3.n(r0)     // Catch: java.util.NoSuchElementException -> L28 java.lang.Throwable -> L58
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L58
            goto Lf
        L28:
            r0 = move-exception
            java.lang.String r1 = "ExternalAudioInput"
            java.lang.String r2 = "Encoder audio request deque unexpectedly empty while draining on error"
            defpackage.zga.f(r1, r2, r0)     // Catch: java.lang.Throwable -> L58
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L58
            goto L33
        L32:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L58
        L33:
            int r0 = r3.j
            r1 = 30
            if (r0 < r1) goto L41
            java.lang.String r0 = "ExternalAudioInput"
            java.lang.String r1 = "Waited too long for cleanup after error"
            defpackage.zga.c(r0, r1)
            return
        L41:
            if (r0 <= 0) goto L51
            r0 = 100
            java.lang.Thread.sleep(r0)     // Catch: java.lang.InterruptedException -> L49
            goto L51
        L49:
            r0 = move-exception
            java.lang.String r1 = "ExternalAudioInput"
            java.lang.String r2 = "Interrupted while draining buffer queue on error."
            defpackage.zga.o(r1, r2, r0)
        L51:
            int r0 = r3.j
            int r0 = r0 + 1
            r3.j = r0
            goto L3
        L58:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L58
            throw r0
        L5b:
            r3.m()
            goto L3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abzu.j():void");
    }

    public final void k(byte[] bArr) {
        acah acahVar;
        if (this.c || this.e) {
            return;
        }
        synchronized (this) {
            if (this.t.isEmpty()) {
                try {
                    acahVar = (acah) this.u.removeFirst();
                } catch (NoSuchElementException e) {
                    zga.f("ExternalAudioInput", "Audio queue unexpectedly empty in overflow", e);
                    this.e = true;
                    return;
                }
            } else {
                try {
                    acahVar = (acah) this.t.removeFirst();
                } catch (NoSuchElementException e2) {
                    zga.f("ExternalAudioInput", "Audio free list unexpectedly empty", e2);
                    this.e = true;
                    return;
                }
            }
        }
        acahVar.d = 0;
        long nanoTime = System.nanoTime() / 1000;
        if (this.l <= 0) {
            this.l = nanoTime;
            this.o.c();
        }
        long j = this.l;
        long j2 = this.m;
        double d = j2;
        double d2 = this.n;
        Double.isNaN(d);
        acahVar.c = j + ((long) (d * d2));
        if (j2 > 0) {
            this.o.b(r4 - nanoTime);
        }
        acahVar.d = bArr.length;
        acahVar.a.put(bArr);
        if (!this.d) {
            byte[] bArr2 = this.g;
            if (bArr2 == null || bArr2.length < acahVar.a.capacity()) {
                this.g = new byte[acahVar.a.capacity()];
            }
            acahVar.a.put(this.g, 0, acahVar.d);
        }
        this.m += acahVar.d;
        synchronized (this) {
            this.u.addLast(acahVar);
        }
    }
}
