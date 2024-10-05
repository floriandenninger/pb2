package defpackage;

import io.grpc.Status;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import org.chromium.net.BidirectionalStream;
import org.chromium.net.ExperimentalBidirectionalStream;
import org.chromium.net.ExperimentalCronetEngine;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class ayfd extends ayfi implements aygd, aylp {
    public static final Logger q = Logger.getLogger(ayfd.class.getName());
    private final ayip a;
    private aycd b;
    private volatile boolean c;

    /* JADX INFO: Access modifiers changed from: protected */
    public ayfd(ayoa ayoaVar, aycd aycdVar, axzo axzoVar) {
        ayiu.h(axzoVar);
        this.a = new aylq(this, ayoaVar);
        this.b = aycdVar;
    }

    @Override // defpackage.aygd
    public final void b(ayiz ayizVar) {
        ayizVar.b("remote_addr", a().c(ayar.a));
    }

    @Override // defpackage.aygd
    public final void c(Status status) {
        amkq.F(!status.f(), "Should not cancel with OK status");
        this.c = true;
        ayew u = u();
        ayix ayixVar = u.a.p;
        ayca aycaVar = ayix.m;
        synchronized (ayixVar.r) {
            ayix ayixVar2 = u.a.p;
            if (ayixVar2.u) {
                return;
            }
            ayixVar2.u = true;
            ayixVar2.w = status;
            Iterator it = ayixVar2.s.iterator();
            while (it.hasNext()) {
            }
            ayixVar2.s.clear();
            ayex ayexVar = u.a;
            BidirectionalStream bidirectionalStream = ayexVar.k;
            if (bidirectionalStream != null) {
                bidirectionalStream.cancel();
            } else {
                ayexVar.i.a(ayexVar, status);
            }
        }
    }

    @Override // defpackage.aygd
    public final void e() {
        if (t().k) {
            return;
        }
        t().k = true;
        aylq aylqVar = (aylq) v();
        if (aylqVar.f) {
            return;
        }
        aylqVar.f = true;
        ayfb ayfbVar = aylqVar.j;
        if (ayfbVar != null && ayfbVar.a() == 0 && aylqVar.j != null) {
            aylqVar.j = null;
        }
        aylqVar.b(true, true);
    }

    @Override // defpackage.aygd
    public final void i(ayaj ayajVar) {
        this.b.d(ayiu.a);
        this.b.f(ayiu.a, Long.valueOf(Math.max(0L, ayajVar.b(TimeUnit.NANOSECONDS))));
    }

    @Override // defpackage.aygd
    public final void j(ayam ayamVar) {
        ayfh t = t();
        amkq.O(t.i == null, "Already called start");
        ayamVar.getClass();
        t.j = ayamVar;
    }

    @Override // defpackage.aygd
    public final void k(int i) {
        ((aylm) t().a).b = i;
    }

    @Override // defpackage.aygd
    public final void l(int i) {
        aylq aylqVar = (aylq) this.a;
        amkq.O(aylqVar.a == -1, "max size already set");
        aylqVar.a = i;
    }

    @Override // defpackage.aygd
    public final void m(aygf aygfVar) {
        ayfh t = t();
        amkq.O(t.i == null, "Already called setListener");
        t.i = aygfVar;
        ayew u = u();
        u.a.j.run();
        ayex ayexVar = u.a;
        if (ayexVar.o != null) {
            ayeu ayeuVar = new ayeu(ayexVar);
            ayex ayexVar2 = u.a;
            ExperimentalBidirectionalStream.Builder newBidirectionalStreamBuilder = ((ExperimentalCronetEngine) ayexVar2.o.a).newBidirectionalStreamBuilder(ayexVar2.d, ayeuVar, ayexVar2.g);
            if (u.a.l) {
                newBidirectionalStreamBuilder.delayRequestHeadersUntilFirstFlush(true);
            }
            ayex ayexVar3 = u.a;
            Object obj = ayexVar3.m;
            if (obj != null || ayexVar3.n != null) {
                if (obj != null) {
                    ayex.q(newBidirectionalStreamBuilder, obj);
                }
                Collection collection = u.a.n;
                if (collection != null) {
                    Iterator it = collection.iterator();
                    while (it.hasNext()) {
                        ayex.q(newBidirectionalStreamBuilder, it.next());
                    }
                }
            }
            ayex ayexVar4 = u.a;
            newBidirectionalStreamBuilder.addHeader(ayiu.i.a, ayexVar4.e);
            newBidirectionalStreamBuilder.addHeader(ayiu.g.a, "application/grpc");
            newBidirectionalStreamBuilder.addHeader("te", "trailers");
            byte[][] a = ayog.a(ayexVar4.h);
            for (int i = 0; i < a.length; i += 2) {
                String str = new String(a[i], Charset.forName("UTF-8"));
                if (!ayiu.g.a.equalsIgnoreCase(str) && !ayiu.i.a.equalsIgnoreCase(str) && !ayiu.h.a.equalsIgnoreCase(str)) {
                    newBidirectionalStreamBuilder.addHeader(str, new String(a[i + 1], Charset.forName("UTF-8")));
                }
            }
            u.a.k = newBidirectionalStreamBuilder.build();
            u.a.k.start();
        }
        this.b = null;
    }

    @Override // defpackage.ayfi, defpackage.ayob
    public final boolean o() {
        return (((aylq) v()).f || !p().c() || this.c) ? false : true;
    }

    @Override // defpackage.ayfi
    public /* bridge */ /* synthetic */ ayfh p() {
        throw null;
    }

    protected abstract ayfh t();

    protected abstract ayew u();

    @Override // defpackage.ayfi
    protected final ayip v() {
        return this.a;
    }

    @Override // defpackage.aylp
    public final void w(ayfb ayfbVar, boolean z, boolean z2) {
        ByteBuffer byteBuffer;
        boolean z3 = true;
        if (ayfbVar == null && !z) {
            z3 = false;
        }
        amkq.F(z3, "null frame before EOS");
        ayew u = u();
        ayix ayixVar = u.a.p;
        ayca aycaVar = ayix.m;
        synchronized (ayixVar.r) {
            if (u.a.p.u) {
                return;
            }
            if (ayfbVar != null) {
                byteBuffer = ayfbVar.a;
                byteBuffer.flip();
            } else {
                byteBuffer = ayex.a;
            }
            ayex ayexVar = u.a;
            int remaining = byteBuffer.remaining();
            ayix ayixVar2 = ayexVar.p;
            synchronized (ayixVar2.b) {
                ayixVar2.e += remaining;
            }
            ayex ayexVar2 = u.a;
            ayix ayixVar3 = ayexVar2.p;
            if (!ayixVar3.t) {
                ayixVar3.s.add(new ayev(byteBuffer, z, z2));
            } else {
                ayexVar2.s(byteBuffer, z, z2);
            }
        }
    }
}
