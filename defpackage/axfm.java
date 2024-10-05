package defpackage;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.media.PlaybackParams;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axfm extends oyb implements oxp {
    private final axfl a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public axfm(oyr oyrVar, Handler handler, afbe afbeVar, axfg axfgVar) {
        super(oyrVar, oxv.a, (pbh) null, true, handler, (oya) afbeVar);
        opn.h(axfgVar);
        axez axezVar = new axez(axfgVar);
        this.a = new axfl(handler, afbeVar, axezVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.oyb, defpackage.oys
    public final void A(long j, long j2, boolean z) {
        super.A(j, j2, z);
        this.a.k();
        if (h()) {
            this.a.c();
        }
    }

    @Override // defpackage.oxp
    public final long a() {
        return this.a.a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.oyb, defpackage.oyx
    public final boolean h() {
        return this.g && !this.a.h();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.oyb, defpackage.oyx
    public final boolean i() {
        return this.a.h();
    }

    @Override // defpackage.oyx, defpackage.oxi
    public final void k(int i, Object obj) {
        axfl axflVar = this.a;
        if (i == 1) {
            axflVar.g(((Float) obj).floatValue());
        } else {
            if (i != 2) {
                return;
            }
            axflVar.a.k((PlaybackParams) obj);
        }
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
    @Override // defpackage.oyb, defpackage.oys, defpackage.oyx
    public final void q() {
        try {
            this.a.f();
        } finally {
            super.q();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.oyb, defpackage.oys
    public final void r(long j) {
        super.r(j);
        this.a.b(j);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.oyb
    public final void s(oyn oynVar) {
        super.s(oynVar);
        this.a.i(oynVar.a);
    }

    @Override // defpackage.oyb
    protected final void t(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        this.a.j(mediaFormat.getInteger("sample-rate"), mediaFormat.getInteger("channel-count"));
    }

    @Override // defpackage.oyb, defpackage.oyx
    protected final void v() {
        this.a.e();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.oyx
    public final void w() {
        this.a.d();
    }

    @Override // defpackage.oyb
    protected final boolean x(oxv oxvVar, com.google.android.exoplayer.MediaFormat mediaFormat) {
        String str = mediaFormat.b;
        return muf.R(str) && ("audio/x-unknown".equals(str) || oxvVar.a(str, false) != null);
    }

    @Override // defpackage.oyb
    protected final boolean y(long j, long j2, MediaCodec mediaCodec, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo, int i, boolean z) {
        if (z) {
            this.b.g++;
        }
        boolean l = this.a.l(byteBuffer, bufferInfo.offset, bufferInfo.size, z);
        if (l) {
            mediaCodec.releaseOutputBuffer(i, false);
            if (!z) {
                this.b.f++;
                return true;
            }
        }
        return l;
    }
}
