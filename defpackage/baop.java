package defpackage;

import android.graphics.Bitmap;
import android.opengl.GLES20;
import android.os.Handler;
import java.nio.ByteBuffer;
import java.text.DecimalFormat;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import org.webrtc.Logging;
import org.webrtc.VideoFrame;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class baop implements Runnable {
    final /* synthetic */ baov a;
    private final /* synthetic */ int b;

    public baop(baov baovVar, int i) {
        this.b = i;
        this.a = baovVar;
    }

    public /* synthetic */ baop(baov baovVar, int i, byte[] bArr) {
        this.b = i;
        this.a = baovVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j;
        float f;
        float f2;
        float f3;
        int i = this.b;
        if (i == 0) {
            baov baovVar = this.a;
            DecimalFormat decimalFormat = new DecimalFormat("#.0");
            long nanoTime = System.nanoTime();
            synchronized (baovVar.o) {
                try {
                    j = nanoTime - baovVar.s;
                } catch (Throwable th) {
                    th = th;
                }
                try {
                    if (j > 0) {
                        long j2 = baovVar.r;
                        long nanos = TimeUnit.SECONDS.toNanos(1L);
                        long millis = TimeUnit.NANOSECONDS.toMillis(j);
                        int i2 = baovVar.p;
                        int i3 = baovVar.q;
                        int i4 = baovVar.r;
                        String format = decimalFormat.format(((float) (j2 * nanos)) / ((float) j));
                        String c = baov.c(baovVar.t, baovVar.r);
                        String c2 = baov.c(baovVar.u, baovVar.r);
                        StringBuilder sb = new StringBuilder(String.valueOf(format).length() + 173 + String.valueOf(c).length() + String.valueOf(c2).length());
                        sb.append("Duration: ");
                        sb.append(millis);
                        sb.append(" ms. Frames received: ");
                        sb.append(i2);
                        sb.append(". Dropped: ");
                        sb.append(i3);
                        sb.append(". Rendered: ");
                        sb.append(i4);
                        sb.append(". Render fps: ");
                        sb.append(format);
                        sb.append(". Average render time: ");
                        sb.append(c);
                        sb.append(". Average swapBuffer time: ");
                        sb.append(c2);
                        sb.append(".");
                        baovVar.b(sb.toString());
                        baovVar.a(nanoTime);
                    }
                    synchronized (this.a.b) {
                        baov baovVar2 = this.a;
                        Handler handler = baovVar2.c;
                        if (handler != null) {
                            handler.removeCallbacks(baovVar2.w);
                            baov baovVar3 = this.a;
                            baovVar3.c.postDelayed(baovVar3.w, TimeUnit.SECONDS.toMillis(4L));
                        }
                    }
                    return;
                } catch (Throwable th2) {
                    th = th2;
                    throw th;
                }
            }
        }
        if (i != 1) {
            synchronized (this.a.b) {
                this.a.c = null;
            }
            return;
        }
        baov baovVar4 = this.a;
        synchronized (baovVar4.k) {
            VideoFrame videoFrame = baovVar4.l;
            if (videoFrame == null) {
                return;
            }
            baovVar4.l = null;
            baom baomVar = baovVar4.g;
            if (baomVar == null || !baomVar.k()) {
                baovVar4.b("Dropping frame - No surface");
                return;
            }
            synchronized (baovVar4.f) {
            }
            long nanoTime2 = System.nanoTime();
            float b = videoFrame.b() / videoFrame.a();
            synchronized (baovVar4.m) {
                f = baovVar4.n;
                if (f == 0.0f) {
                    f = b;
                }
            }
            if (b > f) {
                f3 = f / b;
                f2 = 1.0f;
            } else {
                f2 = b / f;
                f3 = 1.0f;
            }
            baovVar4.j.reset();
            baovVar4.j.preTranslate(0.5f, 0.5f);
            baovVar4.j.preScale(1.0f, 1.0f);
            baovVar4.j.preScale(f3, f2);
            baovVar4.j.preTranslate(-0.5f, -0.5f);
            try {
                GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
                GLES20.glClear(16384);
                baovVar4.h.b(videoFrame, baovVar4.i, baovVar4.j, baovVar4.g.b(), baovVar4.g.a());
                long nanoTime3 = System.nanoTime();
                baovVar4.g.i();
                long nanoTime4 = System.nanoTime();
                synchronized (baovVar4.o) {
                    baovVar4.r++;
                    baovVar4.t += nanoTime4 - nanoTime2;
                    baovVar4.u += nanoTime4 - nanoTime3;
                }
                if (!baovVar4.d.isEmpty()) {
                    baovVar4.j.reset();
                    baovVar4.j.preTranslate(0.5f, 0.5f);
                    baovVar4.j.preScale(1.0f, 1.0f);
                    baovVar4.j.preScale(1.0f, -1.0f);
                    baovVar4.j.preTranslate(-0.5f, -0.5f);
                    Iterator it = baovVar4.d.iterator();
                    if (it.hasNext()) {
                        baot baotVar = (baot) it.next();
                        it.remove();
                        float f4 = baotVar.b;
                        int b2 = (int) (videoFrame.b() * 0.0f);
                        float f5 = baotVar.b;
                        int a = (int) (videoFrame.a() * 0.0f);
                        if (b2 != 0 && a != 0) {
                            baovVar4.v.b(b2, a);
                            GLES20.glBindFramebuffer(36160, baovVar4.v.a);
                            GLES20.glFramebufferTexture2D(36160, 36064, 3553, baovVar4.v.b, 0);
                            GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
                            GLES20.glClear(16384);
                            baqt baqtVar = baovVar4.h;
                            bapq bapqVar = baotVar.c;
                            baqtVar.b(videoFrame, null, baovVar4.j, b2, a);
                            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(b2 * a * 4);
                            GLES20.glViewport(0, 0, b2, a);
                            GLES20.glReadPixels(0, 0, b2, a, 6408, 5121, allocateDirect);
                            GLES20.glBindFramebuffer(36160, 0);
                            aynu.s("EglRenderer.notifyCallbacks");
                            Bitmap.createBitmap(b2, a, Bitmap.Config.ARGB_8888).copyPixelsFromBuffer(allocateDirect);
                            baos baosVar = baotVar.a;
                            throw null;
                        }
                        baos baosVar2 = baotVar.a;
                        throw null;
                    }
                }
            } catch (bapb e) {
                Logging.c("EglRenderer", String.valueOf(baovVar4.a).concat("Error while drawing frame"), e);
                baor baorVar = baovVar4.e;
                baovVar4.i.c();
                baovVar4.h.a();
                baovVar4.v.a();
            } finally {
                videoFrame.release();
            }
        }
    }
}
