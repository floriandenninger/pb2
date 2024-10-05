package androidx.media3.decoder.av1;

import android.view.Surface;
import androidx.media3.decoder.av1.Gav1Decoder;
import androidx.media3.exoplayer.video.VideoDecoderOutputBuffer;
import defpackage.asu;
import defpackage.asw;
import defpackage.asx;
import defpackage.asy;
import defpackage.ata;
import defpackage.aua;
import defpackage.aub;
import defpackage.bgu;
import defpackage.pts;
import java.nio.ByteBuffer;
import org.chromium.net.CellularSignalStrengthError;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class Gav1Decoder extends ata {
    public final long a;
    public volatile int b;

    public Gav1Decoder(int i) {
        super(new bgu[4], new VideoDecoderOutputBuffer[4]);
        if (!aub.a()) {
            throw new aua("Failed to load decoder native library.");
        }
        int gav1GetThreads = gav1GetThreads();
        long gav1Init = gav1Init(gav1GetThreads <= 0 ? Runtime.getRuntime().availableProcessors() : gav1GetThreads);
        this.a = gav1Init;
        if (gav1Init == 0 || gav1CheckError(gav1Init) == 0) {
            String valueOf = String.valueOf(gav1GetErrorMessage(gav1Init));
            throw new aua(valueOf.length() != 0 ? "Failed to initialize decoder. Error: ".concat(valueOf) : new String("Failed to initialize decoder. Error: "));
        }
        o(i);
    }

    private native int gav1CheckError(long j);

    private native void gav1Close(long j);

    private native int gav1Decode(long j, ByteBuffer byteBuffer, int i);

    private native int gav1GetFrame(long j, VideoDecoderOutputBuffer videoDecoderOutputBuffer, boolean z);

    private native int gav1GetThreads();

    private native long gav1Init(int i);

    private native void gav1ReleaseFrame(long j, VideoDecoderOutputBuffer videoDecoderOutputBuffer);

    @Override // defpackage.ast
    public final String c() {
        return "libgav1";
    }

    @Override // defpackage.ata, defpackage.ast
    public final void f() {
        super.f();
        gav1Close(this.a);
    }

    @Override // defpackage.ata
    protected final /* bridge */ /* synthetic */ asu g(Throwable th) {
        return new aua(th);
    }

    public native String gav1GetErrorMessage(long j);

    public native int gav1RenderFrame(long j, Surface surface, VideoDecoderOutputBuffer videoDecoderOutputBuffer);

    @Override // defpackage.ata
    protected final /* bridge */ /* synthetic */ asu h(asw aswVar, asy asyVar, boolean z) {
        bgu bguVar = (bgu) aswVar;
        VideoDecoderOutputBuffer videoDecoderOutputBuffer = (VideoDecoderOutputBuffer) asyVar;
        ByteBuffer byteBuffer = bguVar.b;
        int i = pts.a;
        aua auaVar = null;
        if (gav1Decode(this.a, byteBuffer, byteBuffer.limit()) == 0) {
            String valueOf = String.valueOf(gav1GetErrorMessage(this.a));
            auaVar = new aua(valueOf.length() != 0 ? "gav1Decode error: ".concat(valueOf) : new String("gav1Decode error: "));
        } else {
            boolean isDecodeOnly = bguVar.isDecodeOnly();
            if (!isDecodeOnly) {
                videoDecoderOutputBuffer.init(bguVar.d, this.b, null);
            }
            int gav1GetFrame = gav1GetFrame(this.a, videoDecoderOutputBuffer, isDecodeOnly);
            if (gav1GetFrame == 0) {
                String valueOf2 = String.valueOf(gav1GetErrorMessage(this.a));
                auaVar = new aua(valueOf2.length() != 0 ? "gav1GetFrame error: ".concat(valueOf2) : new String("gav1GetFrame error: "));
            } else {
                if (gav1GetFrame == 2) {
                    videoDecoderOutputBuffer.addFlag(CellularSignalStrengthError.ERROR_NOT_SUPPORTED);
                }
                if (!isDecodeOnly) {
                    videoDecoderOutputBuffer.format = bguVar.f;
                    return null;
                }
            }
        }
        return auaVar;
    }

    @Override // defpackage.ata
    protected final /* bridge */ /* synthetic */ asw i() {
        return new bgu();
    }

    @Override // defpackage.ata
    protected final /* bridge */ /* synthetic */ asy k() {
        return new VideoDecoderOutputBuffer(new asx() { // from class: atz
            @Override // defpackage.asx
            public final void a(asy asyVar) {
                Gav1Decoder.this.q((VideoDecoderOutputBuffer) asyVar);
            }
        });
    }

    public final void q(VideoDecoderOutputBuffer videoDecoderOutputBuffer) {
        if (videoDecoderOutputBuffer.mode == 1 && !videoDecoderOutputBuffer.isDecodeOnly()) {
            gav1ReleaseFrame(this.a, videoDecoderOutputBuffer);
        }
        super.n(videoDecoderOutputBuffer);
    }
}
