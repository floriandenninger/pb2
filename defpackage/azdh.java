package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azdh extends ayps implements aytd {
    final Object a;

    public azdh(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.ayps
    protected final void Z(aypt ayptVar) {
        ayptVar.se(aysa.INSTANCE);
        ayptVar.sc(this.a);
    }

    @Override // defpackage.aytd, java.util.concurrent.Callable
    public final Object call() {
        return this.a;
    }
}
