package defpackage;

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.os.Handler;
import android.os.SystemClock;
import android.view.Surface;
import com.google.android.exoplayer.MediaFormat;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class oym extends oyb {
    private float A;
    public final oyl a;
    private final oza i;
    private final long j;
    private final int k;
    private Surface l;
    private boolean m;
    private boolean n;
    private long o;
    private int p;
    private int q;
    private int r;
    private float s;
    private int t;
    private int u;
    private int v;
    private float w;
    private int x;
    private int y;
    private int z;

    public oym(Context context, oyr oyrVar, oxv oxvVar, long j, pbh pbhVar, boolean z, Handler handler, oyl oylVar, int i) {
        super(oyrVar, oxvVar, pbhVar, z, handler, oylVar);
        this.i = new oza(context.getApplicationContext());
        this.j = 1000 * j;
        this.a = oylVar;
        this.k = i;
        this.o = -1L;
        this.t = -1;
        this.u = -1;
        this.w = -1.0f;
        this.s = -1.0f;
        this.x = -1;
        this.y = -1;
        this.A = -1.0f;
    }

    private final void N() {
        Handler handler = this.d;
        if (handler == null || this.a == null || this.m) {
            return;
        }
        handler.post(new oyj(this, this.l));
        this.m = true;
    }

    private final void O() {
        if (this.d == null || this.a == null || this.p == 0) {
            return;
        }
        SystemClock.elapsedRealtime();
        this.d.post(new oyk(this));
        this.p = 0;
    }

    private final void P() {
        Handler handler = this.d;
        if (handler == null || this.a == null) {
            return;
        }
        int i = this.x;
        int i2 = this.t;
        if (i == i2 && this.y == this.u && this.z == this.v && this.A == this.w) {
            return;
        }
        int i3 = this.u;
        int i4 = this.v;
        float f = this.w;
        handler.post(new oyi(this, i2, i3));
        this.x = i2;
        this.y = i3;
        this.z = i4;
        this.A = f;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.oyb
    public boolean D(MediaCodec mediaCodec, boolean z, MediaFormat mediaFormat, MediaFormat mediaFormat2) {
        if (mediaFormat2.b.equals(mediaFormat.b)) {
            if (z) {
                return true;
            }
            if (mediaFormat.h == mediaFormat2.h && mediaFormat.i == mediaFormat2.i) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.oyb
    public boolean F() {
        Surface surface;
        return super.F() && (surface = this.l) != null && surface.isValid();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void G(MediaCodec mediaCodec, int i) {
        P();
        int i2 = pgz.a;
        mediaCodec.releaseOutputBuffer(i, true);
        this.b.f++;
        this.n = true;
        N();
    }

    protected final void H(MediaCodec mediaCodec, int i, long j) {
        P();
        int i2 = pgz.a;
        mediaCodec.releaseOutputBuffer(i, j);
        this.b.f++;
        this.n = true;
        N();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean I(long j, long j2) {
        return j < -30000;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.oyb, defpackage.oyx
    public boolean i() {
        if (super.i() && (this.n || ((oyb) this).e == null || ((oyb) this).f == 2)) {
            this.o = -1L;
            return true;
        }
        if (this.o == -1) {
            return false;
        }
        if (SystemClock.elapsedRealtime() * 1000 < this.o) {
            return true;
        }
        this.o = -1L;
        return false;
    }

    @Override // defpackage.oyx, defpackage.oxi
    public void k(int i, Object obj) {
        Surface surface;
        if (i != 1 || this.l == (surface = (Surface) obj)) {
            return;
        }
        this.l = surface;
        this.m = false;
        int i2 = this.h;
        if (i2 == 2 || i2 == 3) {
            C();
            B();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.oyb
    public void n(MediaCodec mediaCodec, boolean z, android.media.MediaFormat mediaFormat, MediaCrypto mediaCrypto) {
        char c;
        int i;
        if (!mediaFormat.containsKey("max-input-size")) {
            int integer = mediaFormat.getInteger("height");
            if (z && mediaFormat.containsKey("max-height")) {
                integer = Math.max(integer, mediaFormat.getInteger("max-height"));
            }
            int integer2 = mediaFormat.getInteger("width");
            if (z && mediaFormat.containsKey("max-width")) {
                integer2 = Math.max(integer, mediaFormat.getInteger("max-width"));
            }
            String string = mediaFormat.getString("mime");
            int i2 = 4;
            switch (string.hashCode()) {
                case -1664118616:
                    if (string.equals("video/3gpp")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case -1662541442:
                    if (string.equals("video/hevc")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 1187890754:
                    if (string.equals("video/mp4v-es")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 1331836730:
                    if (string.equals("video/avc")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 1599127256:
                    if (string.equals("video/x-vnd.on2.vp8")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 1599127257:
                    if (string.equals("video/x-vnd.on2.vp9")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            if (c != 0 && c != 1) {
                if (c != 2) {
                    if (c != 3) {
                        if (c == 4 || c == 5) {
                            i = integer2 * integer;
                            mediaFormat.setInteger("max-input-size", (i * 3) / (i2 + i2));
                        }
                    }
                } else if (!"BRAVIA 4K 2015".equals(pgz.d)) {
                    i = ((integer2 + 15) / 16) * ((integer + 15) / 16) * 256;
                    i2 = 2;
                    mediaFormat.setInteger("max-input-size", (i * 3) / (i2 + i2));
                }
            }
            i = integer2 * integer;
            i2 = 2;
            mediaFormat.setInteger("max-input-size", (i * 3) / (i2 + i2));
        }
        mediaCodec.configure(mediaFormat, this.l, mediaCrypto, 0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void o(MediaCodec mediaCodec, int i) {
        int i2 = pgz.a;
        mediaCodec.releaseOutputBuffer(i, false);
        oxd oxdVar = this.b;
        oxdVar.h++;
        this.p++;
        int i3 = this.q + 1;
        this.q = i3;
        oxdVar.i = Math.max(i3, oxdVar.i);
        if (this.p == this.k) {
            O();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.oys, defpackage.oyx
    public void pG(int i, long j, boolean z) {
        super.pG(i, j, z);
        if (z) {
            this.o = (SystemClock.elapsedRealtime() * 1000) + this.j;
        }
        oza ozaVar = this.i;
        ozaVar.i = false;
        if (ozaVar.a != null) {
            ozaVar.b.c.sendEmptyMessage(1);
            oyy oyyVar = ozaVar.c;
            if (oyyVar != null) {
                oyyVar.a.registerDisplayListener(oyyVar, null);
            }
            ozaVar.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.oyb, defpackage.oys, defpackage.oyx
    public void q() {
        this.t = -1;
        this.u = -1;
        this.w = -1.0f;
        this.s = -1.0f;
        this.x = -1;
        this.y = -1;
        this.A = -1.0f;
        oza ozaVar = this.i;
        if (ozaVar.a != null) {
            oyy oyyVar = ozaVar.c;
            if (oyyVar != null) {
                oyyVar.a.unregisterDisplayListener(oyyVar);
            }
            ozaVar.b.c.sendEmptyMessage(2);
        }
        super.q();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.oyb, defpackage.oys
    public void r(long j) {
        super.r(j);
        this.n = false;
        this.q = 0;
        this.o = -1L;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.oyb
    public void s(oyn oynVar) {
        super.s(oynVar);
        MediaFormat mediaFormat = oynVar.a;
        float f = mediaFormat.m;
        if (f == -1.0f) {
            f = 1.0f;
        }
        this.s = f;
        int i = mediaFormat.l;
        if (i == -1) {
            i = 0;
        }
        this.r = i;
    }

    @Override // defpackage.oyb
    protected final void t(MediaCodec mediaCodec, android.media.MediaFormat mediaFormat) {
        int integer;
        int integer2;
        boolean z = false;
        if (mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top")) {
            z = true;
        }
        if (z) {
            integer = (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1;
        } else {
            integer = mediaFormat.getInteger("width");
        }
        this.t = integer;
        if (z) {
            integer2 = (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1;
        } else {
            integer2 = mediaFormat.getInteger("height");
        }
        this.u = integer2;
        this.w = this.s;
        if (pgz.a >= 21) {
            int i = this.r;
            if (i == 90 || i == 270) {
                int i2 = this.t;
                this.t = this.u;
                this.u = i2;
                this.w = 1.0f / this.w;
            }
        } else {
            this.v = this.r;
        }
        mediaCodec.setVideoScalingMode(1);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.oyb, defpackage.oyx
    public void v() {
        this.p = 0;
        SystemClock.elapsedRealtime();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.oyx
    public void w() {
        this.o = -1L;
        O();
    }

    @Override // defpackage.oyb
    protected final boolean x(oxv oxvVar, MediaFormat mediaFormat) {
        String str = mediaFormat.b;
        return muf.S(str) && ("video/x-unknown".equals(str) || oxvVar.a(str, false) != null);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x010c  */
    @Override // defpackage.oyb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final boolean y(long r25, long r27, android.media.MediaCodec r29, java.nio.ByteBuffer r30, android.media.MediaCodec.BufferInfo r31, int r32, boolean r33) {
        /*
            Method dump skipped, instructions count: 329
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oym.y(long, long, android.media.MediaCodec, java.nio.ByteBuffer, android.media.MediaCodec$BufferInfo, int, boolean):boolean");
    }
}
