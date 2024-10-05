package defpackage;

import android.graphics.Matrix;
import android.os.Handler;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import org.webrtc.Logging;
import org.webrtc.VideoFrame;
import org.webrtc.VideoSink;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class baov implements VideoSink {
    protected final String a;
    public final Object b;
    public Handler c;
    public final ArrayList d;
    public volatile baor e;
    public final Object f;
    public baom g;
    public final baqt h;
    public bapq i;
    public final Matrix j;
    public final Object k;
    public VideoFrame l;
    public final Object m;
    public float n;
    public final Object o;
    public int p;
    public int q;
    public int r;
    public long s;
    public long t;
    public long u;
    public final bapa v;
    public final Runnable w;
    public final baoq x;

    public baov(String str) {
        baqt baqtVar = new baqt();
        this.b = new Object();
        this.d = new ArrayList();
        this.f = new Object();
        this.j = new Matrix();
        this.k = new Object();
        this.m = new Object();
        this.o = new Object();
        this.v = new bapa(6408);
        this.w = new baop(this, 0);
        this.x = new baoq(this);
        this.a = str;
        this.h = baqtVar;
    }

    public static final String c(long j, int i) {
        if (i <= 0) {
            return "NA";
        }
        long micros = TimeUnit.NANOSECONDS.toMicros(j / i);
        StringBuilder sb = new StringBuilder(23);
        sb.append(micros);
        sb.append(" us");
        return sb.toString();
    }

    public final void a(long j) {
        synchronized (this.o) {
            this.s = j;
            this.p = 0;
            this.q = 0;
            this.r = 0;
            this.t = 0L;
            this.u = 0L;
        }
    }

    public final void b(String str) {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(str);
        Logging.a("EglRenderer", valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf));
    }

    @Override // org.webrtc.VideoSink
    public void onFrame(VideoFrame videoFrame) {
        int i;
        VideoFrame videoFrame2;
        synchronized (this.o) {
            i = 1;
            this.p++;
        }
        synchronized (this.b) {
            if (this.c == null) {
                b("Dropping frame - Not initialized or already released.");
                return;
            }
            synchronized (this.k) {
                videoFrame2 = this.l;
                if (videoFrame2 != null) {
                    videoFrame2.release();
                }
                this.l = videoFrame;
                videoFrame.retain();
                this.c.post(new baop(this, i, null));
            }
            if (videoFrame2 != null) {
                synchronized (this.o) {
                    this.q++;
                }
            }
        }
    }
}
