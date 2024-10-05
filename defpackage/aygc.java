package defpackage;

import io.grpc.Status;
import java.nio.charset.Charset;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aygc extends axzr {
    private static final Logger h = Logger.getLogger(aygc.class.getName());
    public final aych a;
    public final Executor b;
    public final ayft c;
    public final ayai d;
    public aygd e;
    public volatile boolean f;
    public ayam g = ayam.b;
    private final boolean i;
    private volatile ScheduledFuture j;
    private final boolean k;
    private axzo l;
    private boolean m;
    private boolean n;
    private final ScheduledExecutorService o;
    private final aykc p;

    static {
        "gzip".getBytes(Charset.forName("US-ASCII"));
    }

    public aygc(aych aychVar, Executor executor, axzo axzoVar, aykc aykcVar, ScheduledExecutorService scheduledExecutorService, ayft ayftVar) {
        ayad ayadVar = ayad.a;
        this.a = aychVar;
        String str = aychVar.b;
        System.identityHashCode(this);
        int i = aypd.a;
        if (executor == angq.a) {
            this.b = new aynn();
            this.i = true;
        } else {
            this.b = new aynr(executor);
            this.i = false;
        }
        this.c = ayftVar;
        this.d = ayai.b();
        this.k = aychVar.a == aycg.UNARY || aychVar.a == aycg.SERVER_STREAMING;
        this.l = axzoVar;
        this.p = aykcVar;
        this.o = scheduledExecutorService;
    }

    private final void h(Object obj) {
        amkq.O(this.e != null, "Not started");
        amkq.O(!this.m, "call was cancelled");
        amkq.O(!this.n, "call was half-closed");
        try {
            aygd aygdVar = this.e;
            if (!(aygdVar instanceof aynl)) {
                aygdVar.n(this.a.b(obj));
            } else {
                aynl aynlVar = (aynl) aygdVar;
                aynb aynbVar = aynlVar.r;
                if (aynbVar.a) {
                    aynbVar.f.a.n(aynlVar.e.b(obj));
                } else {
                    aynlVar.s(new aymq(aynlVar, obj));
                }
            }
            if (this.k) {
                return;
            }
            this.e.d();
        } catch (Error e) {
            this.e.c(Status.c.withDescription("Client sendMessage() failed with Error"));
            throw e;
        } catch (RuntimeException e2) {
            this.e.c(Status.c.c(e2).withDescription("Failed to stream message"));
        }
    }

    @Override // defpackage.axzr
    public final void b(String str, Throwable th) {
        Status withDescription;
        int i = aypd.a;
        if (str == null && th == null) {
            th = new CancellationException("Cancelled without a message or cause");
            h.logp(Level.WARNING, "io.grpc.internal.ClientCallImpl", "cancelInternal", "Cancelling without a message or cause is suboptimal", th);
        }
        if (this.m) {
            return;
        }
        this.m = true;
        try {
            if (this.e != null) {
                Status status = Status.c;
                if (str != null) {
                    withDescription = status.withDescription(str);
                } else {
                    withDescription = status.withDescription("Call cancelled without message");
                }
                if (th != null) {
                    withDescription = withDescription.c(th);
                }
                this.e.c(withDescription);
            }
        } finally {
            g();
        }
    }

    @Override // defpackage.axzr
    public final void c() {
        int i = aypd.a;
        amkq.O(this.e != null, "Not started");
        amkq.O(!this.m, "call was cancelled");
        amkq.O(!this.n, "call already half-closed");
        this.n = true;
        this.e.e();
    }

    @Override // defpackage.axzr
    public final void d(int i) {
        int i2 = aypd.a;
        amkq.O(this.e != null, "Not started");
        amkq.F(true, "Number requested must be non-negative");
        this.e.g(i);
    }

    @Override // defpackage.axzr
    public final void e(Object obj) {
        int i = aypd.a;
        h(obj);
    }

    public final ayaj f() {
        ayaj ayajVar = this.l.b;
        if (ayajVar == null) {
            return null;
        }
        return ayajVar;
    }

    public final void g() {
        ScheduledFuture scheduledFuture = this.j;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
    }

    @Override // defpackage.axzr
    public final void k(ayaw ayawVar, aycd aycdVar) {
        axzo axzoVar;
        aygd aynlVar;
        int i = aypd.a;
        amkq.O(this.e == null, "Already started");
        amkq.O(!this.m, "call was cancelled");
        ayle ayleVar = (ayle) this.l.e(ayle.a);
        if (ayleVar != null) {
            Long l = ayleVar.b;
            if (l != null) {
                ayaj c = ayaj.c(l.longValue(), TimeUnit.NANOSECONDS);
                ayaj ayajVar = this.l.b;
                if (ayajVar == null || c.compareTo(ayajVar) < 0) {
                    this.l = this.l.a(c);
                }
            }
            Boolean bool = ayleVar.c;
            if (bool != null) {
                if (bool.booleanValue()) {
                    axzoVar = new axzo(this.l);
                    axzoVar.e = Boolean.TRUE;
                } else {
                    axzoVar = new axzo(this.l);
                    axzoVar.e = Boolean.FALSE;
                }
                this.l = axzoVar;
            }
            Integer num = ayleVar.d;
            if (num != null) {
                axzo axzoVar2 = this.l;
                Integer num2 = axzoVar2.f;
                if (num2 != null) {
                    this.l = axzoVar2.b(Math.min(num2.intValue(), ayleVar.d.intValue()));
                } else {
                    this.l = axzoVar2.b(num.intValue());
                }
            }
            Integer num3 = ayleVar.e;
            if (num3 != null) {
                axzo axzoVar3 = this.l;
                Integer num4 = axzoVar3.g;
                if (num4 != null) {
                    this.l = axzoVar3.c(Math.min(num4.intValue(), ayleVar.e.intValue()));
                } else {
                    this.l = axzoVar3.c(num3.intValue());
                }
            }
        }
        ayab ayabVar = ayaa.a;
        ayam ayamVar = this.g;
        aycdVar.d(ayiu.f);
        aycdVar.d(ayiu.b);
        if (ayabVar != ayaa.a) {
            aycdVar.f(ayiu.b, "identity");
        }
        aycdVar.d(ayiu.c);
        byte[] bArr = ayamVar.d;
        if (bArr.length != 0) {
            aycdVar.f(ayiu.c, bArr);
        }
        aycdVar.d(ayiu.d);
        aycdVar.d(ayiu.e);
        ayaj f = f();
        if (f != null && f.d()) {
            ayep[] k = ayiu.k(this.l, aycdVar, 0, false);
            Status status = Status.f;
            String valueOf = String.valueOf(f);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 44);
            sb.append("ClientCall started after deadline exceeded: ");
            sb.append(valueOf);
            this.e = new ayii(status.withDescription(sb.toString()), k, null, null, null);
        } else {
            ayaj ayajVar2 = this.l.b;
            Logger logger = h;
            if (logger.isLoggable(Level.FINE) && f != null && f.equals(null)) {
                StringBuilder sb2 = new StringBuilder(String.format("Call timeout set to '%d' ns, due to context deadline.", Long.valueOf(Math.max(0L, f.b(TimeUnit.NANOSECONDS)))));
                if (ayajVar2 == null) {
                    sb2.append(" Explicit call timeout was not set.");
                } else {
                    sb2.append(String.format(" Explicit call timeout was '%d' ns.", Long.valueOf(ayajVar2.b(TimeUnit.NANOSECONDS))));
                }
                logger.logp(Level.FINE, "io.grpc.internal.ClientCallImpl", "logIfContextNarrowedTimeout", sb2.toString());
            }
            aykc aykcVar = this.p;
            aych aychVar = this.a;
            axzo axzoVar4 = this.l;
            ayai ayaiVar = this.d;
            aykx aykxVar = aykcVar.a;
            if (!aykxVar.P) {
                aygg a = aykcVar.a(new aybn(aychVar, aycdVar, axzoVar4));
                ayai a2 = ayaiVar.a();
                try {
                    aynlVar = a.l(aychVar, aycdVar, axzoVar4, ayiu.k(axzoVar4, aycdVar, 0, false));
                    ayaiVar.c(a2);
                } catch (Throwable th) {
                    ayaiVar.c(a2);
                    throw th;
                }
            } else {
                aynk aynkVar = aykxVar.f141J.a;
                ayle ayleVar2 = (ayle) axzoVar4.e(ayle.a);
                aynlVar = new aynl(aykcVar, aychVar, aycdVar, axzoVar4, ayleVar2 == null ? null : ayleVar2.f, ayleVar2 == null ? null : ayleVar2.g, aynkVar, ayaiVar);
            }
            this.e = aynlVar;
        }
        if (this.i) {
            this.e.f();
        }
        Integer num5 = this.l.f;
        if (num5 != null) {
            this.e.k(num5.intValue());
        }
        Integer num6 = this.l.g;
        if (num6 != null) {
            this.e.l(num6.intValue());
        }
        if (f != null) {
            this.e.i(f);
        }
        this.e.h(ayabVar);
        this.e.j(this.g);
        this.c.b();
        this.e.m(new ayga(this, ayawVar, null, null));
        ayai.d(angq.a, "executor");
        if (f != null && !f.equals(null) && this.o != null) {
            long b = f.b(TimeUnit.NANOSECONDS);
            this.j = this.o.schedule(new ayjs(new aygb(this, b)), b, TimeUnit.NANOSECONDS);
        }
        if (this.f) {
            g();
        }
    }

    public final String toString() {
        ammu Y = amkq.Y(this);
        Y.b("method", this.a);
        return Y.toString();
    }
}
