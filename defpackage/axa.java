package defpackage;

import android.content.Context;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class axa extends bac implements psx {
    private boolean A;
    public final awa a;
    public boolean b;
    public pmh c;
    private final Context q;
    private final awh u;
    private int v;
    private boolean w;
    private pms x;
    private long y;
    private boolean z;

    public axa(Context context, azx azxVar, bae baeVar, Handler handler, awb awbVar, awh awhVar) {
        super(1, azxVar, baeVar, 44100.0f);
        this.q = context.getApplicationContext();
        this.u = awhVar;
        this.a = new awa(handler, awbVar);
        awhVar.n(new awz(this));
    }

    private final int U(baa baaVar, pms pmsVar) {
        if (!"OMX.google.raw.decoder".equals(baaVar.a) || pts.a >= 24 || (pts.a == 23 && pts.X(this.q))) {
            return pmsVar.o;
        }
        return -1;
    }

    private final void V() {
        long b = this.u.b(r());
        if (b != Long.MIN_VALUE) {
            if (!this.b) {
                b = Math.max(this.y, b);
            }
            this.y = b;
            this.b = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.bac
    public void A(asw aswVar) {
        if (!this.z || aswVar.isDecodeOnly()) {
            return;
        }
        if (Math.abs(aswVar.d - this.y) > 500000) {
            this.y = aswVar.d;
        }
        this.z = false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.bac, defpackage.ple
    public final void B() {
        try {
            super.B();
            if (this.A) {
                this.A = false;
                this.u.j();
            }
        } catch (Throwable th) {
            if (this.A) {
                this.A = false;
                this.u.j();
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.bac
    public boolean D(long j, long j2, azy azyVar, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, pms pmsVar) {
        pse.c(byteBuffer);
        if (this.x != null && (i2 & 2) != 0) {
            pse.c(azyVar);
            azyVar.p(i);
            return true;
        }
        if (z) {
            if (azyVar != null) {
                azyVar.p(i);
            }
            this.o.f += i3;
            this.u.f();
            return true;
        }
        try {
            if (!this.u.r(byteBuffer, j3, i3)) {
                return false;
            }
            if (azyVar != null) {
                azyVar.p(i);
            }
            this.o.e += i3;
            return true;
        } catch (awd e) {
            throw ak(e, e.c, e.b, 5001);
        } catch (awg e2) {
            throw ak(e2, pmsVar, e2.b, 5002);
        }
    }

    @Override // defpackage.bac
    protected final boolean E(pms pmsVar) {
        return this.u.u(pmsVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.bac
    public float b(float f, pms pmsVar, pms[] pmsVarArr) {
        int i = -1;
        for (pms pmsVar2 : pmsVarArr) {
            int i2 = pmsVar2.B;
            if (i2 != -1) {
                i = Math.max(i, i2);
            }
        }
        if (i == -1) {
            return -1.0f;
        }
        return i * f;
    }

    @Override // defpackage.bac
    protected final int c(bae baeVar, pms pmsVar) {
        if (!psz.j(pmsVar.n)) {
            return 0;
        }
        int i = pts.a;
        int i2 = pmsVar.G;
        boolean R = R(pmsVar);
        if (R && this.u.u(pmsVar) && (i2 == 0 || bao.b() != null)) {
            return 44;
        }
        if (("audio/raw".equals(pmsVar.n) && !this.u.u(pmsVar)) || !this.u.u(pts.A(2, pmsVar.A, pmsVar.B))) {
            return 1;
        }
        List u = u(baeVar, pmsVar, false);
        if (u.isEmpty()) {
            return 1;
        }
        if (!R) {
            return 2;
        }
        baa baaVar = (baa) u.get(0);
        boolean c = baaVar.c(pmsVar);
        int i3 = 8;
        if (c && baaVar.d(pmsVar)) {
            i3 = 16;
        }
        return (true != c ? 3 : 4) | i3 | 32;
    }

    @Override // defpackage.poe, defpackage.pof
    public final String d() {
        return "MediaCodecAudioRenderer";
    }

    @Override // defpackage.bac
    protected final auk e(baa baaVar, pms pmsVar, pms pmsVar2) {
        int i;
        int i2;
        auk b = baaVar.b(pmsVar, pmsVar2);
        int i3 = b.e;
        if (U(baaVar, pmsVar2) > this.v) {
            i3 |= 64;
        }
        String str = baaVar.a;
        if (i3 != 0) {
            i2 = i3;
            i = 0;
        } else {
            i = b.d;
            i2 = 0;
        }
        return new auk(str, pmsVar, pmsVar2, i, i2);
    }

    @Override // defpackage.psx
    public final long f() {
        if (this.s == 2) {
            V();
        }
        return this.y;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.bac
    public final auk g(pmt pmtVar) {
        auk g = super.g(pmtVar);
        this.a.g(pmtVar.b, g);
        return g;
    }

    @Override // defpackage.psx
    public final pnu h() {
        return this.u.c();
    }

    @Override // defpackage.ple, defpackage.poe
    public psx i() {
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.bac, defpackage.ple
    public final void k() {
        this.A = true;
        try {
            this.u.e();
            try {
                super.k();
            } finally {
            }
        } catch (Throwable th) {
            try {
                super.k();
                throw th;
            } finally {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.bac, defpackage.ple
    public void l(boolean z, boolean z2) {
        super.l(z, z2);
        this.a.f(this.o);
        aB();
        this.u.d();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.bac, defpackage.ple
    public final void m(long j, boolean z) {
        super.m(j, z);
        this.u.e();
        this.y = j;
        this.z = true;
        this.b = true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ple
    public void n() {
        this.u.h();
    }

    @Override // defpackage.ple
    protected final void o() {
        V();
        this.u.g();
    }

    @Override // defpackage.psx
    public final void q(pnu pnuVar) {
        this.u.o(pnuVar);
    }

    @Override // defpackage.bac, defpackage.poe
    public final boolean r() {
        return this.i && this.u.t();
    }

    @Override // defpackage.ple, defpackage.poc
    public void rk(int i, Object obj) {
        if (i == 2) {
            this.u.q(((Float) obj).floatValue());
            return;
        }
        if (i == 3) {
            this.u.k((asd) obj);
            return;
        }
        if (i != 6) {
            switch (i) {
                case 9:
                    this.u.p(((Boolean) obj).booleanValue());
                    return;
                case 10:
                    this.u.l(((Integer) obj).intValue());
                    return;
                case 11:
                    this.c = (pmh) obj;
                    return;
                default:
                    return;
            }
        }
        this.u.m((ase) obj);
    }

    @Override // defpackage.bac, defpackage.poe
    public boolean s() {
        return this.u.s() || super.s();
    }

    @Override // defpackage.bac
    protected final azw t(baa baaVar, pms pmsVar, MediaCrypto mediaCrypto, float f) {
        pms[] aA = aA();
        int U = U(baaVar, pmsVar);
        if (aA.length != 1) {
            for (pms pmsVar2 : aA) {
                if (baaVar.b(pmsVar, pmsVar2).d != 0) {
                    U = Math.max(U, U(baaVar, pmsVar2));
                }
            }
        }
        this.v = U;
        this.w = pts.a < 24 && "OMX.SEC.aac.dec".equals(baaVar.a) && "samsung".equals(pts.c) && (pts.b.startsWith("zeroflte") || pts.b.startsWith("herolte") || pts.b.startsWith("heroqlte"));
        String str = baaVar.c;
        int i = this.v;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("channel-count", pmsVar.A);
        mediaFormat.setInteger("sample-rate", pmsVar.B);
        prh.i(mediaFormat, pmsVar.p);
        prh.h(mediaFormat, "max-input-size", i);
        if (pts.a >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f != -1.0f && (pts.a != 23 || (!"ZTE B2017G".equals(pts.d) && !"AXON 7 mini".equals(pts.d)))) {
                mediaFormat.setFloat("operating-rate", f);
            }
        }
        if (pts.a <= 28 && "audio/ac4".equals(pmsVar.n)) {
            mediaFormat.setInteger("ac4-is-sync", 1);
        }
        if (pts.a >= 24 && this.u.a(pts.A(4, pmsVar.A, pmsVar.B)) == 2) {
            mediaFormat.setInteger("pcm-encoding", 4);
        }
        pms pmsVar3 = null;
        if ("audio/raw".equals(baaVar.b) && !"audio/raw".equals(pmsVar.n)) {
            pmsVar3 = pmsVar;
        }
        this.x = pmsVar3;
        return new azw(baaVar, mediaFormat, pmsVar, null, mediaCrypto);
    }

    @Override // defpackage.bac
    protected final List u(bae baeVar, pms pmsVar, boolean z) {
        baa b;
        String str = pmsVar.n;
        if (str == null) {
            return Collections.emptyList();
        }
        if (!this.u.u(pmsVar) || (b = bao.b()) == null) {
            List d = bao.d(baeVar.a(str, z, false), pmsVar);
            if ("audio/eac3-joc".equals(str)) {
                ArrayList arrayList = new ArrayList(d);
                arrayList.addAll(baeVar.a("audio/eac3", z, false));
                d = arrayList;
            }
            return Collections.unmodifiableList(d);
        }
        return Collections.singletonList(b);
    }

    @Override // defpackage.bac
    protected final void v(Exception exc) {
        prh.j("MediaCodecAudioRenderer", "Audio codec error", exc);
        this.a.a(exc);
    }

    @Override // defpackage.bac
    protected final void w(String str, long j, long j2) {
        this.a.c(str, j, j2);
    }

    @Override // defpackage.bac
    protected final void x(String str) {
        this.a.d(str);
    }

    @Override // defpackage.bac
    protected final void z() {
        this.u.f();
    }

    @Override // defpackage.bac
    protected final void C() {
        try {
            this.u.i();
        } catch (awg e) {
            throw ak(e, e.c, e.b, 5002);
        }
    }

    public axa(Context context, bae baeVar, Handler handler, awb awbVar, awh awhVar) {
        this(context, azx.a, baeVar, handler, awbVar, awhVar);
    }

    @Override // defpackage.bac
    protected final void y(pms pmsVar, MediaFormat mediaFormat) {
        int i;
        int i2;
        pms pmsVar2 = this.x;
        int[] iArr = null;
        if (pmsVar2 != null) {
            pmsVar = pmsVar2;
        } else if (((bac) this).e != null) {
            if ("audio/raw".equals(pmsVar.n)) {
                i = pmsVar.C;
            } else if (pts.a < 24 || !mediaFormat.containsKey("pcm-encoding")) {
                if (mediaFormat.containsKey("v-bits-per-sample")) {
                    i = pts.i(mediaFormat.getInteger("v-bits-per-sample"));
                } else {
                    i = "audio/raw".equals(pmsVar.n) ? pmsVar.C : 2;
                }
            } else {
                i = mediaFormat.getInteger("pcm-encoding");
            }
            pmr pmrVar = new pmr();
            pmrVar.k = "audio/raw";
            pmrVar.z = i;
            pmrVar.A = pmsVar.D;
            pmrVar.B = pmsVar.E;
            pmrVar.x = mediaFormat.getInteger("channel-count");
            pmrVar.y = mediaFormat.getInteger("sample-rate");
            pms a = pmrVar.a();
            if (this.w && a.A == 6 && (i2 = pmsVar.A) < 6) {
                iArr = new int[i2];
                for (int i3 = 0; i3 < pmsVar.A; i3++) {
                    iArr[i3] = i3;
                }
            }
            pmsVar = a;
        }
        try {
            this.u.v(pmsVar, iArr);
        } catch (awc e) {
            throw aj(e, e.a, 5001);
        }
    }
}
