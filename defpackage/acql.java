package defpackage;

import android.app.Application;
import java.security.SecureRandom;
import java.util.Observable;
import java.util.Observer;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acql implements Observer {
    static final long a = TimeUnit.SECONDS.toMillis(30);
    static final long b = TimeUnit.SECONDS.toMillis(90);
    public static final /* synthetic */ int m = 0;
    private final ScheduledExecutorService A;
    private final zbw B;
    private final shf C;
    private final aaea D;
    private int F;
    private int G;
    private final ypa H;
    private final ynn I;

    /* renamed from: J, reason: collision with root package name */
    private final afsy f28J;
    private final ywr K;
    yqi e;
    public volatile afsx f;
    public volatile afsg g;
    public final acpl i;
    public final String j;
    private yqa u;
    private yqb v;
    private ScheduledFuture w;
    private ypc x;
    private ypc y;
    private final Application z;
    private boolean n = false;
    private boolean o = false;
    public boolean c = false;
    private boolean p = false;
    public boolean d = false;
    private long q = -1;
    private long r = -1;
    private long s = -1;
    private long t = -1;
    public int l = 1;
    public final Object h = new Object();
    private long E = 0;
    final Runnable k = new acqi(this, 1);

    public acql(acpl acplVar, Application application, ScheduledExecutorService scheduledExecutorService, zbw zbwVar, shf shfVar, aaea aaeaVar, ypa ypaVar, ynn ynnVar, afsy afsyVar, ywr ywrVar) {
        this.i = acplVar;
        this.z = application;
        this.A = scheduledExecutorService;
        this.B = zbwVar;
        this.C = shfVar;
        this.D = aaeaVar;
        this.H = ypaVar;
        this.I = ynnVar;
        this.f28J = afsyVar;
        this.K = ywrVar;
        byte[] bArr = new byte[32];
        new SecureRandom().nextBytes(bArr);
        this.j = anbp.d.i(bArr);
    }

    private final anhy m(long j) {
        return this.K.b(new fjv(j, 9));
    }

    public final anhy a() {
        return b(0L);
    }

    public final anhy b(long j) {
        synchronized (this.h) {
            if (this.F == 0) {
                return m(j);
            }
            anhy O = anaf.O(null);
            if (j > 1000000000) {
                j = 0;
            }
            int i = this.G - 1;
            this.G = i;
            if (i <= 0) {
                this.G = this.F;
                O = m(j);
            }
            this.E = j;
            return O;
        }
    }

    public final void c() {
        asui asuiVar;
        synchronized (this.h) {
            if (this.n) {
                afsi.b(2, 12, "HeartbeatClient.configure() have been called more than once.");
                return;
            }
            arfd a2 = this.D.a();
            if (a2 == null) {
                asuiVar = null;
            } else {
                asuj asujVar = a2.m;
                if (asujVar == null) {
                    asujVar = asuj.a;
                }
                asuiVar = asujVar.e;
                if (asuiVar == null) {
                    asuiVar = asui.a;
                }
            }
            if (asuiVar == null || !asuiVar.c) {
                synchronized (this.h) {
                    yqi yqiVar = this.e;
                    if (yqiVar != null) {
                        yqiVar.b(this.z);
                        this.e.d(this.u);
                        this.e.d(this.v);
                        this.B.deleteObserver(this);
                        this.H.l(this.x);
                        this.H.l(this.y);
                    }
                    i();
                }
                this.n = true;
            }
            int i = asuiVar.h;
            this.F = i;
            if (i != 0) {
                long j = ((awuv) this.K.c()).c;
                if (j == -1) {
                    j = 0;
                }
                this.G = 2;
                ynm.m(b(j + (this.F * 4)), abbr.d);
            }
            synchronized (this.h) {
                this.B.addObserver(this);
                this.x = this.H.a(this, aftm.class, new acqh(this, 1));
                this.y = this.H.a(this, afto.class, new acqh(this, 0));
                if (this.e == null) {
                    this.u = new acqj(this);
                    this.v = new acqk(this);
                    yqi yqiVar2 = new yqi();
                    this.e = yqiVar2;
                    yqiVar2.a(this.z);
                }
                this.e.c(this.u);
                this.e.c(this.v);
            }
            this.r = asuiVar.d <= 0 ? a : TimeUnit.SECONDS.toMillis(asuiVar.d);
            this.s = asuiVar.e <= 0 ? b : TimeUnit.SECONDS.toMillis(asuiVar.e);
            boolean z = asuiVar.f;
            this.c = z;
            this.p = asuiVar.g;
            this.d = asuiVar.i;
            this.f = z ? this.f28J.c() : null;
            this.g = this.c ? new afsg(this.f28J.g(), this.f28J.c().g()) : null;
            if (uon.c(this.z.getApplicationContext())) {
                f();
            } else {
                e();
            }
            this.n = true;
        }
    }

    public final void d() {
        synchronized (this.h) {
            afsx c = this.f28J.c();
            afsg afsgVar = new afsg(this.f28J.g(), c.g());
            if (c.d().equals(this.f.d())) {
                return;
            }
            j(4, this.f, this.g);
            this.f = c;
            this.g = afsgVar;
            ynm.k(a(), angq.a, new ynk() { // from class: acqc
                @Override // defpackage.zfi
                /* renamed from: b */
                public final void a(Throwable th) {
                    acql acqlVar = acql.this;
                    afsi.c(2, 12, "Failed to reset the heartbeat index.", th);
                    acqlVar.j(3, acqlVar.f, acqlVar.g);
                }
            }, new ynl() { // from class: acqe
                @Override // defpackage.ynl, defpackage.zfi
                public final void a(Object obj) {
                    acql acqlVar = acql.this;
                    acqlVar.j(3, acqlVar.f, acqlVar.g);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e() {
        this.I.a(2, new acqi(this, 0));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void f() {
        this.I.a(2, new acqi(this, 2));
    }

    public final void h() {
        synchronized (this.h) {
            i();
            long j = this.r;
            if (j > 0) {
                this.w = this.A.scheduleAtFixedRate(this.k, j, j, TimeUnit.MILLISECONDS);
                this.o = true;
            }
        }
    }

    public final void i() {
        synchronized (this.h) {
            ScheduledFuture scheduledFuture = this.w;
            if (scheduledFuture != null && !scheduledFuture.isCancelled()) {
                this.w.cancel(true);
            }
            this.o = false;
        }
    }

    public final void l(int i, afsx afsxVar, afsg afsgVar, aone aoneVar) {
        long j;
        synchronized (this.h) {
            long d = this.C.d();
            long j2 = this.t;
            long j3 = j2 == -1 ? -1L : d - j2;
            aoneVar.copyOnWrite();
            aqxq aqxqVar = (aqxq) aoneVar.instance;
            aqxq aqxqVar2 = aqxq.a;
            aqxqVar.b |= 4;
            aqxqVar.e = j3;
            long j4 = this.q;
            long j5 = j4 == -1 ? -1L : d - j4;
            aoneVar.copyOnWrite();
            aqxq aqxqVar3 = (aqxq) aoneVar.instance;
            aqxqVar3.b |= 1;
            aqxqVar3.c = j5;
            if (this.c) {
                double c = this.C.c();
                Double.isNaN(c);
                j = Math.round(c / 1000.0d) * 1000;
            } else {
                j = -1;
            }
            if (i == 4) {
                arpn a2 = arpp.a();
                a2.copyOnWrite();
                ((arpp) a2.instance).cA((aqxq) aoneVar.build());
                this.i.h((arpp) a2.build(), afsxVar, j, afsgVar);
            } else if (i == 3) {
                arpn a3 = arpp.a();
                a3.copyOnWrite();
                ((arpp) a3.instance).cA((aqxq) aoneVar.build());
                this.i.d((arpp) a3.build(), afsxVar, j, afsgVar);
                if (this.p) {
                    aone createBuilder = aqpy.a.createBuilder();
                    createBuilder.copyOnWrite();
                    aqpy aqpyVar = (aqpy) createBuilder.instance;
                    aqpyVar.b |= 1;
                    aqpyVar.c = true;
                    arpn a4 = arpp.a();
                    a4.copyOnWrite();
                    ((arpp) a4.instance).cs((aqpy) createBuilder.build());
                    this.i.c((arpp) a4.build());
                }
            } else {
                arpn a5 = arpp.a();
                a5.copyOnWrite();
                ((arpp) a5.instance).cA((aqxq) aoneVar.build());
                this.i.c((arpp) a5.build());
            }
            this.q = -1L;
            this.t = d;
        }
    }

    @Override // java.util.Observer
    public final void update(Observable observable, Object obj) {
        synchronized (this.h) {
            if (observable == this.B && this.q == -1) {
                this.q = ((Long) obj).longValue();
            }
        }
        if (this.l != 2 || this.o) {
            return;
        }
        h();
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x001e, code lost:
    
        if (r4 >= r6) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j(final int r12, final defpackage.afsx r13, final defpackage.afsg r14) {
        /*
            r11 = this;
            java.lang.Object r0 = r11.h
            monitor-enter(r0)
            r1 = 2
            r2 = -1
            if (r12 == r1) goto L9
            goto L25
        L9:
            zbw r4 = r11.B     // Catch: java.lang.Throwable -> La7
            long r4 = r4.a()     // Catch: java.lang.Throwable -> La7
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 != 0) goto L14
            goto L20
        L14:
            long r6 = r11.s     // Catch: java.lang.Throwable -> La7
            r8 = 0
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 <= 0) goto L25
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 < 0) goto L25
        L20:
            r11.i()     // Catch: java.lang.Throwable -> La7
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La7
            return
        L25:
            aqxq r4 = defpackage.aqxq.a     // Catch: java.lang.Throwable -> La7
            aone r4 = r4.createBuilder()     // Catch: java.lang.Throwable -> La7
            r5 = 3
            if (r12 != r5) goto L32
            r11.q = r2     // Catch: java.lang.Throwable -> La7
            r11.t = r2     // Catch: java.lang.Throwable -> La7
        L32:
            r4.copyOnWrite()     // Catch: java.lang.Throwable -> La7
            aonm r2 = r4.instance     // Catch: java.lang.Throwable -> La7
            aqxq r2 = (defpackage.aqxq) r2     // Catch: java.lang.Throwable -> La7
            int r3 = r12 + (-1)
            r2.f = r3     // Catch: java.lang.Throwable -> La7
            int r3 = r2.b     // Catch: java.lang.Throwable -> La7
            r3 = r3 | 8
            r2.b = r3     // Catch: java.lang.Throwable -> La7
            boolean r2 = r11.d     // Catch: java.lang.Throwable -> La7
            if (r2 == 0) goto L5b
            java.lang.String r2 = r11.j     // Catch: java.lang.Throwable -> La7
            r4.copyOnWrite()     // Catch: java.lang.Throwable -> La7
            aonm r3 = r4.instance     // Catch: java.lang.Throwable -> La7
            aqxq r3 = (defpackage.aqxq) r3     // Catch: java.lang.Throwable -> La7
            r2.getClass()     // Catch: java.lang.Throwable -> La7
            int r5 = r3.b     // Catch: java.lang.Throwable -> La7
            r5 = r5 | 16
            r3.b = r5     // Catch: java.lang.Throwable -> La7
            r3.g = r2     // Catch: java.lang.Throwable -> La7
        L5b:
            acqf r2 = new acqf     // Catch: java.lang.Throwable -> La7
            r5 = r2
            r6 = r11
            r7 = r12
            r8 = r13
            r9 = r14
            r10 = r4
            r5.<init>()     // Catch: java.lang.Throwable -> La7
            acqd r3 = new acqd     // Catch: java.lang.Throwable -> La7
            r5 = r3
            r6 = r11
            r7 = r12
            r8 = r13
            r9 = r14
            r10 = r4
            r5.<init>()     // Catch: java.lang.Throwable -> La7
            int r12 = r11.F     // Catch: java.lang.Throwable -> La7
            if (r12 == 0) goto L94
            long r12 = r11.E     // Catch: java.lang.Throwable -> La7
            r4.copyOnWrite()     // Catch: java.lang.Throwable -> La7
            aonm r14 = r4.instance     // Catch: java.lang.Throwable -> La7
            aqxq r14 = (defpackage.aqxq) r14     // Catch: java.lang.Throwable -> La7
            int r4 = r14.b     // Catch: java.lang.Throwable -> La7
            r1 = r1 | r4
            r14.b = r1     // Catch: java.lang.Throwable -> La7
            r14.d = r12     // Catch: java.lang.Throwable -> La7
            long r12 = r11.E     // Catch: java.lang.Throwable -> La7
            r4 = 1
            long r12 = r12 + r4
            anhy r12 = r11.b(r12)     // Catch: java.lang.Throwable -> La7
            angq r13 = defpackage.angq.a     // Catch: java.lang.Throwable -> La7
            defpackage.ynm.k(r12, r13, r3, r2)     // Catch: java.lang.Throwable -> La7
            goto La5
        L94:
            ywr r12 = r11.K     // Catch: java.lang.Throwable -> La7
            acqg r13 = new acqg     // Catch: java.lang.Throwable -> La7
            r14 = 0
            r13.<init>(r4, r14)     // Catch: java.lang.Throwable -> La7
            anhy r12 = r12.b(r13)     // Catch: java.lang.Throwable -> La7
            angq r13 = defpackage.angq.a     // Catch: java.lang.Throwable -> La7
            defpackage.ynm.k(r12, r13, r3, r2)     // Catch: java.lang.Throwable -> La7
        La5:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La7
            return
        La7:
            r12 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La7
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acql.j(int, afsx, afsg):void");
    }
}
