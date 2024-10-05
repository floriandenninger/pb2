package defpackage;

import android.os.Looper;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.chromium.net.CellularSignalStrengthError;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bdq implements bcy, bda, bft, bfw {
    public final int a;
    public final bdr b;
    boolean c;
    private final boolean[] e;
    private final bcz f;
    private final bbx g;
    private final bfs h;
    private final ArrayList k;
    private final List l;
    private final bcx m;
    private final bcx[] n;
    private final bdk o;
    private bdn p;
    private pms q;
    private long r;
    private long s;
    private int t;
    private final int[] d = new int[0];
    private final bfz i = new bfz("ChunkSampleStream");
    private final bdp j = new bdp();

    public bdq(int i, bdr bdrVar, bcz bczVar, bfg bfgVar, long j, ayr ayrVar, bbx bbxVar, bfs bfsVar, bbx bbxVar2, byte[] bArr) {
        this.a = i;
        this.b = bdrVar;
        this.f = bczVar;
        this.g = bbxVar2;
        this.h = bfsVar;
        ArrayList arrayList = new ArrayList();
        this.k = arrayList;
        this.l = Collections.unmodifiableList(arrayList);
        this.n = new bcx[0];
        this.e = new boolean[0];
        Looper myLooper = Looper.myLooper();
        pse.c(myLooper);
        bcx D = bcx.D(bfgVar, myLooper, ayrVar, bbxVar);
        this.m = D;
        this.o = new bdk(new int[]{i}, new bcx[]{D});
        this.r = j;
        this.s = j;
    }

    private final int i(int i, int i2) {
        do {
            i2++;
            if (i2 >= this.k.size()) {
                return this.k.size() - 1;
            }
        } while (((bdi) this.k.get(i2)).c(0) <= i);
        return i2 - 1;
    }

    private final bdi j(int i) {
        bdi bdiVar = (bdi) this.k.get(i);
        ArrayList arrayList = this.k;
        pts.P(arrayList, i, arrayList.size());
        this.t = Math.max(this.t, this.k.size());
        this.m.m(bdiVar.c(0));
        return bdiVar;
    }

    private final bdi k() {
        return (bdi) this.k.get(r0.size() - 1);
    }

    private final void l() {
        int i = i(this.m.a(), this.t - 1);
        while (true) {
            int i2 = this.t;
            if (i2 > i) {
                return;
            }
            this.t = i2 + 1;
            bdi bdiVar = (bdi) this.k.get(i2);
            pms pmsVar = bdiVar.h;
            if (!pmsVar.equals(this.q)) {
                this.g.c(this.a, pmsVar, bdiVar.i, bdiVar.j, bdiVar.k);
            }
            this.q = pmsVar;
        }
    }

    private final void n() {
        this.m.r();
    }

    private final boolean q(int i) {
        return this.m.a() > ((bdi) this.k.get(i)).c(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00e2  */
    @Override // defpackage.bft
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* synthetic */ defpackage.aeqp A(defpackage.bfv r26, java.io.IOException r27, int r28) {
        /*
            Method dump skipped, instructions count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bdq.A(bfv, java.io.IOException, int):aeqp");
    }

    @Override // defpackage.bcy
    public final int a(pmt pmtVar, asw aswVar, int i) {
        if (g()) {
            return -3;
        }
        l();
        return this.m.d(pmtVar, aswVar, i, this.c);
    }

    @Override // defpackage.bcy
    public final int b(long j) {
        if (g()) {
            return 0;
        }
        int b = this.m.b(j, this.c);
        this.m.w(b);
        l();
        return b;
    }

    @Override // defpackage.bda
    public final long c() {
        if (g()) {
            return this.r;
        }
        if (this.c) {
            return Long.MIN_VALUE;
        }
        return k().l;
    }

    @Override // defpackage.bcy
    public final boolean d() {
        return !g() && this.m.y(this.c);
    }

    public final void e(long j, boolean z) {
        if (g()) {
            return;
        }
        bcx bcxVar = this.m;
        int i = bcxVar.b;
        bcxVar.j(j, z, true);
        bcx bcxVar2 = this.m;
        int i2 = bcxVar2.b;
        if (i2 > i) {
            bcxVar2.f();
        }
        int min = Math.min(i(i2, 0), this.t);
        if (min > 0) {
            pts.P(this.k, 0, min);
            this.t -= min;
        }
    }

    public final void f(long j) {
        bdi bdiVar;
        boolean A;
        this.s = j;
        if (g()) {
            this.r = j;
            return;
        }
        int i = 0;
        while (true) {
            bdiVar = null;
            if (i >= this.k.size()) {
                break;
            }
            bdi bdiVar2 = (bdi) this.k.get(i);
            long j2 = bdiVar2.k;
            if (j2 == j && bdiVar2.a == -9223372036854775807L) {
                bdiVar = bdiVar2;
                break;
            } else if (j2 > j) {
                break;
            } else {
                i++;
            }
        }
        if (bdiVar != null) {
            A = this.m.z(bdiVar.c(0));
        } else {
            A = this.m.A(j, j < c());
        }
        if (A) {
            this.t = i(this.m.a(), 0);
            return;
        }
        this.r = j;
        this.c = false;
        this.k.clear();
        this.t = 0;
        if (this.i.f()) {
            this.m.k();
            this.i.a();
        } else {
            this.i.b();
            n();
        }
    }

    final boolean g() {
        return this.r != -9223372036854775807L;
    }

    public final void h() {
        this.m.p();
        this.i.d(this);
    }

    @Override // defpackage.bda
    public final long jJ() {
        if (this.c) {
            return Long.MIN_VALUE;
        }
        if (g()) {
            return this.r;
        }
        long j = this.s;
        bdi k = k();
        if (!k.h()) {
            if (this.k.size() > 1) {
                k = (bdi) this.k.get(r2.size() - 2);
            } else {
                k = null;
            }
        }
        if (k != null) {
            j = Math.max(j, k.l);
        }
        return Math.max(j, this.m.g());
    }

    @Override // defpackage.bcy
    public final void jK() {
        this.i.c(CellularSignalStrengthError.ERROR_NOT_SUPPORTED);
        this.m.o();
        if (this.i.f()) {
            return;
        }
        this.b.d();
    }

    @Override // defpackage.bda
    public final void m(long j) {
        if (this.i.e() || g()) {
            return;
        }
        if (this.i.f()) {
            bdn bdnVar = this.p;
            pse.c(bdnVar);
            if ((bdnVar instanceof bdi) && q(this.k.size() - 1)) {
                return;
            }
            this.b.h();
            return;
        }
        int a = this.b.a(j, this.l);
        if (a < this.k.size()) {
            pse.g(!this.i.f());
            int size = this.k.size();
            while (true) {
                if (a >= size) {
                    a = -1;
                    break;
                } else if (!q(a)) {
                    break;
                } else {
                    a++;
                }
            }
            if (a == -1) {
                return;
            }
            long j2 = k().l;
            bdi j3 = j(a);
            if (this.k.isEmpty()) {
                this.r = this.s;
            }
            this.c = false;
            bbx bbxVar = this.g;
            int i = this.a;
            bbx.j(j3.k);
            bbx.j(j2);
            bbxVar.h(new bbn(i, null, 3, null));
        }
    }

    @Override // defpackage.bda
    public final boolean o(long j) {
        List list;
        long j2;
        if (this.c || this.i.f() || this.i.e()) {
            return false;
        }
        boolean g = g();
        if (g) {
            list = Collections.emptyList();
            j2 = this.r;
        } else {
            list = this.l;
            j2 = k().l;
        }
        bdr bdrVar = this.b;
        bdrVar.c(j, j2, list, this.j);
        bdp bdpVar = this.j;
        boolean z = bdpVar.b;
        bdn bdnVar = bdpVar.a;
        bdpVar.a = null;
        bdpVar.b = false;
        if (z) {
            this.r = -9223372036854775807L;
            this.c = true;
            return true;
        }
        if (bdnVar == null) {
            return false;
        }
        this.p = bdnVar;
        if (bdnVar instanceof bdi) {
            bdi bdiVar = (bdi) bdnVar;
            if (g) {
                long j3 = bdiVar.k;
                long j4 = this.r;
                if (j3 != j4) {
                    this.m.c = j4;
                }
                this.r = -9223372036854775807L;
            }
            bdk bdkVar = this.o;
            bdiVar.c = bdkVar;
            int[] iArr = new int[1];
            char c = 0;
            while (true) {
                bcx[] bcxVarArr = bdkVar.a;
                if (c > 0) {
                    break;
                }
                iArr[0] = bcxVarArr[0].c();
                c = 1;
            }
            bdiVar.d = iArr;
            this.k.add(bdiVar);
        } else if (bdnVar instanceof bdt) {
            ((bdt) bdnVar).a = this.o;
        }
        this.i.g(bdnVar, this, Integer.MAX_VALUE);
        this.g.n(new bbi(bdnVar.e, bdnVar.f), this.a, bdnVar.h, bdnVar.i, bdnVar.j, bdnVar.k, bdnVar.l);
        return true;
    }

    @Override // defpackage.bda
    public final boolean p() {
        return this.i.f();
    }

    @Override // defpackage.bfw
    public final void v() {
        this.m.q();
        this.b.f();
    }

    @Override // defpackage.bft
    public final /* synthetic */ void y(bfv bfvVar, boolean z) {
        bdn bdnVar = (bdn) bfvVar;
        this.p = null;
        bbi bbiVar = new bbi(bdnVar.e, bdnVar.f, bdnVar.e());
        this.h.c(bdnVar.e);
        bbx bbxVar = this.g;
        int i = bdnVar.g;
        bbxVar.k(bbiVar, this.a, bdnVar.h, bdnVar.i, bdnVar.j, bdnVar.k, bdnVar.l);
        if (z) {
            return;
        }
        if (!g()) {
            if (bdnVar instanceof bdi) {
                j(this.k.size() - 1);
                if (this.k.isEmpty()) {
                    this.r = this.s;
                }
            }
        } else {
            n();
        }
        this.f.j(this);
    }

    @Override // defpackage.bft
    public final /* synthetic */ void z(bfv bfvVar) {
        bdn bdnVar = (bdn) bfvVar;
        this.p = null;
        this.b.e(bdnVar);
        bbi bbiVar = new bbi(bdnVar.e, bdnVar.f, bdnVar.e());
        this.h.c(bdnVar.e);
        bbx bbxVar = this.g;
        int i = bdnVar.g;
        bbxVar.l(bbiVar, this.a, bdnVar.h, bdnVar.i, bdnVar.j, bdnVar.k, bdnVar.l);
        this.f.j(this);
    }
}
