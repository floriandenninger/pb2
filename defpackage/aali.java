package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aali extends azrs {
    public final azrl a;
    private final Runnable b;

    private aali(azrl azrlVar, Runnable runnable) {
        this.a = azrlVar;
        this.b = runnable;
    }

    public static aali e(Runnable runnable) {
        azrl e = azrl.e();
        runnable.getClass();
        return new aali(e, runnable);
    }

    @Override // defpackage.ayqd
    public final void b(Throwable th) {
        this.a.b(th);
        this.b.run();
    }

    @Override // defpackage.ayqd
    public final void c(Object obj) {
        this.a.c(obj);
    }

    @Override // defpackage.aypy
    protected final void f(ayqd ayqdVar) {
        this.a.aE(new aalh(ayqdVar, this));
    }

    @Override // defpackage.ayqd
    public final void se(ayqx ayqxVar) {
        this.a.se(ayqxVar);
    }

    @Override // defpackage.ayqd
    public final void sh() {
        this.a.sh();
        this.b.run();
    }
}
