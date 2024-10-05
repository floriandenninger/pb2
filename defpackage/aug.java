package defpackage;

import android.os.Handler;
import android.view.Surface;
import androidx.media3.common.decoder.CryptoConfig;
import androidx.media3.decoder.vp9.VpxDecoder;
import androidx.media3.decoder.vp9.VpxLibrary;
import androidx.media3.exoplayer.video.VideoDecoderOutputBuffer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class aug extends bgo {
    private final int b;
    private final int c;
    private final int d;
    private VpxDecoder e;

    public aug(long j, Handler handler, bhn bhnVar, int i) {
        this(j, handler, bhnVar, i, Runtime.getRuntime().availableProcessors(), 4, 4);
    }

    @Override // defpackage.pof
    public final int a(pms pmsVar) {
        if (VpxLibrary.a() && "video/x-vnd.on2.vp9".equalsIgnoreCase(pmsVar.n)) {
            return !VpxLibrary.b(pmsVar.G) ? 2 : 20;
        }
        return 0;
    }

    @Override // defpackage.bgo
    protected final /* bridge */ /* synthetic */ ast b(pms pmsVar, CryptoConfig cryptoConfig) {
        int i = pts.a;
        int i2 = pmsVar.o;
        VpxDecoder vpxDecoder = new VpxDecoder(this.b, this.c, i2 == -1 ? 786432 : i2, cryptoConfig, this.d);
        this.e = vpxDecoder;
        return vpxDecoder;
    }

    @Override // defpackage.bgo
    protected final auk c(String str, pms pmsVar, pms pmsVar2) {
        return new auk(str, pmsVar, pmsVar2, 3, 0);
    }

    @Override // defpackage.poe, defpackage.pof
    public final String d() {
        return "LibvpxVideoRenderer";
    }

    @Override // defpackage.bgo
    protected final void e(VideoDecoderOutputBuffer videoDecoderOutputBuffer, Surface surface) {
        VpxDecoder vpxDecoder = this.e;
        if (vpxDecoder == null) {
            throw new aui("Failed to render output buffer to surface: decoder is not initialized.");
        }
        if (vpxDecoder.vpxRenderFrame(vpxDecoder.a, surface, videoDecoderOutputBuffer) != -1) {
            videoDecoderOutputBuffer.release();
            return;
        }
        throw new aui("Buffer render failed.");
    }

    @Override // defpackage.bgo
    protected final void f(int i) {
        VpxDecoder vpxDecoder = this.e;
        if (vpxDecoder != null) {
            vpxDecoder.b = i;
        }
    }

    public aug(long j, Handler handler, bhn bhnVar, int i, int i2, int i3, int i4) {
        super(j, handler, bhnVar, i);
        this.d = i2;
        this.b = i3;
        this.c = i4;
    }
}
