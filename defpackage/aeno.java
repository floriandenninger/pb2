package defpackage;

import android.os.Handler;
import android.os.SystemClock;
import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aeno implements aenl {
    private final aaoz b;
    private final aaea c;
    private final aenv d;
    private long f;
    private aeny g;
    private long i;
    private apks j;
    private long k;
    private long l;
    private int m;
    private aeny h = aeny.u;
    private int n = 0;
    private long e = -1;
    private final bew a = new bew();

    public aeno(aaoz aaozVar, aenv aenvVar, aaea aaeaVar) {
        this.b = aaozVar;
        this.c = aaeaVar;
        this.d = aenvVar;
    }

    private final aeny l() {
        if (this.i <= 0 || SystemClock.elapsedRealtime() - this.i >= 900000) {
            this.i = SystemClock.elapsedRealtime();
            arfd a = this.c.a();
            if (a != null) {
                atcl atclVar = a.i;
                if (atclVar == null) {
                    atclVar = atcl.a;
                }
                apks apksVar = atclVar.e;
                if (apksVar == null) {
                    apksVar = apks.a;
                }
                if ((apksVar.b & 2) != 0) {
                    atcl atclVar2 = a.i;
                    if (atclVar2 == null) {
                        atclVar2 = atcl.a;
                    }
                    apks apksVar2 = atclVar2.e;
                    if (apksVar2 == null) {
                        apksVar2 = apks.a;
                    }
                    if (!apksVar2.equals(this.j)) {
                        this.h = i(true);
                        atcl atclVar3 = a.i;
                        if (atclVar3 == null) {
                            atclVar3 = atcl.a;
                        }
                        apks apksVar3 = atclVar3.e;
                        if (apksVar3 == null) {
                            apksVar3 = apks.a;
                        }
                        this.j = apksVar3;
                        aenv aenvVar = this.d;
                        if (aenvVar != null) {
                            j(aenvVar.a(), this.h);
                        }
                    }
                }
            }
            this.h = aeny.u;
        }
        return this.h;
    }

    private final aeny q() {
        Class cls;
        if (this.g != null) {
            int bf = this.b.get().bf(2) - 1;
            if (bf == 2) {
                cls = aeoa.class;
            } else if (bf != 3) {
                cls = bf != 4 ? aens.class : aenn.class;
            } else {
                cls = aenw.class;
            }
            if (cls.isInstance(this.g)) {
                return this.g;
            }
        }
        this.g = i(false);
        aenv aenvVar = this.d;
        if (aenvVar != null) {
            j(aenvVar.a(), this.g);
        }
        return this.g;
    }

    private final void r(int i, long j, long j2) {
        this.a.b(i, j, j2);
    }

    private final void s() {
        float b = this.g.b();
        this.e = Float.isNaN(b) ? -1L : b;
        float b2 = this.h.b();
        this.f = Float.isNaN(b2) ? -1L : b2;
    }

    @Override // defpackage.att
    public final synchronized void a(ate ateVar, ath athVar, boolean z, int i) {
        this.k += i;
    }

    @Override // defpackage.att
    public final synchronized void b(ate ateVar, ath athVar, boolean z) {
        pse.g(this.m > 0);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int i = (int) (elapsedRealtime - this.l);
        if (i > 0) {
            long j = this.k;
            if (j >= this.n) {
                long j2 = (j * 8000) / i;
                float f = (float) j2;
                q().f(f);
                l().f(f);
                s();
                r(i, this.k, this.e);
                aenv aenvVar = this.d;
                if (aenvVar != null) {
                    aenvVar.b(this.k, j2);
                }
            }
        }
        int i2 = this.m - 1;
        this.m = i2;
        if (i2 > 0) {
            this.l = elapsedRealtime;
        }
        this.k = 0L;
    }

    @Override // defpackage.att
    public final void c(ate ateVar, ath athVar, boolean z) {
    }

    @Override // defpackage.att
    public final synchronized void d(ate ateVar, ath athVar, boolean z) {
        PlayerConfigModel playerConfigModel = this.b.get();
        if (playerConfigModel != null) {
            this.n = playerConfigModel.l();
        }
        if (this.m == 0) {
            this.l = SystemClock.elapsedRealtime();
        }
        this.m++;
    }

    @Override // defpackage.bey
    public final synchronized long e() {
        return this.e;
    }

    @Override // defpackage.bey
    public final void f(Handler handler, bex bexVar) {
        this.a.a(handler, bexVar);
    }

    @Override // defpackage.bey
    public final void g(bex bexVar) {
        this.a.c(bexVar);
    }

    @Override // defpackage.aenl
    public final synchronized long h() {
        return this.f;
    }

    protected final aeny i(boolean z) {
        PlayerConfigModel playerConfigModel = this.b.get();
        int bf = playerConfigModel.bf(2) - 1;
        if (bf == 2) {
            return new aeoa(playerConfigModel.be(), playerConfigModel.bd());
        }
        if (bf != 3) {
            if (bf == 4) {
                return new aenn(playerConfigModel.be(), playerConfigModel.bd());
            }
            if (bf != 5) {
                return new aens(playerConfigModel.be(), playerConfigModel.bd());
            }
        }
        aenw k = aenw.k(this.c, z);
        return k != null ? k : new aens(12, 0.5f);
    }

    protected final void j(List list, aeny aenyVar) {
        if (list.isEmpty()) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            aenyVar.f((float) ((Long) it.next()).longValue());
        }
        s();
    }

    @Override // defpackage.aenl
    public final void k() {
        aeny aenyVar = this.g;
        if (aenyVar != null) {
            aenyVar.h();
        }
        this.h.h();
    }

    @Override // defpackage.aenl
    public final void m(long j) {
        float f = (float) j;
        q().f(f);
        l().f(f);
        aenv aenvVar = this.d;
        if (aenvVar != null) {
            aenvVar.b(1L, j);
        }
        s();
        r(0, 0L, this.e);
    }

    @Override // defpackage.aenl
    public final /* synthetic */ void n() {
    }

    @Override // defpackage.aenl
    public final /* synthetic */ void o(PlayerConfigModel playerConfigModel) {
    }

    @Override // defpackage.aenl
    public final /* synthetic */ int p() {
        return 1;
    }
}
