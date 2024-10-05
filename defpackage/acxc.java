package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.cast.framework.CastOptions;
import j$.time.Duration;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acxc implements acwr, rpi {
    public static final String a = zga.a("MDX.CastSdkClient");
    public final Context b;
    public final acws c;
    public final String d;
    public final acxd e;
    public final axpg f;
    public final axpg g;
    public final Executor i;
    public acwt j;
    private qgw m;
    private acxb n;
    private boolean o;
    private qft p;
    private final Duration q;
    private long r;
    public int l = -1;
    final Handler k = new Handler(Looper.getMainLooper());
    public boolean h = false;

    public acxc(Context context, acws acwsVar, acxi acxiVar, Executor executor, acxd acxdVar, axpg axpgVar, axpg axpgVar2, acun acunVar) {
        this.b = context;
        this.c = acwsVar;
        this.i = executor;
        this.e = acxdVar;
        this.f = axpgVar;
        this.g = axpgVar2;
        this.q = Duration.ofSeconds(acunVar.E);
        this.r = acunVar.F;
        this.d = acxiVar.j;
    }

    private final void g(qft qftVar) {
        this.m = qftVar.d();
        acxb acxbVar = new acxb(this);
        this.n = acxbVar;
        this.m.c(acxbVar, qfy.class);
        this.o = true;
    }

    @Override // defpackage.rpi
    public final void a(rpt rptVar) {
        if (rptVar.k()) {
            qft qftVar = (qft) rptVar.g();
            this.p = qftVar;
            if (this.o) {
                return;
            }
            g(qftVar);
            this.r = 2L;
            return;
        }
        zga.f(a, "Error fetching CastContext.", rptVar.f());
        this.k.postDelayed(new Runnable() { // from class: acwz
            @Override // java.lang.Runnable
            public final void run() {
                acxc acxcVar = acxc.this;
                qft.f(acxcVar.b, acxcVar.i).q(acxcVar);
            }
        }, this.q.multipliedBy(this.r).toMillis());
        long j = this.r;
        this.r = j * j;
    }

    @Override // defpackage.acwr
    public final void b() {
        yjk.f();
        if (this.o) {
            this.n.a = false;
            return;
        }
        qft qftVar = this.p;
        if (qftVar != null) {
            g(qftVar);
        } else {
            qft.f(this.b, this.i).q(this);
        }
    }

    @Override // defpackage.acwr
    public final void c() {
        if (this.o) {
            this.n.a = true;
        }
    }

    @Override // defpackage.acwr
    public final void d(boolean z) {
        qgf qgfVar;
        qft qftVar = this.p;
        if (qftVar == null) {
            return;
        }
        qip.as("Must be called from the main thread.");
        CastOptions castOptions = qftVar.h;
        if (z == castOptions.b) {
            return;
        }
        castOptions.b = z;
        qftVar.g();
        qfy a2 = qftVar.f.a();
        if (a2 == null || (qgfVar = a2.b) == null) {
            return;
        }
        try {
            qgfVar.i(z);
        } catch (RemoteException unused) {
        }
    }

    @Override // defpackage.acwr
    public final boolean e() {
        return this.o;
    }

    public final void f() {
        this.j = null;
    }
}
