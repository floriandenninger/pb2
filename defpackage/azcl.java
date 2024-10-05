package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azcl extends ayps {
    final Throwable a;

    public azcl(Throwable th) {
        this.a = th;
    }

    @Override // defpackage.ayps
    protected final void Z(aypt ayptVar) {
        ayptVar.se(aysa.INSTANCE);
        ayptVar.b(this.a);
    }
}
