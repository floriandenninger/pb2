package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class alkk {
    public alkb a;
    public alkb b;
    public alkb c;
    public alkb d;
    public alkd e;
    public alkd f;
    public alkd g;
    public alkd h;
    public alkd i;
    public alkd j;
    public alkd k;
    public alkd l;

    public alkk() {
        this.i = alkd.F();
        this.j = alkd.F();
        this.k = alkd.F();
        this.l = alkd.F();
        this.a = new aljz(0.0f);
        this.b = new aljz(0.0f);
        this.c = new aljz(0.0f);
        this.d = new aljz(0.0f);
        this.e = alkd.z();
        this.f = alkd.z();
        this.g = alkd.z();
        this.h = alkd.z();
    }

    public static void h(alkd alkdVar) {
        if (alkdVar instanceof alkj) {
        } else if (alkdVar instanceof alkc) {
        }
    }

    public final alkl a() {
        return new alkl(this);
    }

    public final void b(float f) {
        this.d = new aljz(f);
    }

    public final void c(float f) {
        this.c = new aljz(f);
    }

    public final void d(float f) {
        this.a = new aljz(f);
    }

    public final void e(float f) {
        this.b = new aljz(f);
    }

    public final void f(alkd alkdVar) {
        this.i = alkdVar;
        h(alkdVar);
    }

    public final void g(alkd alkdVar) {
        this.j = alkdVar;
        h(alkdVar);
    }

    public alkk(alkl alklVar) {
        this.i = alkd.F();
        this.j = alkd.F();
        this.k = alkd.F();
        this.l = alkd.F();
        this.a = new aljz(0.0f);
        this.b = new aljz(0.0f);
        this.c = new aljz(0.0f);
        this.d = new aljz(0.0f);
        this.e = alkd.z();
        this.f = alkd.z();
        this.g = alkd.z();
        this.h = alkd.z();
        this.i = alklVar.j;
        this.j = alklVar.k;
        this.k = alklVar.l;
        this.l = alklVar.m;
        this.a = alklVar.b;
        this.b = alklVar.c;
        this.c = alklVar.d;
        this.d = alklVar.e;
        this.e = alklVar.f;
        this.f = alklVar.g;
        this.g = alklVar.h;
        this.h = alklVar.i;
    }
}
