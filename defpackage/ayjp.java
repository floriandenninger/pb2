package defpackage;

import io.grpc.Status;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ayjp implements aybb, ayoh {
    public final ayjj a;
    public final ScheduledExecutorService b;
    public final ayay c;
    public final axzq d;
    public final aydh e;
    public final ayjk f;
    public volatile List g;
    public final amnp h;
    public aydg i;
    public aydg j;
    public ayli k;
    public aygo n;
    public volatile ayli o;
    public Status q;
    public ayih r;
    private final aybc s;
    private final String t;
    private final String u;
    private final aygi v;
    private final ayft w;
    public final Collection l = new ArrayList();
    public final ayiy m = new ayja(this);
    public volatile ayaf p = ayaf.a(ayae.IDLE);

    public ayjp(List list, String str, String str2, aygi aygiVar, ScheduledExecutorService scheduledExecutorService, aydh aydhVar, ayjj ayjjVar, ayay ayayVar, ayft ayftVar, aybc aybcVar, axzq axzqVar) {
        amkq.F(!list.isEmpty(), "addressGroups is empty");
        j(list);
        List unmodifiableList = Collections.unmodifiableList(new ArrayList(list));
        this.g = unmodifiableList;
        this.f = new ayjk(unmodifiableList);
        this.t = str;
        this.u = str2;
        this.v = aygiVar;
        this.b = scheduledExecutorService;
        this.h = amnp.c();
        this.e = aydhVar;
        this.a = ayjjVar;
        this.c = ayayVar;
        this.w = ayftVar;
        this.s = aybcVar;
        this.d = axzqVar;
    }

    public static void j(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            it.next().getClass();
        }
    }

    public static final String k(Status status) {
        StringBuilder sb = new StringBuilder();
        sb.append(status.getCode());
        if (status.getDescription() != null) {
            sb.append("(");
            sb.append(status.getDescription());
            sb.append(")");
        }
        return sb.toString();
    }

    @Override // defpackage.ayoh
    public final aygg a() {
        ayli ayliVar = this.o;
        if (ayliVar != null) {
            return ayliVar;
        }
        this.e.execute(new ayjb(this, 0));
        return null;
    }

    public final void b(ayae ayaeVar) {
        this.e.d();
        d(ayaf.a(ayaeVar));
    }

    @Override // defpackage.aybg
    public final aybc c() {
        return this.s;
    }

    public final void d(ayaf ayafVar) {
        aybr aylvVar;
        this.e.d();
        if (this.p.a != ayafVar.a) {
            boolean z = this.p.a != ayae.SHUTDOWN;
            String valueOf = String.valueOf(ayafVar);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 37);
            sb.append("Cannot transition out of SHUTDOWN to ");
            sb.append(valueOf);
            amkq.O(z, sb.toString());
            this.p = ayafVar;
            ayjj ayjjVar = this.a;
            amkq.O(true, "listener is null");
            aylu ayluVar = ayjjVar.a;
            ayly aylyVar = ayluVar.b;
            aybq aybqVar = ayluVar.a;
            ayae ayaeVar = ayafVar.a;
            if (ayaeVar != ayae.SHUTDOWN) {
                if (ayafVar.a == ayae.TRANSIENT_FAILURE || ayafVar.a == ayae.IDLE) {
                    aykk aykkVar = (aykk) aylyVar.b;
                    aykkVar.c.o.d();
                    aykkVar.b = true;
                    aykkVar.c.o.execute(new ayki(aykkVar));
                }
                int ordinal = ayaeVar.ordinal();
                if (ordinal == 0) {
                    aylvVar = new aylv(aybm.a);
                } else if (ordinal == 1) {
                    aylvVar = new aylv(aybm.c(aybqVar));
                } else if (ordinal == 2) {
                    aylvVar = new aylv(aybm.b(ayafVar.b));
                } else if (ordinal == 3) {
                    aylvVar = new aylx(aylyVar, aybqVar);
                } else {
                    String valueOf2 = String.valueOf(ayaeVar);
                    StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 18);
                    sb2.append("Unsupported state:");
                    sb2.append(valueOf2);
                    throw new IllegalArgumentException(sb2.toString());
                }
                aylyVar.b.b(ayaeVar, aylvVar);
            }
            if ((ayafVar.a == ayae.TRANSIENT_FAILURE || ayafVar.a == ayae.IDLE) && !ayjjVar.b.b.b) {
                aykx.a.logp(Level.WARNING, "io.grpc.internal.ManagedChannelImpl$SubchannelImpl$1ManagedInternalSubchannelCallback", "onStateChange", "LoadBalancer should call Helper.refreshNameResolution() to refresh name resolution if subchannel state becomes TRANSIENT_FAILURE or IDLE. This will no longer happen automatically in the future releases");
                ayjjVar.b.j.i();
                ayjjVar.b.b.b = true;
            }
        }
    }

    public final void e() {
        this.e.execute(new ayjb(this, 2));
    }

    public final void f(aygo aygoVar, boolean z) {
        this.e.execute(new ayje(this, aygoVar, z));
    }

    public final void g(Status status) {
        this.e.execute(new ayjf(this, status, 1));
    }

    public final void h() {
        ayat ayatVar;
        this.e.d();
        amkq.O(this.i == null, "Should have no reconnectTask scheduled");
        ayjk ayjkVar = this.f;
        if (ayjkVar.b == 0 && ayjkVar.c == 0) {
            amnp amnpVar = this.h;
            amnpVar.e();
            amnpVar.f();
        }
        SocketAddress a = this.f.a();
        if (a instanceof ayat) {
            ayat ayatVar2 = (ayat) a;
            ayatVar = ayatVar2;
            a = ayatVar2.a;
        } else {
            ayatVar = null;
        }
        ayjk ayjkVar2 = this.f;
        axzj axzjVar = ((ayan) ayjkVar2.a.get(ayjkVar2.b)).c;
        String str = (String) axzjVar.c(ayan.a);
        aygh ayghVar = new aygh();
        if (str == null) {
            str = this.t;
        }
        str.getClass();
        ayghVar.a = str;
        ayghVar.b = axzjVar;
        ayghVar.c = this.u;
        ayghVar.d = ayatVar;
        ayjo ayjoVar = new ayjo();
        ayjoVar.a = this.s;
        ayji ayjiVar = new ayji(this.v.a(a, ayghVar, ayjoVar), this.w);
        ayjoVar.a = ayjiVar.c();
        ayay.a(this.c.d, ayjiVar);
        this.n = ayjiVar;
        this.l.add(ayjiVar);
        Runnable d = ayjiVar.d(new ayjn(this, ayjiVar));
        if (d != null) {
            this.e.c(d);
        }
        this.d.b(2, "Started transport {0}", ayjoVar.a);
    }

    public final String toString() {
        ammu Y = amkq.Y(this);
        Y.f("logId", this.s.a);
        Y.b("addressGroups", this.g);
        return Y.toString();
    }
}
