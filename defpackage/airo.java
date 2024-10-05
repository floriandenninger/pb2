package defpackage;

import android.util.Base64;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class airo implements afia {
    private final Runnable A;
    private final Runnable B;
    private final Runnable C;
    private final Runnable D;
    private long E;
    private final Runnable F;
    private final ScheduledExecutorService G;
    private ScheduledFuture H;
    private int I;

    /* renamed from: J, reason: collision with root package name */
    private long f58J;
    private int K;
    private aone L;
    public final shf a;
    public final Executor b;
    public final afhz c;
    public final airi d;
    public final long e;
    public final int f;
    public final float g;
    public final int h;
    public final float i;
    public volatile boolean j;
    public boolean k;
    public volatile boolean l;
    public long m;
    public volatile int n;
    public aheg p;
    public boolean q;
    private final boolean r;
    private final int s;
    private final int t;
    private final boolean u;
    private final int v;
    private long w;
    private volatile long y;
    private volatile int z;
    private final Object x = new Object();
    public final Object o = new Object();

    public airo(shf shfVar, Executor executor, airi airiVar, afhz afhzVar, auij auijVar, ScheduledExecutorService scheduledExecutorService) {
        final int i = 1;
        this.A = new Runnable(this) { // from class: airk
            public final /* synthetic */ airo a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i2 = i;
                if (i2 == 0) {
                    this.a.g(false);
                    return;
                }
                if (i2 == 1) {
                    this.a.g(true);
                    return;
                }
                if (i2 == 2) {
                    this.a.h(true);
                } else if (i2 != 3) {
                    this.a.j(false);
                } else {
                    this.a.h(false);
                }
            }
        };
        final int i2 = 0;
        this.B = new Runnable(this) { // from class: airk
            public final /* synthetic */ airo a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i22 = i2;
                if (i22 == 0) {
                    this.a.g(false);
                    return;
                }
                if (i22 == 1) {
                    this.a.g(true);
                    return;
                }
                if (i22 == 2) {
                    this.a.h(true);
                } else if (i22 != 3) {
                    this.a.j(false);
                } else {
                    this.a.h(false);
                }
            }
        };
        final int i3 = 2;
        this.C = new Runnable(this) { // from class: airk
            public final /* synthetic */ airo a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i22 = i3;
                if (i22 == 0) {
                    this.a.g(false);
                    return;
                }
                if (i22 == 1) {
                    this.a.g(true);
                    return;
                }
                if (i22 == 2) {
                    this.a.h(true);
                } else if (i22 != 3) {
                    this.a.j(false);
                } else {
                    this.a.h(false);
                }
            }
        };
        final int i4 = 3;
        this.D = new Runnable(this) { // from class: airk
            public final /* synthetic */ airo a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i22 = i4;
                if (i22 == 0) {
                    this.a.g(false);
                    return;
                }
                if (i22 == 1) {
                    this.a.g(true);
                    return;
                }
                if (i22 == 2) {
                    this.a.h(true);
                } else if (i22 != 3) {
                    this.a.j(false);
                } else {
                    this.a.h(false);
                }
            }
        };
        final int i5 = 4;
        this.F = new Runnable(this) { // from class: airk
            public final /* synthetic */ airo a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i22 = i5;
                if (i22 == 0) {
                    this.a.g(false);
                    return;
                }
                if (i22 == 1) {
                    this.a.g(true);
                    return;
                }
                if (i22 == 2) {
                    this.a.h(true);
                } else if (i22 != 3) {
                    this.a.j(false);
                } else {
                    this.a.h(false);
                }
            }
        };
        this.a = shfVar;
        this.b = executor;
        this.d = airiVar;
        this.c = afhzVar;
        this.r = auijVar.m;
        this.s = auijVar.n;
        this.t = auijVar.o;
        this.u = auijVar.p;
        this.v = auijVar.u;
        this.f = auijVar.w;
        this.h = auijVar.s;
        this.g = auijVar.v;
        this.i = auijVar.t;
        this.j = auijVar.q;
        this.G = scheduledExecutorService;
        long d = shfVar.d();
        this.e = d;
        this.w = d + 30000;
        this.k = true;
        this.n = 0;
        this.L = ande.a.createBuilder();
        this.q = false;
        this.I = 0;
        this.m = 0L;
        this.l = false;
        this.K = 1;
        this.f58J = -1L;
    }

    private final synchronized float l(long j) {
        this.E += (this.a.d() - j) / 1000;
        return Math.round(((float) (r0 * 10)) / 1000.0f) / 10.0f;
    }

    private final synchronized void m() {
        ScheduledFuture scheduledFuture = this.H;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            this.H = null;
        }
    }

    private final void n(boolean z) {
        aone aoneVar;
        synchronized (this.o) {
            long j = this.f58J;
            int i = this.K;
            int i2 = this.I;
            int i3 = this.n;
            if (i3 != 5 && i3 != 9) {
                return;
            }
            if (z) {
                this.f58J = this.a.d();
            } else {
                this.f58J = -1L;
                this.K = 1;
            }
            this.I++;
            if (j < 0) {
                return;
            }
            if (i2 >= this.v) {
                zga.l("We've reached the rebuffer observation threshold for this reporting interval");
                return;
            }
            int i4 = i3 == 5 ? 2 : 3;
            float l = l(j);
            if (l >= 0.0f) {
                aoneVar = andf.a.createBuilder();
                aoneVar.copyOnWrite();
                andf andfVar = (andf) aoneVar.instance;
                andfVar.c = i4 - 1;
                andfVar.b |= 1;
                aoneVar.copyOnWrite();
                andf andfVar2 = (andf) aoneVar.instance;
                andfVar2.b |= 4;
                andfVar2.e = l;
                if (i != 1) {
                    boolean z2 = i == 2;
                    aoneVar.copyOnWrite();
                    andf andfVar3 = (andf) aoneVar.instance;
                    andfVar3.b = 2 | andfVar3.b;
                    andfVar3.d = z2;
                }
            } else {
                aoneVar = null;
            }
            synchronized (this.o) {
                if (aoneVar != null) {
                    aone aoneVar2 = this.L;
                    aoneVar2.copyOnWrite();
                    ande andeVar = (ande) aoneVar2.instance;
                    andf andfVar4 = (andf) aoneVar.build();
                    ande andeVar2 = ande.a;
                    andfVar4.getClass();
                    aony aonyVar = andeVar.c;
                    if (!aonyVar.c()) {
                        andeVar.c = aonm.mutableCopy(aonyVar);
                    }
                    andeVar.c.add(andfVar4);
                }
            }
        }
    }

    private final void o(long j, int i) {
        if (i <= 0) {
            StringBuilder sb = new StringBuilder(65);
            sb.append("bandwidthElapsed not > 0, bandwidthBytes is: ");
            sb.append(j);
            zga.l(sb.toString());
            return;
        }
        airi airiVar = this.d;
        amkq.E(true);
        tcr a = tcs.a();
        a.b = Long.valueOf(j);
        a.a = Long.valueOf(TimeUnit.MILLISECONDS.toMicros(i));
        airiVar.a.a(a.a());
    }

    private final synchronized boolean p() {
        return this.H != null;
    }

    private static final boolean q(int i) {
        return (i == 3 || i == 8 || i == 7) ? false : true;
    }

    @Override // defpackage.afia
    public final void a(afio afioVar) {
        synchronized (this.x) {
            this.y += afioVar.c;
            this.z += afioVar.b;
        }
        f(false);
    }

    @Override // defpackage.afia
    public final /* synthetic */ void b(Exception exc) {
    }

    @Override // defpackage.afia
    public final /* synthetic */ void c(int i) {
    }

    public final synchronized long e() {
        return this.E;
    }

    public final void f(boolean z) {
        if (this.r) {
            if (z) {
                this.b.execute(this.A);
                return;
            } else {
                this.b.execute(this.B);
                return;
            }
        }
        if (z) {
            this.b.execute(this.C);
        } else {
            this.b.execute(this.D);
        }
    }

    public final void g(boolean z) {
        synchronized (this.x) {
            long d = this.a.d();
            if (this.y > 0 && (z || d > this.w)) {
                if (this.z <= this.s && this.y <= this.t) {
                    if (this.u) {
                        this.y = 0L;
                        this.z = 0;
                    }
                    this.w = d + 30000;
                }
                o(this.y, this.z);
                this.y = 0L;
                this.z = 0;
                this.w = d + 30000;
            }
        }
    }

    public final void h(boolean z) {
        synchronized (this.x) {
            long d = this.a.d();
            if (this.y > 0 && (z || d > this.w)) {
                if (this.z > this.s) {
                    o(this.y, this.z);
                }
                this.w = d + 30000;
                this.y = 0L;
                this.z = 0;
            }
        }
    }

    public final void i(int i) {
        if (this.j && this.q && this.n != i) {
            boolean z = this.n == 5 || this.n == 9;
            boolean z2 = i == 5 || i == 9;
            if (z) {
                if (!z2) {
                    n(false);
                } else if (i == 9) {
                    n(true);
                } else {
                    i = this.n;
                }
            } else if (z2) {
                synchronized (this.o) {
                    if (this.f58J < 0) {
                        aheg ahegVar = this.p;
                        if (ahegVar != null && ahegVar.a() != -1 && this.p.e() != -1) {
                            this.K = this.p.a() - this.p.e() > 0 ? 2 : 3;
                            this.p = null;
                            this.f58J = this.a.d();
                        }
                        this.K = 1;
                        this.f58J = this.a.d();
                    }
                }
            }
            if (q(i) && !p()) {
                k();
            }
            this.n = i;
        }
    }

    public final void j(boolean z) {
        ande andeVar;
        m();
        if (this.l) {
            return;
        }
        n(true);
        synchronized (this.o) {
            aone aoneVar = this.L;
            aoneVar.copyOnWrite();
            ande andeVar2 = (ande) aoneVar.instance;
            ande andeVar3 = ande.a;
            andeVar2.b = 1 | andeVar2.b;
            andeVar2.d = z;
            andeVar = (ande) aoneVar.build();
            this.I = 0;
            this.L = ande.a.createBuilder();
        }
        try {
            final String encodeToString = Base64.encodeToString(andeVar.toByteArray(), 0);
            this.b.execute(new Runnable() { // from class: airm
                @Override // java.lang.Runnable
                public final void run() {
                    airo airoVar = airo.this;
                    String str = encodeToString;
                    if (airoVar.j) {
                        long j = airoVar.m * airoVar.h;
                        if (j > airoVar.f && ((float) (airoVar.e() / j)) > airoVar.g) {
                            zga.l("Threshold for long playtime and rebuffer rate have been met, ceaseing all rebuffer reports");
                            airoVar.j = false;
                        } else if (new Random().nextDouble() < airoVar.i) {
                            airi airiVar = airoVar.d;
                            tcr a = tcs.a();
                            a.c(12);
                            a.b("rebuffers", str);
                            airiVar.a.a(a.a());
                        }
                    }
                    airoVar.m++;
                }
            });
        } catch (AssertionError unused) {
            zga.l("Error when encoding currentRebufferInfo");
        }
        if (!q(this.n) || z) {
            return;
        }
        k();
    }

    public final synchronized void k() {
        m();
        this.H = this.G.schedule(this.F, this.h, TimeUnit.SECONDS);
    }

    @Override // defpackage.afia
    public final /* synthetic */ void rP(long j) {
    }
}
