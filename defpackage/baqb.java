package defpackage;

import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.SystemClock;
import org.webrtc.Logging;
import org.webrtc.VideoFrame;
import org.webrtc.VideoSink;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class baqb {
    public final Handler a;
    public final SurfaceTexture b;
    public VideoSink c;
    public boolean d;
    public volatile boolean e;
    public boolean f;
    public int g;
    public int h;
    public int i;
    public VideoSink j;
    private final baom m;
    private final int n;
    private final bara o;
    private final baqi l = new baqa(this);
    public final Runnable k = new bapw(this, 3, null);

    public baqb(baog baogVar, Handler handler, bara baraVar) {
        if (handler.getLooper().getThread() == Thread.currentThread()) {
            this.a = handler;
            this.o = baraVar;
            baom d = baoe.d(baogVar, baom.d);
            this.m = d;
            try {
                d.c();
                d.f();
                int q = aynu.q(36197);
                this.n = q;
                SurfaceTexture surfaceTexture = new SurfaceTexture(q);
                this.b = surfaceTexture;
                surfaceTexture.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() { // from class: bapv
                    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
                    public final void onFrameAvailable(SurfaceTexture surfaceTexture2) {
                        baqb baqbVar = baqb.this;
                        if (baqbVar.d) {
                            Logging.a("SurfaceTextureHelper", "A frame is already pending, dropping frame.");
                        }
                        baqbVar.d = true;
                        baqbVar.b();
                    }
                }, handler);
                return;
            } catch (RuntimeException e) {
                this.m.g();
                handler.getLooper().quit();
                throw e;
            }
        }
        throw new IllegalStateException("SurfaceTextureHelper must be created on the handler thread");
    }

    public final void a() {
        if (this.a.getLooper().getThread() == Thread.currentThread()) {
            if (this.e || !this.f) {
                throw new IllegalStateException("Unexpected release.");
            }
            bara baraVar = this.o;
            baraVar.a.a();
            baraVar.c.c();
            baraVar.b.a();
            baraVar.d.a();
            baraVar.a.b();
            GLES20.glDeleteTextures(1, new int[]{this.n}, 0);
            this.b.release();
            this.m.g();
            this.a.getLooper().quit();
            return;
        }
        throw new IllegalStateException("Wrong thread.");
    }

    public final void b() {
        VideoSink videoSink;
        if (this.a.getLooper().getThread() == Thread.currentThread()) {
            if (this.f || !this.d || this.e || this.c == null) {
                return;
            }
            if (this.h == 0 || this.i == 0) {
                Logging.d("SurfaceTextureHelper", "Texture size has not been set.");
                return;
            }
            this.e = true;
            this.d = false;
            c();
            float[] fArr = new float[16];
            this.b.getTransformMatrix(fArr);
            long timestamp = this.b.getTimestamp();
            int i = this.h;
            int i2 = this.i;
            int i3 = this.n;
            float[] fArr2 = {fArr[0], fArr[4], fArr[12], fArr[1], fArr[5], fArr[13], fArr[3], fArr[7], fArr[15]};
            Matrix matrix = new Matrix();
            matrix.setValues(fArr2);
            VideoFrame videoFrame = new VideoFrame(new baqj(i, i2, i, i2, 1, i3, matrix, this.a, this.o, this.l), this.g, timestamp);
            VideoSink videoSink2 = this.c;
            synchronized (((axjj) videoSink2).a) {
                axio axioVar = axio.UNKNOWN;
                int i4 = ((axjj) videoSink2).e;
                int i5 = i4 - 1;
                if (i4 == 0) {
                    throw null;
                }
                if (i5 == 0) {
                    Logging.d("IMCVideoDecoder", "onFrame() called in READY state.");
                } else if (i5 == 1) {
                    VideoFrame.Buffer buffer = videoFrame.getBuffer();
                    axji axjiVar = ((axjj) videoSink2).b.f;
                    ((axjj) videoSink2).c = new VideoFrame(buffer, axjiVar.c, axjiVar.b);
                    videoFrame.getBuffer().retain();
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    ((axjj) videoSink2).e = 3;
                    axjl axjlVar = ((axjj) videoSink2).d;
                    int i6 = axjlVar.p;
                    if (i6 <= axjlVar.q) {
                        int i7 = axjlVar.j;
                        int i8 = axjlVar.k;
                        axjh axjhVar = ((axjj) videoSink2).b;
                        long j = axjhVar.d;
                        long j2 = elapsedRealtime - axjhVar.e;
                        videoSink = videoSink2;
                        long j3 = elapsedRealtime - axjhVar.f.a;
                        StringBuilder sb = new StringBuilder(156);
                        sb.append("Decoder frame rendered # ");
                        sb.append(i6);
                        sb.append(". ");
                        sb.append(i7);
                        sb.append(" x ");
                        sb.append(i8);
                        sb.append(". TS: ");
                        sb.append(j);
                        sb.append(". RenderTime: ");
                        sb.append(j2);
                        sb.append(". TotalTime: ");
                        sb.append(j3);
                        Logging.a("IMCVideoDecoder", sb.toString());
                    } else {
                        videoSink = videoSink2;
                    }
                    ((axjj) videoSink).a.notifyAll();
                    axjl axjlVar2 = ((axjj) videoSink).d;
                    if (axjlVar2.f) {
                        axjlVar2.e.post(new axjb(axjlVar2, 2));
                    }
                } else {
                    String str = i4 != 1 ? i4 != 2 ? "DONE" : "WAIT_FOR_TEXTURE_FRAME_AVAILABLE" : "READY";
                    StringBuilder sb2 = new StringBuilder(str.length() + 37);
                    sb2.append("Unexpected onFrame() called in state ");
                    sb2.append(str);
                    Logging.b("IMCVideoDecoder", sb2.toString());
                    throw new IllegalStateException("Already holding a texture.");
                }
            }
            videoFrame.release();
            return;
        }
        throw new IllegalStateException("Wrong thread.");
    }

    public final void c() {
        synchronized (baom.b) {
            this.b.updateTexImage();
        }
    }
}
