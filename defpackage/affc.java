package defpackage;

import android.os.Handler;
import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
import com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class affc {
    public static final affc a = new affc(PlayerConfigModel.b, VideoStreamingData.a, null, null);
    private final int A;
    private final int B;
    private boolean C;
    private final Runnable D;
    public final boolean b;
    public volatile boolean c;
    public final boolean d;
    final assy e;
    public final int f;
    public final Runnable g;
    public final Handler h;
    public boolean i;
    public volatile int j;
    public final PlayerConfigModel k;
    private final boolean l;
    private final int m;
    private final aszn n;
    private final float o;
    private final float p;
    private final float q;
    private volatile long r;
    private final amnv s;
    private volatile long t;
    private boolean u;
    private boolean v;
    private final float w;
    private int x;
    private final int y;
    private int z;

    public affc(PlayerConfigModel playerConfigModel, VideoStreamingData videoStreamingData, Runnable runnable, Handler handler) {
        int i;
        advx advxVar = advx.l;
        this.r = Long.MAX_VALUE;
        this.t = Long.MAX_VALUE;
        this.D = new affb(this);
        this.k = playerConfigModel;
        this.s = advxVar;
        this.b = videoStreamingData.B();
        this.l = videoStreamingData.z();
        if (!videoStreamingData.B() || !videoStreamingData.C()) {
            this.e = assy.LIVE_ONLY_PEG_STRATEGY_DO_NOT_PEG;
        } else if (!videoStreamingData.G()) {
            this.e = playerConfigModel.Q();
            this.C = true;
        } else {
            this.e = assy.LIVE_ONLY_PEG_STRATEGY_DO_NOT_PEG;
        }
        this.u = videoStreamingData.z();
        this.d = videoStreamingData.G();
        this.m = videoStreamingData.g;
        aszn asznVar = videoStreamingData.h;
        this.n = asznVar;
        aquz aquzVar = playerConfigModel.c.e;
        float f = (aquzVar == null ? aquz.b : aquzVar).ak;
        this.w = f <= 0.0f ? 1.0f : f;
        this.f = videoStreamingData.b();
        aquz aquzVar2 = playerConfigModel.c.e;
        float f2 = (aquzVar2 == null ? aquz.b : aquzVar2).al;
        f2 = f2 <= 0.0f ? 60.0f : f2;
        afki.b(f2 > 0.0f);
        double log = Math.log(0.5d);
        double d = f2 / 2.0f;
        Double.isNaN(d);
        this.o = (float) (1.0d - Math.exp(log / d));
        aquz aquzVar3 = playerConfigModel.c.e;
        float f3 = (aquzVar3 == null ? aquz.b : aquzVar3).am;
        this.p = f3 <= 0.0f ? 0.75f : f3;
        aquz aquzVar4 = playerConfigModel.c.e;
        float f4 = (aquzVar4 == null ? aquz.b : aquzVar4).an;
        this.q = f4 <= 0.0f ? 3.0f : f4;
        this.g = runnable;
        this.h = handler;
        int j = playerConfigModel.j();
        this.A = j;
        afki.a(this.e);
        afki.a(asznVar);
        if (this.e.equals(assy.LIVE_ONLY_PEG_STRATEGY_SEEK_ON_REBUFFER_ESTIMATE_DURATION)) {
            aszn asznVar2 = aszn.MDE_STREAM_OPTIMIZATIONS_RENDERER_LATENCY_UNKNOWN;
            int ordinal = asznVar.ordinal();
            j = ordinal != 2 ? ordinal != 3 ? 15000 : 4000 : 6000;
        }
        this.z = j;
        atyi atyiVar = playerConfigModel.c;
        if ((atyiVar.c & 32768) != 0) {
            astb astbVar = atyiVar.G;
            i = (int) ((astbVar == null ? astb.a : astbVar).b * 1000.0d);
        } else {
            i = 12000;
        }
        this.y = i;
        this.j = i;
        this.x = i;
        this.B = playerConfigModel.x();
    }

    private final void n(boolean z) {
        boolean z2 = this.i;
        this.i = z;
        Handler handler = this.h;
        if (handler == null || this.g == null) {
            return;
        }
        if (!z2 && z) {
            handler.post(this.D);
        } else {
            if (!z2 || z) {
                return;
            }
            handler.removeCallbacks(this.D);
        }
    }

    private final void o() {
        if (this.k.aI()) {
            if (this.n != aszn.MDE_STREAM_OPTIMIZATIONS_RENDERER_LATENCY_ULTRA_LOW) {
                if (this.x < this.y * this.p) {
                    this.j = (int) Math.min(this.j + (this.w * this.f), this.y + this.z);
                } else {
                    this.j = (int) Math.max(this.j - (this.w * this.f), this.y);
                }
            }
            this.x = this.y;
        }
    }

    private final void p() {
        afki.a(this.e);
        if (this.e.equals(assy.LIVE_ONLY_PEG_STRATEGY_SEEK_ON_REBUFFER_ESTIMATE_DURATION)) {
            this.z = Math.min(this.z + this.f, this.A);
        }
    }

    private final boolean q(long j, long j2) {
        return this.b && j != 0 && j != -9223372036854775807L && j >= 0 && j2 != Long.MAX_VALUE && j2 > 0 && this.z + this.j < ((int) (j2 - j));
    }

    public final int a(long j, long j2) {
        if (this.u && j > 0 && j2 > 0 && j2 > j) {
            try {
                return anaf.ad(j2 - j);
            } catch (IllegalArgumentException unused) {
            }
        }
        return -1;
    }

    public final int b() {
        if (this.f <= 0) {
            return this.m;
        }
        int i = this.j;
        return ((i + r1) - 1) / this.f;
    }

    public final long c() {
        if (this.c) {
            return f();
        }
        long j = this.t;
        if (j != Long.MAX_VALUE) {
            return ((Long) this.s.get()).longValue() + j;
        }
        return Long.MAX_VALUE;
    }

    public final long d() {
        return TimeUnit.MILLISECONDS.toMicros(this.j);
    }

    public final long e() {
        long j = this.r;
        if (j != Long.MAX_VALUE) {
            return j + TimeUnit.MILLISECONDS.toMicros(this.f);
        }
        return Long.MAX_VALUE;
    }

    final long f() {
        if (this.r != Long.MAX_VALUE) {
            return TimeUnit.MICROSECONDS.toMillis(this.r);
        }
        return Long.MAX_VALUE;
    }

    public final void g() {
        aszn asznVar = aszn.MDE_STREAM_OPTIMIZATIONS_RENDERER_LATENCY_UNKNOWN;
        assy assyVar = assy.LIVE_ONLY_PEG_STRATEGY_UNKNOWN;
        if (this.e.ordinal() == 3) {
            boolean z = true;
            if (!this.v && (!this.u || this.d)) {
                z = false;
            }
            this.v = z;
            n(false);
        }
        this.u = false;
        this.C = false;
    }

    public final void h(boolean z) {
        boolean z2 = this.b;
        this.C = z2 && z;
        if (z2) {
            this.u = this.l && z;
            this.v = false;
            n(false);
        }
    }

    public final void i(long j) {
        if (!this.b || this.c) {
            return;
        }
        this.c = true;
        this.r = j;
    }

    public final void j(long j) {
        if (!this.b || this.c) {
            return;
        }
        if (this.r == Long.MAX_VALUE || j > this.r) {
            this.r = j;
            if (this.c) {
                return;
            }
            if (j == Long.MAX_VALUE) {
                this.t = Long.MAX_VALUE;
                return;
            }
            long millis = TimeUnit.MICROSECONDS.toMillis(j);
            long c = c();
            if (millis > c || c == Long.MAX_VALUE) {
                this.t = millis - ((Long) this.s.get()).longValue();
            }
        }
    }

    public final boolean k(long j, long j2) {
        long f;
        if (!this.c && this.k.aI() && this.b) {
            if (this.e.equals(assy.LIVE_ONLY_PEG_STRATEGY_SEEK_ON_REBUFFER_ESTIMATE_DURATION)) {
                f = c();
            } else {
                f = f();
            }
            if (this.f > 0 && j != -9223372036854775807L && j >= 0 && f != Long.MAX_VALUE && f > 0) {
                long max = Math.max(f - j, 0L);
                float f2 = this.o;
                int i = (int) (((1.0f - f2) * this.x) + (f2 * ((float) j2)));
                this.x = i;
                int i2 = this.y;
                float f3 = (this.f / 2) + i2;
                if (((float) max) > this.q * f3 && i > f3) {
                    this.j = i2;
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x005f, code lost:
    
        if (q(r14, r7 + r9) != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x006c, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x006a, code lost:
    
        if (q(r14, r7) != false) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x007a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean l(long r14, long r16, long r18) {
        /*
            r13 = this;
            r0 = r13
            r1 = r14
            boolean r3 = r0.c
            r4 = 0
            if (r3 != 0) goto L81
            boolean r3 = r0.b
            if (r3 == 0) goto L81
            boolean r3 = r0.C
            if (r3 == 0) goto L11
            goto L81
        L11:
            aszn r3 = defpackage.aszn.MDE_STREAM_OPTIMIZATIONS_RENDERER_LATENCY_UNKNOWN
            assy r3 = defpackage.assy.LIVE_ONLY_PEG_STRATEGY_UNKNOWN
            assy r3 = r0.e
            int r3 = r3.ordinal()
            r5 = 3
            r6 = 1
            if (r3 == r5) goto L21
        L1f:
            r1 = 0
            goto L6d
        L21:
            long r7 = r13.c()
            r9 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r3 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r3 == 0) goto L62
            r9 = 0
            int r3 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r3 <= 0) goto L62
            int r3 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r3 == 0) goto L62
            int r3 = (r18 > r9 ? 1 : (r18 == r9 ? 0 : -1))
            if (r3 <= 0) goto L62
            r11 = -1
            int r3 = (r16 > r11 ? 1 : (r16 == r11 ? 0 : -1))
            if (r3 == 0) goto L62
            int r3 = (r16 > r9 ? 1 : (r16 == r9 ? 0 : -1))
            if (r3 <= 0) goto L62
            r9 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r3 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r3 == 0) goto L62
            int r3 = r0.B
            long r9 = (long) r3
            long r9 = r9 * r18
            long r9 = r9 / r16
            boolean r3 = r0.u
            if (r3 == 0) goto L1f
            long r7 = r7 + r9
            boolean r1 = r13.q(r14, r7)
            if (r1 == 0) goto L1f
            goto L6c
        L62:
            boolean r3 = r0.u
            if (r3 == 0) goto L1f
            boolean r1 = r13.q(r14, r7)
            if (r1 == 0) goto L1f
        L6c:
            r1 = 1
        L6d:
            com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel r2 = r0.k
            boolean r2 = r2.aI()
            if (r2 == 0) goto L78
            r13.n(r4)
        L78:
            if (r1 == 0) goto L81
            r13.p()
            r13.o()
            return r6
        L81:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.affc.l(long, long, long):boolean");
    }

    public final boolean m() {
        boolean z = this.C;
        this.C = false;
        if (!this.c && this.b && !z) {
            aszn asznVar = aszn.MDE_STREAM_OPTIMIZATIONS_RENDERER_LATENCY_UNKNOWN;
            assy assyVar = assy.LIVE_ONLY_PEG_STRATEGY_UNKNOWN;
            if (this.e.ordinal() == 3 && this.v) {
                p();
                o();
                return true;
            }
            if (this.k.aI() && this.u) {
                n(true);
            }
        }
        return false;
    }
}
