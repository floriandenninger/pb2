package defpackage;

import androidx.media3.exoplayer.video.VideoDecoderOutputBuffer;
import com.google.android.exoplayer.youtube.libvpx.VpxOutputBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahlq {
    public static final hy a = new ia(4);
    public VpxOutputBuffer b;
    public VideoDecoderOutputBuffer c;
    public ahlp d;

    public final int a() {
        VpxOutputBuffer vpxOutputBuffer = this.b;
        return vpxOutputBuffer != null ? vpxOutputBuffer.height : this.c.height;
    }

    public final void b() {
        VpxOutputBuffer vpxOutputBuffer = this.b;
        if (vpxOutputBuffer != null) {
            vpxOutputBuffer.release();
        } else {
            this.c.release();
        }
        a.b(this);
    }

    public final int[] c() {
        VpxOutputBuffer vpxOutputBuffer = this.b;
        return vpxOutputBuffer != null ? vpxOutputBuffer.yuvStrides : this.c.yuvStrides;
    }
}
