package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aiik implements aijo {
    private final aifw a;
    private final aigv b;

    public aiik(aifw aifwVar, aigv aigvVar) {
        aifwVar.getClass();
        this.a = aifwVar;
        aigvVar.getClass();
        this.b = aigvVar;
    }

    @Override // defpackage.aijo
    public final void qZ(aijr aijrVar) {
        if (this.a.g() == aigf.REMOTE) {
            aijrVar.M = ahbl.h(5) | ahbl.h(2);
            aijrVar.N = ahbl.f(5) | ahbl.f(2);
        } else {
            aijrVar.M = this.a.f().a;
            aijrVar.N = this.a.r() ? ahbl.f(5) : ahbl.f(1);
        }
        aijrVar.O = this.a.h().c;
        aijrVar.e(this.a.g().i);
        synchronized (this.b) {
            if (this.b.j()) {
                aijrVar.G = this.b.i();
                aijrVar.F = this.b.a();
                aijrVar.H = this.b.b().f;
                aijrVar.f55J = this.b.k();
            }
        }
    }
}
