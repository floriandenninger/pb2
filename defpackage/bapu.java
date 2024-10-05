package defpackage;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.view.SurfaceHolder;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.webrtc.Logging;
import org.webrtc.VideoFrame;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bapu extends baov implements SurfaceHolder.Callback {
    private boolean A;
    private int B;
    private int C;
    private int D;
    private bapr y;
    private final Object z;

    public bapu(String str) {
        super(str);
        this.z = new Object();
    }

    private final void e(String str) {
        String str2 = this.a;
        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 2 + String.valueOf(str).length());
        sb.append(str2);
        sb.append(": ");
        sb.append(str);
        Logging.a("SurfaceEglRenderer", sb.toString());
    }

    public final void d(final baog baogVar, bapr baprVar, final int[] iArr, bapq bapqVar) {
        aype.x();
        this.y = baprVar;
        synchronized (this.z) {
            this.A = false;
            this.B = 0;
            this.C = 0;
            this.D = 0;
        }
        synchronized (this.b) {
            if (this.c != null) {
                throw new IllegalStateException(String.valueOf(this.a).concat("Already initialized"));
            }
            super.b("Initializing EglRenderer");
            this.i = bapqVar;
            HandlerThread handlerThread = new HandlerThread(String.valueOf(this.a).concat("EglRenderer"));
            handlerThread.start();
            this.c = new baou(handlerThread.getLooper(), new baop(this, 2));
            aype.y(this.c, new Runnable() { // from class: baoo
                @Override // java.lang.Runnable
                public final void run() {
                    baov baovVar = baov.this;
                    baog baogVar2 = baogVar;
                    int[] iArr2 = iArr;
                    baovVar.b("EglBase.create shared context");
                    baovVar.g = baoe.d(baogVar2, iArr2);
                }
            });
            this.c.post(this.x);
            super.a(System.nanoTime());
            this.c.postDelayed(this.w, TimeUnit.SECONDS.toMillis(4L));
        }
    }

    @Override // defpackage.baov, org.webrtc.VideoSink
    public final void onFrame(VideoFrame videoFrame) {
        int i;
        final int i2;
        VideoFrame videoFrame2;
        synchronized (this.z) {
            i = 1;
            if (!this.A) {
                this.A = true;
                e("Reporting first rendered frame.");
            }
            if (this.B != videoFrame.b() || this.C != videoFrame.a() || this.D != videoFrame.getRotation()) {
                int width = videoFrame.getBuffer().getWidth();
                int height = videoFrame.getBuffer().getHeight();
                int rotation = videoFrame.getRotation();
                StringBuilder sb = new StringBuilder(87);
                sb.append("Reporting frame resolution changed to ");
                sb.append(width);
                sb.append("x");
                sb.append(height);
                sb.append(" with rotation ");
                sb.append(rotation);
                e(sb.toString());
                bapr baprVar = this.y;
                if (baprVar != null) {
                    final int width2 = videoFrame.getBuffer().getWidth();
                    int height2 = videoFrame.getBuffer().getHeight();
                    int rotation2 = videoFrame.getRotation();
                    if (rotation2 == 0) {
                        i2 = width2;
                    } else if (rotation2 == 180) {
                        i2 = width2;
                        rotation2 = 180;
                    } else {
                        i2 = height2;
                    }
                    if (rotation2 == 0 || rotation2 == 180) {
                        width2 = height2;
                    }
                    final baqd baqdVar = (baqd) baprVar;
                    Runnable runnable = new Runnable() { // from class: baqc
                        @Override // java.lang.Runnable
                        public final void run() {
                            baqd baqdVar2 = baqd.this;
                            int i3 = i2;
                            int i4 = width2;
                            baqdVar2.b = i3;
                            baqdVar2.c = i4;
                            baqdVar2.a();
                            baqdVar2.requestLayout();
                        }
                    };
                    if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                        runnable.run();
                    } else {
                        ((baqd) baprVar).post(runnable);
                    }
                }
                this.B = videoFrame.b();
                this.C = videoFrame.a();
                this.D = videoFrame.getRotation();
            }
        }
        synchronized (this.o) {
            this.p++;
        }
        synchronized (this.b) {
            if (this.c == null) {
                super.b("Dropping frame - Not initialized or already released.");
                return;
            }
            synchronized (this.k) {
                videoFrame2 = this.l;
                if (videoFrame2 != null) {
                    videoFrame2.release();
                }
                this.l = videoFrame;
                this.l.retain();
                this.c.post(new baop(this, i, null));
            }
            if (videoFrame2 != null) {
                synchronized (this.o) {
                    this.q++;
                }
            }
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        aype.x();
        StringBuilder sb = new StringBuilder(65);
        sb.append("surfaceChanged: format: ");
        sb.append(i);
        sb.append(" size: ");
        sb.append(i2);
        sb.append("x");
        sb.append(i3);
        e(sb.toString());
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        aype.x();
        this.x.a(surfaceHolder.getSurface());
        baoq baoqVar = this.x;
        synchronized (this.b) {
            Handler handler = this.c;
            if (handler != null) {
                handler.post(baoqVar);
            }
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        aype.x();
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final Runnable runnable = new Runnable() { // from class: bapt
            @Override // java.lang.Runnable
            public final void run() {
                countDownLatch.countDown();
            }
        };
        this.x.a(null);
        synchronized (this.b) {
            Handler handler = this.c;
            if (handler != null) {
                handler.removeCallbacks(this.x);
                this.c.postAtFrontOfQueue(new Runnable() { // from class: baon
                    @Override // java.lang.Runnable
                    public final void run() {
                        baov baovVar = baov.this;
                        Runnable runnable2 = runnable;
                        baom baomVar = baovVar.g;
                        if (baomVar != null) {
                            baomVar.e();
                            baovVar.g.h();
                        }
                        runnable2.run();
                    }
                });
            } else {
                runnable.run();
            }
        }
        aype.w(countDownLatch);
    }
}
