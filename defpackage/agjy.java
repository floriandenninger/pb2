package defpackage;

import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agjy {
    public PlayerResponseModel a;
    public long b;
    public long c;
    public agnz d;
    public agno e;
    public agnv f;
    final /* synthetic */ agka g;
    private agnp h;
    private final atrx i;
    private final int j;
    private final byte[] k;
    private long l;
    private agnf m;
    private long n;
    private long o;
    private agnu p;

    public agjy(agka agkaVar, agnp agnpVar, atrx atrxVar, int i, byte[] bArr, agnf agnfVar, agno agnoVar, long j) {
        this.g = agkaVar;
        atrx atrxVar2 = atrx.UNKNOWN_FORMAT_TYPE;
        this.h = agnpVar;
        this.i = atrxVar;
        this.j = i;
        this.k = bArr;
        this.m = agnfVar;
        this.e = agnoVar;
        this.c = j;
    }

    public final long a() {
        long j;
        synchronized (this.g.k) {
            j = this.l;
        }
        return j;
    }

    public final agnf b() {
        agnf agnfVar;
        synchronized (this.g.k) {
            agnfVar = this.m;
        }
        return agnfVar;
    }

    public final agnp c() {
        agnp agnpVar;
        synchronized (this.g.k) {
            agnpVar = this.h;
        }
        return agnpVar;
    }

    public final agnu d() {
        agnu agnuVar;
        PlayerResponseModel playerResponseModel;
        atqq r;
        synchronized (this.g.k) {
            if (this.p == null && (playerResponseModel = this.a) != null && (r = playerResponseModel.r()) != null) {
                this.p = new agnu(this.h.f(), r, this.l, this.b, this.g.j);
            }
            agnuVar = this.p;
        }
        return agnuVar;
    }

    public final agnv e() {
        agjy agjyVar;
        synchronized (this.g.k) {
            try {
                try {
                    if (this.f == null) {
                        agnu d = d();
                        PlayerResponseModel playerResponseModel = this.a;
                        aryi q = playerResponseModel != null ? playerResponseModel.q() : null;
                        agjm a = this.g.a(this.h.f());
                        agnp agnpVar = this.h;
                        try {
                            agjyVar = this;
                            agjyVar.f = new agnv(agnpVar, this.i, this.j, this.k, this.g.h(agnpVar.f()), this.l, this.n, this.o, this.c, d, q, this.m, this.e, a == null ? null : a.d(), this.d, this.a);
                        } catch (Throwable th) {
                            th = th;
                            throw th;
                        }
                    } else {
                        agjyVar = this;
                    }
                    return agjyVar.f;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }

    public final void f() {
        synchronized (this.g.k) {
            this.a = null;
            this.p = null;
        }
    }

    public final void g() {
        synchronized (this.g.k) {
            this.f = null;
        }
    }

    public final void h(long j) {
        synchronized (this.g.k) {
            this.o = j;
            this.f = null;
        }
    }

    public final void i(long j) {
        synchronized (this.g.k) {
            this.n = j;
            this.f = null;
        }
    }

    public final void j(agnf agnfVar) {
        synchronized (this.g.k) {
            this.m = agnfVar;
            this.f = null;
        }
    }

    public final void k(PlayerResponseModel playerResponseModel, long j, long j2) {
        synchronized (this.g.k) {
            f();
            this.a = playerResponseModel;
            this.l = j;
            this.b = j2;
            this.f = null;
        }
    }

    public final void l(agnp agnpVar) {
        synchronized (this.g.k) {
            this.h = agnpVar;
            this.f = null;
        }
    }
}
