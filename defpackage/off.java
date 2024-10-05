package defpackage;

import android.support.v7.widget.RecyclerView;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class off extends lo implements nun, fgp, ofd {
    public final nqp a;
    public final ofe b;
    public final fgq c;
    public final RecyclerView d;
    public boolean e;
    private final int f;
    private final wd g;
    private final oip h;
    private final oii i;
    private final fma j;
    private final ajwi k;
    private String l;

    public off(int i, nqp nqpVar, ofe ofeVar, fgq fgqVar, oip oipVar, oii oiiVar, fma fmaVar, RecyclerView recyclerView, ajwi ajwiVar) {
        this.f = i;
        nqpVar.getClass();
        this.a = nqpVar;
        ofeVar.getClass();
        this.b = ofeVar;
        fgqVar.getClass();
        this.c = fgqVar;
        oipVar.getClass();
        this.h = oipVar;
        fmaVar.getClass();
        this.j = fmaVar;
        this.i = oiiVar;
        recyclerView.getClass();
        this.d = recyclerView;
        wd wdVar = recyclerView.n;
        wdVar.getClass();
        this.g = wdVar;
        ajwiVar.getClass();
        this.k = ajwiVar;
    }

    @Override // defpackage.lo
    public final void c(RecyclerView recyclerView, int i, int i2) {
        k();
    }

    @Override // defpackage.ofd
    public final void e(int i, int i2) {
        boolean h = ofe.h(i);
        boolean h2 = ofe.h(i2);
        if (!h && h2) {
            this.c.i(this);
        } else {
            if (!h || h2) {
                return;
            }
            this.c.j(this);
        }
    }

    @Override // defpackage.nun
    public final void g(nqg nqgVar) {
        if (nqgVar instanceof noq) {
            ((noq) nqgVar).i(this);
        }
        k();
    }

    public final void j() {
        String str = this.l;
        if (str == null) {
            return;
        }
        this.j.b(str);
        this.l = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0075, code lost:
    
        if (r3.x() == false) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k() {
        /*
            r9 = this;
            java.lang.String r0 = r9.l
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L8
            r0 = 0
            goto L9
        L8:
            r0 = 1
        L9:
            nqp r3 = r9.a
            nqg r3 = r3.c()
            ofe r4 = r9.b
            int r4 = r4.b
            boolean r4 = defpackage.ofe.f(r4)
            if (r4 == 0) goto L78
            fgq r4 = r9.c
            fhg r4 = r4.g()
            fhg r5 = defpackage.fhg.WATCH_WHILE_MAXIMIZED
            if (r4 == r5) goto L31
            fgq r4 = r9.c
            fhg r4 = r4.g()
            fhg r5 = defpackage.fhg.WATCH_WHILE_MINIMIZED
            if (r4 != r5) goto L78
            boolean r4 = r9.e
            if (r4 == 0) goto L78
        L31:
            wd r4 = r9.g
            android.view.View r4 = r4.S(r2)
            wd r5 = r9.g
            android.view.View r5 = r5.S(r1)
            ajwi r6 = r9.k
            ajoc r6 = r6.f
            oii r7 = r9.i
            ajpd r7 = r7.a
            if (r6 == 0) goto L5a
            int r8 = r7.size()
            if (r8 <= 0) goto L5a
            java.lang.Object r6 = r6.c(r2)
            java.lang.Object r7 = r7.get(r2)
            if (r6 != r7) goto L5a
            if (r5 == 0) goto L5a
            r4 = r5
        L5a:
            if (r4 == 0) goto L79
            int r4 = r4.getTop()
            int r5 = r9.f
            int r5 = -r5
            if (r4 < r5) goto L79
            oip r4 = r9.h
            r5 = 8
            boolean r4 = r4.k(r5)
            if (r4 == 0) goto L78
            if (r3 == 0) goto L78
            boolean r3 = r3.x()
            if (r3 == 0) goto L78
            goto L79
        L78:
            r1 = 0
        L79:
            if (r0 != r1) goto L7c
            return
        L7c:
            if (r1 == 0) goto L87
            fma r0 = r9.j
            java.lang.String r0 = r0.a()
            r9.l = r0
            return
        L87:
            r9.j()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.off.k():void");
    }

    @Override // defpackage.fgp
    public final void oQ(fhg fhgVar) {
        k();
    }

    @Override // defpackage.fgp
    public final /* synthetic */ void oR(fhg fhgVar, fhg fhgVar2) {
        fav.g(this, fhgVar2);
    }
}
