package defpackage;

import com.google.android.libraries.youtube.innertube.model.player.Vss3ConfigModel;
import com.google.android.libraries.youtube.player.stats.VideoStats3Client$VideoStats3ClientState;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aiqs {
    public final boolean A;
    public boolean B;
    public int C;
    public aone D;
    public aone E;
    private final ysy F;
    private final acpl G;
    private final aomf H;
    private final boolean I;

    /* renamed from: J, reason: collision with root package name */
    private awdj f57J;
    private final ScheduledExecutorService K;
    private boolean L;
    private long M;
    public final zez a;
    public awed b;
    public final Vss3ConfigModel c;
    public final shf d;
    public final long e;
    public long f;
    public final Runnable g;
    public ScheduledFuture h;
    public boolean i;
    public boolean j;
    public boolean k;
    public long l;
    public long m;
    public float n;
    public final String o;
    public final String p;
    public String q;
    public long r;
    public int s;
    public long t;
    public final boolean u;
    public final boolean v;
    public aigm w;
    public ahcx x;
    public long y;
    public boolean z;

    public aiqs(ScheduledExecutorService scheduledExecutorService, ysy ysyVar, zez zezVar, shf shfVar, acpl acplVar, aifs aifsVar, awdj awdjVar, VideoStats3Client$VideoStats3ClientState videoStats3Client$VideoStats3ClientState) {
        this(scheduledExecutorService, ysyVar, acplVar, zezVar, shfVar, awdjVar, videoStats3Client$VideoStats3ClientState.d, videoStats3Client$VideoStats3ClientState.c, videoStats3Client$VideoStats3ClientState.i, videoStats3Client$VideoStats3ClientState.b, videoStats3Client$VideoStats3ClientState.j, videoStats3Client$VideoStats3ClientState.g, videoStats3Client$VideoStats3ClientState.h, videoStats3Client$VideoStats3ClientState.f, videoStats3Client$VideoStats3ClientState.k, videoStats3Client$VideoStats3ClientState.l, aifsVar.t, aifsVar.c(), videoStats3Client$VideoStats3ClientState.m, videoStats3Client$VideoStats3ClientState.n, videoStats3Client$VideoStats3ClientState.o, videoStats3Client$VideoStats3ClientState.u, videoStats3Client$VideoStats3ClientState.v, videoStats3Client$VideoStats3ClientState.p, videoStats3Client$VideoStats3ClientState.q, videoStats3Client$VideoStats3ClientState.r, videoStats3Client$VideoStats3ClientState.s, videoStats3Client$VideoStats3ClientState.t);
        this.r = videoStats3Client$VideoStats3ClientState.e;
    }

    public static boolean i(int i) {
        return i == 0;
    }

    private static float k(long j) {
        double d = ((j + 50) / 100) * 100;
        Double.isNaN(d);
        return (float) (d / 1000.0d);
    }

    private final synchronized int l(long j) {
        int M;
        int i;
        if (this.b.isInitialized()) {
            awec awecVar = this.b.h;
            if (awecVar == null) {
                awecVar = awec.a;
            }
            if (awecVar.g > 0) {
                awec awecVar2 = this.b.h;
                if (awecVar2 == null) {
                    awecVar2 = awec.a;
                }
                return awecVar2.g;
            }
        }
        if (this.b.isInitialized() && (M = awxr.M(this.b.k)) != 0 && M == 3 && (i = this.c.e) > 0) {
            return i;
        }
        long j2 = this.M;
        if (j2 > 0) {
            Vss3ConfigModel vss3ConfigModel = this.c;
            if (((int) k(j - j2)) < vss3ConfigModel.d) {
                return vss3ConfigModel.c;
            }
        }
        return this.c.b;
    }

    private final long m() {
        long j = this.m;
        long j2 = this.l;
        if (j <= j2 || j2 == 0) {
            return j;
        }
        StringBuilder sb = new StringBuilder(110);
        sb.append("Reported playback position ");
        sb.append(j);
        sb.append(" is greater than the duration of the video ");
        sb.append(j2);
        zga.l(sb.toString());
        return this.l;
    }

    private final synchronized void n(long j) {
        if (((awec) this.E.instance).d) {
            return;
        }
        awed awedVar = (awed) this.D.instance;
        if ((awedVar.b & 256) != 0) {
            int M = awxr.M(awedVar.k);
            if (M == 0) {
                M = 1;
            }
            if (M == 3) {
                aone aoneVar = this.E;
                int i = this.c.e;
                aoneVar.copyOnWrite();
                awec awecVar = (awec) aoneVar.instance;
                awecVar.b |= 32;
                awecVar.g = i;
                return;
            }
            if (M == 7 || M == 9) {
                return;
            }
            long j2 = this.M;
            if (j2 > 0) {
                int k = (int) k(j - j2);
                Vss3ConfigModel vss3ConfigModel = this.c;
                int i2 = vss3ConfigModel.c;
                if (i2 <= 0 || k >= vss3ConfigModel.d) {
                    aone aoneVar2 = this.E;
                    int i3 = vss3ConfigModel.b;
                    aoneVar2.copyOnWrite();
                    awec awecVar2 = (awec) aoneVar2.instance;
                    awecVar2.b |= 32;
                    awecVar2.g = i3;
                    return;
                }
                aone aoneVar3 = this.E;
                aoneVar3.copyOnWrite();
                awec awecVar3 = (awec) aoneVar3.instance;
                awecVar3.b |= 32;
                awecVar3.g = i2;
            }
        }
    }

    private final void o() {
        aone aoneVar = this.E;
        boolean z = this.I;
        aoneVar.copyOnWrite();
        awec awecVar = (awec) aoneVar.instance;
        awec awecVar2 = awec.a;
        awecVar.b |= 64;
        awecVar.h = z;
        aone aoneVar2 = this.D;
        String str = this.o;
        aoneVar2.copyOnWrite();
        awed awedVar = (awed) aoneVar2.instance;
        awed awedVar2 = awed.a;
        str.getClass();
        awedVar.b |= 1;
        awedVar.c = str;
        String str2 = this.p;
        aoneVar2.copyOnWrite();
        awed awedVar3 = (awed) aoneVar2.instance;
        str2.getClass();
        awedVar3.b |= 2;
        awedVar3.d = str2;
        apue apueVar = apue.values()[this.F.a()];
        aoneVar2.copyOnWrite();
        awed awedVar4 = (awed) aoneVar2.instance;
        awedVar4.m = apueVar.o;
        awedVar4.b |= 1024;
        long j = this.l;
        aoneVar2.copyOnWrite();
        awed awedVar5 = (awed) aoneVar2.instance;
        awedVar5.b |= 16;
        awedVar5.g = k(j);
        int a = this.a.a();
        aoneVar2.copyOnWrite();
        awed awedVar6 = (awed) aoneVar2.instance;
        awedVar6.b |= 4096;
        awedVar6.o = a;
        aomf aomfVar = this.H;
        aoneVar2.copyOnWrite();
        awed awedVar7 = (awed) aoneVar2.instance;
        aomfVar.getClass();
        awedVar7.b |= 64;
        awedVar7.i = aomfVar;
        if (this.w == aigm.IS_UAO) {
            aone aoneVar3 = this.D;
            aoneVar3.copyOnWrite();
            awed awedVar8 = (awed) aoneVar3.instance;
            awedVar8.b |= 8192;
            awedVar8.p = true;
        }
        if (this.j) {
            aone aoneVar4 = this.D;
            aoneVar4.copyOnWrite();
            awed awedVar9 = (awed) aoneVar4.instance;
            awedVar9.b |= 16384;
            awedVar9.q = true;
        }
        if (this.x.e()) {
            aone aoneVar5 = this.D;
            aoneVar5.copyOnWrite();
            awed awedVar10 = (awed) aoneVar5.instance;
            awedVar10.b |= 32768;
            awedVar10.r = true;
        }
        if (this.x.d().i != aigf.REMOTE.i) {
            aone aoneVar6 = this.D;
            int i = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 32}[this.x.d().i];
            aoneVar6.copyOnWrite();
            awed awedVar11 = (awed) aoneVar6.instance;
            int i2 = i - 1;
            if (i == 0) {
                throw null;
            }
            awedVar11.n = i2;
            awedVar11.b |= 2048;
        }
        awdj awdjVar = this.f57J;
        if (awdjVar == null || (awdjVar.b & 1) == 0) {
            return;
        }
        aone aoneVar7 = this.D;
        aomf z2 = aomf.z(awdjVar.c);
        aoneVar7.copyOnWrite();
        awed awedVar12 = (awed) aoneVar7.instance;
        awedVar12.b |= 128;
        awedVar12.j = z2;
    }

    private final synchronized void p(int i) {
        if (i > 0) {
            if (this.h == null) {
                long j = i;
                this.h = this.K.scheduleAtFixedRate(this.g, j, j, TimeUnit.MILLISECONDS);
                return;
            }
            return;
        }
        StringBuilder sb = new StringBuilder(70);
        sb.append("ERROR: maxSegmentLengthMillis ");
        sb.append(i);
        sb.append(" <= 0 and cannot be scheduled");
        zga.b(sb.toString());
    }

    public final synchronized void a() {
        ScheduledFuture scheduledFuture = this.h;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
            this.h = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x01ac, code lost:
    
        if (r11.e <= 0.0f) goto L56;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void b(boolean r10, long r11) {
        /*
            Method dump skipped, instructions count: 493
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aiqs.b(boolean, long):void");
    }

    public final synchronized void c() {
        if (this.z) {
            a();
        } else {
            b(false, this.d.d());
            h(this.d.d());
        }
    }

    public final synchronized void d(long j) {
        this.C = 6;
        b(false, this.d.d());
        this.m = j;
        h(this.d.d());
    }

    public final synchronized void e(long j) {
        if (this.i) {
            StringBuilder sb = new StringBuilder(65);
            sb.append("Warning: unexpected playback play ");
            sb.append(j);
            sb.append(" surpressed");
            zga.l(sb.toString());
            return;
        }
        long d = this.d.d();
        this.i = true;
        if (!this.L) {
            this.L = true;
            this.M = d;
        }
        this.C = 2;
        this.m = j;
        h(d);
    }

    public final void f() {
        this.C = 9;
        b(false, this.d.d());
    }

    public final synchronized void g() {
        if (this.B) {
            zga.n("VSS3 client called release more than once.", new Exception());
            return;
        }
        if (this.k) {
            zga.n("VSS3 client released unexpectedly", new Exception());
            f();
        }
        this.B = true;
    }

    public final synchronized void h(long j) {
        if (!this.i || this.k) {
            return;
        }
        this.f = j;
        aone createBuilder = awed.a.createBuilder();
        long m = m();
        createBuilder.copyOnWrite();
        awed awedVar = (awed) createBuilder.instance;
        awedVar.b |= 4;
        awedVar.e = k(m);
        this.D = createBuilder;
        this.E = awec.a.createBuilder();
        awed awedVar2 = this.b;
        if ((awedVar2.b & 32) != 0) {
            awec awecVar = awedVar2.h;
            if (awecVar == null) {
                awecVar = awec.a;
            }
            if (awecVar.g > 0) {
                aone aoneVar = this.E;
                awec awecVar2 = this.b.h;
                if (awecVar2 == null) {
                    awecVar2 = awec.a;
                }
                int i = awecVar2.g;
                aoneVar.copyOnWrite();
                awec awecVar3 = (awec) aoneVar.instance;
                awecVar3.b |= 16;
                awecVar3.f = i;
            }
        }
        p(l(j) * 1000);
        this.C = 2;
        this.k = true;
        o();
    }

    public final boolean j() {
        return this.t != -1;
    }

    public aiqs(ScheduledExecutorService scheduledExecutorService, ysy ysyVar, acpl acplVar, zez zezVar, shf shfVar, awdj awdjVar, String str, String str2, float f, long j, String str3, int i, long j2, boolean z, boolean z2, boolean z3, aigm aigmVar, ahcx ahcxVar, Vss3ConfigModel vss3ConfigModel, boolean z4, long j3, aone aoneVar, aone aoneVar2, awed awedVar, long j4, boolean z5, boolean z6, int i2) {
        this.g = new Runnable() { // from class: aiqr
            @Override // java.lang.Runnable
            public final void run() {
                aiqs.this.c();
            }
        };
        this.h = null;
        this.K = scheduledExecutorService;
        this.F = ysyVar;
        this.G = acplVar;
        this.a = zezVar;
        this.d = shfVar;
        this.f57J = awdjVar;
        this.o = str;
        this.p = str2;
        this.n = f;
        this.l = j;
        this.q = str3;
        this.s = i;
        this.t = j2;
        this.j = z;
        this.u = z2;
        this.v = z3;
        this.w = aigmVar;
        this.x = ahcxVar;
        this.r = 0L;
        this.c = vss3ConfigModel;
        this.z = z4;
        this.e = j3;
        this.E = aoneVar;
        this.D = aoneVar2;
        this.b = awedVar;
        this.f = j4;
        this.H = vss3ConfigModel.f;
        this.I = vss3ConfigModel.a;
        this.A = z5;
        this.B = z6;
        this.C = i2;
    }
}
