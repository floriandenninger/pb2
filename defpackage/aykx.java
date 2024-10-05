package defpackage;

import io.grpc.Status;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aykx extends aybv implements aybb {
    public static final Logger a = Logger.getLogger(aykx.class.getName());
    static final Pattern b = Pattern.compile("[a-zA-Z][a-zA-Z0-9+.-]*:/.*");
    static final Status c = Status.o.withDescription("Channel shutdownNow invoked");
    public static final Status d = Status.o.withDescription("Channel shutdown invoked");
    static final Status e = Status.o.withDescription("Subchannel shutdown invoked");
    public static final aylg f = new aylg(null, new HashMap(), new HashMap(), null, null, null);
    public static final ayba g = new ayju();
    public static final axzr h = new ayka();
    public final AtomicBoolean A;
    public boolean B;
    public boolean C;
    public volatile boolean D;
    public final ayft E;
    public final ayfv F;
    public final axzq G;
    public final ayay H;
    public final aykt I;

    /* renamed from: J, reason: collision with root package name */
    public aylg f141J;
    public boolean K;
    public final boolean L;
    public final aymw M;
    public final long N;
    public final long O;
    public final boolean P;
    final ayiy Q;
    public aydg R;
    public int S;
    public ayih T;
    public final ayjv U;
    public final aykc V;
    private final String W;
    private final aycl X;
    private final aycj Y;
    private final ayfp Z;
    private final aykg aa;
    private final long ab;
    private final axzp ac;
    private aycq ad;
    private boolean ae;
    private final Set af;
    private final CountDownLatch ag;
    private final aylh ah;
    private final aymi ai;
    private final aynz aj;
    public final aybc i;
    public final aygi j;
    public final ayku k;
    public final Executor l;
    public final aykg m;
    public final ayof n;
    public final aydh o;
    public final ayam p;
    public final aygp q;
    public final String r;
    public aykk s;
    public volatile aybr t;
    public boolean u;
    public final Set v;
    public Collection w;
    public final Object x;
    public final ayhk y;
    public final aykw z;

    /* JADX WARN: Type inference failed for: r10v1, types: [java.util.concurrent.Executor, java.lang.Object] */
    public aykx(aylb aylbVar, aygi aygiVar, aynz aynzVar, amnv amnvVar, List list, ayof ayofVar) {
        aydh aydhVar = new aydh(new ayjy(this));
        this.o = aydhVar;
        this.q = new aygp();
        this.v = new HashSet(16, 0.75f);
        this.x = new Object();
        this.af = new HashSet(1, 0.75f);
        this.z = new aykw(this);
        this.A = new AtomicBoolean(false);
        this.ag = new CountDownLatch(1);
        this.S = 1;
        this.f141J = f;
        this.K = false;
        this.M = new aymw();
        aykf aykfVar = new aykf(this);
        this.ah = aykfVar;
        this.Q = new aykh(this);
        this.V = new aykc(this);
        String str = aylbVar.f;
        str.getClass();
        this.W = str;
        aybc b2 = aybc.b("Channel", str);
        this.i = b2;
        this.n = ayofVar;
        aynz aynzVar2 = aylbVar.n;
        aynzVar2.getClass();
        this.aj = aynzVar2;
        ?? b3 = aynzVar2.b();
        b3.getClass();
        this.l = b3;
        ayfs ayfsVar = new ayfs(aygiVar, b3);
        this.j = ayfsVar;
        new ayfs(aygiVar, b3);
        ayku aykuVar = new ayku(ayfsVar.b());
        this.k = aykuVar;
        long a2 = ayofVar.a();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 14);
        sb.append("Channel for '");
        sb.append(str);
        sb.append("'");
        ayfv ayfvVar = new ayfv(b2, a2, sb.toString());
        this.F = ayfvVar;
        ayfu ayfuVar = new ayfu(ayfvVar, ayofVar);
        this.G = ayfuVar;
        aycx aycxVar = ayiu.j;
        this.P = true;
        ayfp ayfpVar = new ayfp(aybu.b());
        this.Z = ayfpVar;
        aynz aynzVar3 = aylbVar.o;
        aynzVar3.getClass();
        this.m = new aykg(aynzVar3);
        aycp aycpVar = new aycp(true, ayfpVar);
        ayci ayciVar = new ayci();
        ayciVar.a = 443;
        aycxVar.getClass();
        ayciVar.b = aycxVar;
        ayciVar.c = aydhVar;
        ayciVar.e = aykuVar;
        ayciVar.d = aycpVar;
        ayciVar.f = ayfuVar;
        ayciVar.g = new ayjz(this);
        aycj aycjVar = new aycj(ayciVar.a, ayciVar.b, ayciVar.c, ayciVar.d, ayciVar.e, ayciVar.f, ayciVar.g);
        this.Y = aycjVar;
        aycl ayclVar = aylbVar.e;
        this.X = ayclVar;
        this.ad = o(str, ayclVar, aycjVar);
        this.aa = new aykg(aynzVar);
        ayhk ayhkVar = new ayhk(b3, aydhVar);
        this.y = ayhkVar;
        ayhkVar.f = aykfVar;
        ayhkVar.c = new ayhh(aykfVar, 1);
        ayhkVar.d = new ayhh(aykfVar, 0);
        ayhkVar.e = new ayhh(aykfVar, 2);
        this.L = true;
        aykt ayktVar = new aykt(this, this.ad.a());
        this.I = ayktVar;
        this.ac = axzw.a(ayktVar, list);
        amnvVar.getClass();
        long j = aylbVar.j;
        if (j == -1) {
            this.ab = j;
        } else {
            amkq.I(j >= aylb.b, "invalid idleTimeoutMillis %s", aylbVar.j);
            this.ab = aylbVar.j;
        }
        this.ai = new aymi(new ayjx(this, 4), aydhVar, ayfsVar.b(), amnp.c());
        ayam ayamVar = aylbVar.h;
        ayamVar.getClass();
        this.p = ayamVar;
        aylbVar.i.getClass();
        this.r = aylbVar.g;
        this.O = 16777216L;
        this.N = 1048576L;
        ayjv ayjvVar = new ayjv(ayofVar);
        this.U = ayjvVar;
        this.E = ayjvVar.a();
        ayay ayayVar = aylbVar.k;
        ayayVar.getClass();
        this.H = ayayVar;
        ayay.a(ayayVar.b, this);
    }

    private static aycq o(String str, aycl ayclVar, aycj aycjVar) {
        URI uri;
        aycq a2;
        StringBuilder sb = new StringBuilder();
        try {
            uri = new URI(str);
        } catch (URISyntaxException e2) {
            sb.append(e2.getMessage());
            uri = null;
        }
        if (uri != null && (a2 = ayclVar.a(uri, aycjVar)) != null) {
            return a2;
        }
        String str2 = "";
        if (!b.matcher(str).matches()) {
            try {
                String b2 = ayclVar.b();
                String valueOf = String.valueOf(str);
                aycq a3 = ayclVar.a(new URI(b2, "", valueOf.length() != 0 ? "/".concat(valueOf) : new String("/"), null), aycjVar);
                if (a3 != null) {
                    return a3;
                }
            } catch (URISyntaxException e3) {
                throw new IllegalArgumentException(e3);
            }
        }
        Object[] objArr = new Object[2];
        objArr[0] = str;
        if (sb.length() > 0) {
            String valueOf2 = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 3);
            sb2.append(" (");
            sb2.append(valueOf2);
            sb2.append(")");
            str2 = sb2.toString();
        }
        objArr[1] = str2;
        throw new IllegalArgumentException(String.format("cannot find a NameResolver for %s%s", objArr));
    }

    private final void p() {
        this.o.d();
        aydg aydgVar = this.R;
        if (aydgVar != null) {
            aydgVar.a();
            this.R = null;
            this.T = null;
        }
    }

    @Override // defpackage.axzp
    public final axzr a(aych aychVar, axzo axzoVar) {
        return this.ac.a(aychVar, axzoVar);
    }

    @Override // defpackage.axzp
    public final String b() {
        return this.ac.b();
    }

    @Override // defpackage.aybg
    public final aybc c() {
        return this.i;
    }

    public final Executor d(axzo axzoVar) {
        Executor executor = axzoVar.c;
        return executor == null ? this.l : executor;
    }

    public final void e(boolean z) {
        ScheduledFuture scheduledFuture;
        aymi aymiVar = this.ai;
        aymiVar.e = false;
        if (!z || (scheduledFuture = aymiVar.f) == null) {
            return;
        }
        scheduledFuture.cancel(false);
        aymiVar.f = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void f() {
        this.o.d();
        if (this.A.get() || this.u) {
            return;
        }
        if (this.Q.a.isEmpty()) {
            k();
        } else {
            e(false);
        }
        if (this.s != null) {
            return;
        }
        this.G.a(2, "Exiting idle mode");
        aykk aykkVar = new aykk(this);
        aykkVar.a = new ayfk(this.Z, aykkVar);
        this.s = aykkVar;
        this.ad.d(new aycm(this, aykkVar, this.ad));
        this.ae = true;
    }

    public final void g() {
        if (this.B) {
            for (ayjp ayjpVar : this.v) {
                Status status = c;
                ayjpVar.g(status);
                ayjpVar.e.execute(new ayjf(ayjpVar, status, 0));
            }
            Iterator it = this.af.iterator();
            if (it.hasNext()) {
                throw null;
            }
        }
    }

    public final void h() {
        if (!this.D && this.A.get() && this.v.isEmpty() && this.af.isEmpty()) {
            this.G.a(2, "Terminated");
            ayay.b(this.H.b, this);
            this.aj.c(this.l);
            this.aa.b();
            this.m.b();
            this.j.close();
            this.D = true;
            this.ag.countDown();
        }
    }

    public final void i() {
        this.o.d();
        p();
        j();
    }

    public final void j() {
        this.o.d();
        if (this.ae) {
            this.ad.b();
        }
    }

    public final void k() {
        long j = this.ab;
        if (j == -1) {
            return;
        }
        aymi aymiVar = this.ai;
        long nanos = TimeUnit.MILLISECONDS.toNanos(j);
        long a2 = aymiVar.a() + nanos;
        aymiVar.e = true;
        if (a2 - aymiVar.d < 0 || aymiVar.f == null) {
            ScheduledFuture scheduledFuture = aymiVar.f;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            aymiVar.f = aymiVar.a.schedule(new aymh(aymiVar, 0), nanos, TimeUnit.NANOSECONDS);
        }
        aymiVar.d = a2;
    }

    public final void l(boolean z) {
        this.o.d();
        if (z) {
            amkq.O(this.ae, "nameResolver is not started");
            amkq.O(this.s != null, "lbHelper is null");
        }
        if (this.ad != null) {
            p();
            this.ad.c();
            this.ae = false;
            if (z) {
                this.ad = o(this.W, this.X, this.Y);
            } else {
                this.ad = null;
            }
        }
        aykk aykkVar = this.s;
        if (aykkVar != null) {
            ayfk ayfkVar = aykkVar.a;
            ayfkVar.b.c();
            ayfkVar.b = null;
            this.s = null;
        }
        this.t = null;
    }

    public final void m(aybr aybrVar) {
        this.t = aybrVar;
        this.y.a(aybrVar);
    }

    public final void n() {
        this.G.a(1, "shutdown() called");
        if (this.A.compareAndSet(false, true)) {
            this.o.execute(new ayjx(this, 0));
            aykt ayktVar = this.I;
            ayktVar.c.o.execute(new ayko(ayktVar, 1));
            this.o.execute(new ayjx(this, 1));
        }
    }

    public final String toString() {
        ammu Y = amkq.Y(this);
        Y.f("logId", this.i.a);
        Y.b("target", this.W);
        return Y.toString();
    }
}
