package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rwt extends rwx implements rws {
    private float b;
    private float c;
    private float d;
    private float e;
    private float f;
    private float g;

    @Override // defpackage.rws
    public final rwu a() {
        if (this.a == null) {
            return null;
        }
        return new rwu(o(), p(), this.c, this.f);
    }

    @Override // defpackage.rws
    public final synchronized void b(rwu rwuVar) {
        if (rwuVar == null) {
            return;
        }
        v(rwuVar.a);
        w(rwuVar.b);
        float f = rwuVar.c;
        this.d = f;
        this.b = f;
        this.c = f;
        float f2 = rwuVar.d;
        this.g = f2;
        this.e = f2;
        this.f = f2;
    }

    @Override // defpackage.rws
    public final void c(float f, float f2) {
        this.b = this.c;
        this.e = this.f;
        this.d = f;
        this.g = f2;
    }

    @Override // defpackage.rws
    public final float d() {
        return this.f;
    }

    @Override // defpackage.rws
    public final float e() {
        return this.c;
    }

    @Override // defpackage.rwx
    protected final rww f(sba sbaVar) {
        return n(sbaVar);
    }

    @Override // defpackage.rwx, defpackage.rwz
    public final synchronized void g(float f) {
        super.g(f);
        float f2 = this.d;
        float f3 = this.b;
        this.c = ((f2 - f3) * f) + f3;
        float f4 = this.g;
        float f5 = this.e;
        this.f = ((f4 - f5) * f) + f5;
    }
}
