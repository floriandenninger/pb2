package defpackage;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vwa {
    private final MediaMuxer a;

    public vwa(String str) {
        this.a = new MediaMuxer(str, 0);
    }

    public final int a(MediaFormat mediaFormat) {
        return this.a.addTrack(mediaFormat);
    }

    public final void b() {
        this.a.release();
    }

    public final void c(int i) {
        this.a.setOrientationHint(i);
    }

    public final void d() {
        this.a.start();
    }

    public final void e() {
        this.a.stop();
    }

    public final void f(int i, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        this.a.writeSampleData(i, byteBuffer, bufferInfo);
    }
}
