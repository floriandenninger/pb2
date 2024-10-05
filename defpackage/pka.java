package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Handler;
import android.os.SystemClock;
import android.view.Surface;
import com.google.android.exoplayer.MediaFormat;
import com.google.android.exoplayer.youtube.libvpx.VpxDecoder;
import com.google.android.exoplayer.youtube.libvpx.VpxOutputBuffer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class pka extends oys {
    public final oxd a;
    public final pjz b;
    private final int c;
    private final int d;
    private final boolean e;
    private final Handler f;
    private final oyn g;
    private final int i;
    private MediaFormat j;
    private VpxDecoder k;
    private pkc l;
    private VpxOutputBuffer m;
    private VpxOutputBuffer n;
    private Bitmap o;
    private boolean p;
    private boolean q;
    private Surface r;
    private pkd s;
    private final int t;
    private boolean u;
    private boolean v;
    private boolean w;
    private int x;
    private int y;
    private int z;

    public pka(oyr oyrVar, Handler handler, pjz pjzVar, boolean z, boolean z2, boolean z3, int i, int i2, int i3) {
        super(oyrVar);
        this.a = new oxd();
        this.f = handler;
        this.b = pjzVar;
        this.e = z;
        if (z2) {
            this.t = true == z3 ? 3 : 0;
        } else {
            this.t = 2;
        }
        this.i = i;
        this.c = i2;
        this.d = i3;
        this.x = -1;
        this.y = -1;
        this.g = new oyn();
    }

    public static String l() {
        if (VpxDecoder.a) {
            return VpxDecoder.getLibvpxVersion();
        }
        return null;
    }

    private final void n() {
        this.l = null;
        VpxOutputBuffer vpxOutputBuffer = this.m;
        if (vpxOutputBuffer != null) {
            vpxOutputBuffer.release();
            this.m = null;
        }
        VpxOutputBuffer vpxOutputBuffer2 = this.n;
        if (vpxOutputBuffer2 != null) {
            vpxOutputBuffer2.release();
            this.n = null;
        }
        this.k.h();
    }

    private final void o(Surface surface) {
        if (this.p || this.b == null) {
            return;
        }
        this.f.post(new pjv(this, surface));
        this.p = true;
    }

    private final void s() {
        if (this.b == null || this.z <= 0) {
            return;
        }
        SystemClock.elapsedRealtime();
        this.z = 0;
        this.f.post(new pju(this));
    }

    private final void t(MediaFormat mediaFormat) {
        if (this.b != null) {
            this.f.post(new pjy(this, mediaFormat));
        }
    }

    private final void u() {
        pkd pkdVar;
        Surface surface;
        int i;
        int i2 = 1;
        this.a.f++;
        VpxOutputBuffer vpxOutputBuffer = this.m;
        int i3 = vpxOutputBuffer.width;
        int i4 = vpxOutputBuffer.height;
        int i5 = this.x;
        if (i5 == -1 || (i = this.y) == -1 || i5 != i3 || i != i4) {
            this.x = i3;
            this.y = i4;
            if (this.b != null) {
                this.f.post(new pjt(this, i3, i4));
            }
        }
        VpxOutputBuffer vpxOutputBuffer2 = this.m;
        int i6 = vpxOutputBuffer2.mode;
        if (i6 != 1) {
            i2 = i6;
        } else if (this.r != null) {
            Bitmap bitmap = this.o;
            if (bitmap == null || bitmap.getWidth() != vpxOutputBuffer2.width || this.o.getHeight() != vpxOutputBuffer2.height) {
                this.o = Bitmap.createBitmap(vpxOutputBuffer2.width, vpxOutputBuffer2.height, Bitmap.Config.RGB_565);
            }
            this.o.copyPixelsFromBuffer(vpxOutputBuffer2.data);
            Canvas lockCanvas = this.r.lockCanvas(null);
            lockCanvas.scale(lockCanvas.getWidth() / vpxOutputBuffer2.width, lockCanvas.getHeight() / vpxOutputBuffer2.height);
            lockCanvas.drawBitmap(this.o, 0.0f, 0.0f, (Paint) null);
            this.r.unlockCanvasAndPost(lockCanvas);
            o(this.r);
            this.m.release();
            this.m = null;
        }
        if ((i2 == 0 || i2 == 3) && (pkdVar = this.s) != null) {
            pkdVar.rI(vpxOutputBuffer2);
            o(this.r);
        } else if (i2 != 2 || (surface = this.r) == null) {
            vpxOutputBuffer2.release();
        } else {
            VpxDecoder vpxDecoder = this.k;
            if (vpxDecoder.vpxRenderFrame(vpxDecoder.b, surface, vpxOutputBuffer2) != -1) {
                o(this.r);
                this.m.release();
            } else {
                throw new pkb("Buffer render failed.");
            }
        }
        this.m = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x016b A[Catch: pkb -> 0x017c, TRY_LEAVE, TryCatch #0 {pkb -> 0x017c, blocks: (B:12:0x0026, B:16:0x0062, B:19:0x00f4, B:22:0x0168, B:24:0x016b, B:32:0x00fc, B:34:0x0100, B:37:0x010d, B:42:0x011c, B:46:0x012b, B:47:0x013f, B:49:0x0157, B:50:0x015d, B:51:0x006a, B:53:0x006e, B:55:0x0072, B:56:0x0081, B:59:0x0077, B:60:0x0086, B:62:0x008a, B:63:0x0094, B:65:0x009c, B:66:0x00a6, B:68:0x00ac, B:69:0x00b0, B:73:0x00bc, B:75:0x00cc, B:76:0x00cf, B:77:0x00d9, B:79:0x00dd, B:80:0x00e3, B:82:0x00e8, B:84:0x00ef, B:87:0x0030, B:89:0x004d, B:90:0x005b), top: B:11:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x017b A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00fc A[Catch: pkb -> 0x017c, TryCatch #0 {pkb -> 0x017c, blocks: (B:12:0x0026, B:16:0x0062, B:19:0x00f4, B:22:0x0168, B:24:0x016b, B:32:0x00fc, B:34:0x0100, B:37:0x010d, B:42:0x011c, B:46:0x012b, B:47:0x013f, B:49:0x0157, B:50:0x015d, B:51:0x006a, B:53:0x006e, B:55:0x0072, B:56:0x0081, B:59:0x0077, B:60:0x0086, B:62:0x008a, B:63:0x0094, B:65:0x009c, B:66:0x00a6, B:68:0x00ac, B:69:0x00b0, B:73:0x00bc, B:75:0x00cc, B:76:0x00cf, B:77:0x00d9, B:79:0x00dd, B:80:0x00e3, B:82:0x00e8, B:84:0x00ef, B:87:0x0030, B:89:0x004d, B:90:0x005b), top: B:11:0x0026 }] */
    @Override // defpackage.oys
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void A(long r17, long r19, boolean r21) {
        /*
            Method dump skipped, instructions count: 404
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pka.A(long, long, boolean):void");
    }

    @Override // defpackage.oys
    protected final boolean E(MediaFormat mediaFormat) {
        return "video/x-vnd.on2.vp9".equalsIgnoreCase(mediaFormat.b);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.oyx
    public final boolean h() {
        return this.v;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.oyx
    public final boolean i() {
        if (this.j != null) {
            return (this.w || this.m != null) && this.q;
        }
        return false;
    }

    @Override // defpackage.oyx, defpackage.oxi
    public final void k(int i, Object obj) {
        pkd pkdVar;
        if (i == 1) {
            Surface surface = (Surface) obj;
            if (this.t != 2 || this.r == surface) {
                return;
            }
            this.r = surface;
            this.p = false;
            return;
        }
        if (i != 2 || this.s == (pkdVar = (pkd) obj)) {
            return;
        }
        int i2 = this.t;
        if (i2 == 0 || i2 == 3) {
            this.s = pkdVar;
            this.p = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.oys, defpackage.oyx
    public final void q() {
        this.l = null;
        this.m = null;
        this.j = null;
        try {
            if (this.k != null) {
                n();
                this.k.d();
                this.k = null;
                this.a.b++;
            }
        } finally {
            super.q();
        }
    }

    @Override // defpackage.oys
    protected final void r(long j) {
        this.w = false;
        this.u = false;
        this.v = false;
        this.q = false;
        if (this.k != null) {
            n();
        }
    }

    @Override // defpackage.oyx
    protected final void v() {
        this.z = 0;
        SystemClock.elapsedRealtime();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.oyx
    public final void w() {
        s();
    }
}
