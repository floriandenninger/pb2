package defpackage;

import android.os.Handler;
import android.view.Surface;
import androidx.media3.common.decoder.CryptoConfig;
import androidx.media3.decoder.av1.Gav1Decoder;
import androidx.media3.exoplayer.video.VideoDecoderOutputBuffer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class auc extends bgo {
    private static final int b = ((pts.b(1280, 64) * pts.b(720, 64)) * 6144) / 2;
    private Gav1Decoder c;

    public auc(long j, Handler handler, bhn bhnVar, int i) {
        super(j, handler, bhnVar, i);
    }

    @Override // defpackage.pof
    public final int a(pms pmsVar) {
        if ("video/av01".equalsIgnoreCase(pmsVar.n) && aub.a()) {
            return pmsVar.G != 0 ? 2 : 20;
        }
        return 0;
    }

    @Override // defpackage.bgo
    protected final /* bridge */ /* synthetic */ ast b(pms pmsVar, CryptoConfig cryptoConfig) {
        int i = pts.a;
        int i2 = pmsVar.o;
        if (i2 == -1) {
            i2 = b;
        }
        Gav1Decoder gav1Decoder = new Gav1Decoder(i2);
        this.c = gav1Decoder;
        return gav1Decoder;
    }

    @Override // defpackage.bgo
    protected final auk c(String str, pms pmsVar, pms pmsVar2) {
        return new auk(str, pmsVar, pmsVar2, 3, 0);
    }

    @Override // defpackage.poe, defpackage.pof
    public final String d() {
        return "Libgav1VideoRenderer";
    }

    @Override // defpackage.bgo
    protected final void e(VideoDecoderOutputBuffer videoDecoderOutputBuffer, Surface surface) {
        Gav1Decoder gav1Decoder = this.c;
        if (gav1Decoder == null) {
            throw new aua("Failed to render output buffer to surface: decoder is not initialized.");
        }
        if (videoDecoderOutputBuffer.mode != 1) {
            throw new aua("Invalid output mode.");
        }
        if (gav1Decoder.gav1RenderFrame(gav1Decoder.a, surface, videoDecoderOutputBuffer) != 0) {
            videoDecoderOutputBuffer.release();
        } else {
            String valueOf = String.valueOf(gav1Decoder.gav1GetErrorMessage(gav1Decoder.a));
            throw new aua(valueOf.length() != 0 ? "Buffer render error: ".concat(valueOf) : new String("Buffer render error: "));
        }
    }

    @Override // defpackage.bgo
    protected final void f(int i) {
        Gav1Decoder gav1Decoder = this.c;
        if (gav1Decoder != null) {
            gav1Decoder.b = i;
        }
    }
}
