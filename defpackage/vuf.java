package defpackage;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vuf extends oyb implements oxp {
    public vty a;
    private long i;

    public vuf(oyr oyrVar) {
        super(oyrVar, oxv.a, (pbh) null, false, (Handler) null, (oya) null);
        this.i = 0L;
    }

    @Override // defpackage.oxp
    public final long a() {
        return this.i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.oyx
    public final oxp m() {
        return this;
    }

    @Override // defpackage.oyb
    protected final void n(MediaCodec mediaCodec, boolean z, MediaFormat mediaFormat, MediaCrypto mediaCrypto) {
        mediaCodec.configure(mediaFormat, (Surface) null, mediaCrypto, 0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.oyx
    public final void w() {
        this.a.a();
    }

    @Override // defpackage.oyb
    protected final boolean x(oxv oxvVar, com.google.android.exoplayer.MediaFormat mediaFormat) {
        String str = mediaFormat.b;
        return muf.R(str) && ("audio/x-unknown".equals(str) || oxvVar.a(str, false) != null);
    }

    @Override // defpackage.oyb
    protected final boolean y(long j, long j2, MediaCodec mediaCodec, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo, int i, boolean z) {
        this.i = bufferInfo.presentationTimeUs;
        if (this.a != null) {
            MediaFormat outputFormat = mediaCodec.getOutputFormat();
            int integer = outputFormat.getInteger("sample-rate");
            int integer2 = outputFormat.getInteger("channel-count");
            byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
            this.a.b(byteBuffer.asShortBuffer(), integer, integer2);
        }
        mediaCodec.releaseOutputBuffer(i, false);
        return true;
    }
}
