package defpackage;

import android.content.Context;
import android.media.MediaCodecInfo;
import android.os.Handler;
import android.util.Pair;
import android.view.Surface;
import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aevr extends bgt {
    private aetl A;
    private final Pair b;
    private final afdf c;
    private boolean q;
    private boolean u;
    private boolean v;
    private boolean w;
    private long x;
    private final long y;
    private final aetw z;

    public aevr(Context context, bhn bhnVar, aetw aetwVar, Handler handler, aevi aeviVar, afdf afdfVar, long j, azx azxVar) {
        super(context, azxVar, aeviVar, 5000L, handler, bhnVar, 10);
        this.q = false;
        this.z = aetwVar;
        this.c = afdfVar;
        this.w = ((awvr) aetwVar.s.f.c()).q;
        this.y = j;
        this.A = aetl.a;
        this.b = yjk.R(context);
    }

    public static /* synthetic */ void aC(Throwable th) {
        afsi.c(1, 6, "Failed to store: codecNeedsSetOutputSurfaceWorkaround.", th);
    }

    @Override // defpackage.bgt, defpackage.bac
    public final void A(asw aswVar) {
        super.A(aswVar);
        this.A.d();
    }

    @Override // defpackage.bgt, defpackage.bac
    public final void H(asw aswVar) {
        if (this.u) {
            super.H(aswVar);
            return;
        }
        final afdt afdtVar = this.z.c;
        ByteBuffer byteBuffer = aswVar.e;
        final long j = aswVar.d;
        if (byteBuffer == null || !byteBuffer.hasRemaining()) {
            return;
        }
        int remaining = byteBuffer.remaining();
        final byte[] bArr = new byte[remaining + 1];
        bArr[0] = 0;
        byteBuffer.get(bArr, 1, remaining);
        afdtVar.d.post(new Runnable() { // from class: afdr
            @Override // java.lang.Runnable
            public final void run() {
                afdt afdtVar2 = afdt.this;
                byte[] bArr2 = bArr;
                long j2 = j;
                afdtVar2.b();
                afky T = afdtVar2.e.T();
                if (T != null) {
                    T.r(false, bArr2, j2, afdtVar2.e.g() * 1000);
                }
            }
        });
    }

    @Override // defpackage.bgt, defpackage.bac
    public final boolean Q(baa baaVar) {
        Surface surface = ((bgt) this).a;
        if (!this.z.s.p().t || surface == null || surface.isValid()) {
            if (this.q) {
                this.q = false;
                this.c.n(surface, afqu.ANDROID_EXOPLAYER_V2, true, this.z.b());
            }
            return super.Q(baaVar);
        }
        this.q = true;
        this.c.n(surface, afqu.ANDROID_EXOPLAYER_V2, false, this.z.b());
        return false;
    }

    @Override // defpackage.bgt
    public final boolean V(String str) {
        int i;
        afhs afhsVar = this.z.s;
        if (afhsVar.a.a() == null || (i = amkq.bK(afhsVar.o().e)) == 0) {
            i = 1;
        }
        int i2 = i - 1;
        if (i2 == 2) {
            return true;
        }
        if (i2 == 3) {
            return false;
        }
        if (i2 != 4) {
            return super.V(str);
        }
        return this.w || super.V(str);
    }

    @Override // defpackage.bgt
    public final boolean W(long j, boolean z) {
        if (!this.v) {
            return super.W(j, z);
        }
        int ag = ag(j);
        if (ag == 0) {
            return false;
        }
        auj aujVar = this.o;
        aujVar.i++;
        if (z) {
            aujVar.f += ag;
        } else {
            q(ag);
        }
        return false;
    }

    @Override // defpackage.bgt
    public final boolean X(long j, long j2, boolean z) {
        if (this.v) {
            return true;
        }
        return super.X(j, j2, z);
    }

    @Override // defpackage.bgt
    public final boolean Y(long j, long j2, boolean z) {
        long j3 = this.y;
        if ((j3 <= 0 || j2 - this.x <= j3) && super.Y(j, j2, z)) {
            return true;
        }
        this.x = j2;
        return false;
    }

    @Override // defpackage.bgt
    public final dkb ac(baa baaVar, pms pmsVar, pms[] pmsVarArr) {
        int i;
        if (!this.z.s.Z(aqva.EXO_PLAYER_HOT_CONFIG_FEATURES_USE_FIXED_CODEC_MAX_VALUES)) {
            return super.ac(baaVar, pmsVar, pmsVarArr);
        }
        int max = Math.max(((Integer) this.b.first).intValue(), ((Integer) this.b.second).intValue());
        MediaCodecInfo.CodecCapabilities codecCapabilities = baaVar.d;
        if (codecCapabilities != null) {
            int min = Math.min(codecCapabilities.getVideoCapabilities().getSupportedWidths().getUpper().intValue(), max);
            i = Math.min(baaVar.d.getVideoCapabilities().getSupportedHeights().getUpper().intValue(), max);
            max = min;
        } else {
            i = max;
        }
        dkb ac = super.ac(baaVar, pmsVar, pmsVarArr);
        return new dkb(Math.min(Math.max(ac.c, 720), max), Math.min(Math.max(ac.a, 720), i), 0, null);
    }

    @Override // defpackage.bgt, defpackage.bac
    public final float b(float f, pms pmsVar, pms[] pmsVarArr) {
        if (this.z.s.p().aw) {
            return -1.0f;
        }
        aezf aezfVar = this.z.n;
        if (aezfVar != null) {
            FormatStreamModel[] formatStreamModelArr = aezfVar.c().a;
            float f2 = 30.0f;
            if (formatStreamModelArr.length > 0) {
                float c = formatStreamModelArr[0].c();
                if (c > 0.0f) {
                    f2 = c;
                }
            }
            return f2 * f;
        }
        return super.b(f, pmsVar, pmsVarArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.bgt, defpackage.bac
    public final auk e(baa baaVar, pms pmsVar, pms pmsVar2) {
        Boolean bool;
        if (!this.z.a().aU()) {
            aqvj aqvjVar = this.z.s.p.b.b().C;
            if (aqvjVar == null) {
                aqvjVar = aqvj.a;
            }
            if (aqvjVar.a(45354764L)) {
                aoot aootVar = aqvjVar.b;
                if (!aootVar.containsKey(45354764L)) {
                    throw new IllegalArgumentException();
                }
                aqvk aqvkVar = (aqvk) aootVar.get(45354764L);
                bool = Boolean.valueOf(aqvkVar.b == 1 ? ((Boolean) aqvkVar.c).booleanValue() : false);
            } else {
                bool = false;
            }
            if (!bool.booleanValue()) {
                if (!this.z.s.P() || pmsVar2.e(pmsVar)) {
                    return super.e(baaVar, pmsVar, pmsVar2);
                }
                return new auk(baaVar.a, pmsVar, pmsVar2, 0, 32);
            }
        }
        return new auk(baaVar.a, pmsVar, pmsVar2, 0, 4);
    }

    @Override // defpackage.bgt
    public final void h(azy azyVar, Surface surface) {
        try {
            super.h(azyVar, surface);
            this.c.h(afqu.ANDROID_EXOPLAYER_V2, surface, null);
        } catch (Exception e) {
            this.c.h(afqu.ANDROID_EXOPLAYER_V2, surface, e);
            this.w = true;
            ynm.m(this.z.s.f.b(new adpv(14)), adha.s);
            throw e;
        }
    }

    @Override // defpackage.bgt, defpackage.bac, defpackage.ple
    public final void l(boolean z, boolean z2) {
        super.l(z, z2);
        this.A.c();
    }

    @Override // defpackage.bgt, defpackage.bac, defpackage.ple
    public final void m(long j, boolean z) {
        super.m(j, z);
        this.x = 0L;
    }

    @Override // defpackage.bgt, defpackage.ple
    public final void n() {
        aetw aetwVar = this.z;
        this.u = aetwVar.c.c;
        this.v = aetwVar.a().Y();
        super.n();
        this.A.f();
    }

    @Override // defpackage.bgt, defpackage.bac, defpackage.poe
    public final boolean s() {
        if (!super.s()) {
            return false;
        }
        this.A.e();
        return true;
    }

    @Override // defpackage.bgt, defpackage.ple, defpackage.poc
    public final void rk(int i, Object obj) {
        if (i != 10001) {
            if (i == 10003) {
                super.S(((bac) this).f);
                return;
            } else {
                super.rk(i, obj);
                return;
            }
        }
        aetl aetlVar = (aetl) obj;
        if (aetlVar == null) {
            aetlVar = aetl.a;
        }
        this.A = aetlVar;
    }
}
