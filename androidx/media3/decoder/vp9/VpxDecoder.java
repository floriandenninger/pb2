package androidx.media3.decoder.vp9;

import android.view.Surface;
import androidx.media3.common.decoder.CryptoConfig;
import androidx.media3.decoder.vp9.VpxDecoder;
import androidx.media3.exoplayer.video.VideoDecoderOutputBuffer;
import defpackage.asq;
import defpackage.ass;
import defpackage.asu;
import defpackage.asw;
import defpackage.asx;
import defpackage.asy;
import defpackage.ata;
import defpackage.aui;
import defpackage.bgu;
import defpackage.pse;
import defpackage.pts;
import java.nio.ByteBuffer;
import org.chromium.net.CellularSignalStrengthError;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class VpxDecoder extends ata {
    public final long a;
    public volatile int b;
    private final CryptoConfig c;
    private ByteBuffer d;

    public VpxDecoder(int i, int i2, int i3, CryptoConfig cryptoConfig, int i4) {
        super(new bgu[i], new VideoDecoderOutputBuffer[i2]);
        if (VpxLibrary.a()) {
            this.c = cryptoConfig;
            if (cryptoConfig == null || VpxLibrary.vpxIsSecureDecodeSupported()) {
                long vpxInit = vpxInit(false, false, i4);
                this.a = vpxInit;
                if (vpxInit == 0) {
                    throw new aui("Failed to initialize decoder");
                }
                o(i3);
                return;
            }
            throw new aui("Vpx decoder does not support secure decode.");
        }
        throw new aui("Failed to load decoder native libraries.");
    }

    private native long vpxClose(long j);

    private native long vpxDecode(long j, ByteBuffer byteBuffer, int i);

    private native int vpxGetErrorCode(long j);

    private native String vpxGetErrorMessage(long j);

    private native int vpxGetFrame(long j, VideoDecoderOutputBuffer videoDecoderOutputBuffer);

    private native long vpxInit(boolean z, boolean z2, int i);

    private native int vpxReleaseFrame(long j, VideoDecoderOutputBuffer videoDecoderOutputBuffer);

    private native long vpxSecureDecode(long j, ByteBuffer byteBuffer, int i, CryptoConfig cryptoConfig, int i2, byte[] bArr, byte[] bArr2, int i3, int[] iArr, int[] iArr2);

    @Override // defpackage.ast
    public final String c() {
        String valueOf = String.valueOf(VpxLibrary.a() ? VpxLibrary.vpxGetVersion() : null);
        return valueOf.length() != 0 ? "libvpx".concat(valueOf) : new String("libvpx");
    }

    @Override // defpackage.ata, defpackage.ast
    public final void f() {
        super.f();
        this.d = null;
        vpxClose(this.a);
    }

    @Override // defpackage.ata
    protected final /* bridge */ /* synthetic */ asu g(Throwable th) {
        return new aui("Unexpected decode error", th);
    }

    @Override // defpackage.ata
    protected final /* bridge */ /* synthetic */ asu h(asw aswVar, asy asyVar, boolean z) {
        long vpxDecode;
        ByteBuffer byteBuffer;
        bgu bguVar = (bgu) aswVar;
        VideoDecoderOutputBuffer videoDecoderOutputBuffer = (VideoDecoderOutputBuffer) asyVar;
        if (z && (byteBuffer = this.d) != null) {
        }
        ByteBuffer byteBuffer2 = bguVar.b;
        int i = pts.a;
        int limit = byteBuffer2.limit();
        ass assVar = bguVar.a;
        if (bguVar.d()) {
            vpxDecode = vpxSecureDecode(this.a, byteBuffer2, limit, this.c, assVar.c, (byte[]) pse.c(assVar.b), (byte[]) pse.c(assVar.a), assVar.f, assVar.d, assVar.e);
        } else {
            vpxDecode = vpxDecode(this.a, byteBuffer2, limit);
        }
        if (vpxDecode != 0) {
            if (vpxDecode == -2) {
                String valueOf = String.valueOf(vpxGetErrorMessage(this.a));
                String concat = valueOf.length() != 0 ? "Drm error: ".concat(valueOf) : new String("Drm error: ");
                vpxGetErrorCode(this.a);
                return new aui(concat, new asq(concat));
            }
            String valueOf2 = String.valueOf(vpxGetErrorMessage(this.a));
            return new aui(valueOf2.length() != 0 ? "Decode error: ".concat(valueOf2) : new String("Decode error: "));
        }
        if (bguVar.hasSupplementalData()) {
            ByteBuffer byteBuffer3 = bguVar.e;
            pse.c(byteBuffer3);
            int remaining = byteBuffer3.remaining();
            if (remaining > 0) {
                ByteBuffer byteBuffer4 = this.d;
                if (byteBuffer4 == null || byteBuffer4.capacity() < remaining) {
                    this.d = ByteBuffer.allocate(remaining);
                }
                this.d.put(byteBuffer3);
            }
        }
        if (bguVar.isDecodeOnly()) {
            return null;
        }
        videoDecoderOutputBuffer.init(bguVar.d, this.b, this.d);
        int vpxGetFrame = vpxGetFrame(this.a, videoDecoderOutputBuffer);
        if (vpxGetFrame == 1) {
            videoDecoderOutputBuffer.addFlag(CellularSignalStrengthError.ERROR_NOT_SUPPORTED);
        } else if (vpxGetFrame == -1) {
            return new aui("Buffer initialization failed.");
        }
        videoDecoderOutputBuffer.format = bguVar.f;
        return null;
    }

    @Override // defpackage.ata
    protected final /* bridge */ /* synthetic */ asw i() {
        return new bgu();
    }

    @Override // defpackage.ata
    protected final /* bridge */ /* synthetic */ asy k() {
        return new VideoDecoderOutputBuffer(new asx() { // from class: auh
            @Override // defpackage.asx
            public final void a(asy asyVar) {
                VpxDecoder.this.q((VideoDecoderOutputBuffer) asyVar);
            }
        });
    }

    public final void q(VideoDecoderOutputBuffer videoDecoderOutputBuffer) {
        if (this.b == 1 && !videoDecoderOutputBuffer.isDecodeOnly()) {
            vpxReleaseFrame(this.a, videoDecoderOutputBuffer);
        }
        super.n(videoDecoderOutputBuffer);
    }

    public native int vpxRenderFrame(long j, Surface surface, VideoDecoderOutputBuffer videoDecoderOutputBuffer);
}
