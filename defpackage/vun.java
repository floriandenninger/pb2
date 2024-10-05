package defpackage;

import android.media.MediaCodec;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vun {
    private final MediaCodec a;
    private final int b;

    public vun(MediaCodec mediaCodec, int i) {
        this.a = mediaCodec;
        this.b = i;
    }

    public static vun a(MediaCodec mediaCodec) {
        int dequeueInputBuffer = mediaCodec.dequeueInputBuffer(1000000L);
        if (dequeueInputBuffer >= 0) {
            return new vun(mediaCodec, dequeueInputBuffer);
        }
        return null;
    }

    public final boolean b(ByteBuffer byteBuffer, long j, int i) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        ByteBuffer byteBuffer2 = this.a.getInputBuffers()[this.b];
        this.a.queueInputBuffer(this.b, 0, byteBuffer2.remaining(), j, i);
        return byteBuffer.hasRemaining();
    }
}
