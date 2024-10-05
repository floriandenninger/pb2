package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class rvt implements rwa {
    public rws a;
    public sba b;
    public final ryv c;
    private final rws d;
    private final rws e;
    private rze f;

    public rvt(rws rwsVar) {
        Float valueOf = Float.valueOf(0.0f);
        this.c = new ryv(valueOf, valueOf);
        this.d = rwsVar;
        this.e = new rwv();
        this.a = rwsVar;
    }

    public final float a(int i) {
        return this.a.h(i);
    }

    public final float b(int i) {
        return this.a.i(i);
    }

    public final float c(int i) {
        return this.a.j(i);
    }

    public final int d(int i) {
        return this.a.k(i);
    }

    public final int e() {
        return this.a.l();
    }

    public final int f(Object obj) {
        return this.a.m(obj);
    }

    public final Object g(int i) {
        return this.a.s(i);
    }

    public final void h(rze rzeVar, rze rzeVar2, saw sawVar, sba sbaVar, boolean z, float f, float f2, ryv ryvVar) {
        this.b = sbaVar;
        rws rwsVar = z ? this.d : this.e;
        rws rwsVar2 = this.a;
        if (rwsVar != rwsVar2) {
            rwsVar.b(rwsVar2.a());
            this.a.B();
            rwsVar.C();
            this.a = rwsVar;
        }
        this.a.c(f, f2);
        this.a.x(rzeVar, rzeVar2, sawVar, sbaVar);
        if (rzeVar == null) {
            rzeVar = this.f;
        }
        this.f = rzeVar;
        if (rzeVar == null) {
            ryv ryvVar2 = this.c;
            Float valueOf = Float.valueOf(0.0f);
            ryvVar2.b(valueOf, valueOf);
        } else {
            float c = rzeVar.c();
            this.c.b(Float.valueOf(((Float) ryvVar.a).floatValue() - c), Float.valueOf(((Float) ryvVar.b).floatValue() + c));
        }
    }

    public final float i() {
        return this.a.d();
    }

    public final float j() {
        return this.a.e();
    }

    @Override // defpackage.rwa
    public final void setAnimationPercent(float f) {
        this.a.g(f);
    }
}
