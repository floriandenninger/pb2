package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class emz implements emu {
    public final Executor a;
    public final Executor b;
    public final azrj c = azrj.W();
    public final eni d;
    public final azrw e;
    public final azrw f;
    public final azrw g;
    public final azrw h;
    public final azrw i;
    public final azrw j;
    public final azrw k;
    public final azrw l;
    public final azrw m;
    public final azrw n;
    public final azrw o;
    private final Executor p;
    private final ymp q;
    private final yxx r;
    private final azrw s;
    private final azrw t;

    public emz(Executor executor, Executor executor2, Executor executor3, ymp ympVar, yxx yxxVar, eni eniVar, azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, azrw azrwVar6, azrw azrwVar7, azrw azrwVar8, azrw azrwVar9, azrw azrwVar10, azrw azrwVar11, azrw azrwVar12, azrw azrwVar13) {
        this.p = executor;
        this.a = executor2;
        this.b = executor3;
        this.q = ympVar;
        this.r = yxxVar;
        this.d = eniVar;
        this.s = azrwVar;
        this.e = azrwVar2;
        this.f = azrwVar3;
        this.g = azrwVar4;
        this.h = azrwVar5;
        this.i = azrwVar6;
        this.j = azrwVar7;
        this.k = azrwVar8;
        this.l = azrwVar9;
        this.m = azrwVar10;
        this.n = azrwVar11;
        this.o = azrwVar12;
        this.t = azrwVar13;
    }

    private final Runnable d() {
        return new emx(this, 3);
    }

    private final Runnable e(Executor executor) {
        return new emy(this, executor);
    }

    @Override // defpackage.emu
    public final void a() {
        ((akpt) this.s.get()).e();
        int i = 1;
        boolean z = (this.r.f(yxx.C) & 32) != 0;
        long f = this.r.f(yxx.U) & 2;
        if (!z) {
            b();
        }
        this.a.execute(new emw(this, z));
        if (z) {
            Executor executor = this.p;
            executor.execute(e(executor));
        }
        this.b.execute(new emx(this, 0));
        this.p.execute(new emx(this, 2));
        if (!z) {
            Executor executor2 = this.p;
            executor2.execute(e(executor2));
        }
        if (f != 0) {
            this.a.execute(d());
        } else {
            this.b.execute(d());
        }
        if (z) {
            azrj.w(new emx(this, i, null)).E(azre.b(this.a)).U(this.c);
        }
    }

    public final void b() {
        ((kcd) this.t.get()).b();
        this.q.a();
    }

    public final void c() {
        kcd kcdVar = (kcd) this.t.get();
        kcdVar.g(this.a);
        kcdVar.f(this.a);
    }
}
