package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vsg implements vsh {
    public float a = 0.0f;
    final /* synthetic */ vsm b;
    private final vsi c;
    private final vsi d;
    private final vsi e;
    private final float f;
    private final float g;
    private final float h;
    private float i;
    private float j;
    private float k;

    public vsg(vsm vsmVar, vsi vsiVar, vsi vsiVar2, vsi vsiVar3) {
        this.b = vsmVar;
        this.c = vsiVar;
        this.d = vsiVar2;
        this.e = vsiVar3;
        this.f = vsiVar.a(vsiVar2.a);
        this.g = vsiVar.a(vsiVar2.b);
        this.h = (float) (vsiVar2.c / vsiVar.c);
        d(this.a);
    }

    @Override // defpackage.vsh
    public final float a(long j) {
        if (this.b.g) {
            return this.e.a(j);
        }
        vsi vsiVar = this.d;
        if (j < vsiVar.a) {
            return this.c.a(j) - (this.f - this.i);
        }
        if (j > vsiVar.b) {
            return this.c.a(j) + (this.j - this.g);
        }
        return this.i + (this.k * vsiVar.a(j));
    }

    @Override // defpackage.vsh
    public final long b(float f) {
        return this.e.b(f);
    }

    @Override // defpackage.vsh
    public final long c(float f) {
        if (this.b.g) {
            return this.e.c(f);
        }
        float f2 = this.i;
        if (f < f2) {
            return this.c.c(f + (this.f - f2));
        }
        float f3 = this.j;
        if (f > f3) {
            return this.c.c(f - (f3 - this.g));
        }
        return this.d.c((f - f2) / this.k);
    }

    public final void d(float f) {
        this.a = f;
        this.i = (float) vsm.a(this.f, 0.0d, f);
        this.j = (float) vsm.a(this.g, 1.0d, f);
        this.k = (float) vsm.a(this.h, 1.0d, f);
        this.b.g();
    }
}
