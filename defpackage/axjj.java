package defpackage;

import android.os.SystemClock;
import org.webrtc.Logging;
import org.webrtc.VideoFrame;
import org.webrtc.VideoSink;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axjj implements VideoSink {
    public axjh b;
    public VideoFrame c;
    public final /* synthetic */ axjl d;
    private final baqb f;
    public final Object a = new Object();
    public int e = 1;

    public axjj(axjl axjlVar, baqb baqbVar) {
        this.d = axjlVar;
        this.f = baqbVar;
    }

    public final void a() {
        synchronized (this.a) {
            if (this.e == 3) {
                this.c.release();
                this.c = null;
            }
            this.e = 1;
        }
    }

    public final boolean b() {
        this.d.i();
        synchronized (this.a) {
            if (this.e == 1 && this.d.h.size() != 0) {
                axjh axjhVar = (axjh) this.d.h.remove();
                this.b = axjhVar;
                this.e = 2;
                final baqb baqbVar = this.f;
                final int i = axjhVar.a;
                final int i2 = axjhVar.b;
                if (i <= 0) {
                    StringBuilder sb = new StringBuilder(51);
                    sb.append("Texture width must be positive, but was ");
                    sb.append(i);
                    throw new IllegalArgumentException(sb.toString());
                }
                if (i2 <= 0) {
                    StringBuilder sb2 = new StringBuilder(52);
                    sb2.append("Texture height must be positive, but was ");
                    sb2.append(i2);
                    throw new IllegalArgumentException(sb2.toString());
                }
                baqbVar.b.setDefaultBufferSize(i, i2);
                baqbVar.a.post(new Runnable() { // from class: bapy
                    @Override // java.lang.Runnable
                    public final void run() {
                        baqb baqbVar2 = baqb.this;
                        int i3 = i;
                        int i4 = i2;
                        baqbVar2.h = i3;
                        baqbVar2.i = i4;
                        baqbVar2.b();
                    }
                });
                final baqb baqbVar2 = this.f;
                final int i3 = this.b.f.c;
                baqbVar2.a.post(new Runnable() { // from class: bapx
                    @Override // java.lang.Runnable
                    public final void run() {
                        baqb.this.g = i3;
                    }
                });
                return this.d.n(this.b.c, true);
            }
            return false;
        }
    }

    @Override // org.webrtc.VideoSink
    public final void onFrame(VideoFrame videoFrame) {
        synchronized (this.a) {
            axio axioVar = axio.UNKNOWN;
            int i = this.e;
            int i2 = i - 1;
            if (i == 0) {
                throw null;
            }
            if (i2 == 0) {
                Logging.d("IMCVideoDecoder", "onFrame() called in READY state.");
            } else if (i2 == 1) {
                VideoFrame.Buffer buffer = videoFrame.getBuffer();
                axji axjiVar = this.b.f;
                this.c = new VideoFrame(buffer, axjiVar.c, axjiVar.b);
                videoFrame.getBuffer().retain();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                this.e = 3;
                axjl axjlVar = this.d;
                int i3 = axjlVar.p;
                if (i3 <= axjlVar.q) {
                    int i4 = axjlVar.j;
                    int i5 = axjlVar.k;
                    axjh axjhVar = this.b;
                    long j = axjhVar.d;
                    long j2 = elapsedRealtime - axjhVar.e;
                    long j3 = elapsedRealtime - axjhVar.f.a;
                    StringBuilder sb = new StringBuilder(156);
                    sb.append("Decoder frame rendered # ");
                    sb.append(i3);
                    sb.append(". ");
                    sb.append(i4);
                    sb.append(" x ");
                    sb.append(i5);
                    sb.append(". TS: ");
                    sb.append(j);
                    sb.append(". RenderTime: ");
                    sb.append(j2);
                    sb.append(". TotalTime: ");
                    sb.append(j3);
                    Logging.a("IMCVideoDecoder", sb.toString());
                }
                this.a.notifyAll();
                axjl axjlVar2 = this.d;
                if (axjlVar2.f) {
                    axjlVar2.e.post(new axjb(axjlVar2, 2));
                }
            } else {
                String str = i != 1 ? i != 2 ? "DONE" : "WAIT_FOR_TEXTURE_FRAME_AVAILABLE" : "READY";
                StringBuilder sb2 = new StringBuilder(str.length() + 37);
                sb2.append("Unexpected onFrame() called in state ");
                sb2.append(str);
                Logging.b("IMCVideoDecoder", sb2.toString());
                throw new IllegalStateException("Already holding a texture.");
            }
        }
    }
}
