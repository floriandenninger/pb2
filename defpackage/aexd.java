package defpackage;

import android.net.Uri;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class aexd extends aewf {
    private volatile boolean A;
    private volatile boolean B;
    private final bdm C;
    public final aewz s;
    volatile boolean t;
    private boolean u;
    private long v;
    private long w;
    private final ArrayList x;
    private long y;
    private volatile int z;

    public aexd(ate ateVar, ath athVar, pms pmsVar, int i, Object obj, long j, long j2, long j3, long j4, bdm bdmVar, aewz aewzVar) {
        super(ateVar, athVar, pmsVar, i, obj, j, j2, j3, j4);
        this.x = new ArrayList();
        this.z = -1;
        this.C = bdmVar;
        this.s = aewzVar;
        this.v = -9223372036854775807L;
        this.w = -9223372036854775807L;
        this.u = true;
    }

    private final synchronized void y() {
        this.y = 0L;
        this.x.clear();
        this.v = -9223372036854775807L;
        this.u = true;
    }

    @Override // defpackage.bfv
    public final synchronized void a() {
        this.A = true;
    }

    @Override // defpackage.bfv
    public final void b() {
        long j;
        long j2;
        long j3;
        synchronized (this) {
            j = this.y;
            j2 = this.w;
        }
        if (j != 0) {
            afic aficVar = afic.ABR;
        }
        ath b = k().b(j);
        if (j2 != -9223372036854775807L) {
            zhy b2 = zhy.b(b.a);
            b2.g("min_lmt", String.valueOf(j2));
            b = b.d(b2.a());
        }
        try {
            bgh bghVar = this.m;
            bid bidVar = new bid(bghVar, b.g, bghVar.h(b));
            if (j == 0) {
                this.C.b(new bdo() { // from class: aexc
                    @Override // defpackage.bdo
                    public final bjc a(int i, int i2) {
                        aexd aexdVar = aexd.this;
                        aexdVar.s.a(aexdVar.d().a(i, i2));
                        return aexdVar.s;
                    }
                }, -9223372036854775807L, -9223372036854775807L);
            }
            do {
                try {
                    if (this.A) {
                        break;
                    }
                } catch (Throwable th) {
                    synchronized (this) {
                        this.y = bidVar.c - k().g;
                        throw th;
                    }
                }
            } while (this.C.d(bidVar));
            synchronized (this) {
                j3 = bidVar.c - k().g;
                this.y = j3;
            }
            if (j3 <= 0) {
                afid.e(afic.MFL, "EmptyChunkException, sequence %d, httpStatus %d", Long.valueOf(i()), Integer.valueOf(this.z));
                throw new aewl(this.z, i(), k());
            }
            synchronized (this) {
            }
            this.m.j();
            q();
        } catch (Throwable th2) {
            this.m.j();
            throw th2;
        }
    }

    @Override // defpackage.bdu
    public final synchronized long f() {
        return m();
    }

    @Override // defpackage.bdu
    public final synchronized boolean h() {
        return this.B;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized long l() {
        return this.v;
    }

    public final synchronized long m() {
        long j = this.o;
        if (j == -1) {
            return -1L;
        }
        return j + 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void n(aesh aeshVar) {
        this.x.add(aeshVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void o() {
        if (k().a.getQueryParameter("headm") != null) {
            this.w = -9223372036854775807L;
            r(-1L);
            this.q = -9223372036854775807L;
            this.r = -9223372036854775807L;
        }
        y();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void p(long j) {
        this.v = j;
    }

    final synchronized void q() {
        this.B = !this.A;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void r(long j) {
        this.o = j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void s(long j, long j2, long j3, Uri uri) {
        r(j);
        this.q = j2;
        this.r = j3;
        t(uri);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void t(Uri uri) {
        this.p = this.p.d(uri);
        this.w = -9223372036854775807L;
        y();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized boolean u() {
        return !this.x.isEmpty();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized boolean v(long j) {
        this.r = j;
        if (!this.u) {
            return false;
        }
        this.q = j;
        this.u = false;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized aesh[] w() {
        return (aesh[]) this.x.toArray(new aesh[0]);
    }

    public final synchronized void x(int i, ajun ajunVar) {
        this.z = i;
        if (i == 204) {
            throw new afhu(204, "Chunk not available yet. Need to retry.", k());
        }
        Long f = ajunVar.f();
        long longValue = f != null ? f.longValue() : -9223372036854775807L;
        long j = this.w;
        if (j != -9223372036854775807L && j != longValue) {
            afid.e(afic.MFL, "LastModifiedTime changed for sequence %d", Long.valueOf(i()));
            this.w = Math.max(this.w, longValue);
            throw new aewm(k(), i());
        }
        this.w = longValue;
    }
}
