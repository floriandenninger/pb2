package defpackage;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayDeque;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azs extends MediaCodec.Callback {
    public final HandlerThread b;
    public Handler c;
    public MediaFormat h;
    public long i;
    public boolean j;
    private MediaFormat k;
    private MediaCodec.CodecException l;
    private IllegalStateException m;
    public final Object a = new Object();
    public final azv d = new azv();
    public final azv e = new azv();
    public final ArrayDeque f = new ArrayDeque();
    public final ArrayDeque g = new ArrayDeque();

    public azs(HandlerThread handlerThread) {
        this.b = handlerThread;
    }

    private final void e(MediaFormat mediaFormat) {
        this.e.b(-2);
        this.g.add(mediaFormat);
    }

    public final void a() {
        if (!this.g.isEmpty()) {
            this.k = (MediaFormat) this.g.getLast();
        }
        this.d.c();
        this.e.c();
        this.f.clear();
        this.g.clear();
        this.l = null;
    }

    public final void b() {
        IllegalStateException illegalStateException = this.m;
        if (illegalStateException != null) {
            this.m = null;
            throw illegalStateException;
        }
        MediaCodec.CodecException codecException = this.l;
        if (codecException == null) {
            return;
        }
        this.l = null;
        throw codecException;
    }

    public final void c(IllegalStateException illegalStateException) {
        synchronized (this.a) {
            this.m = illegalStateException;
        }
    }

    public final boolean d() {
        return this.i > 0 || this.j;
    }

    @Override // android.media.MediaCodec.Callback
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.a) {
            this.l = codecException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i) {
        synchronized (this.a) {
            this.d.b(i);
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i, MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.a) {
            MediaFormat mediaFormat = this.k;
            if (mediaFormat != null) {
                e(mediaFormat);
                this.k = null;
            }
            this.e.b(i);
            this.f.add(bufferInfo);
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.a) {
            e(mediaFormat);
            this.k = null;
        }
    }
}
