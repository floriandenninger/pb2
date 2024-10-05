package defpackage;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.media.PlaybackParams;
import android.os.Handler;
import android.os.SystemClock;
import android.view.Surface;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class oxt extends oyb implements oxp {
    public final afbe a;
    private final ozi i;
    private boolean j;
    private MediaFormat k;
    private int l;
    private int m;
    private long n;
    private boolean o;
    private boolean p;
    private long q;

    public oxt(oyr oyrVar, oxv oxvVar) {
        this(oyrVar, oxvVar, null, null, null);
    }

    public long a() {
        long d = this.i.d(h());
        if (d != Long.MIN_VALUE) {
            if (!this.o) {
                d = Math.max(this.n, d);
            }
            this.n = d;
            this.o = false;
        }
        return this.n;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.oyb, defpackage.oyx
    public final boolean h() {
        return this.g && !this.i.m();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.oyb, defpackage.oyx
    public boolean i() {
        return this.i.m() || super.i();
    }

    @Override // defpackage.oyx, defpackage.oxi
    public void k(int i, Object obj) {
        if (i == 1) {
            this.i.l(((Float) obj).floatValue());
            return;
        }
        if (i == 2) {
            this.i.k((PlaybackParams) obj);
            return;
        }
        if (i != 3) {
            return;
        }
        int intValue = ((Integer) obj).intValue();
        ozi oziVar = this.i;
        if (oziVar.b != intValue) {
            oziVar.b = intValue;
            oziVar.j();
            this.m = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.oyb
    public final oxf l(oxv oxvVar, String str, boolean z) {
        this.j = false;
        return super.l(oxvVar, str, z);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.oyx
    public oxp m() {
        return this;
    }

    @Override // defpackage.oyb
    protected final void n(MediaCodec mediaCodec, boolean z, MediaFormat mediaFormat, MediaCrypto mediaCrypto) {
        mediaFormat.getString("mime");
        mediaCodec.configure(mediaFormat, (Surface) null, mediaCrypto, 0);
        this.k = null;
    }

    protected void o() {
    }

    protected void p(int i) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.oyb, defpackage.oys, defpackage.oyx
    public void q() {
        this.m = 0;
        try {
            this.i.j();
        } finally {
            super.q();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.oyb, defpackage.oys
    public void r(long j) {
        super.r(j);
        this.i.j();
        this.n = j;
        this.o = true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.oyb
    public final void s(oyn oynVar) {
        super.s(oynVar);
        this.l = "audio/raw".equals(oynVar.a.b) ? oynVar.a.s : 2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.oyb
    public void t(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        MediaFormat mediaFormat2 = this.k;
        String string = mediaFormat2 != null ? mediaFormat2.getString("mime") : "audio/raw";
        if (mediaFormat2 != null) {
            mediaFormat = this.k;
        }
        this.i.e(string, mediaFormat.getInteger("channel-count"), mediaFormat.getInteger("sample-rate"), this.l, 0);
    }

    @Override // defpackage.oyb
    protected final void u() {
        this.i.g();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.oyb, defpackage.oyx
    public void v() {
        this.i.i();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.oyx
    public final void w() {
        this.i.h();
    }

    @Override // defpackage.oyb
    protected final boolean x(oxv oxvVar, com.google.android.exoplayer.MediaFormat mediaFormat) {
        String str = mediaFormat.b;
        return muf.R(str) && ("audio/x-unknown".equals(str) || oxvVar.a(str, false) != null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.oyb
    public boolean y(long j, long j2, MediaCodec mediaCodec, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo, int i, boolean z) {
        if (z) {
            mediaCodec.releaseOutputBuffer(i, false);
            this.b.g++;
            this.i.f();
            return true;
        }
        if (!this.i.n()) {
            try {
                int i2 = this.m;
                if (i2 != 0) {
                    this.i.c(i2);
                } else {
                    int b = this.i.b();
                    this.m = b;
                    p(b);
                }
                this.p = false;
                if (this.h == 3) {
                    this.i.i();
                }
            } catch (ozg e) {
                Handler handler = this.d;
                if (handler != null && this.a != null) {
                    handler.post(new oxq(this, e));
                }
                throw new oxh(e);
            }
        } else {
            boolean z2 = this.p;
            boolean m = this.i.m();
            this.p = m;
            if (z2 && !m && this.h == 3) {
                long elapsedRealtime = SystemClock.elapsedRealtime() - this.q;
                long j3 = this.i.d;
                long j4 = j3 != -1 ? j3 / 1000 : -1L;
                Handler handler2 = this.d;
                if (handler2 != null && this.a != null) {
                    handler2.post(new oxs(this, j4, elapsedRealtime));
                }
            }
        }
        try {
            int a = this.i.a(byteBuffer, bufferInfo.offset, bufferInfo.size, bufferInfo.presentationTimeUs);
            this.q = SystemClock.elapsedRealtime();
            if ((a & 1) != 0) {
                o();
                this.o = true;
            }
            if ((a & 2) == 0) {
                return false;
            }
            mediaCodec.releaseOutputBuffer(i, false);
            this.b.f++;
            return true;
        } catch (ozh e2) {
            Handler handler3 = this.d;
            if (handler3 != null && this.a != null) {
                handler3.post(new oxr(this, e2));
            }
            throw new oxh(e2);
        }
    }

    public oxt(oyr oyrVar, oxv oxvVar, pbh pbhVar, Handler handler, afbe afbeVar) {
        super(new oyr[]{oyrVar}, oxvVar, pbhVar, true, handler, (oya) afbeVar);
        this.a = afbeVar;
        this.m = 0;
        this.i = new ozi(null);
    }
}
