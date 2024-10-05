package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ayyv extends aypn implements aytd {
    private final Object b;

    public ayyv(Object obj) {
        this.b = obj;
    }

    @Override // defpackage.aypn
    protected final void ac(banw banwVar) {
        banwVar.f(new azpz(banwVar, this.b));
    }

    @Override // defpackage.aytd, java.util.concurrent.Callable
    public final Object call() {
        return this.b;
    }
}
