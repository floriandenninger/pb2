package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bay extends bbc {
    private final bbr d;
    private final long e;
    private final long f;
    private final ArrayList g;
    private final pot h;
    private baw i;
    private bax j;
    private long k;
    private long l;

    public bay(bbr bbrVar, long j, long j2) {
        pse.e(j >= 0);
        this.d = bbrVar;
        this.e = j;
        this.f = j2;
        this.g = new ArrayList();
        this.h = new pot();
    }

    private final void A(pou pouVar) {
        long j;
        long j2;
        pouVar.y(0, this.h);
        long j3 = this.h.q;
        if (this.i == null || this.g.isEmpty()) {
            long j4 = this.e;
            long j5 = this.f;
            this.k = j3 + j4;
            this.l = j5 != Long.MIN_VALUE ? j3 + j5 : Long.MIN_VALUE;
            int size = this.g.size();
            for (int i = 0; i < size; i++) {
                ((bav) this.g.get(i)).n(this.k, this.l);
            }
            j = j4;
            j2 = j5;
        } else {
            long j6 = this.k - j3;
            j2 = this.f != Long.MIN_VALUE ? this.l - j3 : Long.MIN_VALUE;
            j = j6;
        }
        try {
            baw bawVar = new baw(pouVar, j, j2);
            this.i = bawVar;
            rw(bawVar);
        } catch (bax e) {
            this.j = e;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.bbc, defpackage.bar
    public final void k() {
        super.k();
        this.j = null;
        this.i = null;
    }

    @Override // defpackage.bbr
    public final pnd r() {
        return ((bcr) this.d).d;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.bbc, defpackage.bar
    public final void rq(att attVar) {
        super.rq(attVar);
        x(null, this.d);
    }

    @Override // defpackage.bbc, defpackage.bbr
    public final void s() {
        bax baxVar = this.j;
        if (baxVar != null) {
            throw baxVar;
        }
        super.s();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.bbc
    public final /* bridge */ /* synthetic */ void t(Object obj, bbr bbrVar, pou pouVar) {
        if (this.j != null) {
            return;
        }
        A(pouVar);
    }

    @Override // defpackage.bbr
    public final void u(bbp bbpVar) {
        pse.g(this.g.remove(bbpVar));
        this.d.u(((bav) bbpVar).a);
        if (this.g.isEmpty()) {
            baw bawVar = this.i;
            pse.c(bawVar);
            A(bawVar.a);
        }
    }

    @Override // defpackage.bbr
    public final bbp v(ash ashVar, bfg bfgVar, long j) {
        bav bavVar = new bav(this.d.v(ashVar, bfgVar, j), true, this.k, this.l);
        this.g.add(bavVar);
        return bavVar;
    }
}
