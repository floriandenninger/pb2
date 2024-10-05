package defpackage;

import android.util.SparseArray;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bdm implements bik {
    private static final tfq j = new tfq(null, null, null);
    public pms[] a;
    private final bih b;
    private final int c;
    private final pms d;
    private final SparseArray e = new SparseArray();
    private boolean f;
    private bdo g;
    private long h;
    private biz i;

    public bdm(bih bihVar, int i, pms pmsVar) {
        this.b = bihVar;
        this.c = i;
        this.d = pmsVar;
    }

    public final bib a() {
        biz bizVar = this.i;
        if (bizVar instanceof bib) {
            return (bib) bizVar;
        }
        return null;
    }

    public final void b(bdo bdoVar, long j2, long j3) {
        this.g = bdoVar;
        this.h = j3;
        if (!this.f) {
            this.b.d(this);
            if (j2 != -9223372036854775807L) {
                this.b.f(0L, j2);
            }
            this.f = true;
            return;
        }
        bih bihVar = this.b;
        if (j2 == -9223372036854775807L) {
            j2 = 0;
        }
        bihVar.f(0L, j2);
        for (int i = 0; i < this.e.size(); i++) {
            ((bdl) this.e.valueAt(i)).a(bdoVar, j3);
        }
    }

    public final void c() {
        this.b.e();
    }

    public final boolean d(bii biiVar) {
        int h = this.b.h(biiVar, j);
        pse.g(h != 1);
        return h == 0;
    }

    @Override // defpackage.bik
    public final bjc n(int i, int i2) {
        bdl bdlVar = (bdl) this.e.get(i);
        if (bdlVar == null) {
            pse.g(this.a == null);
            bdlVar = new bdl(i, i2, i2 == this.c ? this.d : null);
            bdlVar.a(this.g, this.h);
            this.e.put(i, bdlVar);
        }
        return bdlVar;
    }

    @Override // defpackage.bik
    public final void q() {
        pms[] pmsVarArr = new pms[this.e.size()];
        for (int i = 0; i < this.e.size(); i++) {
            pms pmsVar = ((bdl) this.e.valueAt(i)).a;
            pse.d(pmsVar);
            pmsVarArr[i] = pmsVar;
        }
        this.a = pmsVarArr;
    }

    @Override // defpackage.bik
    public final void w(biz bizVar) {
        this.i = bizVar;
    }
}
