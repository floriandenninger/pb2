package defpackage;

import android.app.Activity;
import android.content.res.Configuration;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class gjz extends gju implements fxi, fxh, gjs, aiva, gjo, fgp {
    public final fxj b;
    public final gjr c;
    public final gjy d;
    public final zas e;
    public final aivb f;
    ayqx g;
    private final fgq h;
    private final gjw i;
    private final acra j;
    private final aypn k;

    public gjz(Activity activity, fxj fxjVar, fgq fgqVar, aadw aadwVar, gjr gjrVar, gjy gjyVar, zas zasVar, gjw gjwVar, aivb aivbVar, acra acraVar, nyk nykVar) {
        super(activity, gjrVar, nykVar);
        this.b = fxjVar;
        this.c = gjrVar;
        this.d = gjyVar;
        this.e = zasVar;
        this.f = aivbVar;
        this.h = fgqVar;
        this.i = gjwVar;
        this.j = acraVar;
        this.k = nykVar.a;
        asvu asvuVar = aadwVar.b().e;
        if ((asvuVar == null ? asvu.a : asvuVar).z) {
            gjrVar.c(1);
        }
    }

    private final void k(fhg fhgVar, boolean z) {
        int b;
        if (etx.u(fhgVar)) {
            int a = this.d.a();
            if (z) {
                b = this.c.b(fhgVar, a, this.a);
            } else {
                gjr gjrVar = this.c;
                zcp zcpVar = this.a;
                amkq.E(etx.u(fhgVar));
                b = (gjrVar.c.a || !fhgVar.b() || fhgVar.g()) ? gjrVar.b(fhgVar, a, zcpVar) : etx.v(a, gjrVar.g(a, zcpVar));
            }
            h(b);
        }
    }

    private final void l(int i) {
        if (i == 1) {
            this.i.c();
        } else {
            if (i != 2) {
                return;
            }
            this.i.b();
        }
    }

    @Override // defpackage.fxi
    public final void a() {
        this.e.disable();
        gjy gjyVar = this.d;
        gjyVar.e = null;
        gjyVar.b.removeCallbacks(gjyVar.c);
        this.h.j(this);
        ayqx ayqxVar = this.g;
        if (ayqxVar == null || ayqxVar.e()) {
            return;
        }
        azqb.f((AtomicReference) this.g);
    }

    @Override // defpackage.fxi
    public final void b() {
        this.e.enable();
        i();
        this.h.i(this);
    }

    @Override // defpackage.gjs
    public final void c() {
        k(this.h.g(), true);
    }

    @Override // defpackage.aiva
    public final void d(int i, int i2) {
        k(this.h.g(), false);
    }

    @Override // defpackage.fxh
    public final void e(Configuration configuration) {
        gjy gjyVar = this.d;
        gjyVar.d = true;
        gjyVar.e(configuration);
        if (this.a instanceof zct) {
            i();
        } else {
            ayqx ayqxVar = this.g;
            if (ayqxVar != null && !ayqxVar.e()) {
                azqb.f((AtomicReference) this.g);
            }
            this.g = this.k.X(new ayrs() { // from class: gjv
                @Override // defpackage.ayrs
                public final void a(Object obj) {
                    gjz.this.i();
                }
            });
        }
        this.d.d = false;
    }

    @Override // defpackage.gju
    public final boolean f() {
        return j(false);
    }

    @Override // defpackage.gjo
    public final void g(int i) {
        fhg g = this.h.g();
        if (etx.u(g)) {
            gjr gjrVar = this.c;
            amkq.E(etx.u(g));
            amkq.E(etx.t(i) || etx.s(i));
            l((gjrVar.c.a || !g.b() || !g.a() || gjrVar.f(i)) ? 0 : 1);
        }
    }

    public final void h(int i) {
        gjy gjyVar = this.d;
        Integer num = gjyVar.e;
        if (num == null || num.intValue() != i) {
            gjyVar.b.removeCallbacks(gjyVar.c);
            gjyVar.b(i);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x005f, code lost:
    
        if (r1.f(r2) == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x006a, code lost:
    
        if ((r3 instanceof defpackage.zcs) != false) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i() {
        /*
            r9 = this;
            fgq r0 = r9.h
            fhg r0 = r0.g()
            gjr r1 = r9.c
            gjy r2 = r9.d
            int r2 = r2.a()
            zcp r3 = r9.a
            boolean r4 = r0.g()
            r5 = 1
            r6 = 2
            r7 = 0
            if (r4 != 0) goto L6d
            boolean r4 = r0.e()
            if (r4 != 0) goto L6d
            boolean r4 = r0.d()
            if (r4 == 0) goto L26
            goto L6d
        L26:
            fhg r4 = defpackage.fhg.WATCH_WHILE_SLIDING_MINIMIZED_MAXIMIZED
            if (r0 != r4) goto L2d
            fhg r4 = defpackage.fhg.WATCH_WHILE_MAXIMIZED
            goto L3c
        L2d:
            fhg r4 = defpackage.fhg.WATCH_WHILE_SLIDING_MINIMIZED_DISMISSED
            if (r0 != r4) goto L34
            fhg r4 = defpackage.fhg.WATCH_WHILE_MINIMIZED
            goto L3c
        L34:
            fhg r4 = defpackage.fhg.WATCH_WHILE_SLIDING_FULLSCREEN_DISMISSED
            if (r0 != r4) goto L3b
            fhg r4 = defpackage.fhg.WATCH_WHILE_FULLSCREEN
            goto L3c
        L3b:
            r4 = r0
        L3c:
            fhg r8 = defpackage.fhg.WATCH_WHILE_MAXIMIZED
            if (r4 != r8) goto L48
            boolean r8 = r1.e(r2, r3)
            if (r8 != 0) goto L48
            r5 = 2
            goto L6e
        L48:
            boolean r8 = r4.a()
            if (r8 == 0) goto L6d
            ool r8 = r1.c
            boolean r8 = r8.a
            if (r8 == 0) goto L55
            goto L62
        L55:
            aivb r8 = r1.a
            boolean r8 = r8.b
            if (r8 != 0) goto L62
            boolean r1 = r1.f(r2)
            if (r1 != 0) goto L62
            goto L6e
        L62:
            fhg r1 = defpackage.fhg.WATCH_WHILE_FULLSCREEN
            if (r4 != r1) goto L6d
            if (r2 != r6) goto L6d
            boolean r1 = r3 instanceof defpackage.zcs
            if (r1 == 0) goto L6d
            goto L6e
        L6d:
            r5 = 0
        L6e:
            boolean r1 = r0.b()
            if (r1 != 0) goto L84
            if (r5 != r6) goto L84
            acra r1 = r9.j
            acqx r2 = new acqx
            acrb r3 = defpackage.acrb.FULLSCREEN_OPEN_BY_ROTATE
            r2.<init>(r3)
            r3 = 3
            r4 = 0
            r1.I(r3, r2, r4)
        L84:
            r9.l(r5)
            if (r5 != 0) goto L8c
            r9.k(r0, r7)
        L8c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gjz.i():void");
    }

    @Override // defpackage.fgp
    public final void oQ(fhg fhgVar) {
        k(fhgVar, true);
    }

    @Override // defpackage.fgp
    public final /* synthetic */ void oR(fhg fhgVar, fhg fhgVar2) {
        fav.g(this, fhgVar2);
    }

    public final boolean j(boolean z) {
        return this.c.e(z ? this.d.a.b.c : this.d.a(), this.a);
    }
}
