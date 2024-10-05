package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class eni {
    public final boolean a;
    public final yys b;
    public final azrw c;
    public final azrw d;
    public final AtomicBoolean e;
    public final AtomicInteger f;
    public final yyr g;
    public final yyr h;
    public final yyr i;
    private final double j;
    private final yyt k;

    public eni(yys yysVar, akpt akptVar, azrw azrwVar, azrw azrwVar2) {
        this.b = yysVar;
        this.k = akptVar.a.h;
        this.c = azrwVar;
        this.d = azrwVar2;
        yxx a = akptVar.a();
        whl whlVar = yysVar.m;
        boolean z = true;
        if (!a.o(yxx.D) && a.f(yxx.E) == 0) {
            z = false;
        }
        this.a = z;
        if (z) {
            this.g = yysVar.b("critical");
            this.h = yysVar.b("intentCritical");
            this.i = yysVar.b("nonCritical");
        } else {
            this.i = null;
            this.h = null;
            this.g = null;
        }
        double a2 = ems.a();
        Double.isNaN(a2);
        this.j = 1.0d / a2;
        this.e = new AtomicBoolean(false);
        this.f = new AtomicInteger(0);
    }

    public final ayph a() {
        return this.k.c.L(eng.b).ak(1L).h();
    }

    public final ayph b() {
        return this.k.c.L(eng.a).ak(1L).h();
    }

    public final void c(int i) {
        if (this.g == null || this.h == null || this.i == null) {
            return;
        }
        int a = ems.a();
        if (i == 0) {
            this.g.e(1, a != 3 ? 3 : 4);
            this.g.e(0, a == 3 ? 5 : 3);
            return;
        }
        if (i != 1) {
            if (i == 2) {
                if (a == 3) {
                    this.h.e(1, 2);
                    this.h.e(0, 2);
                    return;
                }
                return;
            }
            if (i == 4) {
                if (a == 3) {
                    this.h.e(1, 1);
                    return;
                }
                return;
            } else {
                if (a == 3) {
                    this.h.e(0, 1);
                    return;
                }
                return;
            }
        }
        this.h.g(this.g.d(), 2, 3);
        this.i.g(b(), 1, 2);
        if (a == 3) {
            this.i.g(this.h.d(), 0, 2);
        }
        ayqi b = azre.b(this.b.c());
        yyr yyrVar = this.g;
        double d = this.j;
        double d2 = ems.d;
        Double.isNaN(d2);
        yyrVar.l((long) (d * d2), b);
        yyr yyrVar2 = this.h;
        double d3 = this.j;
        double d4 = ems.c;
        Double.isNaN(d4);
        yyrVar2.l((long) (d3 * d4), b);
        yyr yyrVar3 = this.i;
        double d5 = this.j;
        double d6 = ems.a;
        Double.isNaN(d6);
        yyrVar3.l((long) (d5 * d6), b);
        this.g.d().R(new ene(this, 1));
    }

    public final void d() {
        this.k.a(yyt.a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e() {
        this.k.a(yyt.b);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0026, code lost:
    
        r0 = r6.j;
        r4 = defpackage.ems.e;
        java.lang.Double.isNaN(r4);
        r0 = (long) (r0 * r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0033, code lost:
    
        if (r6.a == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0035, code lost:
    
        r7 = r6.h;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0037, code lost:
    
        if (r7 == null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0039, code lost:
    
        r7 = r7.d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0042, code lost:
    
        r2 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003e, code lost:
    
        r7 = defpackage.ayph.f();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x001a, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0043, code lost:
    
        r2.l(r0, java.util.concurrent.TimeUnit.MILLISECONDS, defpackage.azre.b(r6.b.c())).R(new defpackage.ene(r6, 0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005b, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2:0x0010, code lost:
    
        if (r7 != 0) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0018, code lost:
    
        if (r6.f.get() == 0) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0021, code lost:
    
        if (r6.f.compareAndSet(0, r7) == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0024, code lost:
    
        if (r7 == 1) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(int r7) {
        /*
            r6 = this;
            double r0 = r6.j
            long r2 = defpackage.ems.b
            double r2 = (double) r2
            java.lang.Double.isNaN(r2)
            double r0 = r0 * r2
            long r0 = (long) r0
            ayph r2 = defpackage.ayph.f()
            r3 = 0
            if (r7 == 0) goto L43
        L12:
            java.util.concurrent.atomic.AtomicInteger r4 = r6.f
            int r4 = r4.get()
            if (r4 == 0) goto L1b
            return
        L1b:
            java.util.concurrent.atomic.AtomicInteger r4 = r6.f
            boolean r4 = r4.compareAndSet(r3, r7)
            if (r4 == 0) goto L12
            r4 = 1
            if (r7 == r4) goto L43
            double r0 = r6.j
            long r4 = defpackage.ems.e
            double r4 = (double) r4
            java.lang.Double.isNaN(r4)
            double r0 = r0 * r4
            long r0 = (long) r0
            boolean r7 = r6.a
            if (r7 == 0) goto L3e
            yyr r7 = r6.h
            if (r7 == 0) goto L3e
            ayph r7 = r7.d()
            goto L42
        L3e:
            ayph r7 = defpackage.ayph.f()
        L42:
            r2 = r7
        L43:
            yys r7 = r6.b
            java.util.concurrent.Executor r7 = r7.c()
            ayqi r7 = defpackage.azre.b(r7)
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS
            ayph r7 = r2.l(r0, r4, r7)
            ene r0 = new ene
            r0.<init>(r6, r3)
            r7.R(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eni.f(int):void");
    }
}
