package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fcw {
    public final ypa a;
    private final actg b;
    private final asvu c;

    public fcw(ypa ypaVar, actg actgVar, aadw aadwVar) {
        this.a = ypaVar;
        this.b = actgVar;
        asvu asvuVar = aadwVar.b().e;
        this.c = asvuVar == null ? asvu.a : asvuVar;
    }

    public final void a() {
        if (!this.c.E) {
            b();
        } else if (this.b.j(fcn.class)) {
            this.a.d(new fdh());
        }
    }

    public final void b() {
        if (this.b.j(fcn.class)) {
            this.a.d(new fdf());
        }
    }

    public final void c() {
        this.a.d(new fer());
    }

    public final void d() {
        this.a.d(new fes());
    }
}
