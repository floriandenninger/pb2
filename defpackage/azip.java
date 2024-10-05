package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azip extends aypy implements aytd {
    private final Object a;

    public azip(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.aytd, java.util.concurrent.Callable
    public final Object call() {
        return this.a;
    }

    @Override // defpackage.aypy
    protected final void f(ayqd ayqdVar) {
        azjy azjyVar = new azjy(ayqdVar, this.a);
        ayqdVar.se(azjyVar);
        azjyVar.run();
    }
}
