package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rwv extends rwy implements rws {
    private float a;
    private float b;

    @Override // defpackage.rws
    public final rwu a() {
        rxa f = f();
        if (f == null) {
            return null;
        }
        return new rwu(f, n(), this.a, this.b);
    }

    @Override // defpackage.rws
    public final void b(rwu rwuVar) {
        if (rwuVar == null) {
            return;
        }
        p(rwuVar.a);
        o(rwuVar.b);
        this.a = rwuVar.c;
        this.b = rwuVar.d;
    }

    @Override // defpackage.rws
    public final void c(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    @Override // defpackage.rws
    public final float d() {
        return this.b;
    }

    @Override // defpackage.rws
    public final float e() {
        return this.a;
    }
}
