package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abrs extends abqh {
    private boolean c = false;

    @Override // defpackage.abqh, defpackage.abqx
    public final synchronized void b() {
        super.b();
        this.c = false;
    }

    @Override // defpackage.abqh, defpackage.abrp
    public final synchronized boolean e(boolean z, abrr abrrVar, abqu abquVar) {
        if (!this.c) {
            return false;
        }
        return super.e(z, abrrVar, abquVar);
    }

    public final synchronized void f(int i, int i2, abqg abqgVar) {
        this.a.b(i, i2);
        d(abqgVar);
        this.c = true;
    }
}
