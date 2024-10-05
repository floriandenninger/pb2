package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bbm extends bbc {
    public bbk d;
    private final bbr e;
    private final boolean f;
    private final pot g;
    private final pos h;
    private bbj i;
    private boolean j;
    private boolean k;
    private boolean l;

    public bbm(bbr bbrVar, boolean z) {
        boolean z2;
        this.e = bbrVar;
        if (z) {
            bbrVar.rA();
            z2 = true;
        } else {
            z2 = false;
        }
        this.f = z2;
        this.g = new pot();
        this.h = new pos();
        bbrVar.rz();
        this.d = new bbk(new bbl(bbrVar.r()), pot.a, bbk.b);
    }

    private final Object B(Object obj) {
        return (this.d.c == null || !obj.equals(bbk.b)) ? obj : this.d.c;
    }

    private final void C(long j) {
        bbj bbjVar = this.i;
        int d = this.d.d(bbjVar.e.a);
        if (d == -1) {
            return;
        }
        long j2 = this.d.x(d, this.h).d;
        if (j2 != -9223372036854775807L && j >= j2) {
            j = Math.max(0L, j2 - 1);
        }
        bbjVar.d = j;
    }

    @Override // defpackage.bbr
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public final bbj v(ash ashVar, bfg bfgVar, long j) {
        bbj bbjVar = new bbj(ashVar, bfgVar, j);
        bbr bbrVar = this.e;
        pse.g(bbjVar.b == null);
        bbjVar.b = bbrVar;
        if (this.k) {
            bbjVar.n(ashVar.b(B(ashVar.a)));
        } else {
            this.i = bbjVar;
            if (!this.j) {
                this.j = true;
                x(null, this.e);
            }
        }
        return bbjVar;
    }

    @Override // defpackage.bbc, defpackage.bar
    public final void k() {
        this.k = false;
        this.j = false;
        super.k();
    }

    @Override // defpackage.bbr
    public final pnd r() {
        return this.e.r();
    }

    @Override // defpackage.bbc, defpackage.bar
    public final void rq(att attVar) {
        super.rq(attVar);
        if (this.f) {
            return;
        }
        this.j = true;
        x(null, this.e);
    }

    @Override // defpackage.bbc, defpackage.bbr
    public final void s() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0089  */
    @Override // defpackage.bbc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void t(java.lang.Object r11, defpackage.bbr r12, defpackage.pou r13) {
        /*
            r10 = this;
            r0 = r11
            java.lang.Void r0 = (java.lang.Void) r0
            boolean r0 = r10.k
            r6 = 0
            if (r0 == 0) goto L1b
            bbk r0 = r10.d
            bbk r0 = r0.k(r13)
            r10.d = r0
            bbj r0 = r10.i
            if (r0 == 0) goto La2
            long r0 = r0.d
            r10.C(r0)
            goto La2
        L1b:
            boolean r0 = r13.z()
            if (r0 == 0) goto L37
            boolean r0 = r10.l
            if (r0 == 0) goto L2c
            bbk r0 = r10.d
            bbk r0 = r0.k(r13)
            goto L34
        L2c:
            java.lang.Object r0 = defpackage.pot.a
            java.lang.Object r1 = defpackage.bbk.b
            bbk r0 = defpackage.bbk.l(r13, r0, r1)
        L34:
            r10.d = r0
            goto La2
        L37:
            pot r0 = r10.g
            r1 = 0
            r13.y(r1, r0)
            pot r0 = r10.g
            long r2 = r0.m
            java.lang.Object r7 = r0.b
            bbj r0 = r10.i
            if (r0 == 0) goto L69
            long r4 = r0.a
            bbk r8 = r10.d
            ash r0 = r0.e
            java.lang.Object r0 = r0.a
            pos r9 = r10.h
            r8.jH(r0, r9)
            pos r0 = r10.h
            long r8 = r0.e
            long r8 = r8 + r4
            bbk r0 = r10.d
            pot r4 = r10.g
            pot r0 = r0.y(r1, r4)
            long r0 = r0.m
            int r4 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r4 == 0) goto L69
            r4 = r8
            goto L6a
        L69:
            r4 = r2
        L6a:
            pot r1 = r10.g
            pos r2 = r10.h
            r3 = 0
            r0 = r13
            android.util.Pair r0 = r0.v(r1, r2, r3, r4)
            java.lang.Object r1 = r0.first
            java.lang.Object r0 = r0.second
            java.lang.Long r0 = (java.lang.Long) r0
            long r2 = r0.longValue()
            boolean r0 = r10.l
            if (r0 == 0) goto L89
            bbk r0 = r10.d
            bbk r0 = r0.k(r13)
            goto L8d
        L89:
            bbk r0 = defpackage.bbk.l(r13, r7, r1)
        L8d:
            r10.d = r0
            bbj r0 = r10.i
            if (r0 == 0) goto La2
            r10.C(r2)
            ash r0 = r0.e
            java.lang.Object r1 = r0.a
            java.lang.Object r1 = r10.B(r1)
            ash r6 = r0.b(r1)
        La2:
            r0 = 1
            r10.l = r0
            r10.k = r0
            bbk r0 = r10.d
            r10.rw(r0)
            if (r6 == 0) goto Lb6
            bbj r0 = r10.i
            defpackage.pse.c(r0)
            r0.n(r6)
        Lb6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bbm.t(java.lang.Object, bbr, pou):void");
    }

    @Override // defpackage.bbr
    public final void u(bbp bbpVar) {
        bbj bbjVar = (bbj) bbpVar;
        if (bbjVar.c != null) {
            bbr bbrVar = bbjVar.b;
            pse.c(bbrVar);
            bbrVar.u(bbjVar.c);
        }
        if (bbpVar == this.i) {
            this.i = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.bbc
    public final /* bridge */ /* synthetic */ ash z(Object obj, ash ashVar) {
        Object obj2 = ashVar.a;
        Object obj3 = this.d.c;
        if (obj3 != null && obj3.equals(obj2)) {
            obj2 = bbk.b;
        }
        return ashVar.b(obj2);
    }
}
